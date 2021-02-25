import java.awt.event.*;
import javax.swing.JButton;
class WPlay extends Window {
  Window parent;
  JButton breturn;
  GBoard board;
  boolean create = false;
  WPlay(Window parent){
    this.parent = parent;
    board = new GBoard(5,this);

    breturn = new JButton("return");
    breturn.setBounds(100,500,200,100);
    breturn.addActionListener(this);
    add(breturn);

  }
  void Oncreate(){
    if(!create){
      board.onCreate(5);
      create = true;
    }
  }
  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==breturn){
      parent.setPrincipal(this);
    }
  }
}
