// ip : 14 2
// op : 13
import java.util.*;
class Jos {
	static int jo(int n, int k) {
		if (n == 1) return 1;
		return (jo(n - 1, k)+k-1) % n + 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(jo(n,k));
	}
}
