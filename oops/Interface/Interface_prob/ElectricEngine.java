package Assignments.oops.Interface.Interface_prob;

public class ElectricEngine implements Engine{
    @Override
    public void Start() {
        System.out.println("ElectricEngine Starts");
    }

    @Override
    public void Stop() {
        System.out.println("ElectricEngine Stops");
    }

    @Override
    public void Acc() {
        System.out.println("ElectricEngine Accelerates");
    }
}
