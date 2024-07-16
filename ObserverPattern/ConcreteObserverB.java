package ObserverPattern;

class ConcreteObserverB implements Observer {
    @Override
    public void update(String state) {
        System.out.println("ConcreteObserverB received updated state: " + state);
    }
}