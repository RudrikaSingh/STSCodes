// Binary Palindrome
// ip : 9
// op : true
import java.util.*;
class BPN {
    public static boolean isPal(int n)
        {
            int reverse = 0;
            int temp = n;
            while (temp != 0) {
                reverse = (reverse * 10) + (temp % 10);
                temp = temp / 10;
            }
            return (reverse == n);
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);   
            int n = sc.nextInt();
            System.out.println(isPal(n));
    }
}
