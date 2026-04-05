import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloWorldTest {

    public static void main(String[] args) {
        testOutput();
        System.out.println("All tests passed!");
    }

    static void testOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        HelloWorld.main(new String[]{});

        System.setOut(new PrintStream(new java.io.FileOutputStream(java.io.FileDescriptor.out)));

        String output = out.toString().trim();
        assert output.equals("Hello, World!") : "Expected 'Hello, World!' but got '" + output + "'";
        System.out.println("testOutput: PASSED");
    }
}
