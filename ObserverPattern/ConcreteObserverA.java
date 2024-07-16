package ObserverPattern;

class ConcreteObserverA implements Observer {
    @Override
    public void update(String state) {
        System.out.println("ConcreteObserverA received new state: " + state);
    }
}