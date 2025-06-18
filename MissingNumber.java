import java.util.*;

public class MissingNumber{
    public int missingNum(int[] num){
        int range=num.length;

        int actualSum = (range * (range+1))/2;

        int currsum=0;

        for(int i=0;i<num.length;i++){
            currsum=currsum+num[i];
       }
                    int ans= actualSum-currsum;

                    return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements (n-1)");
        int n=sc.nextInt();
        int[] num=new int[n];
        System.out.println("Enter " + n + " elements (from 0 to " + n + " with one missing):");
        for (int i = 0; i < n; i++) {
            num[i]=sc.nextInt();
        }
            MissingNumber obj=new MissingNumber();
            int result= obj.missingNum(num);

            System.out.println("The Missing Number is "+result);           
        sc.close();
    }
}