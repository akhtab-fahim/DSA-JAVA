public class SkipChar {
    public static  void skip(String processed,String unprocessed,char miss ){
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        if(ch==miss){
            skip(processed, unprocessed.substring(1),miss);
        }else{
            skip(processed+ch, unprocessed.substring(1),miss);
        }
    }
    public static String skipStr(String processed){
        if(processed.isEmpty()) {
            
            return "";
        }

        char ch = processed.charAt(0);
        if(ch=='a'){
            return skipStr(processed.substring(1));
        }else{
            return ch+skipStr(processed.substring(1));
        }
    }

    public static String skipPortion(String processed){
        if(processed.isEmpty()) {
            
            return "";
        }
        if(processed.startsWith("apple")){
            return skipPortion(processed.substring(5));
        }else{
            return processed.charAt(0)+skipPortion(processed.substring(1));
        }
    }
    public static void main(String[] args) {
        skip("", "baccad",'a');
        System.out.println(skipStr("baccad"));
        System.out.println(skipPortion("skibidiapplegyat"));
    }
}
