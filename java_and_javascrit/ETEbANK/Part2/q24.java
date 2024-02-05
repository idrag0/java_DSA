package Part2;


import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
public class q24 { 
    public static void main(String[] args) { 
        JFrame frame = new JFrame("Division Categorizer"); 
        frame.setLayout(new GridLayout(4, 2)); 
 
        JLabel nameLabel = new JLabel("Enter Name:"); 
        JTextField nameTextField = new JTextField(); 
 
        JLabel genderLabel = new JLabel("Enter Gender:"); 
        JTextField genderTextField = new JTextField(); 
 
        JLabel marksLabel = new JLabel("Enter Marks:"); 
        JTextField marksTextField = new JTextField(); 
 
        JButton categorizeButton = new JButton("Categorize"); 
        JLabel resultLabel = new JLabel(); 
 
        categorizeButton.addActionListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent e) { 
                try { 
                    // Parse marks from the text field 
                    int marks = Integer.parseInt(marksTextField.getText()); 
 
                    // Categorize based on marks 
                    if (marks >= 60) { 
                        resultLabel.setText("First Division"); 
                    } else if (marks >= 45) { 
                        resultLabel.setText("Second Division"); 
                    } else if (marks >= 33) { 
                        resultLabel.setText("Third Division"); 
                    } else { 
                        resultLabel.setText("Fail"); 
                    } 
                } catch (NumberFormatException ex) { 
                    resultLabel.setText("Invalid input for marks. Please enter a valid integer."); 
                } 
            } 
        }); 
 
        frame.add(nameLabel); 
        frame.add(nameTextField); 
        frame.add(genderLabel); 
        frame.add(genderTextField); 
        frame.add(marksLabel); 
        frame.add(marksTextField); 
        frame.add(categorizeButton); 
        frame.add(resultLabel); 
 
        frame.setSize(300, 200); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true); 
    } 
} 