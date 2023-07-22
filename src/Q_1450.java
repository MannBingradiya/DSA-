public class Q_1450 {
    public static void main(String[] args) {
        int[] startTime = {1,2,3}, endTime = {3,2,7};
        int queryTime = 4;
        System.out.println(busyStudent(startTime,endTime,queryTime));
    }

    private static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if ((startTime[i] <= queryTime) && (endTime[i] >= queryTime)) {
                count++;
            }
        }
        return count;
    }
}
