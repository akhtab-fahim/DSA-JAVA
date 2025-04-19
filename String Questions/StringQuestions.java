import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

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


        public String longestCommonPrefix(String[] str) {
            String ans = "";
            for(int i = 0;i<str[0].length();i++){
                char ch = str[0].charAt(i);
    
                boolean match = true;
                for(int j=1;j<str.length;j++){
                    if(str[j].length()<=i || str[j].charAt(i)!=ch) match = false;
                }
    
                if(match) ans+=ch;
            }
            return ans;
        }

        public String longestCommonPrefixOpt(String[] str) {
            String ans = "";
            int n = str.length;
            Arrays.sort(str);
            int i = 0;
            char first[] = str[0].toCharArray();
            char last[] = str[n-1].toCharArray();


            while(i<first.length){
                if(first[i]!=last[i]) break;
                else ans+=first[i];
            }
            return ans;
        }


        public boolean rotateString(String s, String goal) {
            if(s.length()!=goal.length()) return false;
            for(int i = 0;i<goal.length();i++){
                if(goal.charAt(i) == s.charAt(0)){
                    if(match(s,goal,i)) return true;
                }
            }
            return false;
        }

        private boolean  match(String s,String goal,int index){
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i) != goal.charAt((index+1)%goal.length())) return false;
            }
            return true;
        }

        public boolean rotateStringOpt(String s, String goal) {
            if(s.length()!=goal.length()) return false;
            return (s+s).contains(goal);
        }

        public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()) return false;
            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
         }

         public boolean isAnagramOpt(String s, String t) {
            if(s.length() != t.length()) return false;
            HashMap<Character,Integer> map1 = new HashMap<>();
            HashMap<Character,Integer> map2 = new HashMap<>();

            for(int i = 0;i<s.length();i++){
                char ch1 = s.charAt(i);
                char ch2 = t.charAt(i);
                
                map1.put(ch1, map1.getOrDefault(ch1, 0) + 1);
                map2.put(ch2, map2.getOrDefault(ch2, 0) + 1);
            }


            return map1.equals(map2);
        }


        public String frequencySort(String s) {
            HashMap<Character,Integer> map = new HashMap<>();
            for(char ch : s.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
            List<Character> list = new ArrayList<>(map.keySet());
            StringBuilder ans = new StringBuilder();
            list.sort((ob1,ob2) -> map.get(ob2)-map.get(ob1));
            
            for(char ch : list){
                for(int i = 0;i<map.get(ch);i++){
                    ans.append(ch);
                }
            }
            return ans.toString();
        }

        public int maxDepth(String s) {
            int depth = 0,maxDepth = -1;
            for(char ch : s.toCharArray()){
                if(ch=='(') depth++;
                if(ch==')') depth--;
                maxDepth = Math.max(depth, maxDepth);
            }
            return maxDepth;
        }

        public int romanToInt(String s) {
            int i = s.length()-1;
            int ans = 0;
            while(i >= 0){
                if(getNumericValue(s.charAt(i)) > getNumericValue(s.charAt(i-1))){
                    ans+= getNumericValue(s.charAt(i-1)) - getNumericValue(s.charAt(i));
                    i = i-2;
                }else{
                    ans+=getNumericValue(s.charAt(i));
                    i--;
                }
            }
            return ans;
        }
        private int getNumericValue(char c) {
            if (c == 'I') return 1;
            else if (c == 'V') return 5;
            else if (c == 'X') return 10;
            else if (c == 'L') return 50;
            else if (c == 'C') return 100;
            else if (c == 'D') return 500;
            else if (c == 'M') return 1000;
            else return 0; 
        }

public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int index = 0;
        char sign = '+';
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = s.charAt(index);
            index++;
        }

        long num = 0; 
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            num = num * 10 + (s.charAt(index) - '0');
            if(sign == '-' && -num<Integer.MIN_VALUE) num = Integer.MIN_VALUE;
            if(sign == '-' && -num>Integer.MIN_VALUE) num = Integer.MAX_VALUE;
            index++;
        }
        return (sign == '-') ? (int)(-num) : (int)num;
    }

    public String longestPalindrome(String s) {
        int left,right;
        StringBuilder ans = new StringBuilder();
        for(int i = 1;i<s.length();i++){
            left = i;
            right = i;
            while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
            StringBuilder pal = new StringBuilder(s.substring(left, right));
            if(pal.length()>ans.length()){
                ans = pal;
            }

        }
        return ans.toString();
    }

    public int beautySum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int minFreq = 0,maxFreq = 0;
        for(int freq : map.values()){
            minFreq = Math.min(freq, minFreq);
            maxFreq = Math.max(freq, maxFreq);
        }

        return maxFreq-minFreq;
    }

    public int beautySumOpt(String s){
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            int freq[] = new int[26];
            for(int j = i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int minFreq = Integer.MAX_VALUE,maxFreq = Integer.MIN_VALUE;
                    for(int fr : freq){
                        if(fr!=0){
                            minFreq = Math.min(minFreq, fr);
                            maxFreq = Math.max(maxFreq, fr);
                        }
                    }
                    sum += maxFreq - minFreq;
            }
        }
        return sum;
    }

    public int countHomogenous(String s) {
        int count = 0;
        int MOD = 1_000_000_007;
        for(int i = 0;i<s.length();i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j = i;j<s.length();j++){
                char ch = s.charAt(j);
                if(map.isEmpty()){
                    map.put(ch, 1);
                }
                if(!map.containsKey(ch)){
                    break;
                }
                map.put(ch, map.getOrDefault(ch, 0)+1);
                count = (count + 1)%MOD;
            }
        }
        return count;
    }


    public int countHomogenousOpt(String s) {
        int count = 0;
        int length = 1;
        int MOD = 1_000_000_007;

        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                length++;
            }else{
                int noOfSubstrings = (length * (length + 1))/2;
                count = (count +  noOfSubstrings) % MOD;
                length = 1;
            }
        }
        count = (count +  (length * (length + 1))/2) % MOD;
        return count;
    }

    public int lengthOfLongestSubstring(String s) {
        int streak = 0,maxStreak = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int i =0,startIndex = 0;
        while(i<s.length()){
            char c = s.charAt(i);
            if(map.containsKey(c) && map.get(c)>= startIndex){
                startIndex = map.get(c) + 1;
                streak = i - startIndex + 1;
            }else{
                streak++;
            }
            map.put(c, i);
            i++;
            maxStreak = Math.max(maxStreak, streak);

        }
        return maxStreak;
    }


}
