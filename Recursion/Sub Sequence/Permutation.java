
import java.util.ArrayList;

public class Permutation {
    static void permutation(String p,String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            permutation(first+ch+second, up.substring(1));
        }

    }

    static int permutationCount(String p,String up){
        if(up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            count+= permutationCount(first+ch+second, up.substring(1));
        }
        return count;
    }

    static ArrayList<String> permutationArr(String p,String up){
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        //local to the call 
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            ans.addAll(permutationArr(first+ch+second, up.substring(1)));
        }

    return ans;
    }

    public static void main(String[] args) {
        permutation("", "abc");
        System.out.println(permutationCount("", "abc"));
        ArrayList<String> ans = permutationArr("", "abc");
        System.out.println(ans);
    }
}
