package fileio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test4 {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("abc.txt");
        BufferedReader b= Files.newBufferedReader(path);
        System.out.println(b.readLine());
        System.out.println(b.readLine());
        System.out.println(b.readLine());
    }
}
