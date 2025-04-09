public class NiceCar implements Engine {
    private Engine engine;
    public NiceCar(){
        engine = new PowerEngine();
    }
    public NiceCar(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }
    public void upgradeEngine(Engine engine){
        engine = new V8Engine();
        System.out.println("Engine upgraded to V8");
    }
}
