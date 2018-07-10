
import java.util.Scanner;

public class SpellChecking2 {

    static int countMatch(String vocab, String word) {
        int match = 0;
        for (int i = 0; i < vocab.length() && i < word.length(); i++) {
            if (vocab.charAt(i) == word.charAt(i)) {
                match += 1;
            }
        }
        return match;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        String[] vocabs = new String[n];
        for (int i = 0; i < vocabs.length; i++) {
            vocabs[i] = sc.next();
        }

        final int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            String word = sc.next();
            int max = Integer.MIN_VALUE;
            int pos = -1;
            boolean same = false;
            for (int j = 0; j < vocabs.length; j++) {
                if (word.equals(vocabs[j])) {
                    System.out.println(word);
                    same = true;
                    break;
                }

                if (countMatch(vocabs[j], word) > max) {
                    max = countMatch(vocabs[j], word);
                    pos = j;
                }

            }

            if (!same) {

                System.out.println(vocabs[pos]);

            }

        }

    }
}
