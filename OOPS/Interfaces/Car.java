public class Car implements Media, Engine{
    double mileage = 12.5;
    //here multiple inheritence is allowed Car implements engine and Media 
    public void start(){
        System.out.println("Start");
    }
    public void stop(){
        System.out.println("Stop");
    }
    public void acc(){
        System.out.println("Accelate");
    }
    public void play(){
        System.out.println("Play");
    }
    public void pause(){
        System.out.println("Pause");
    
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.acc();
        c.start();
        c.play();

        // Media carMedia = new Car();
        // carMedia.stop();
        
    }
}
