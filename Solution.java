import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            if (s.equals(":")) {
                sb.append(":::;");
            } else {
                sb.append(s);
                sb.append(":;");
            }
        }
        return sb.toString();
    }

    /*
     * @param str: A string
     * @return: decodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        // write your code here
        String[] arr = str.split(":;");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("::")) {
                arr[i] = ":";
            }
        }

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test encode method
        List<String> strs = Arrays.asList("hello", "world", ":");
        String encodedString = solution.encode(strs);
        System.out.println("Encoded: " + encodedString);

        // Test decode method
        String str = "hello:;world:;:::;";
        List<String> decodedList = solution.decode(str);
        System.out.println("Decoded: " + decodedList);
    }
}
