import java.io.*;

public class Fileread {
    public static void main (String[]args){
        String filepath = "D:\\Beast Gym\\My Files\\Java\\ZSGS Assgmnt\\Full Notes\\file2.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(filepath))){
            String line;
            System.out.println("File contents:");
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found :" + e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error Reading file :" + e.getMessage());
        }
    }
}
