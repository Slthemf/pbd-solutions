import javax.swing.*;
import java.awt.*;

public class FrameWithPanelWriting {
    public static void main(String[] args) {
        MyCustomFrame f = new MyCustomFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

class MyCustomFrame extends JFrame {
    public MyCustomFrame() {
        setTitle("My Awesome Custom Frame(window)!");
        setSize(800, 600);
        setLocation(100, 200);

        MyCustomPanel panel = new MyCustomPanel();
        Container cp = getContentPane();
        cp.add(panel);
    }
}

class MyCustomPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hi", 75, 100);
    }
}