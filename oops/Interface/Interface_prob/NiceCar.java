package Assignments.oops.Interface.Interface_prob;

public class NiceCar {

    private Engine engine;
    private Media music;

    public NiceCar() {
       engine = new PowerEngine();
    }
    public void Start(){
        engine.Start();
    }
    public void Stop(){
        engine.Stop();
    }
    public void Acc(){
        engine.Acc();
    }
    public void CarUpgrade() {
        engine = new ElectricEngine();
        System.out.println("The CarEngine is Upgraded to Electric Engine");
    }
    public void CarDegrade(){
        engine = new PowerEngine();
        System.out.println("The CarEngine is Degraded to Power Engine");
    }
    public void Music(){
        music = new CDplayer();
        System.out.println("Switched to CD player You can listen Music by Using Start and Stop");
    }
    public void StartMusic(){
        music.Start();
    }
    public void StopMusic(){
        music.Stop();
    }



}
