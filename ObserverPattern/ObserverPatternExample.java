package ObserverPattern;

public class ObserverPatternExample {
    public static void main(String[] args) {
        // Create subject
        ConcreteSubject subject = new ConcreteSubject();

        // Create observers
        Observer observer1 = new ConcreteObserverA();
        Observer observer2 = new ConcreteObserverB();

        // Register observers with subject
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        // Change subject state and notify observers
        subject.setState("State 1");
        subject.setState("State 2");

        // Unregister observer1 and change state again
        subject.removeObserver(observer1);
        subject.setState("State 3");
    }
}
