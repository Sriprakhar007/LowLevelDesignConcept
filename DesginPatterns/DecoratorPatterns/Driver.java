package DesginPatterns.DecoratorPatterns;

public class Driver {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        Car sportsCar = new SportsCar(new BasicCar());
        Car sportsLuxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));

        System.out.println("Basic Car:");
        basicCar.assemble();
        System.out.println("\n");

        System.out.println("Sports Car:");
        sportsCar.assemble();
        System.out.println("\n");

        System.out.println("Sports Luxury Car:");
        sportsLuxuryCar.assemble();
        System.out.println("\n");
    }
}