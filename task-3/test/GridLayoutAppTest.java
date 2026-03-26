
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.*;
import java.awt.*;

    public class GridLayoutAppTest {

        @Test
        void testLayoutAndPanels() throws Exception {
            GridLayoutApp[] app = new GridLayoutApp[1];

            SwingUtilities.invokeAndWait(() -> {
                app[0] = new GridLayoutApp();
            });

            JFrame frame = app[0];

            // Check layout
            assertTrue(frame.getLayout() instanceof GridLayout);

            GridLayout layout = (GridLayout) frame.getLayout();
            assertEquals(1, layout.getRows());
            assertEquals(3, layout.getColumns());

            // Check components count
            assertEquals(3, frame.getContentPane().getComponentCount());

            // Check colors
            Component c1 = frame.getContentPane().getComponent(0);
            Component c2 = frame.getContentPane().getComponent(1);
            Component c3 = frame.getContentPane().getComponent(2);

            assertEquals(Color.RED, c1.getBackground());
            assertEquals(Color.GREEN, c2.getBackground());
            assertEquals(Color.BLUE, c3.getBackground());

            frame.dispose(); // clean up
        }
    }

