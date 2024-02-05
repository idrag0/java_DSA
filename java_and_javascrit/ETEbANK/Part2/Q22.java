package Part2;
import java.awt.*;
import java.awt.event.*;

public class MyAWTApp extends Frame {
    public MyAWTApp() {
        Button button = new Button("Click Me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        add(button);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyAWTApp();
    }
}
