package by.epam.stone.model;

import by.epam.stone.controller.PagePath;
import by.epam.stone.entities.Stone;
import by.epam.stone.xml.XMLParsingFactory;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ReadStAX implements IСommand {
    private static final Logger LOGGER = Logger.getLogger(ReadStAX.class);

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Stone> stones = XMLParsingFactory.getInstance().getStAXReader().parseStAX();

        request.setAttribute("type", ParserType.STAX);
        request.setAttribute("stones", stones);

        return PagePath.STONES_PAGE;

       }
}