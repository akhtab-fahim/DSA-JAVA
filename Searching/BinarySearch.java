public class BinarySearch {
    static boolean search(int arr[],int a){
        if(arr.length==0) {return false;}
        boolean found = false;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==a){
                found = true;
                break;
            }
        }
        return found;
    }
    static int searchIndex(int arr[],int a){
        if(arr.length==0) {return -1;}
        for(int i:arr){
            if(arr[i]==a){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
    static int searchInRange(int arr[],int a,int s,int e){
        if(arr.length==0) {return -1;}
        for(int i=s;i<=e;i++){
            if(arr[i]==a){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
    static boolean  searchString(String name,char a){   //for whats in the i th element of String use string.charAt(i)
            boolean found = false;
            for(char c:name.toCharArray()){
                if(a==c){
                    found = true;
                    break;
                }
            }
            return found;
    }
    public static void main(String args[]){
        int arr[] = {2,56,1,23,766,8};
        String name = "fadachand";

        System.out.println(search(arr,1));
        System.out.println(searchIndex(arr,1));
        System.out.println(searchString(name,'c'));
        System.out.println(searchInRange(arr,56,1,4));

    }
}
