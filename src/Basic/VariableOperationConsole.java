package Basic;

public class VariableOperationConsole {
    public static void main(String[] args) {
        // Section of String
        String firstName = "Java";
        String lastName = "Application";
        String fullName = firstName + " " + lastName;
        System.out.println("fullName --> " + fullName);

        // Section of Char
        char char1 = 'a';
        char char2 = 'b';
        String charCombine = String.valueOf(char1) + String.valueOf(char2);
        System.out.println("char1 + char2 --> " + charCombine);

        // Section of Number
        int number = 10;
        int plusNumber = 15;
        int summaryResult = number + plusNumber;
        System.out.printf("%d + %d = %d", number, plusNumber, summaryResult);
        System.out.println();

        number = 10;
        int subTractNumber = 5;
        int subTractResult = number - subTractNumber;
        System.out.printf("%d - %d = %d", number, subTractNumber, subTractResult);
        System.out.println();

        number = 10;
        int multiplyNumber = 5;
        int multiplyResult = number * multiplyNumber;
        System.out.printf("%d * %d = %d", number, multiplyNumber, multiplyResult);
        System.out.println();

        number = 10;
        int dividedByNumber = 5;
        int dividedResult = number / multiplyNumber;
        System.out.printf("%d / %d = %d", number, dividedByNumber, dividedResult);
        System.out.println();

        number = 10;
        int modNumber = 6;
        int modResult = number % modNumber;
        System.out.printf("%d mod %d = %d", number, modNumber, modResult);
        System.out.println();

        number = 10;
        modNumber = 3;
        modResult = number % modNumber;
        System.out.printf("%d mod %d = %d", number, modNumber, modResult);
        System.out.println();

        int baseNumber = 3;
        int powerNumber = 5;
        double resultPower = Math.pow(baseNumber, powerNumber);
        System.out.printf("%d ^ %d = %.1f", baseNumber, powerNumber, resultPower);
        System.out.println();

        // Section of float
        float floatNumber = 10.3f;
        float dividedByFloatNumber = 5.1f;
        float resultFloatOperation = floatNumber / dividedByFloatNumber;
        System.out.printf("%.2f / %.2f = %.5f", floatNumber, dividedByFloatNumber, resultFloatOperation);
        System.out.println();

        // Section of boolean
        boolean check = true;
        if (check == true) {
            System.out.println("true");
            System.out.println("check --> " + check);
        }

        check = false;
        if (check == false) {
            System.out.println("false");
            System.out.println("check --> " + check);
        }
    }
}
