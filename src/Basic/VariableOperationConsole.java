package Basic;

public class VariableOperationConsole {
    public static void main(String[] args) {
        int number = 10;
        int plusNumber = 15;
        int summaryResult = number + plusNumber;
        System.out.println(summaryResult);
        System.out.printf("%d + %d = %d", number, plusNumber, summaryResult);
        System.out.println();

        number = 10;
        int subTractNumber = 5;
        int subTractResult = number + subTractNumber;
        System.out.println(subTractResult);
        System.out.printf("%d - %d = %d", number, subTractNumber, subTractResult);
        System.out.println();

        int baseNumber = 3;
        int powerNumber = 5;
        double resultPower = Math.pow(baseNumber, powerNumber);
        System.out.println(resultPower);
        System.out.printf("%d ^ %d = %.1f", baseNumber, powerNumber, resultPower);
    }
}
