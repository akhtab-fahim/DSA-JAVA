import java.util.Stack;

public class MInAddToMakeParenthesisValid {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch==')'){
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }else{
                st.push(ch);
            }
        }
        return st.size();
    }


    public static int minAddToMakeValidTry(String s) {
        Stack<Character> st = new Stack<>();
        int size = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
                size ++;
            }else{
                if( ch==')' ){
                    if(!st.isEmpty() && st.peek()=='('){
                        st.pop();
                        size--;
                    } else {
                        size++;
                    }
                }
                if( ch=='}' ){
                    if(!st.isEmpty() && st.peek()=='{'){
                        st.pop();
                        size--;
                    } else {
                        size++;
                    }
                }
                if( ch==']' ){
                    if(!st.isEmpty() && st.peek()=='['){
                        st.pop();
                        size--;
                    } else {
                        size++;
                    }
                }
            }
        }
        return size;
    }

    public static void main(String[] args) {
        String s = "())";
        System.out.println(minAddToMakeValid(s));
    }
}
