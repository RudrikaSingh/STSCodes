// Swap two nibbles in a byte
// ip: 240 
// op: 15
import java.util.Scanner;
class SwapNibs {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = n % 16;
    int b = n / 16;
    System.out.println((a * 16) + b);
  }
} 
