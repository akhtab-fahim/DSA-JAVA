public class ArraySorted {
    static boolean checkSorted(int arr[],int index){
        if(index==arr.length-1) return true;
        return arr[index]<arr[index+1] && checkSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,7,5,6,8,9};
        System.out.println(checkSorted(arr, 0));
    }
}
