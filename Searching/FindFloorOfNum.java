public class FindFloorOfNum {
    static int findFloor(int arr[],int target){
        int start =0;
        int end = arr.length-1;
        int middle = Integer.MIN_VALUE;
        while(end>=start){
            middle = (start + end )/2;
            if(arr[middle]<target) {start = middle +1;}
            else if(arr[middle]>target){end = middle-1;}
            else{
                return middle;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        
        System.out.println(findFloor(arr,15));

    }
}
