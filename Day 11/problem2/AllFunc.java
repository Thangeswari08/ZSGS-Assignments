import java.util.*;
import java.io.*;

public class AllFunc {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n______________FILE OPERATIONS______________");
            System.out.println("1) Write content to a file");
            System.out.println("2) Copy content from one file to another");
            System.out.println("3) Modify content of a file");
            System.out.println("4) Search for a word and count it's frequency");
            System.out.println("5) Convert a .txt to .csv ");
            System.out.println("6) Enter your choice");
            System.out.println("Enter your choice :");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    writeFile();
                case 2:
                    copyFile();
                case 3:
                    modifyFile();
                case 4:
                    searchFile();
                case 5:
                    convertToCSV();
                case 6: {
                    System.out.println("👋 Tata Gudu bye!!!. Have a great day!");
                    return;
                }
                default:
                    System.out.println("Invalid Choice!! Try again");
            }
        }
    }

    static void writeFile() {
        System.out.println("Enter your file path:");
        String path = scan.nextLine();
        System.out.println("Enter the content :");
        String content = scan.nextLine();

        try (BufferedWriter br = new BufferedWriter(new FileWriter(path))) {
            br.write(content);
            br.newLine();
        } catch (IOException e) {
            System.out.println("IOException :");
        }
    }

    static void copyFile() {
        System.out.println("Enter the Source file path : ");
        String spath = scan.nextLine();
        System.out.println("Enter the destination file path : ");
        String dpath = scan.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(spath));
                BufferedWriter bw = new BufferedWriter(new FileWriter(dpath))) {
            String line;

            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File copied successfully !!!");

        } catch (IOException e) {
            System.out.println("IOException :");
        }
    }

    static void modifyFile() {
        System.out.println("ENter the filepath to modify :");
        String path = scan.nextLine();
        System.out.println("ENter the content to modify :");
        String text = scan.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(text);
            bw.newLine();

            System.out.println("Modified Successfully !!!");
        } catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        }
    }

    static void searchFile() {
        System.out.println("Enter the path :");
        String path = scan.nextLine();
        System.out.println("Enter the word to search:");
        String word = scan.nextLine();

        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String w : words) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
            System.out.println("The word " + word + "appears" + count + " times");
        } catch (IOException e) {
            System.out.println("IOException :");
        }
    }

    static void convertToCSV() {
        System.out.print("Enter .txt file with product list: ");
        String txtFile = scan.nextLine();
        System.out.print("Enter destination .csv file: ");
        String csvFile = scan.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(txtFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {

            String line;
            bw.write("Product Name");
            bw.newLine();

            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("✅ Converted to CSV: " + csvFile);
        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

    }
}
