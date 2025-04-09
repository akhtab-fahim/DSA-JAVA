import java.util.ArrayList;
import java.util.List;

public class SubSeqInttr {
    public static List<List<Integer>> subset(int arr[]){
        List<List<Integer>> outer = new ArrayList<>();
        
        outer.add(new ArrayList<>());
        for(int num : arr){
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i)); //outer is getting copied in the internal 
                internal.add(num);
                outer.add(internal);//adding the internal to the outer  
            }
        }
        return outer;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3};
        List<List<Integer>> ans = subset(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }
}
