import java.util.ArrayList;

public class SubarrayWithGivenSum {
    public ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int start = 0;
        int currentSum = 0;
        ArrayList<Integer> res = new ArrayList<>();
        
        for (int end = 0; end < n; end++) {
            currentSum += arr[end];
            while (currentSum > s && start < end) {
                currentSum -= arr[start];
                start++;
            }
            if (currentSum == s) {
                res.add(start + 1);
                res.add(end + 1);
                return res;
            }
        }
        res.add(-1);
        return res;
    }
}
