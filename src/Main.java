import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map<String, String> telexVietnamese = new HashMap<>();
    static {
        telexVietnamese.put("aw", "ă");
        telexVietnamese.put("aa", "â");
        telexVietnamese.put("dd", "đ");
        telexVietnamese.put("ee", "ê");
        telexVietnamese.put("oo", "ô");
        telexVietnamese.put("ow", "ơ");
        telexVietnamese.put("w", "ư");
    }
    public static void main(String[] args) {
        String input = "hfdawhwhcoomdd";
        int count = countVietnameseLetters(input);
        System.out.println(count);
    }
    public static int countVietnameseLetters(String input) {
        int count = 0;
        int i = 0;
        while (i < input.length() - 1) {
            String twoChars = input.substring(i, i + 2);
            String oneChar = input.substring(i, i + 1);
            if (telexVietnamese.containsKey(oneChar)) {
                count++;
                i++;
            } else if (telexVietnamese.containsKey(twoChars)) {
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        return count;
    }
}