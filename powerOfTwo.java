import java.util.*;
public class powerOfTwo{
    public boolean isPowerOfTwo(int n){
        if(n<=0){
            return false;
        }
        else if(n==1){
            return true;
        }else{
            while(n%2==0){
                n=n/2;
            }
            return n==1;
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();

        powerOfTwo obj=new powerOfTwo();
        if(obj.isPowerOfTwo(n)){
            System.out.println(n+ "is a power of two ");
        }
        else{
            System.out.println(n+ "is not a power of two ");
        

        }

    }
}