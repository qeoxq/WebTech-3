package by.bsuir.Grinev.server.command;

import by.bsuir.Grinev.server.command.exception.CommandException;

public interface Command {
    String complete(Object caller, String request) throws CommandException;
}
