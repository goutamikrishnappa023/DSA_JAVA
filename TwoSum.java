import java.util.*;
public class TwoSum{
    public int[] twosums(int[] nums, int target){
        int[] ans =new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }

        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();

        int[] nums=new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int target=sc.nextInt();

        TwoSum obj=new TwoSum();

        int result[]=obj.twosums(nums, target);

        System.out.println("The result is "+Arrays.toString(result));
        sc.close();


   }
}
