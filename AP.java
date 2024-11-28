// Activity Problem
import java.util.Scanner;

class AP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s[] = new int[n];
		for (int i = 0; i < n; i++) s[i] = sc.nextInt();
		int m = sc.nextInt();
		int f[] = new int[m];
		for (int i = 0; i < m; i++) f[i] = sc.nextInt();
		System.out.print("0" + " ");
		int i = 0, j = 1;
		for (j = 1; j < m; j++) {
			if (s[j] > f[i]) {
				System.out.print(j + " ");
				i = j;
			}
		}
	}
}
