package edu.iis.powp.command;

public class CommandFactory {

    public static ComplexCommand drawRectangle() {
        ComplexCommand command = new ComplexCommand();

        command.addCommand(new CommandSetPosition(10, 10));
        command.addCommand(new CommandDrawLineToPosition(10, 120));
        command.addCommand(new CommandDrawLineToPosition(220, 120));
        command.addCommand(new CommandDrawLineToPosition(220, 10));
        command.addCommand(new CommandDrawLineToPosition(10, 10));

        return command;
    }

}
