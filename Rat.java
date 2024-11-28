import java.util.*;
class Rat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int a[][] = new int[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j , c; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    int[][] sol = new int[r][c];
    if(path(a, r, c, 0, 0, sol)) {
      for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) System.out.print(sol[i][j] + " ");
        System.out.println();
      }
    } else System.out.println("No path found");
  }
  static boolean path(int[][] a, int r, int c, int i, int j, int[][] sol) {
    if (i == r - 1 && j == c - 1 && a[i][j] == 1) {
      sol[i][j] = 1;
      return true;
    }
    if (isPath(a, r, c, i, j)) {
      sol[i][j] = 1;
      if(path(a, r, c, i+1, j)) return true;
      if(path(a, r, c, i, j+1)) return true;
      sol[i][j] = 0;
    }
    return false;
  }
  static boolean isPath(int[][] a, int r, int c, int i, int j) {
    return(i >= 0 && j >= 0 && i < r && j < c && a[i][j] == 1);
  }
}
