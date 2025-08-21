import java.io.*;
import java.util.Scanner;

public class FileRNW {
    public static void main(String[]args){

        String path = "D:\\\\Beast Gym\\\\My Files\\\\Java\\\\ZSGS Assgmnt\\\\Full Notes\\\\file2.txt";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the text :");
        String text = scan.nextLine();

        try(FileWriter fr = new FileWriter(path, true);
         BufferedWriter br = new BufferedWriter(fr)
        ){
           

            br.write(text);
            br.newLine();
            System.out.println("Successfully appended !!!");

            scan.close();
        }
        catch(IOException e){
            System.out.println("IOException : " + e.getMessage());
        }
    }
}
