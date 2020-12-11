package Basic;

import java.util.Scanner;

public class DisplayChristmasTreeConsole {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input rows: ");
        int row = reader.nextInt();
        triangleShape(row);
    }

    private static void triangleShape(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
