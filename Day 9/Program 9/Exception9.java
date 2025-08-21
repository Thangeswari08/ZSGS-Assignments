import java.io.*;
class Exception9 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }catch (IOException e) {
            System.out.println("IO error occurred.");
        }finally {
            try {
                if (reader != null) reader.close();
                } catch (IOException e) {
                System.out.println("Error closing file.");
             }
         }
     }
}
