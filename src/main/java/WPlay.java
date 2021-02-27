import java.awt.event.*;
import javax.swing.JButton;
class WPlay extends Window {
  Window parent;
  JButton breturn;
  JButton level;
  GBoard board;
  boolean create = false;
  WPlay(Window parent){
    this.parent = parent;
    board = new GBoard(5,this);

    breturn = new JButton("return");
    breturn.setBounds(150,500,250,100);
    breturn.addActionListener(this);
    add(breturn);

    level = new JButton("level");
    level.setBounds(400,500,250,100);
    level.addActionListener(this);
    add(level);
  }
  void Oncreate(){
    if(!create){
      board.onCreate();
      create = true;
    }
  }
  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==breturn){
      parent.setPrincipal(this);
    }
    if(e.getSource()==level){
      board.makewhite();
      do{
        board.MakeRandom();
      }while(board.checkwin());
    }
  }
}
