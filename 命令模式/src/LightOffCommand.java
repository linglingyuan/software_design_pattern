public class LightOffCommand implements Command{
    private LightrReceiver lightrReceiver;

    public LightOffCommand(LightrReceiver lightrReceiver){
        super();
        this.lightrReceiver = lightrReceiver;
    }
    @Override
    public void execute() {
        lightrReceiver.off();
    }

    @Override
    public void undo() {
        lightrReceiver.on();
    }
}
