import java.util.Scanner;
 class ReverseWordsRecursively {

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
        for (String word : words) {
            reversedParagraph.append(reverseWord(word)).append(" ");
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

