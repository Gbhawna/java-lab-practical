
import java.awt.*;
import java.awt.event.*;
public class question9 extends Frame {
Label l;
question9() {
super("AWT Pink");
l = new Label("This is a Label");
l.setBounds(100, 100, 250, 250);
l.setAlignment(Label.CENTER);
this.add(l);
this.setBackground(Color.PINK);
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
new question9();
}
}