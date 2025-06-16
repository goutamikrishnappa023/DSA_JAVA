import java.util.*;

public class palindrome {
    
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int n = x;
        int revnum = 0;

        while (n > 0) {
            int d = n % 10;
            revnum = revnum * 10 + d;
            n = n / 10;
        }

        return revnum == x;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is palindrome:");
        
        int x = sc.nextInt(); 

        palindrome obj = new palindrome();
        if (obj.isPalindrome(x)) {
            System.out.println(x + " is a palindrome");
        } else {
            System.out.println(x + " is not a palindrome");
        }

        sc.close(); 
    }
}
