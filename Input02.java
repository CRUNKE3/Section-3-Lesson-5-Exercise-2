package input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Fruits are crazy!",
                "Fruit Message",
                2);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "What was the last fruit you ate?",
                "Fruit Diet",
                3, 
                null,
                null,
                "Input Fruit here");
        
        
        String[] acceptableValues = {"apple", "banana", "orange"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "What is your favorite fruit?",
                "Favorite Fruit",
                3,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
