import java.util.*;
public class waterBottles{
    public int numWaterBottles(int bt, int exchange){
        int ans=bt;
         while(bt>=exchange){
            int newBottles= bt/exchange;
            int remBottles=bt%exchange;
            ans=ans+newBottles;
            bt=newBottles + remBottles;

         }
         return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of filled Water bottles");
        int bt= sc.nextInt();
        System.out.println("Enter the exchange number of bottles");
        int exchange=sc.nextInt();
         
         waterBottles obj=new waterBottles();

         int result= obj.numWaterBottles(bt,exchange);

         System.out.println("The total number of bottles that can be filled is "+result );
        sc.close();
    }
    
}