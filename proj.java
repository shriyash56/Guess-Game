import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class proj extends JFrame implements ActionListener
 { 
   JButton b1;
   JLabel l,bc;
   ImageIcon img;
   public proj()
   {
   img=new ImageIcon("images (1).jpg");
   bc=new JLabel("",img,JLabel.CENTER);
   bc.setBounds(0,0,350,350); 
   l=new JLabel("<--  Welcome to Guessgame  -->");
   l.setBounds(5,2,400,30);
   b1=new JButton("Start");
   b1.addActionListener(this);
   Font f = new Font("Courier", Font.BOLD,18);
   l.setFont(f);
   add(bc);
   add(l);
   add(b1);
   b1.setBounds(110,40,110,30); 
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
   setLayout(null);  
   setLocation(250,100);  
   setVisible(true);  
   setSize(350,350);   
   }
   public void actionPerformed(ActionEvent e)
  {
   if(e.getSource()==b1)
    {
		int computerNumber = (int) (Math.random()*100 + 1); 
        int userAnswer = 0; 
		int count=1;
      while (userAnswer != computerNumber)
        {
            String response = JOptionPane.showInputDialog(null,"Enter a guess between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response); 
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber, count)); 
            count++; 
        }  
		
    }
  }
    public static String determineGuess(int userAnswer, int computerNumber, int count)
	{
        if (userAnswer <=0 || userAnswer >100) 
		{
            return "Your guess is invalid";
        }
        else if (userAnswer == computerNumber )
		{
			new test();
            return "Correct!\nTotal Guesses: " + count;
			
        }
        else if (userAnswer > computerNumber)
		{
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (userAnswer < computerNumber)
		{
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else 
		{
            return "Your guess is incorrect\nTry Number: " + count;
            
        }
    }
	 public static void main(String args[])
	{
     new proj();		
    }
   
}
 class test extends JFrame
 { 
   JLabel bc,l;
   ImageIcon img;
   public test()
   {
   img=new ImageIcon("images.jpg");
   bc=new JLabel("",img,JLabel.CENTER);
   bc.setBounds(0,0,340,350); 
   add(bc);
   l=new JLabel("<--  That's The spirit  -->");
   l.setBounds(15,10,400,30);
   add(l);
   Font f = new Font("Courier", Font.BOLD,18);
   l.setFont(f);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
   setLayout(null);  
   setLocation(250,100);  
   setVisible(true);  
   setSize(350,350);  
   }
  public static void main(String args[])
  {
  new test();
  }
 }
