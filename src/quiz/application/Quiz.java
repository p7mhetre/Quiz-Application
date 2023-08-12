
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener{
    
    String question[][]=new String[10][5];
    String answer[][]=new String[10][2];
    String useranswers[][] = new String[10][1];
    
    JLabel qno,questions;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup groupoptions;
    JButton next,lifeline,submit;
    
    public static int timer= 15;
    public static int ans_given =0;
    public static int count=0;
    public static int score=0;
    
    String name;
    
    
    Quiz(String name){
        
        this.name=name;
        setBounds(50,0,1440,850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);
        
        qno=new JLabel();
        qno.setBounds(100,450,50,30);
        qno.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(qno);
        
        questions=new JLabel();
        questions.setBounds(150,450,900,30);
        questions.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(questions);
        
         // Question 1
        question[0][0] = "What is JVM?";
        question[0][1] = "Java Virtual Machine";
        question[0][2] = "Java Virtual Memory";
        question[0][3] = "Java Visual Machine";
        question[0][4] = "Java Virtuous Machine";
        

        // Question 2
        question[1][0] = "What is OOP?";
        question[1][1] = "Object Oriented Programming";
        question[1][2] = "Object Oriented Protocol";
        question[1][3] = "Object Origin Protocol";
        question[1][4] = "Object Operation Procedure";
       

        // Question 3
        question[2][0] = "What is the capital of France?";
        question[2][1] = "Berlin";
        question[2][2] = "Madrid";
        question[2][3] = "Paris";
        question[2][4] = "Rome";
       

        // Question 4
        question[3][0] = "What is the largest planet in our solar system?";
        question[3][1] = "Mars";
        question[3][2] = "Venus";
        question[3][3] = "Jupiter";
        question[3][4] = "Saturn";
       

        // Question 5
        question[4][0] = "Which scientist discovered the theory of general relativity?";
        question[4][1] = "Isaac Newton";
        question[4][2] = "Albert Einstein";
        question[4][3] = "Galileo Galilei";
        question[4][4] = "Nikola Tesla";
        

        // Question 6
        question[5][0] = "What is the chemical symbol for water?";
        question[5][1] = "H2O";
        question[5][2] = "CO2";
        question[5][3] = "O2";
        question[5][4] = "N2";
       

        // Question 7
        question[6][0] = "Which planet is known as the 'Red Planet'?";
        question[6][1] = "Mars";
        question[6][2] = "Venus";
        question[6][3] = "Mercury";
        question[6][4] = "Neptune";
       

        // Question 8
        question[7][0] = "Who wrote the play 'Romeo and Juliet'?";
        question[7][1] = "William Shakespeare";
        question[7][2] = "Jane Austen";
        question[7][3] = "Mark Twain";
        question[7][4] = "Charles Dickens";
        

        // Question 9
        question[8][0] = "Which country is known as the 'Land of the Rising Sun'?";
        question[8][1] = "China";
        question[8][2] = "Japan";
        question[8][3] = "South Korea";
        question[8][4] = "Thailand";
        

        // Question 10
        question[9][0] = "What does HTML stand for?";
        question[9][1] = "Hyper Text Markup Language";
        question[9][2] = "Hyperlink and Text Markup Language";
        question[9][3] = "Home Tool Markup Language";
        question[9][4] = "Hyper Transfer Markup Language";
       

        answer[0][1] = "Java Virtual Machine";
        answer[1][1] = "Object Oriented Programming";
        answer[2][1] =  "Paris";
        answer[3][1] = "Jupiter";
        answer[4][1] ="Albert Einstein";
        answer[5][1] = "H2O";
        answer[6][1] = "Mars";
        answer[7][1] = "William Shakespeare";
        answer[8][1] = "Japan";
        answer[9][1] = "Hyper Text Markup Language";
        
       opt1 = new JRadioButton();
       opt1.setBounds(170,520,700,30);
       opt1.setBackground(Color.WHITE);
       opt1.setFont(new Font("Dialog",Font.PLAIN,20));
       add(opt1);
       
       opt2 = new JRadioButton();
       opt2.setBounds(170,560,700,30);
       opt2.setBackground(Color.WHITE);
       opt2.setFont(new Font("Dialog",Font.PLAIN,20));
       add(opt2);
       
       opt3 = new JRadioButton();
       opt3.setBounds(170,600,700,30);
       opt3.setBackground(Color.WHITE);
       opt3.setFont(new Font("Dialog",Font.PLAIN,20));
       add(opt3);
       
       opt4 = new JRadioButton();
       opt4.setBounds(170,640,700,30);
       opt4.setBackground(Color.WHITE);
       opt4.setFont(new Font("Dialog",Font.PLAIN,20));
       add(opt4);
       
       groupoptions=new ButtonGroup();
       groupoptions.add(opt1);
       groupoptions.add(opt2);
       groupoptions.add(opt3);
       groupoptions.add(opt4);
       
       next =new JButton("Next");
       next.setBounds(1100,550,200,40);
       next.setFont(new Font("Tahoma",Font.PLAIN,22));
       next.setBackground(new Color(30,144,255));
       next.setForeground(Color.WHITE);
       next.addActionListener(this);
       add(next);
       
       lifeline =new JButton("50 50 Lifeline");
       lifeline.setBounds(1100,630,200,40);
       lifeline.setFont(new Font("Tahoma",Font.PLAIN,22));
       lifeline.setBackground(new Color(30,144,255));
       lifeline.setForeground(Color.WHITE);
       lifeline.addActionListener(this);
       add(lifeline);
       
       submit =new JButton("Submit");
       submit.setBounds(1100,710,200,40);
       submit.setFont(new Font("Tahoma",Font.PLAIN,22));
       submit.setBackground(new Color(30,144,255));
       submit.setForeground(Color.WHITE);
       submit.addActionListener(this);
       submit.setEnabled(false);
       add(submit);
        
       start(count);
                           
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given=1;
             if(groupoptions.getSelection() == null){
                useranswers[count][0]="";
            }else{
                useranswers[count][0]=groupoptions.getSelection().getActionCommand();
            }
             
             
             
             if(count == 8){
                 next.setEnabled(false);
                 submit.setEnabled(true);
             }
            count++;
            start(count);
            
        }
        else if(ae.getSource() == lifeline){
            if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
                
            }else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
                
            
            lifeline.setEnabled(false);
        }else if(ae.getSource() == submit){
            ans_given = 1;
             //sibmit button
            if(groupoptions.getSelection() == null){
                useranswers[count][0]="";
            }else{
                useranswers[count][0]=groupoptions.getSelection().getActionCommand();
            }
                
            for(int i=0;i<useranswers.length;i++){//calculate score
                if(useranswers[i][0].equals(answer[i][1])){
                    score +=10;
                }
                else{
                    score +=0;
                }
            }
            setVisible(false);
            new Score(name , score); 
            
        }
        
    }
    
    
    
    public void paint(Graphics g){
        super.paint(g);
        
        String time= "Time left - "+timer + "Seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma",Font.BOLD,25));
        
        if(timer > 0 ){
            g.drawString(time,1100,500);
        }else{
            g.drawString("Times up !!", 1100,500);
        }
        
        timer--;
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given == 1){
            ans_given = 0;
            timer = 15;
        }else if(timer < 0){
            timer =15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 8){
                 next.setEnabled(false);
                 submit.setEnabled(true);
             }
            
            if(count==9){ //sibmit button
                if(groupoptions.getSelection() == null){
                useranswers[count][0]="";
            }else{
                useranswers[count][0]=groupoptions.getSelection().getActionCommand();
            }
                
            for(int i=0;i<useranswers.length;i++){//calculate score
                if(useranswers[i][0].equals(answer[i][1])){
                    score +=10;
                }
                else{
                    score +=0;
                }
            }
            setVisible(false);
            new Score(name,score); 
                
            }else{   //next button
            
            if(groupoptions.getSelection() == null){
                useranswers[count][0]="";
            }else{
                useranswers[count][0]=groupoptions.getSelection().getActionCommand();
            }
            
            count++;
                     
            start(count);
            }
        }
    }
    
    
    public void start(int count){
        qno.setText("" +(count + 1)+". ");
        questions.setText(question[count][0]);
        
        opt1.setText(question[count][1]);
        opt1.setActionCommand(question[count][1]);
        
        opt2.setText(question[count][2]);
        opt2.setActionCommand(question[count][2]);
        
        opt3.setText(question[count][3]);
        opt3.setActionCommand(question[count][3]);
        
        opt4.setText(question[count][4]);
        opt4.setActionCommand(question[count][4]);
        
        groupoptions.clearSelection();
        
    }
    
    
    
    public static void main(String[] args){
        new Quiz("User");
    }
}
