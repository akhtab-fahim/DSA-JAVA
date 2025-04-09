public class MaxSubstring {
    public static void main(String[] args) {
        int arr[] = {2,5,1,10,10};
        System.out.println(findMaxSubString(arr,14));

    }
    public static int findMaxSubString(int arr[],int k){
        int sum = 0,l=0,r=0;
        int maxLength = 0; 

        while(r<=arr.length-1){
            sum = sum + arr[r];
            while(sum>k){
                sum = sum - arr[l];
                l++;
            }
            if(sum <= k){
                maxLength = Math.max(maxLength, r-l+1);
            }
            r++;
            
        }

        return maxLength;

    }
}
