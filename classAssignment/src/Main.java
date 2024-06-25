import java.io.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.print("Enter a filename: ");
        String filename = new Scanner(System.in).nextLine();

        try {
            File file1 = new File(filename);
            Scanner fileScanner = new Scanner(file1);

            int numChars = 0;
            int numWords = 0;
            int numLines = 0;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                numLines++;
                numChars += line.length() + 1; // +1 for the newline character
                numWords += line.split("\\s+").length;
            }

            System.out.println("Number of characters: " + numChars);
            System.out.println("Number of words: " + numWords);
            System.out.println("Number of lines: " + numLines);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }
}