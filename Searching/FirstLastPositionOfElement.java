
import java.util.Arrays;

public class FirstLastPositionOfElement {
    static int [] firstLastPos(int arr[],int target){
        int ans[] = {-1,-1};
        ans[0]=binarySearch(arr, target, true);
        ans[1]=binarySearch(arr, target, false);
        return ans;
    }
    static int binarySearch(int arr[],int target,boolean findFirstOccurence ){
        int start =0;
        int ans =-1;
        int end = arr.length-1;
        int middle = Integer.MIN_VALUE;
        while(end>=start){
            middle = (start + end )/2;
            if(arr[middle]<target) {start = middle +1;}
            else if(arr[middle]>target){end = middle-1;}
            else{ 
                ans = middle;
                if(findFirstOccurence){
                   
                    end = middle -1;
                }else{
                    start = middle +1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        
        System.out.println(Arrays.toString(firstLastPos(arr,7)));

    }
}
