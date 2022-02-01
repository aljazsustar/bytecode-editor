import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BytecodeClassLoader extends ClassLoader {

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return super.loadClass(name);
    }

    public void loadClassFile(String name) throws IOException {
        Path path = Paths.get(name);
        byte[] data = Files.readAllBytes(path);

        for (byte d : data) {
            System.out.printf("%02X ", d);
        }
        System.out.println();
    }
}
