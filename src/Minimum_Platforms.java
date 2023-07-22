import javax.sound.midi.MidiFileFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Minimum_Platforms {
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        int n = 3;
        System.out.println(findPlatform(arr, dep, n));
    }

    private static int findPlatform(int[] arr, int[] dep, int n) {
        int[][] platform = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            platform[i][0] = arr[i];
            platform[i][1] = dep[i];
        }

        Arrays.sort(platform, Comparator.comparingDouble(o -> o[1]));

        int count = 1;
        int numOfPlat = 0;
        while(count != arr.length){
            int last = platform[0][1];
            for (int i = 1; i < arr.length; i++) {
                if (platform[i][0] > last && arr[i] != dep[i]) {
                    count++;
                    arr[i] = 0;
                    dep[i] = 0;
                    last = platform[i][1];
                }
            }
            numOfPlat++;
        }
        return numOfPlat;
    }
}
