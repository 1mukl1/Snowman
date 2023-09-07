import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception{
        JFrame jFrame = getFrame();
        jFrame.add(new Mycomponent());
    }

    static class Mycomponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setStroke(new BasicStroke(2));
            g2.setColor(Color.black);
            g2.draw(new Arc2D.Double(100, 350, 200, 200, 128, 285,0));
            g2.draw(new Arc2D.Double(125, 250, 150, 150, 120, 300,0));
            g2.draw(new Arc2D.Double(150, 175, 100, 100, 135, 270,0));
            g2.draw(new Arc2D.Double(140, 170, 120, 20, 125, 290,0));
            g2.draw(new RoundRectangle2D.Double(165, 102, 70, 70, 10, 10));
            g2.draw(new Line2D.Double(165, 152, 235, 152));
            g2.draw(new Ellipse2D.Double(195, 205, 10,10));
            g2.draw(new Ellipse2D.Double(225, 205, 10,10));
            int[] p1 = {210, 280, 212};
            int[] p2 = {225, 220, 235};
            g2.setColor(Color.white);
            g2.fill(new Polygon(p1, p2, 3));
            g2.setColor(Color.black);
            g2.draw(new Polygon(p1, p2, 3));
            g2.draw(new Ellipse2D.Double(190, 238, 8, 8));
            g2.draw(new Ellipse2D.Double(203, 245, 8, 8));
            g2.draw(new Ellipse2D.Double(216, 245, 8, 8));
            g2.draw(new Ellipse2D.Double(229, 238, 8, 8));
            g2.draw(new Ellipse2D.Double(210, 310, 10, 10));
            g2.draw(new Ellipse2D.Double(210, 330, 10, 10));
            g2.draw(new Ellipse2D.Double(210, 350, 10, 10));
            int[] r1 = {135, 70, 55, 50, 70, 50, 55, 70, 55, 60, 78, 140};
            int[] r2 = {330, 321, 330, 325, 315, 310, 305, 309, 295, 290, 310, 320};
            g2.setColor(Color.white);
            g2.fill(new Polygon(r1, r2, 12));
            g2.setColor(Color.black);
            g2.draw(new Polygon(r1, r2, 12));
            int[] r3 = {265, 330, 345, 350, 330, 350, 345, 330, 345, 340, 322, 260};
            int[] r4 = {330, 321, 330, 325, 315, 310, 305, 309, 295, 290, 310, 320};
            g2.setColor(Color.white);
            g2.fill(new Polygon(r3, r4, 12));
            g2.setColor(Color.black);
            g2.draw(new Polygon(r3, r4, 12));
        }
    }

    static JFrame getFrame() throws Exception{
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 200, dimension.height / 2 - 300, 400, 600);
        jFrame.setTitle("Снеговик");
        try {
            URL url = new URL("https://img.freepik.com/premium-vector/merry-christmas-greeting-card-with-snowman-funny-snowman-cartoon-character-usable-for-greeting-card-poster-flyer-etc-stock-vector-illustration-on-white-background_88465-3202.jpg?w=2000");
            Image image = new ImageIcon(url).getImage();
            jFrame.setIconImage(image);
        } catch (MalformedURLException ex){
            ex.printStackTrace();
        }
        jFrame.setVisible(true);
        return jFrame;
    }
}
