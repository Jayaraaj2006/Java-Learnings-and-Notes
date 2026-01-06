package Assignments.oops.Interface;

public class Car implements Engine,Media,Brake{
    @Override
    public void brake() {
        System.out.println("I Brake like a Normal Car");
    }

    @Override
    public void Start() {
        System.out.println("i Start like a Normal Car");
    }

    @Override
    public void Stop() {
        System.out.println("I Stop like a Normal Car");
    }

    @Override
    public void Acc() {
        System.out.println("I Accelerate like a Normal Car");
    }

    @Override
    public void Songs() {
        System.out.println("I Have a Lot of Songs");
    }
}
