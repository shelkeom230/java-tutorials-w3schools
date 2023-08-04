import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class prog38_files {
    public static void main(String[] args) {
        // creating a File
        try {
            // File obj = new File("myfile.txt");
            // if (obj.createNewFile()) {
            // System.out.println("file created successfully with name " + obj.getName());

            // write to file
            // FileWriter mywriter = new FileWriter("myfile.txt");
            // mywriter.write("omkar shelke\ndata scientist");
            // mywriter.close();
            // System.out.println("write successful check your file");

            // read the contents
            File obj = new File("myfile.txt");
            Scanner sc = new Scanner(obj);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // get info about file attributes
        File obj = new File("myfile.txt");
        System.out.println(obj.getName());
        System.out.println(obj.getAbsolutePath());
        System.out.println(obj.canWrite());
        System.out.println(obj.canRead());
        System.out.println(obj.length());
    }
}
