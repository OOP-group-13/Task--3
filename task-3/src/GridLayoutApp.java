    import javax.swing.*;
    import java.awt.*;

    public class GridLayoutApp extends JFrame {

        JPanel panel1, panel2, panel3;

        public GridLayoutApp() {
            setTitle("Grid Layout Example");

            // Maximize window
            setExtendedState(JFrame.MAXIMIZED_BOTH);

            // Set layout
            setLayout(new GridLayout(1, 3));

            // Initialize panels
            panel1 = new JPanel();
            panel2 = new JPanel();
            panel3 = new JPanel();

            // Set background colors
            panel1.setBackground(Color.RED);
            panel2.setBackground(Color.GREEN);
            panel3.setBackground(Color.BLUE);

            // Add panels
            add(panel1);
            add(panel2);
            add(panel3);

            // Close operation
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            


        }

    }
