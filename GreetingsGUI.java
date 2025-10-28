/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.tut.ac.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author NaHlalithwa
 */
public class GreetingsGUI extends JFrame {
   
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel greetingsAreaPnl;
    private JPanel btnsPnl;
    private JPanel mainPNL;
    private JPanel headingPnl;
    
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    
    
    private JTextArea greetingTxtArea;
    
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    
    public GreetingsGUI() {
        
        
        
        setLayout(new BorderLayout());
        setTitle("Greetings ");
        setSize(500, 500);
        setBackground(Color.yellow);
        
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout());
        
        nameAndSurnamePnl= new JPanel(new GridLayout(2, 1));
        greetingsAreaPnl = new JPanel(new BorderLayout());
        
        btnsPnl = new JPanel(new FlowLayout());
        mainPNL= new JPanel(new BorderLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        headingLbl = new JLabel("Greetings App");
        nameLbl= new JLabel("Name: ");
        surnameLbl = new JLabel("Surname: ");
        
           nameTxtFld= new JTextField(20);
           surnameTxtFld = new JTextField(20);
           
           greetingTxtArea= new JTextArea(25,40);
           greetingTxtArea.setEditable(false);
           greetingTxtArea.setText("Hell [name] [surname]");
           
           greetBtn = new JButton("Greet");
           greetBtn.addActionListener(e ->{
           String name = nameTxtFld.getText().trim();
           String surname = surnameTxtFld.getText().trim();
           
           if(name.isEmpty() || surname.isEmpty()){
           greetingTxtArea.setText("Please enter both name and your surname" );
           }else {
           greetingTxtArea.setText("Hello ["+name+"] ["+surname+"]");
           }
           });
           
           clearBtn= new JButton("Clear");
           clearBtn.addActionListener(e ->{
           nameTxtFld.setText(" ");
           surnameTxtFld.setText(" ");
           greetingTxtArea.setText("Hello [name][surname]");
           });
           
           exitBtn= new JButton("exit");
           exitBtn.addActionListener(e -> System.exit(0));
           
           namePnl.add(nameLbl);
           namePnl.add(nameTxtFld);
           
           surnamePnl.add(surnameLbl);
           surnamePnl.add(surnameTxtFld);
           
           nameAndSurnamePnl.add(namePnl);
           nameAndSurnamePnl.add(surnamePnl);
           
           greetingsAreaPnl.add(greetingTxtArea);
           greetingTxtArea.setBorder(new TitledBorder( new LineBorder(Color.BLACK,1),"Greetings Message "));
           
           btnsPnl.add(greetBtn);
           btnsPnl.add(clearBtn);
           btnsPnl.add(exitBtn);
           
          headingPnl.add(headingLbl);
          
          mainPNL.add(nameAndSurnamePnl, BorderLayout.NORTH);
          mainPNL.add(greetingsAreaPnl , BorderLayout.CENTER);
          mainPNL.add(btnsPnl, BorderLayout.SOUTH);
          
          add(headingPnl,BorderLayout.NORTH);
          add(mainPNL, BorderLayout.CENTER);
          
          setVisible(true);
          
           
    }
    
}