public class CountOs {
    public static void main(String[] args) {
        System.out.println(count(52004503));
    }
    static int count(int n){
        return countZeros(n, 0);
    }
    static int countZeros(int n,int count){
        if(n==0) return count;
        int rem = n % 10;
        if(rem==0) return countZeros(n/10, ++count);
        return countZeros(n/10, count);
    }
}
