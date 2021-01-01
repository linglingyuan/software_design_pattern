package Observer;

public interface Subject {
    public void registerObserver(Observer1 observer);
    public void removeObserver(Observer1 observer);
    public void notifyObserver();
}
