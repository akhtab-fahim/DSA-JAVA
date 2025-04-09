import java.awt.image.RescaleOp;
import java.util.HashMap;
import java.util.Stack;
import javax.swing.event.AncestorEvent;

public class StringQuestions {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        for(char c : s.toCharArray()){
            if(c == '('){
                if(!st.isEmpty()){
                    ans += c;
                }
                st.push(c);
            }else{
                st.pop();
                if(!st.isEmpty()){
                    ans += c;
                }
            }
        }
        return ans;
    }

    public String reverseWords(String s) {
        StringBuilder string = new StringBuilder(s.trim());
        StringBuilder ans = new StringBuilder();
        string.reverse();
        int i=0;
        while(i<string.length()){

            if(string.charAt(i)==' '){
                i++;
                continue;
            }

            StringBuilder word = new StringBuilder();

            while(i<string.length() && string.charAt(i)!=' '){
                word.append(string.charAt(i));
                i++;
            }

            ans.append(word.reverse().append(' '));

        }
        return ans.toString();
    }

    public String reverseWords2(String s) {
        String[] words = s.split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i = words.length;i>=0;i--){
            ans.append(words[i]);
            if(i !=0 ) ans.append(' ');
        }
        return ans.toString().trim();
    }

    public String largestOddNumber(String num) {
        for(int i = num.length()-1;i>=0;i--){
            int digit = Character.getNumericValue(num.charAt(i));
            if (digit % 2 != 0) {
                return num.substring(0, i+1);
            }
        }
        return "";
    }

    public boolean isIsomorphic(String s, String t) {
        if(s.length() == t.length() && findSimilarChar(s) == findSimilarChar(t))   return true;
        else return false;
    }

    private int findSimilarChar(String str){
        int count = 0;
        for(int i = 0;i<str.length();i++){
            for(char c : str.toCharArray()){
                if(str.charAt(i) == c){
                    count++;
                }
            }
        }
        return count;
    }


    public boolean isIsomorphicOptimal(String s, String t) {
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();

        for(int i =0;i<s.length();i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if(map1.containsKey(charS)){
                if(map1.get(charS)!=charT) return false;
                else map1.put(charS, charT);
            }

            if(map1.containsKey(charT))
                if(map1.get(charT)!=charS) return false;
                else map1.put(charT, charS);
            }

            return true;
        }
    }
}
