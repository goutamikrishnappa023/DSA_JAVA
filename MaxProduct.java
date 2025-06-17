import java.util.*;
public class MaxProduct{
    public int maxprod(int[] nums){
        int max=-1;
        int smax=-1;
        for(int i=0;i<nums.length;i++){
            
        if(max<nums[i]){
            smax=max;
            max=nums[i];
        }
        else if(smax<nums[i]){
            smax=nums[i];
        }
        }
        int ans=(max-1)*(smax-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
        MaxProduct obj=new MaxProduct();

        int result=obj.maxprod(nums);
        System.out.println("The ans is "+result);
        sc.close();
    }
}