public class FindCellingofNum {
    static int findCeling(int arr[],int target){
        if(target>arr[arr.length-1]) {return -1;}//handling edge case
        int start =0;
        int end = arr.length-1;
        int middle = Integer.MIN_VALUE;
        while(end>=start){
            middle = (start + end )/2;
            if(arr[middle]==target) { return middle;}
            else if(arr[middle]<target) {start = middle +1;}
            else if(arr[middle]>target){end = middle-1;}
        }
        return start;
    }
    public static void main(String[] args) {if(strat == en)
        int arr[] = {2,4,6,9,11,12,14,20,36,48};
        
        System.out.println(findCeling(arr,36));

    }
}
