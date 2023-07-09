import javax.swing.*;
import java.awt.*;

public class DrawLine extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawLine(0, 0, 100, 100);
  }
  
  public static void main(String[] args) {
    JFrame frame = new JFrame("Draw Line Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    DrawLine panel = new DrawLine();
    frame.add(panel);
    frame.setVisible(true);
  }
  
}