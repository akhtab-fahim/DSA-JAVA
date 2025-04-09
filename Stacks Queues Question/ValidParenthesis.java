import java.util.Stack;

public class ValidParenthesis {
    public boolean isValidParenthesis(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else{
                if(ch == ')' ){
                    if(st.isEmpty()|| st.pop() != '(' ){ return false;}
                }
                if(ch == '}' ){
                    if(st.isEmpty()|| st.pop() != '{' ){ return false;}

                }
                if(ch == ']' ){
                    if(st.isEmpty()|| st.pop() != '[' ){ return false;}

                }
            }

        }
        return st.isEmpty();
    }
}
