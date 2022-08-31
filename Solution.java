import java.util.Scanner;

class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int ans=Integer.MIN_VALUE;
        int ans1=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int a=sum+nums[i];
            if(a>0){
             sum+=nums[i];
             ans=Integer.max(ans,sum);
            }
            else{
                sum=a;
                ans1=Integer.max(ans1, sum);
                sum=0;
            }
        }
        return Integer.max(ans, ans1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution a=new Solution();
        int ans=a.maxSubArray(arr);
        System.out.println(ans);
    }
}
