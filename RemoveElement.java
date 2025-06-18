import java.util.*;

public class RemoveElement {
    public int remEle(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the number to be deleted: ");
        int val = sc.nextInt();

        RemoveElement obj = new RemoveElement();
        int newLength = obj.remEle(nums, val);

        System.out.println("Array after removing " + val + ":");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nNew length of array: " + newLength);

        sc.close();
    }
}
