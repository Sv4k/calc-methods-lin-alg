package out;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutput {
    private FileWriter out;

    public FileOutput(String filename) {
        try {
            out = new FileWriter(filename);
        }
        catch (IOException e) {
            System.out.println("Wrong filename");
        }
    }

    public void print(String outputInformation) {
        try {
            out.write(outputInformation + "\n");
            out.flush();
        }
        catch (IOException e) {
            System.out.println("Unexpected exception while outputting data");
        }
    }
}
