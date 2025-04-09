//google
import java.util.ArrayList;

public class LetterCominationOfPhoneNumber {
    public static void phonepad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;

        }
        int digit = up.charAt(0) -'0'; //converting into int 
        for(int index = (digit -1)*3;index<digit*3;index++){
            char ch = (char)('a'+ index);
            phonepad(p+ch, up.substring(1));
        }

    }

    public static int phonepadCount(String p,String up){
        if(up.isEmpty()){
            return 1;

        }
        int digit = up.charAt(0) -'0'; //converting into int 
        int count = 0;
        for(int index = (digit -1)*3;index<digit*3;index++){
            char ch = (char)('a'+ index);
            count += phonepadCount(p+ch, up.substring(1));
        }
        return count;

    }

    public static ArrayList<String> phonepadList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> ans= new ArrayList<>();
            ans.add(p);
            return ans;

        }
        int digit = up.charAt(0) -'0'; //converting into int
        ArrayList<String> ans = new ArrayList<>(); 
        for(int index = (digit -1)*3;index<digit*3;index++){
            char ch = (char)('a'+ index);
            ans.addAll(phonepadList(p+ch, up.substring(1)));
        }
        return ans;

    }
    public static void main(String[] args) {
        phonepad("","1");
        System.out.println(phonepadList("", "12"));
        System.out.println(phonepadCount("", "12"));
    }
}
