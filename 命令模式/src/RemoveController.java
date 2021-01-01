public class RemoveController {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommands;

    public RemoveController(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }
    public void onButton(int no){
        onCommands[no].execute();
        undoCommands = onCommands[no];
    }
    public void offButton(int no){
        offCommands[no].execute();
        undoCommands = offCommands[no];
    }
    public void undoButton(){
        undoCommands.undo();
    }
}
