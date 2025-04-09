public class Static {
    public static class Human {
        String name;
        int age;
        int height;
        boolean married;
        static int population;

        public Human(String n, int a, int height, boolean m) {
            this.name = n;
            this.age = a;
            this.height = height; 
            this.married = m;
            Human.population += 1;
        }
    }
    void greeting(){    //not static methods requires object 
        System.out.println("Hi");
    }

    void fun2(){ //object will be created in the main method
        greeting();
    }
    

    public static void main(String[] args) {
        //main method doesnt require any instance
        Human r = new Human("Rizz", 20, 177, false);
        Human s = new Human("Sifa", 15, 150, false);
        System.out.println(Human.population);
        System.out.println(Human.population);

        greeting(); 
        //since static methods doesnt require objects(instance) thats why we cant call a non static method inside a static method


    }
    static void fun(){
        // greeting();

        main obj = new main();
        obj.greeting();
        //we cant acces non static elements with out refencing from a object in a static context  
    }

}
