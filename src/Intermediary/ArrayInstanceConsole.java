package Intermediary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class ArrayInstanceConsole {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int number : numbers) {
            System.out.println(number);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        Random rand = new Random();
        int[] randNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            randNumbers[i] = rand.nextInt(10);
        }
        for (int i = 0; i < randNumbers.length; i++) {
            System.out.println(randNumbers[i]);
        }
        for (int num: randNumbers) {
            System.out.println(num);
        }

        String message = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String[] changeToCharacters = message.split(" ");
        String removeSpace = message.replace(" ", "");
        String splitUsername = "darknamer@gmail.com".split("@")[0];
        for (String changeToCharacter: changeToCharacters) {
            System.out.println(changeToCharacter);
        }

    }

    public static void ReadFile() {
        try {
            File file = new File("D:\\faker_users.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
