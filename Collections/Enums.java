
public class Enums {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //enum constants public static and final you cant create child enums 
        //they are all Week type

        Week() {
            System.out.println("Constructor called for " + this.toString());
        }
    }
    public static void main(String[] args) {
       Week week;
       week = Week.Sunday;

    //    for(Week w : Week.values()){
    //     System.out.println(w);
    //    }
    //    System.out.println(week.ordinal());
        
    }

}
