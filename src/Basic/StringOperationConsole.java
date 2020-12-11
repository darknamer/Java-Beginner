package Basic;

public class StringOperationConsole {
    public static void main(String[] args) {
        String name = "Full";
        System.out.println(name);

        String fullName  = name + " Name";
        System.out.println(fullName);

        String firstNumber = "1";
        String secondNumber = "2";
        String result = firstNumber + secondNumber;
        System.out.println(result);

        System.out.println("--- Result ---");
        System.out.printf("%s + %s = %s", firstNumber, secondNumber, result);
    }
}
