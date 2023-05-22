import java.awt.*;

public class Score extends Rectangle {


    int width;
    int height;
    int player1;
    int player2;



    Score(int width,int height)
    {
        this.height=height;
        this.width=width;

    }





    public void draw(Graphics g)
    {
        g.setColor(Color.blue);
        g.setFont(new Font("Consolas",Font.PLAIN,60));
        g.drawString(String.valueOf(player1),80,80);

        g.setColor(Color.RED);
        g.drawString(String.valueOf(player2),width-100-80,80);
    }

}
