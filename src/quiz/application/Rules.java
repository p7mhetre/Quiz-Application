
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start,back;
    
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading =new JLabel("Welcome "+ name +" to Simple Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel rules =new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
                "<html>"
+
" The  quiz exam rules:"
+"<br><br>"+
"1. No talking or communication with other participants during the exam."
+"<br><br>"+
"2. All electronic devices must be turned off and put away during the exam."
+"<br><br>"+
"3. No cheating, plagiarism, or any form of academic dishonesty will be tolerated."
+"<br><br>"+
"4. Follow the instructions given by the exam proctor or supervisor."
+"<br><br>"+
"5. Raise your hand if you have a question or need assistance."
+"<br><br>"+
"6. Do not leave the exam room without permission."
+"<br><br>"+
"7. Stay seated and remain quiet until everyone has finished the exam."
+"<br><br>"+
"8. Submit your exam paper or answer sheet before leaving the exam room."
+"<br><br>"+
"<html>"

        );
        
        back=new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start=new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        add(rules);
        
        
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new Rules("User");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(ae.getSource()==start){
            setVisible(false);
            new Quiz(name);
        }else {
            setVisible(false);
            new Login();
        }
    }
}
