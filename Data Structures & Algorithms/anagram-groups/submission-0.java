public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> seen = new HashMap<>();

        for (String word : strs) {
            int[] letters = new int[26];

            for (char letter : word.toCharArray()) {
                letters[letter - 'a']++;
            }

            StringBuilder signature = new StringBuilder();

            for (int eachLetter : letters) {
                signature.append(eachLetter);
                signature.append("$");
            }

            String key = signature.toString();

            if (seen.containsKey(key)) {
                seen.get(key).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                seen.put(key, list);
            }
        }

        return new ArrayList<>(seen.values());
    }
}