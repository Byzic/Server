package server.commands;


import common.data.Flat;
import exceptions.IncorrectValueException;
import server.utility.ResponseCreator;

/**
 * Command 'help'.
 */
public class HelpCommand extends AbstractCommand {

    public HelpCommand() {
        super("help", "вывести справку по доступным командам");
    }
    /**
     * Executes the command.
     * @return Command exit status.
     */
    @Override
    public boolean execute(String argument, Flat flat) {
        try {
            Thread.sleep(1000);
         if (!argument.isEmpty())throw new IncorrectValueException();
            return true;
        }
         catch (IncorrectValueException | InterruptedException e) {
            ResponseCreator.error("У этой команды нет параметров! Необходимо ввести: help");
        }
        return false;
    }
}

