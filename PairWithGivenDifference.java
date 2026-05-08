import java.util.Arrays;

public class PairWithGivenDifference {
    public boolean findPair(int[] arr, int size, int n) {
        Arrays.sort(arr);
        int i = 0, j = 1;
        while (i < size && j < size) {
            if (i != j && arr[j] - arr[i] == n) {
                return true;
            } else if (Math.abs(arr[j] - arr[i]) < n) {
                j++;
            } else {
                i++;
            }
        }
        return false;
    }
}
