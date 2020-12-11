package Basic;

public class FrogJumpConsole {
    public static void main(String[] args) {
        int round = 15;
        int jump = 3;
        int distance = 0;
        int time = 0;

        distance = distance + jump;
        time = time + 1;

        while (distance % round != 0) {
            distance = distance + jump;
            time = time + 1;
        }

        System.out.printf("Jump %d times", time);
        System.out.println();
    }
}
