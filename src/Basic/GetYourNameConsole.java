package Basic;

import java.util.Scanner;

public class GetYourNameConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        System.out.println(firstName + " " + lastName);
    }
}
