package LeetCode;


import java.awt.*;
import javax.swing.*;

public class HelloWorld extends JFrame {
    public HelloWorld() {
        getContentPane().add(new PieChart1());
    }


    public static void main(String[] args) {
        JFrame frame = new HelloWorld();
        frame.setSize(600, 300);
        frame.setTitle("Exercise 10.14");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class PieChart1 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();
        int xCenter = w / 2;
        int yCenter = h / 2;
        int radius = (int) (Math.min(w, h) * .8 / 2);
        int x = xCenter - radius;
        int y = yCenter - radius;
        // Draw the arc for projects
        g.setColor(Color.green);
        g.fillArc(x, y, 2 * radius, 2 * radius, 0, (int) (20 * 360.0 / 100));
        g.setColor(Color.black);
        g.drawString("Type A -- 20%",
                (int) (xCenter + radius * Math.cos(2 * Math.PI * 0.1)),
                (int) (yCenter - radius * Math.sin(2 * Math.PI * 0.1)));
        //;  Draw the arc for quizzes
        g.setColor(Color.red);
        g.fillArc(x, y, 2 * radius, 2 * radius, (int) (20 * 360.0 / 100),
                (int) (25 * 360 / 100));
        g.setColor(Color.black);
        g.drawString("Type B -- 25%",
                (int) (xCenter + radius * Math.cos(2 * Math.PI * 0.35)),
                (int) (yCenter - radius * Math.sin(2 * Math.PI * 0.35)));
        // Draw the arc for midterm exams*/
        g.setColor(Color.orange);
        g.fillArc(x, y, 2 * radius, 2 * radius, (int) (45 * 360 / 100),
                (int) (15 * 360 / 100));
        g.setColor(Color.black);
        g.drawString("Type AB -- 15%",
                (int) (xCenter + radius * Math.cos(2 * Math.PI * 0.50)) - 60,
                (int) (yCenter - radius * Math.sin(2 * Math.PI * 0.50)));
        // Draw the arc for the final exam*/
        g.setColor(Color.blue);
        g.fillArc(x, y, 2 * radius, 2 * radius, (int) (60 * 360 / 100),
                (int) (40 * 360 / 100));
        g.setColor(Color.black);
        g.drawString("Type O -- 40%",
                (int) (xCenter + radius * Math.cos(2 * Math.PI * 0.8)),
                (int) (yCenter - radius * Math.sin(2 * Math.PI * 0.8)));
    }
}
