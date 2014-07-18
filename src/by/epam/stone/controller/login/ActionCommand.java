package by.epam.stone.controller.login;

import javax.servlet.http.HttpServletRequest;

public interface ActionCommand {
        String execute(HttpServletRequest request);
    }
