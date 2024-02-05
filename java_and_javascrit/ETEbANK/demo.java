import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleAWTApplication {
    public static void main(String[] args) {
        // Create a frame (window) with a title
        Frame frame = new Frame("Simple AWT Application");

        // Create a button
        Button button = new Button("Click Me");

        // Set a layout manager for the frame (FlowLayout by default)
        frame.setLayout(new FlowLayout());

        // Add the button to the frame
        frame.add(button);

        // Create an ActionListener for the button
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action to be performed when the button is clicked
                System.out.println("Button Clicked!");
            }
        };

        // Add the ActionListener to the button
        button.addActionListener(actionListener);

        // Set the size of the frame
        frame.setSize(300, 150);

        // Make the frame visible
        frame.setVisible(true);

        // Add a WindowListener to handle closing the frame
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
