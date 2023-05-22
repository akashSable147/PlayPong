import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle{
    int xVelocity = 20;
    int yVelocity = 20;
    //int initialSpeed= 30;
    Random random;
    Ball(int x,int y,int width,int height)
    {
        super(x,y,width,height);
        random=new Random();
        int RandomXDirection=random.nextInt(2);
        if(RandomXDirection==0)
        {
            RandomXDirection--;
        }else {

        }
        setXDirection(RandomXDirection);
        int RandomYDirection=random.nextInt(2);
        if(RandomYDirection==0)
        {
            RandomYDirection--;
        }
        setYDirection(RandomYDirection);


    }

    public void setYDirection(int randomYDirection) {
        yVelocity=randomYDirection;
    }

    public void setXDirection(int randomXDirection) {
        xVelocity=randomXDirection;
    }

    public void move()
    {
        x+=xVelocity ;
        y+=yVelocity ;
    }
    public void draw(Graphics g)
    {
        g.setColor(Color.green);
        //g.drawLine(1000/2,0,1000/2,555);
        g.drawLine(500,0,500,277-150);

       // g.fillRect(500-5,0,10,555);

        //g.setColor(Color.YELLOW);
        g.drawOval(500-150,277-150,300,300);
        //g.fillOval(500-150,277-150,300,300);

        g.drawLine(500,277+150,500,555);

        g.setColor(Color.cyan);
        g.fillOval(x,y,width,height);


    }
}
