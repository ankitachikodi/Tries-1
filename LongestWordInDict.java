// Time complexity: ON(LogN)+O(N)
// Space complexity: O(N)
class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);

        Set<String> set = new HashSet<String>();
        String res = "";
        for (String word : words) {
            if (word.length() == 1 || set.contains(word.substring(0, word.length() - 1))) {
                res = word.length() > res.length() ? word : res;
                set.add(word);
            }
        }
        return res;
    }
}