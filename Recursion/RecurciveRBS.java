public class RecurciveRBS {
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,1,2,3};
        System.out.println(recRBS(arr, 8, 0, arr.length-1));
    }
    static int recRBS(int arr[],int target,int start,int end){
        if(start>end) return -1;
        int mid = (start+end)/2;
        if(target==arr[mid]) return mid;
        if(arr[start]<=arr[mid]){   //first half sorted
            if (target>=arr[start] && target<=arr[mid]) {   //LHS SearchSpace
                return recRBS(arr, target, start, mid -1);
            }else{
            return recRBS(arr, target, mid +1, end);
            }
        }

        if(target>=arr[mid] && target<=arr[end]){ //Lies in the Second Half
            return recRBS(arr, target, mid+1, end);
        }
            return recRBS(arr, target, start, mid -1);
    }
        
}
