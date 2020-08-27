package Static_properties;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda3", "Skyactive3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda6", "Skyactive6");
        System.out.println(Car.numberOfCars);

    }
}
