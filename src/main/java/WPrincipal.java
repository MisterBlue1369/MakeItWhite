import javax.swing.JButton;
import java.awt.event.*;
class WPrincipal extends Window {
  JButton bplay;
  WPlay  wplay;

  JButton btuto;
  WTuto  wtuto;

  WPrincipal (){   
    wtuto = new WTuto(this);
    wplay = new WPlay(this);

    //play button
    bplay = new JButton("Play");
    bplay.setBounds(100,300,600,100);
    add(bplay);
    bplay.addActionListener(this);

    //Tuto button
    btuto = new JButton("Tutorial");
    btuto.setBounds(100,400,600,100);
    add(btuto);
    btuto.addActionListener(this);

  }
  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==bplay){
      wplay.setPrincipal(this);
      wplay.Oncreate();
    }
    if(e.getSource()==btuto){
      wtuto.setPrincipal(this);
    }
  }

}
