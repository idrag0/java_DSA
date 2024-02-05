package AWT;
// create basic AWT example
import java.awt.*;
import java.awt.event.*;
class AWTExample1 {
    public static void main(String[] args) {
        Frame f = new Frame("AWT Example");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
} 
// Compare this snippet from JDBC/firstJDBC.java: