import java.util.*;
public class CountWordsInString {
    public int countWords(String s) {
        if (s == null || s.isEmpty()) return 0;
        String[] words = s.trim().split("\\s+");
        return s.trim().isEmpty() ? 0 : words.length;
    }
}
