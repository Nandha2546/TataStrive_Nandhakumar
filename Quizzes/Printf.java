package Quizzes;

public class Printf {
    public static void main(String[] args) {
        int num = 010;
        System.out.printf("%d is the number", num);
        System.out.println();
        
        System.out.printf("|%-10s|%-10s|\n", "Name", "Age");

        System.out.printf("|%-10s|%-10d|\n", "Alice", 30);
    }
}
