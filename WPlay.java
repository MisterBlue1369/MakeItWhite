import javax.swing.JFrame;
class WPlay extends JFrame{
  JFrame parent;
  WPlay(JFrame parent){
    this.parent = parent;

    setSize(800,600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(false);
  }
  public void setPrincipal(JFrame toprincipal, JFrame close){
    toprincipal.setVisible(true);
    close.setVisible(false);
  }
}
