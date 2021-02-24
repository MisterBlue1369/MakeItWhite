import javax.swing.JButton;
import java.awt.event.*;
class WPrincipal extends Window implements ActionListener{
  JButton bplay;
  WPlay  wplay;

  JButton btuto;
  WTuto  wtuto;

  WPrincipal (){   
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
  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==bplay){
      wplay.setPrincipal(this);
    }
    if(e.getSource()==btuto){
      wtuto.setPrincipal(this);
    }
  }

}
