package lab;

public class WordCount {
    public static void main(String[] args) {
        String input = "java is programming language it is widely used in many. Java is platform independent java supports multithreading..... keyword used java";
        
        findWord("java", input);
        findWord("language", input);
    }

    public static void findWord(String word, String input) {
        String[] words = input.toLowerCase().split(" ");
        int count = 0;

        System.out.println("Word: " + word);

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                count++;
                System.out.println("Found at position: " + i);
            }
        }

        System.out.println("Total occurrences: " + count);
        System.out.println();
    }
}

