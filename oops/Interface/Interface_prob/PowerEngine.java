package Assignments.oops.Interface.Interface_prob;

public class PowerEngine implements Engine{
    @Override
    public void Start() {
        System.out.println("PowerEngine Starts");
    }

    @Override
    public void Stop() {
        System.out.println("PowerEngine Stops");
    }

    @Override
    public void Acc() {
        System.out.println("PowerEngine Accelerates");
    }
}
