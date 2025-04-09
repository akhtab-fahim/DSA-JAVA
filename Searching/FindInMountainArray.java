//leetcode HARD
//https://leetcode.com/problems/find-in-mountain-array/description/
public class FindInMountainArray {
    static int binarySearch(int arr[],int target,int start,int end){
        int middle = Integer.MIN_VALUE;
        while(end>=start){
            middle = (start + end )/2;
            if(arr[middle]==target) { return middle;}
            else if(arr[middle]<target) {start = middle +1;}
            else if(arr[middle]>target){end = middle-1;}
        }
        return -1;
    }
    static int findPeak(int arr[]){
        int start =0;
        int end = arr.length-1;
        int middle;
        while(start<end){
            middle = (start + end )/2;
            if(arr[middle] > arr[middle+1]){    //you are in the decending part of that array 
                end = middle;
            }else{  //accending part 
                start=middle+1;
            }
        }
        //at the end start and end will be pointing to a single element that will be ans 
        return start;
    }
    static int findInMoutain(int arr[],int target){
        int peak = findPeak(arr);
        int firstTry =binarySearch(arr, target, 0, peak);
        if(firstTry==-1){
            return orderAgnosticBinarySearch(arr, target,peak+1,arr.length-1);
        }
        return firstTry;
    }
    static int orderAgnosticBinarySearch(int arr[],int target,int start,int end){
        boolean isOrder = false;
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
        int arr[]={0,1,2,4,2,1};
        System.out.println(findInMoutain(arr, 4));
    }
}
