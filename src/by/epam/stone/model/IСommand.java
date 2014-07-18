package by.epam.stone.model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface IСommand {
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;

}
