public class example {
    static public class A{
        private int num;
        String name;
        int arr[];

        public int getNum(){
            return num;
        }
        public void setNum(int x){
            this.num = x;
        }

        public A(int n,String name) {
            this.num = n;
            this.name = name;
            this.arr = new int[num];
        }
        
    }public static void main(String[] args) {
        A obj = new A(12, "rizz");
        // obj.num; // data hinding 
        obj.setNum(12);
        
        System.out.println(obj.getNum());
    }

}
