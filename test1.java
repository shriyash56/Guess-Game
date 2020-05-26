import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class test1 extends JFrame
 { 
   JLabel bc;
   ImageIcon img;
   public test()
   {
   img=new ImageIcon("images.jpg");
   bc=new JLabel("",img,JLabel.CENTER);
   bc.setBounds(0,0,340,350); 
   add(bc);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
   setLayout(null);  
   setLocation(250,100);  
   setVisible(true);  
   setSize(350,350);  
   }
  public static void main(String args[])
  {
  new test1();
  }
 }