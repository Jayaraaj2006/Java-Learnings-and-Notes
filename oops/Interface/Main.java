package Assignments.oops.Interface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.Start();
        car.Acc();
        car.brake();
        car.Songs();
        car.Stop();
        // We use Interface to regain the abilities of the Multiple Inheritance Because Java Doesn't Support Multiple Inheritance.
    }
}
