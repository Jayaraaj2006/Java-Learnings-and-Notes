package Assignments.oops.Interface.Interface_prob;

public class CDplayer implements Media{
    @Override
    public void Start() {
        System.out.println("Music Starts");
    }

    @Override
    public void Stop() {
        System.out.println("Music Stops");

    }
}
