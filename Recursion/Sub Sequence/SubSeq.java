
import java.util.ArrayList;

public class SubSeq {
    static void  subSeq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch, up.substring(1));        //take
        subSeq(p, up.substring(1));        //remove
    }
    static ArrayList<String> subSeqList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqList(p+ch, up.substring(1));        //take
        ArrayList<String> right = subSeqList(p, up.substring(1));        //remove

        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
        subSeq("", "abc");
        System.out.println(subSeqList("", "abcd"));
    }
}
    