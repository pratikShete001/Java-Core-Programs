import javax.swing.*;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.*;

public class Loginpage extends JFrame 
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1,b2,b3;
    Loginpage()
    {

    }
    Loginpage(String title)
    {
        super(title);
    }
    void setComponents()
    {
      l1 = new JLabel("Login");
      l2 = new JLabel("Username");
      l3 = new JLabel("Password");
      l4 = new JLabel();
      t1 = new JTextField();
      t2 = new JTextField();
      b1 = new JButton("Login");
      b2 = new JButton("Reset");
      b3 = new JButton("Add");
      setLayout(null);

    l1.setBounds(280,80,100,30);
    l2.setBounds(100,200,100,30);
    l3.setBounds(100,250,100,30);
    l4.setBounds(100,500 ,100 , 30);
    t1.setBounds(400,200,100,30);
    t2.setBounds(400,250,100,30);
    b1.setBounds(100,400,100,30);
    b2.setBounds(400,400,100,30);
    b3.setBounds(250,400,100,30);

//    Font f1 = new Font("Arial",Font.BOLD,20);
    Font f2 = new Font("Arial",Font.BOLD,15);
    
    Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
 //   Cursor c2 = new Cursor(Cursor.CROSSHAIR_CURSOR);

    
    
    
    
   

    
    JLabel[] label = {l1,l2,l3,l4};
    for (int i = 0; i < label.length; i++) {
        add(label[i]);
        if(i == 1)
        {
            label[i].setFont(f2);
        }
        else{
            label[i].setFont(f2);
        }
        
    }

    
    JTextField textfield [] = {t1,t2};
    for (int i = 0; i < textfield.length; i++) {
        add(textfield[i]);
        textfield[i].setFont(f2);
    }
    JButton button [] = {b1,b2,b3};
    for (int i = 0; i < button.length; i++) {
        button[i].addActionListener(new Button1());// w
        add(button[i]);
        button[i].setFont(f2);
        button[i].setCursor(c1);
    }
    }

    public static void main(String[] args) 
    {
       
        Loginpage p1 = new Loginpage("Welcome to Login page");
        p1.setVisible(true);
        p1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1.setSize(800,800);
        p1.setResizable(true); 
        p1.setComponents();
    }

    class Button1 implements ActionListener // ActionListener is an interface which is used to handle the action events. It has a method called actionPerformed() which is invoked when an action occurs. In this case, it is invoked when the login button is clicked.
    {
       public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == b1) {  // Login button
            String username = t1.getText();
            String password = t2.getText();
            if (username.equals("admin") && password.equals("1234")) {
                l4.setText("Login Successful");
            } else {
                l4.setText("Login Failed");
            }
        } 
        else if (source == b2) {  // Reset button
            t1.setText("");
            t2.setText("");
            l4.setText("");
        } 
        else if (source == b3) {  // Sum button
            try {
                int number1 = Integer.parseInt(t1.getText());
                int number2 = Integer.parseInt(t2.getText());
                l4.setText("Sum is: " + (number1 + number2));
            } catch (Exception exception) {
                l4.setText("Please enter valid numbers");
            }
        }
    }
}  
}