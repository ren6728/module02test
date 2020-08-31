package api;

public class StringAPI {

    /**
     * @author Jahiudl Islam
     * Read String JDK 8 API documantation to be read and String source code to be viewed
     * Demonastrate your understanding on String after reading the documentation
     * You are free to document your understanding using comment
     * Reason to comment is to keep documentation so that next developer can get highlevel understaning of your implementation
     * by reading your comments/documents
     */
    public static void main(String args[]) {
        String s="java";
        String s1 = "java";//creating string by java string literal
        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch);//converting char array to string
        String s3 = new String("example");//creating java string by new keyword
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
