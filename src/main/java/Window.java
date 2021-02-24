import javax.swing.JFrame;
class Window extends JFrame{
  Window(){
    setSize(800,600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(false);
  }
  void setPrincipal(Window close){
    setVisible(true);
    close.setVisible(false);
  }
}
