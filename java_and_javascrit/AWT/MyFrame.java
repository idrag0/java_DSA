package AWT;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame implements ActionListener {
    private Button myButton;

    public MyFrame() {
        // Create a button
        myButton = new Button("Click Me");

        // Add the button to the frame
        add(myButton);

        // Register the frame as an ActionListener for the button
        myButton.addActionListener(this);

        // Set frame properties
        setSize(300, 200);
        setTitle("Event Handling Example");
        setVisible(true);
    }

    // Implement actionPerformed method to handle button click
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            System.out.println("Button Clicked!");
        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}

