public class Patterns {
    public static void main(String[] args) {
        // pattern(5);
        // rombhusPattern(5);
        // numPyramid(5);
        // numPyramid(5);
        palangTorPattern(5);
    }
    static void pattern(int n){
        for (int i = 0; i < n*2; i++) {
            int totalCols = i>n?2*n-1-i :i;
            for(int j=0;j<totalCols;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void numPyramid(int n){
        
        for (int i = 1; i <= n; i++) {
            for(int l=1;l<=n-i;l++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int k=2;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println("");
        }
    }
    static void numRhombus(int n){
        
        for (int i = 1; i <= 2*n; i++) {
            int c = i>n?2*n-i : i ;
            for(int l=1;l<=n-c;l++){
                System.out.print("  ");
            }
            for(int j=c;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int k=2;k<=c;k++){
                System.out.print(k+" ");
            }
            System.out.println("");
        }
    }
    static void palangTorPattern(int n){
        int originalN= n;
        for (int rows = 0; rows <= 2*n; rows++) {
            for (int cols = 0; cols <= 2*n; cols++){
                int atEveryIndex = originalN - Math.min(Math.min(rows, cols),Math.min(n-rows, n-cols));
                System.out.print(atEveryIndex+ " ");
            }
            System.out.println("");
        }
    }
    static void rombhusPattern(int n){
        for (int i = 0; i < n*2; i++) {
            int totalCols = i>n?2*n-1-i :i;
            int totalnoOfSpaces = n-totalCols;
            for (int k = 0; k < totalnoOfSpaces; k++) {
                System.out.print(" ");
            }
            for(int j=0;j<totalCols;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
