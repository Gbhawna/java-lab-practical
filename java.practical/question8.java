import java.awt.*;
 import java.awt.event.*;
  class MouseTrial extends Frame implements MouseListener
{
Label l;
MouseTrial(
)

{
addMouseListener(this);
l=new Label(); 
l.setBounds(100,50,100,20); 
l.setBackground(Color.BLUE)
; add(l); setSize(300,300); 
setLayout(null); 
setVisible(true); 
setBackground(Color.PINK);
}
public void mouseClicked(MouseEvent e)
{
l.setText("Mouse clicked");
}
public void mouseEntered(MouseEvent e)
{
l.setText("Mouse entered");
}
public void mousePressed(MouseEvent e)
{
l.setText("mouse pressed");
}
public void mouseExited(MouseEvent e)
{
l.setText("mouse exit");
}
public void mouseReleased(MouseEvent e)
{
l.setText("mouse released");
} public static void main(String [] 
args)
{
new MouseTrial();
}
}
