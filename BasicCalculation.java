import javax.swing.*;
import java.awt.event.*;

public class BasicCalculation extends JFrame{
    JTextArea t1,t2;
    JButton addButton,subButton,mulButton,divButton;
    JLabel label;
    
    BasicCalculation()
    {
        component();
    }
    
    public void component()
    {
        setLayout(null);

        label = new JLabel("Basic Calculator");
        label.setBounds(100,100,100,30);
        add(label);

        // Create text areas for input
        t1 = new JTextArea();
        t2 = new JTextArea();

        t1.setBounds(100,200,100,30);
        t2.setBounds(400,200,100,30);
        add(t1);
        add(t2);

        // Add buttons for basic operations
        addButton = new JButton("ADD");
        subButton = new JButton("Sub");
        mulButton = new JButton("Mul");
        divButton = new JButton("Div");

        addButton.setBounds(100,400,100,30);
        subButton.setBounds(400,400,100,30);
        mulButton.setBounds(250,400,100,30);
        divButton.setBounds(250,500,100,30);
        
        JButton[] buttons = {addButton, subButton, mulButton, divButton};
        for (JButton button : buttons) {
            add(button);
            button.addActionListener(new Button1());
        }
    }
    public static void main(String args[])
    {
        BasicCalculation frame = new BasicCalculation();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
    
    }

    class Button1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            try{
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            if(e.getSource() ==addButton)
            {
                int sum = num1 + num2;
                String result = String.valueOf(sum);
                label.setText("Result: " + result);
            }
            if(e.getSource() ==subButton)
            {
                int sub = num1 - num2;
                String result = String.valueOf(sub);
                label.setText("Result: " + result);
            }
            if(e.getSource() ==mulButton)
            {
                int mul = num1 * num2;
                String result = String.valueOf(mul);
                label.setText("Result: " + result);
            }
            if(e.getSource() ==divButton)
            {
                int div = num1 / num2;
                String result = String.valueOf(div);
                label.setText("Result: " + result);
            }
        }
        catch(Exception exception)
        {
            label.setText("Please enter valid numbers");
        }
    }
}
}

/*Learnings
1) Using arrays to manage multiple components
2) Implementing ActionListener for handling button clicks
3) Parsing string values to integers for calculations
4) valueOF() method to convert numeric results back to string for display
5)Basiccalculation frame is extending JFrame to create a GUI application
6) gerSource() method is used to identify which button was clicked
7) we create object of BasicCalculation class in main method to display the frame
8) Algorithm for this program is simple, we take two numbers from user and perform basic operations like addition, subtraction, multiplication and division based on the button clicked by user.
9) Flow chart for this program is as follows:
   - Start
   - Create GUI components (text areas, buttons, label)
   - Wait for user input
   - On button click, read values from text areas
   - Perform the corresponding operation
   - Display the result in the label
   - End
 */