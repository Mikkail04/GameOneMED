import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameGUI extends JFrame{
    public GameGUI(){
        JFrame start_frame = new JFrame("Video Game Project");
        int width = 1200;
        int height = 800;
        start_frame.setSize(width, height);
        start_frame.setVisible(true);
        start_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel to hold our buttons
        JPanel start_panel = new JPanel();
        start_panel.setLayout(null);
        start_frame.add(start_panel);


        // Button to initialize everything
        JButton start_button = new JButton("Start");
        int buttonWidth = 80;
        int buttonHeight = 20;
        start_button.setBounds(new Rectangle((width - buttonWidth)/2, (height - buttonHeight)/2, buttonWidth, buttonHeight));
        start_button.setSize(new Dimension(buttonWidth, buttonHeight));
        start_button.setFocusable(false);
        start_panel.add(start_button);
    }
}