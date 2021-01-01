public class Client {
    public static void main(String[] args) {
        LightrReceiver lightrReceiver = new LightrReceiver();
        LingthOnCommand lingthOnCommand = new LingthOnCommand(lightrReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightrReceiver);
        RemoveController removeController = new RemoveController();
        removeController.setCommand(0,lingthOnCommand,lightOffCommand);
        removeController.onButton(0);
        removeController.offButton(0);
        removeController.undoButton();
    }
}
