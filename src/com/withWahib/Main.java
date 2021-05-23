package com.withWahib;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

class CodeBottom extends JFrame implements ActionListener ,ItemListener , MouseListener,WindowListener{
    JButton button ,button2;
    JTextField buttonText;
    JPanel jpnl;
    JLabel jlb;
    JCheckBox jcheck;

    CodeBottom(String s){
        super(s);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        jpnl =new JPanel();
        jlb = new JLabel();
        jcheck=new JCheckBox("Java");
        button =new JButton("Button1");
        buttonText=new JTextField("");
        button2=new JButton("Button2");

        jpnl.setBounds(0 ,20,600,400);
        jlb.setBounds(170,300,100,30);
        jcheck.setBounds(140,40,90,30);
        button.setBounds(10,40,100,30);
        button2.setBounds(50,280,50,80);
        buttonText.setBounds(20,40,100,40);

        this.add(jpnl);
        jpnl.add(jlb);
        jpnl.add(jcheck);
        jpnl.add(button);
        jpnl.add(button2);
        jpnl.add(buttonText);
        jcheck.addItemListener(this);

        //jpnl.setLayout(null);

        jcheck.setSelected(false);
       // button2.setActionCommand("Hael");
        button.addActionListener(this);
        button2.addActionListener(this);
       // this.addMouseListener(this);
        jlb.addMouseListener(this);

        this.setSize(600,420);
        this.setTitle(s);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        /*
        String command =e.getActionCommand();
        Scanner input = new Scanner(System.in);
        if(command.equals("Button1"))
        {
            double s = input.nextDouble();
            double y = input.nextDouble();

            buttonText.setText(" "+y+s);
        }
        else {
            JOptionPane.showMessageDialog(null,"You pressed button2", "Warning",2);
        }*/
        if(e.getSource().equals(button)){
            JOptionPane.showMessageDialog(null,"You pressed button1", "Warning",1);
            buttonText.setText(" "+Math.pow(2.0,3.0));
            jlb.setText("label changed ");

        }
        else if (e.getSource().equals(button2)){
            JOptionPane.showMessageDialog(null," "+buttonText.getText(), "Warning",2);

            //jpnl.setVisible(false);
        }
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource().equals(jcheck)){
            System.out.println(jcheck.isSelected());
        }
    }
    public  void mouseClicked(MouseEvent e){
    }
    public  void mouseEntered(MouseEvent e){
        JOptionPane.showMessageDialog(null,"mouse geldi","warning",2);
    }
    public  void mouseExited(MouseEvent e){

    }
    public  void mousePressed(MouseEvent e){

    }
    public  void mouseReleased(MouseEvent e){
    }
    @Override
    public void windowOpened(WindowEvent e) {

    }
    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "Adiyos","Bye",1);
    }
    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}

public class Main {
    public static void main(String[] args) {
	CodeBottom a = new CodeBottom("My page ");
    }
}
