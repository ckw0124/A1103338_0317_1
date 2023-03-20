import java.util.Scanner;

public class A1103338_0317_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入n值：");
        int n = scanner.nextInt();
        System.out.print("請輸入m值：");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (i+1)*(j+1);
            }
        }

        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}