import java.io.*;

public class Count {
    public static void main(String[] args) {
        String filePath = "D:\\file2.txt"; 

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                charCount += line.length();

                String[] words = line.trim().split("\\s+");

                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }
            }

            System.out.println("File statistics:");
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}