// Manoeuvring a cave
import java.util.*;
class MAC {
	static int paths(int r, int c) {
		if (r == 1 || c == 1) return 1;
		return paths(r - 1, c) + paths(r, c-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(paths(r, c));
	}
}
