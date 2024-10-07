import java.util.*;

/**
 * 3. 无重复字符的最长子串
 *
 * @see [https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/?envType=study-plan
 * -v2&envId=top-100-liked
 */
class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            // 判断是不是出现过，如果出现过，就把 left 移动到出现过的位置的下一个位置
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }


    public static int lengthOfLongestSubstring_self(String s) {
        // 0 和 1 的情况
        if (s.length() < 2) {
            return s.length();
        }
        Map<String, String> stringMap = new HashMap<>();
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            stringMap.put(String.valueOf(s.charAt(i)), String.valueOf(s.charAt(i)));
            int j = i + 1;
            while (j < (s.length())) {
                if (stringMap.containsKey(String.valueOf(s.charAt(j)))) {
                    break;
                }
                stringMap.put(String.valueOf(s.charAt(j)), String.valueOf(s.charAt(j)));
                j++;
            }
            int currentSize = stringMap.size();
            if (currentSize > maxLength) {
                maxLength = currentSize;
            }
            //  清空 map
            stringMap.clear();
        }
        return maxLength;
    }
}

