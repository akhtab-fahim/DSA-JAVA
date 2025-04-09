public class OrderAgnosticBinarySearch {
    static int orderAgnosticBinarySearch(int arr[],int target){
        boolean isOrder = false;
        int start =0;
        int end = arr.length-1;
        if(arr[start]<arr[end]){ isOrder = true;}
        int middle = Integer.MIN_VALUE;
        while(end>=start){
            middle = (start + end )/2;
            if(arr[middle]==target) { return middle;}
            if(isOrder){
                if(arr[middle]<target) {start = middle +1;}
                else if(arr[middle]>target){end = middle-1;}
            }else{
                if(arr[middle]>target) {start = middle +1;}
                else if(arr[middle]<target){end = middle-1;}
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,9,11,12,14,20,36,48};
        
        System.out.println(orderAgnosticBinarySearch(arr,36));
    }
}
