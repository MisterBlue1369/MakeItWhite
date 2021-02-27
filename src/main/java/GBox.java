import javax.swing.JButton;
import java.awt.Color;
class GBox extends JButton{
  boolean state;
  GBox(){
    state = true;
    setColor();
  }
  public void setColor(){
    if(state){
      setBackground(Color.white);
    } else {
      setBackground(Color.black);
    }
  }
  void changeto(boolean chng){
    state = chng;
    setColor();
  }
  void change(){
    if(state) {
      state = false;
    } else {
      state = true;
    }
    setColor();
  }
}
