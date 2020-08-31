package api;
import java.io.FileInputStream;
import java.util.Properties;
public class SystemAPI {

    /**
     * @author Jahidul Islam
     * Read System JDK 8 API documantation to be read and System source code to be viewed
     * Demonastrate your understanding on System after reading the documentation
     * Show some uses of System Class
     * Explain, what is System.out.println()?
     * List all the members of the System class, such as class variable, instance variables, local variables
     * method type etc
     *
     * */
   /** System.out.println is a Java statement that prints the argument passed, into the System.out which is generally stdout.

            System – is a final class in java.lang package. As per javadoc, “…Among the facilities provided by the System class
    are standard input, standard output, and error output streams; access to externally defined properties and environment variables;
    a means of loading files and libraries; and a utility method for quickly copying a portion of an array…“
            out – is a static member field of System class and is of type PrintStream. Its access
    specifiers are public final. This gets instantiated during startup and gets mapped with
    standard output console of the host. This stream is open by itself immediately after its
    instantiation and ready to accept data.
            println – is a method of PrintStream class. println prints the argument passed to the
    standard console and a newline. There are multiple println methods with different arguments
    (overloading). Every println makes a call to print method and adds a newline.
    print calls write() and the story goes on like that.**/


  /* Scanner s = new Scanner(System.in);
    Above statement creates an object of Scanner class which is defined in
    java.util.scanner package. Scanner class allows user to take input from console.

    System.in is passed as a parameter in Scanner class. It tells the java compiler
    that system input will be provided through console(keyboard). */



        public static void main(String[] args)
                throws Exception {

            // set up new properties object
            // from file "myProperties.txt"
            FileInputStream propFile =
                    new FileInputStream( "myProperties.txt");
            Properties p =
                    new Properties(System.getProperties());
            p.load(propFile);

            // set the system properties
            System.setProperties(p);
            // display new properties
            System.getProperties().list(System.out);
        }
    }

