import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

    public class FileAnalyzer {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter file name");
            String fileName = scanner.nextLine();

            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                int charc,intc,linec;
                charc=0;
                intc=0;
                linec=0;


                while ((line = reader.readLine()) != null) {
                    charc += countCharacters(line);
                    intc += countWords(line);
                    linec++;
                }
                reader.close();

                System.out.println("Number of characters: " + charc);
                System.out.println("Number of words: " + intc);
                System.out.println("Number of lines: " + linec);
            } catch (IOException e) {
                System.out.println("File not found: " + fileName);
            }
        }

        public static int countCharacters(String line) {
            return line.length();
        }

        public static int countWords(String line) {
            String[] words = line.trim().split("\\s+");
            return words.length;
        }

        public static int countLines(String line) {
            return 1;
        }
    }

