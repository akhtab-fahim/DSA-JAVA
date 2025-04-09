public class RecPatternPrinting {
    static void triagnle(int row,int col){
        if(row==0) return;
        if(row>col){
            System.out.print("* ");
            triagnle(row, col+1);
        }else{
            System.out.println("");
            triagnle(row-1, 0);
        }
    }
    static void triagnle2(int row,int col){
        if(row==0) return;
        if(row>col){
            triagnle2(row, col+1);
            System.out.print("* ");
            
        }else{
            triagnle2(row-1, 0);
            System.out.println("");
            
        }
    }
    public static void main(String[] args) {
        triagnle(5, 0);
        triagnle2(5, 0);
    }
}
