import java.util.*;

/**
 * 电话号码的字母组合
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 */
public class LeetCode_17_588 {

    public List<String> letterCombinations(String digits) {
        if (null == digits || 0 == digits.length()) {
            return new ArrayList<>();
        }

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> res = new LinkedList<>();
        search("", digits, 0, res, map);
        return res;
    }

    private void search(String s, String digits, int i, List<String> res, Map<Character, String> map) {
        if (i == digits.length()) {
            res.add(s);
            return;
        }

        String letters = map.get(digits.charAt(i));
        for (int j = 0; j < letters.length(); j ++) {
            search(s + letters.charAt(j), digits, i + 1, res, map);
        }
    }

    public static void main(String[] args) {

        LeetCode_17_588 solution = new LeetCode_17_588();
        System.out.println(solution.letterCombinations("23"));
    }
}

