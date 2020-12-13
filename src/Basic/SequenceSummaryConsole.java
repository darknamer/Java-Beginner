package Basic;

public class SequenceSummaryConsole {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        int summary = 0;

        for (int i = start; i <= end; i++) {
            summary = summary + i;
        }

        System.out.println("Summary is " + summary);
    }
}
