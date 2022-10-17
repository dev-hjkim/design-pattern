package me.whiteship.designpatterns._03_behavioral_patterns._14_command._04_practice;

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommend = new NoCommand();
        for (int i=0; i<7; i++) {
            this.onCommands[i] = noCommend;
            this.offCommands[i] = noCommend;
        }
        this.undoCommand = noCommend;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
        this.undoCommand = this.onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
        this.undoCommand = this.offCommands[slot];
    }

    public void undoButtonWasPushed() {
        this.undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ 리모컨 -------\n");
        for (int i=0; i<onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + this.onCommands[i].getClass().getName()
                    + "     " + this.offCommands[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + this.undoCommand.getClass().getName());

        return stringBuff.toString();
    }
}
