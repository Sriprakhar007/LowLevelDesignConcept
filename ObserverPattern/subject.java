package ObserverPattern;

public interface subject {
     void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
