package by.bsuir.Grinev.server.command.impl;

import by.bsuir.Grinev.server.command.Command;
import by.bsuir.Grinev.server.command.exception.CommandException;
import by.bsuir.Grinev.server.model.AuthType;
import by.bsuir.Grinev.server.service.ServiceFactory;

public class DisconnectCommand implements Command {
    public String complete(Object caller, String request) throws CommandException {
        ServiceFactory.getInstance().getAuthService().setAuthType(caller, AuthType.UNAUTH);
        return "Bye bye!";
    }
}
