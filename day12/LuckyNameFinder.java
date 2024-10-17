package day12;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuckyNameFinder {

    public static int getNumerologicalValue(String name) {
        int sum = 0;
        for (char c : name.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                sum += c - 'A' + 1;
            }
        }
        return sum;
    }

    public static List<String> findLuckyNames(String filename, int luckyNumber) {
        List<String> luckyNames = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String name;
            while ((name = br.readLine()) != null) {
                if (getNumerologicalValue(name) == luckyNumber) {
                    luckyNames.add(name);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return luckyNames;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your lucky number: ");
        int luckyNumber = scanner.nextInt();
        scanner.close();

        // Use the absolute path to the file
        List<String> luckyNames = findLuckyNames("C:\\Nandha\\myfile.txt", luckyNumber);

        System.out.println("Names with numerological sum matching your lucky number:");
        for (String name : luckyNames) {
            System.out.println(name);
        }
    }
}
