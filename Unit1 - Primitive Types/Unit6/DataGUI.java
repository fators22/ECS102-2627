import javax.swing.*;

import java.awt.*;

public class DataGUI extends JFrame {
    

    public DataGUI() {
        // Set up the JFrame
        setTitle("Data Visualizer");
        setSize(800, 800);
        setLayout(new FlowLayout());


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

  
    public static void main(String[] args) {
        new DataGUI();
    }
}
