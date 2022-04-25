package string.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {

    public static StringBuilder readData(String path) throws IOException {
        StringBuilder builder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            builder.append(line);
        }
        return builder;
    }
}
