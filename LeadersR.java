// Leaders of an array: Reverse
import java.util.*;
class LeadersR {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    int max = Integer.MIN_INTEGER;
    
    for (int i = n - 1; i >= 0; i--) {
      if (max < a[i]) {
        max = a[i];
        System.out.print(max + " ");
      }
    }
    System.out.println();
  }
}
