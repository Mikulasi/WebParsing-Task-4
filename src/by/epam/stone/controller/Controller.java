package by.epam.stone.controller;

import by.epam.stone.controller.login.ActionCommand;
import by.epam.stone.controller.login.ActionFactory;
import by.epam.stone.controller.login.ConfigurationManager;
import by.epam.stone.model.IСommand;
import by.epam.stone.controller.login.MessageManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/controller")
public class Controller extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }



    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            IСommand command = RequestHelper.getInstance().getCommand(request);
            String page = command.execute(request, response);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
            dispatcher.forward(request, response);
        }catch(ServletException | IOException ex){

        }
            String page;
            ActionFactory client = new ActionFactory();
            ActionCommand command = client.defineCommand(request);
            page = command.execute(request);
            if (page != null) {
                RequestDispatcher dispatcher1 =
                        getServletContext().getRequestDispatcher(page);
                dispatcher1.forward(request, response);
            } else {
                page = ConfigurationManager.getProperty("path.page.index");
                request.getSession().setAttribute("nullPage",
                        MessageManager.getProperty("message.nullpage"));
                response.sendRedirect(request.getContextPath() + page);
            }

        }

    }

