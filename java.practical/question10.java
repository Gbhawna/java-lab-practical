
import java.awt.*;
import java.awt.event.*;
public class question10 extends Frame implements ActionListener {
Button btnRed, btnBlue;
question10() {
super("AWT Buttons");
btnRed = new Button("Red");
btnRed.setBounds(70, 100, 250, 30);
btnRed.addActionListener(this);
this.add(btnRed);
btnBlue = new Button("Blue");
btnBlue.setBounds(70, 200, 250, 30);
btnBlue.addActionListener(this);
this.add(btnBlue);
this.setSize(400, 400);
this.setLayout(null);
this.setVisible(true);
this.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
dispose();
}
});
}
public static void main(String[] args) {
new question10();
}
@Override
public void actionPerformed(ActionEvent e) {
if (e.getSource() == btnRed) {
this.setBackground(Color.RED);
} else if (e.getSource() == btnBlue) {
this.setBackground(Color.BLUE);
}
}
}