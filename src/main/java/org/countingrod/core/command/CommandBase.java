package CountingRod.core.command;

public abstract class CommandBase {
    private String commandName;
    /** 'true' means this command needs parameters */
    private boolean isHasNext;

    public String getCommandName() {
        return commandName;
    }

    public boolean isHasNext() {
        return isHasNext;
    }
}
