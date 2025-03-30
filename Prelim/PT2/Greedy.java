import java.util.Arrays;
import java.util.Comparator;

public class Greedy {
    static class Activity {
        int start, end;
        Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void activitySelection(Activity[] activities) {
        Arrays.sort(activities, Comparator.comparingInt(a -> a.end));
        System.out.println("Selected Activities:");

        int lastEnd = -1;
        for (Activity a : activities) {
            if (a.start >= lastEnd) {
                System.out.println("(" + a.start + ", " + a.end + ")");
                lastEnd = a.end;
            }
        }
    }

    public static void main(String[] args) {
        Activity[] activities = {
            new Activity(1, 4), new Activity(3, 5), new Activity(0, 6),
            new Activity(5, 7), new Activity(3, 8), new Activity(5, 9),
            new Activity(6, 10), new Activity(8, 11), new Activity(8, 12),
            new Activity(2, 13), new Activity(12, 14)
        };
        activitySelection(activities);
    }
}
