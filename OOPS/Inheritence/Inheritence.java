public class Inheritence {
    static public class Box{
        double length ;
        double height;
        double width;
        public Box() {
            this.height = 1;
            this.length=1;
            this.width = 1;
        }
        public Box(Box old){
            this.width = old.height;
            this.length = old.length;
            this.height = old.height;
        }
        
    } 
    static class BoxWeight extends Box{
        double weight; 
        public BoxWeight(){
            super();

        }
        public BoxWeight(BoxWeight old){
            super(old);
            this.weight = old.weight;
        }

    }

    static class BoxPrice extends BoxWeight{
        double cost;

        public BoxPrice() {
            super();
        }

        public BoxPrice(BoxPrice other) {
            super(other);
            this.cost = other.cost;

        }

        
    }

    public static void main(String[] args) {
        Box box = new Box(); 
        BoxWeight b = new BoxWeight();
        Box b2 = new BoxWeight();
        // BoxWeight b3 = new Box();
        // b2.weight;
        System.out.println(b.height);

        BoxPrice b4 = new BoxPrice();
        System.out.println(b4.width);

    }



}

