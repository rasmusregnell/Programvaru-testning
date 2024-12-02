import java.io.*;

public class StringFinder{

    public static void main(String[] args) {
        if(args.length != 3 && args[0] != "search") {
            System.out.println("Command must be of the form: search <pattern> <file>");
        } else {
            var pattern = args[1];
            var filename = args[2];
            printLinesInFile(filename, pattern);
        }
    }

    public static void printLinesInFile(String filename, String pattern) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(pattern)) {
                    System.out.println(line + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
