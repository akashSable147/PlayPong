import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanel extends Panel {

    StartPanel(){

        JFrame menue = new JFrame("Start Menue");

        menue.getContentPane().setBackground(Color.GREEN);
        menue.setVisible(true);

        JButton play = new JButton("PLAY");


        Panel window = new Panel();
        window.setBackground(Color.GREEN);
        window.setVisible(true);
        play.setVisible(true);

        play.setBounds(500-50,277-25,100,50);
        menue.add(play);

        menue.add(window);

        menue.setSize(1000,555);
        menue.setLocationRelativeTo(null);
        menue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new GameFrame();
               menue.setVisible(false);
            }
        });


    }
    public static void main(String[] args) {
        StartPanel play = new StartPanel();
    }
}
