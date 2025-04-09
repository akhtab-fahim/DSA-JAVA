public class Main implements A,B {

    public void greet(){

    }


    public static void main(String[] args) {
        NiceCar nc = new NiceCar();
        nc.acc();
        nc.start();
        nc.upgradeEngine(nc);
        nc.start();
        Main obj = new Main();
        //have to call by the interface name 
        A.greeting();

    }
}
