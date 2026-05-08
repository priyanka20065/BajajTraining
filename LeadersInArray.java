import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public ArrayList<Integer> leaders(int arr[], int n) {
        ArrayList<Integer> result = new ArrayList<>();
        int maxFromRight = arr[n - 1];
        result.add(maxFromRight);
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                result.add(maxFromRight);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
