import java.util.*;
public class fibonacci{
    public int fib(int x){
        if(x==0){
            return 0;
        }
        else if(x==1){
            return 1;
        }
        int firstTerm=0;
        int secondTerm=1;
        for(int i=2;i<=x;i++){
            int thirdTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=thirdTerm;
        }
        return secondTerm;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of fibonacci series");
        int x=sc.nextInt();

        fibonacci obj=new fibonacci();
        int result=obj.fib(x);

        System.out.println("Fibonacci number at postion "+x+ " is " + result);
        sc.close();

    }
}