import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Sample {
    public static void main(String[] args) throws IOException {

        String name = "edie.txt";

        FileWriter fileWriter = new FileWriter(name);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        fileWriter.write("Hello");
        bufferedWriter.close();


    }
}
