import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.*;

public class GridLayoutAppIntegrationTest {

    @Test
    void testApplicationLaunch() throws Exception {
        GridLayoutApp[] app = new GridLayoutApp[1];

        SwingUtilities.invokeAndWait(() -> {
            app[0] = new GridLayoutApp();
        });

        JFrame frame = app[0];

        // Check visibility
        assertTrue(frame.isVisible());

        // Check window is maximized
        assertEquals(JFrame.MAXIMIZED_BOTH, frame.getExtendedState());

        // Check panel count
        assertEquals(3, frame.getContentPane().getComponentCount());

        frame.dispose();
    }
}

