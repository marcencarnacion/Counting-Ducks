
import javax.swing.*;
import java.awt.event.*; //this enables the events
import java.awt.*;


public class Main
{
  public static void main (String args[])
  {
      JFrame frame1 = new JFrame("Rioux Duck Counter");
      frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //YOU MUST HAVE THIS LINE
      frame1.setSize(500,500);
      frame1.setVisible(true);

      //----------Panel to hold the buttons--------
      JPanel panel1 = new JPanel(new GridLayout(2,2, 20,20));

      //---------------Label 1--------------------
      JLabel label1 = new JLabel("Count the ducks");
      JTextField textfield1 = new JTextField(10);

      //-----------------Button 1-------------------
      JButton  button1 = new JButton("Update Label");

      button1.addActionListener(new ActionListener()
      {
          public void actionPerformed (ActionEvent e)
          {
            String[] phrases = {"Counting ducks", "You counted to", "Look at you count", "Nice one there", "Keep Going!"};
            String newText = phrases[(int)(Math.random() * phrases.length)];
            label1.setText(newText);
          }//end the block of what the button will do
      }); //end the ActionListener

      //----------------Button 2 -------------------
      JButton button2 = new JButton ("No, click me");
      button2.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("Thanks, pal!");
        }
      });
      


      panel1.add(button1);
      panel1.add(button2);
      panel1.add(label1);
      panel1.add(textfield1);


      //-----------------Panel 2-----------------
      JPanel panel2 = new JPanel (new BorderLayout(10,10));

    
      //--------------Image 1 - the DUCK-------------
      ImageIcon duckImg = new ImageIcon("duckicon.jpg", "A little duck in water");
      JLabel duckLabelPic = new JLabel(duckImg);
      panel2.add(duckLabelPic);

      frame1.getContentPane().add(BorderLayout.NORTH, panel1);
      frame1.getContentPane().add(BorderLayout.CENTER, panel2);
 
  }//end main method
}//end class Main