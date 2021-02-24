import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.*;
class WPrincipal extends JFrame implements ActionListener{
  JButton bplay;
  WPlay  wplay;

  JButton btuto;
  WTuto  wtuto;

  WPrincipal (){
    //Frame
    setSize(800,600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(true);
    
    //play button
    bplay = new JButton("Play");
    bplay.setBounds(100,300,600,100);
    bplay.addActionListener(this);
    add(bplay);
    wplay = new WPlay(this);
    //Tuto button
    btuto = new JButton("Tutorial");
    btuto.setBounds(100,400,600,100);
    btuto.addActionListener(this);
    add(btuto);
    this.wtuto = new WTuto(this);

  }
  
  public void setPrincipal(JFrame close){
    this.setVisible(true);
    close.setVisible(false);
    btuto.setVisible(true);
    bplay.setVisible(true);
  }
  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==bplay){
      wplay.setPrincipal(wplay,this);
      btuto.setVisible(false);
      bplay.setVisible(false);
    }
    if(e.getSource()==btuto){
      wtuto.setPrincipal(wtuto,this);
      btuto.setVisible(false);
      bplay.setVisible(false);
    }
  }

}
