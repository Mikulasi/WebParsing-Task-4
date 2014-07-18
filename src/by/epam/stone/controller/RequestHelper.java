package by.epam.stone.controller;

import by.epam.stone.model.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

public class RequestHelper {

    private static RequestHelper instance = new RequestHelper();
    HashMap<ParserType, IСommand> commands = new HashMap<>();

    private RequestHelper() {
        commands.put(ParserType.SAX, new ReadSAX());
        commands.put(ParserType.DOM, new ReadDOM());
        commands.put(ParserType.STAX, new ReadStAX());

    }

    public IСommand getCommand(HttpServletRequest request) {
        String action = request.getParameter("command");
        IСommand command = commands.get(ParserType.valueOf(action.toUpperCase()));
        if (command == null) {
            command = (IСommand) new NotFoundCommand();
        }
        return command;
    }

    public static RequestHelper getInstance() {
        return instance;
    }
}

