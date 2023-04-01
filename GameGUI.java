import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameGUI extends JFrame{
    public Font customFont;
    public GameGUI(){

        // /*creates a room */
        // room firstRoom = new room("First Room");
        // /*adds options for the player to choose from to the first room*/
        // firstRoom.addOptions("Attack", "Items", "Talk", "Inspect");
        
        // room bossRoom = new room("Boss Encounter");

        JButton startButton;
        JFrame start_Frame = new JFrame();
        JPanel titlePanel = new JPanel();
        JPanel startGameButton;
        JLabel nameLabel;
        

        try {
            customFont = Font.createFont(Font.TRUETYPE_FONT, new File("Ghastly_Panic.ttf")).deriveFont(60f);
            GraphicsEnvironment graphE = GraphicsEnvironment.getLocalGraphicsEnvironment();
            graphE.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Ghastly_Panic.ttf")));
        } catch (IOException | FontFormatException e) {
            
        }

        

        start_Frame.setSize(800,600);
        start_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start_Frame.getContentPane().setBackground(Color.black);
        start_Frame.setLayout(null);
        start_Frame.setVisible(true);

        Container con_Frame = start_Frame.getContentPane();
        titlePanel.setBounds(100,100,600,150);
        titlePanel.setBackground(Color.black);

        startGameButton = new JPanel();
        startGameButton.setBounds(300,400,200,100);
        startGameButton.setBackground(Color.black);

        startButton = new JButton("PRESS START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.red);
        startButton.setFont(customFont);

        nameLabel = new JLabel("NIGHT TERRORS");
        nameLabel.setBackground(Color.black);
        nameLabel.setForeground(Color.red);
        nameLabel.setFont(customFont);

        titlePanel.add(nameLabel);
        startGameButton.add(startButton);
        con_Frame.add(titlePanel);
        con_Frame.add(startGameButton);

    }
}