package Part2;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class q43 extends Applet implements ActionListener {
    TextField num1Field, num2Field, num3Field;
    int smallest;

    public void init() {
        num1Field = new TextField(10);
        num2Field = new TextField(10);
        num3Field = new TextField(10);

        num1Field.addActionListener(this);
        num2Field.addActionListener(this);
        num3Field.addActionListener(this);

        add(num1Field);
        add(num2Field);
        add(num3Field);
    }

    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(num1Field.getText());
        int num2 = Integer.parseInt(num2Field.getText());
        int num3 = Integer.parseInt(num3Field.getText());

        smallest = findSmallest(num1, num2, num3);

        repaint();
    }

    private int findSmallest(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public void paint(Graphics g) {
        g.drawString("The smallest number is: " + smallest, 20, 80);
    }
}
