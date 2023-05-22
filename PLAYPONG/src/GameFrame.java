import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame  {

    static private boolean start = false;


    GameFrame()
    {
        setTitle("Pong Game");
        getContentPane().setBackground(Color.BLACK);
        GamePanel panel = new GamePanel();
        //panel.setMax(k);
        add(panel);

        pack();
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public void setStart(boolean play){
        this.start = true;
    }


}