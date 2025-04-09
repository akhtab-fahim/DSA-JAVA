
import java.util.ArrayList;

public class RecursiveLinearSearch {
    static int linearSearch(int arr[],int target,int index){
        if(index==arr.length-1) return -1;
        if(target==arr[index]) return index;
        return linearSearch(arr, target, ++index);
    }
    static boolean boolLinearSearch(int arr[],int target,int index){
        if(index==arr.length-1) return false;
        return target==arr[index] || boolLinearSearch(arr, target, ++index);
    }
    public static void main(String[] args) {
        int arr[]={3,2,1,18,9};
        int arr1[]={3,2,1,18,9,12,14,18,9};
        // System.out.println(linearSearch(arr, 10, 0));
        // System.out.println(boolLinearSearch(arr, 1, 0));
        // ArrayList<Integer> ans = allLinearSearch(arr1, 18, 0, new ArrayList<>());
        // System.out.println(ans);
        System.out.println(allLinearSearch2(arr1, 18, 0));
    }
    static ArrayList<Integer> allLinearSearch(int arr[],int target,int index,ArrayList<Integer> list){
        if(index==arr.length) return list;
        if(target==arr[index]) list.add(index);
        return allLinearSearch(arr, target, ++index,list);
    }

    static ArrayList<Integer> allLinearSearch2(int arr[],int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length) return list;
        //that list will contain the index only for that particular function call
        if(target==arr[index]) list.add(index);

        ArrayList<Integer> ansFromBelow = allLinearSearch(arr, target, ++index,list);
        list.addAll(ansFromBelow);
        return list;  
    }
}
 