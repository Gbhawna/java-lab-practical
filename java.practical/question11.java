import java.awt.*;
import java.awt.event.*; class Q_three extends 
Frame implements KeyListener
{
Frame f= new Frame("KEY EVENT");
TextArea A;
Label l;
Q_three()
{ l =new Label(); 
l.setBounds(20,30,150,20); 
A= new TextArea(); 
A.setBounds(20,80,100,80)
; A.addKeyListener(this); 
add(l); add(A); 
setSize(400,400); 
setLayout(null); 
setVisible(true);
}
public void keyPressed (KeyEvent e)
{}
public void keyReleased (KeyEvent e)
{}
public void keyTyped (KeyEvent e)
{
l.setText("Typed character is : "+ e.getKeyChar());
} public static void main(String[] 
args)
{
new Q_three();
}
}

