import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public void printFrequencies(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i : arr) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " Frequency: " + entry.getValue());
        }
    }
}
