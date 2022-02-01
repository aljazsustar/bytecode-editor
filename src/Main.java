import java.io.IOException;

public class Main {

    public static void main(String... args) throws ClassNotFoundException, IOException {
        BytecodeClassLoader cl = new BytecodeClassLoader();
        Class<?> c = cl.loadClass("Test");
        System.out.println(c.toGenericString());
        cl.loadClassFile("out/production/bytecode-editor/Test.class");
        int concatenated = Util.concatBytes(new byte[] {(byte)0xCA, (byte)0xFE, (byte)0xBA, (byte)0xBE});
        System.out.printf("%X\n", concatenated);
    }
}
