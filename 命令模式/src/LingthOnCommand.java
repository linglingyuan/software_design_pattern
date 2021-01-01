public class LingthOnCommand implements Command {
    private LightrReceiver lightrReceiver;

    public LingthOnCommand(LightrReceiver lightrReceiver){
        super();
        this.lightrReceiver = lightrReceiver;
    }
    @Override
    public void execute() {
        lightrReceiver.on();
    }

    @Override
    public void undo() {
        lightrReceiver.off();
    }
}
