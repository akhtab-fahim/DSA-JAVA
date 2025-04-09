
public class Polymorphism {
    static public class Shapes{
        void area(){
            System.out.println("Area");
        }
        static void greeting(){
            System.out.println("Im in Shapes Class");
        }
    }
    static public class Square extends Shapes{
        @Override
        void area(){
            System.out.println("Area of square");
        }
        static void greeting(){
            System.out.println("Im in Square Class");
        }
    }
    static public class Circle extends Shapes{
        @Override
        void area(){
            System.out.println("Area of circle");
        }
    }
    static public class Rectangle extends Shapes{
        @Override
        void area(){
            System.out.println("Area of Rectangle");
        }
    }
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        shape.area();
        shape.greeting();
        Circle circle = new Circle();
        circle.area();
        Rectangle rec = new Rectangle();
        rec.area();
        
        Shapes s = new Circle();
        s.area();

        Shapes sq = new Square();
        //here since which method is to be called is decided at runtime and depends upon
        //object so according to that greeting() inside square should be called but it is calling
        //the method inside Shapes class because static methods doesnt depend upon the object
        //thats why its not getting ovveridden 
        sq.greeting();

    }
}
