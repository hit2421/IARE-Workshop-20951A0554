import java.util.Scanner;

class ReverseWordsMultithreaded {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a paragraph: ");
        String paragraph = scanner.nextLine();
        String reversedParagraph = reverseWords(paragraph);
        System.out.println("Reversed paragraph: " + reversedParagraph);
    }

    public static String reverseWords(String paragraph) {
        String[] words = paragraph.split("\\s+");
        StringBuilder reversedParagraph = new StringBuilder();
        Thread[] threads = new Thread[words.length];
        for (int i = 0; i < words.length; i++) {
            final int index = i;
            threads[i] = new Thread(() -> {
                reversedParagraph.append(reverseWord(words[index])).append(" ");
            });
            threads[i].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return reversedParagraph.toString().trim();
    }

    public static String reverseWord(String word) {
        if (word.length() == 0) {
            return "";
        }
        return word.charAt(word.length() - 1) + reverseWord(word.substring(0, word.length() - 1));
    }
}

