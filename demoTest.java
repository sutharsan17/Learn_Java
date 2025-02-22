import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DemoTest {

    @Test
    public void testMain() {
        // Capture the output of the main method
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the main method
        Demo.main(new String[]{});

        // Verify the output
        assertEquals("Hello World\n", outContent.toString());
    }
}