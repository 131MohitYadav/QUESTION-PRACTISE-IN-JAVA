
//Java: Check whether Java is installed on your computer
public class Question20 {
    public static void main(String args[]) {
        // Display Java version
        System.out.println("Java Version: " + System.getProperty("java.version"));

        // Display Java runtime version
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));

        // Display Java Home directory
        System.out.println("Java Home: " + System.getProperty("java.home"));

        // Display vendor Name
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));

        // Display vendor url
        System.out.println("Java Vendor Url: " + System.getProperty("java.vendor.url"));

        // Display class path
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));

    }
    }

