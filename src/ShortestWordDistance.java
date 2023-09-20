import java.util.Arrays;
import java.util.List;

public class ShortestWordDistance {
    public static int shortestDistance(List<String> words, String word1, String word2) {
        int index1 = -1;
        int index2 = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < words.size(); i++) {
            String currentWord = words.get(i);
            if (currentWord.equals(word1)) {
                index1 = i;
                if (index2 != -1) {
                    minDistance = Math.min(minDistance, index1 - index2);
                }
            } else if (currentWord.equals(word2)) {
                index2 = i;
                if (index1 != -1) {
                    minDistance = Math.min(minDistance, index2 - index1);
                }
            }
        }

        return minDistance;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("practice", "makes", "perfect", "coding", "makes");
        String word1 = "coding";
        String word2 = "practice";

        int shortestDistance = shortestDistance(words, word1, word2);
        System.out.println("Shortest distance between '" + word1 + "' and '" + word2 + "': " + shortestDistance);
    }
}
