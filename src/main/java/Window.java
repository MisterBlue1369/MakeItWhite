import javax.swing.JFrame;
import java.awt.event.*;
class Window extends JFrame implements ActionListener{
  Window(){
    setLayout(null);
    setSize(800,600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(true);
    setVisible(false);
    setUndecorated(true);
  }
  void setPrincipal(Window close){
    setVisible(true);
    close.close();
  }
  void close(){
    setVisible(false);
  }
  @Override
  public void actionPerformed(ActionEvent e){
  }
}
