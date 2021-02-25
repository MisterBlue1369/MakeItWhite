import javax.swing.JButton;
import java.awt.Color;
class GBox extends JButton{
  boolean state;
  GBox(){
    state = false;
  }
  void change(){
    if(state) state = false; else state = true;
    if(state) setBackground(Color.black);else setBackground(Color.white);
  }
}
