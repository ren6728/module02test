package javainputoutput;
import java.io.*;
import java.util.*;
public class ReadFromAFileAndWriteInAnotherFile {

    /***
     * Read form a file XXXXXX write in a file YYYYYY
     *
     * */
    public static void main(String args[]) {
        try {
            File input = new File("input");
            File output = new File("output");
            Scanner sc = new Scanner(input);
            PrintWriter printer = new PrintWriter(output);
            while(sc.hasNextLine()) {
                String s = sc.nextLine();
                printer.write(s);
            }
        }
        catch(FileNotFoundException e) {
            System.err.println("File not found. Please scan in new file.");
        }
    }
}
