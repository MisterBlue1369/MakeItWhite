import java.awt.event.*;
class GBoard implements ActionListener{
  GBox[][] board;
  int BSize;
  int size;
  Window parent;
  GBoard (int size, Window parent){
    BSize = 500/size;
    this.size = size;
    this.parent = parent;
  }
  void onCreate(int size){
    board = new GBox[size][size];
    for(int i = 0; i < size; i++){ 
      for(int j = 0; j < size; j++){
        board[j][i] = new GBox();
        board[j][i].setBounds((j*BSize)+150,i*BSize,BSize,BSize);
        parent.add(board[j][i]);
        board[j][i].addActionListener(this);
      }
    }
  }
  public void win(){
    board = null;
    for(int i = 0; i < size; i++){ 
      for(int j = 0; j < size; j++){
        parent.remove(board[j][i]);
      }
    }
    size++;
    onCreate(size);
  }
  public void checkwin(){
    boolean gwin = true;
    for(int i = 0; i < size; i++){ 
      for(int j = 0; j < size; j++){
        if(!board[j][i].state)gwin = false;
      }
    }
    if(gwin)win();
  }
  @Override
  public void actionPerformed(ActionEvent e){
    for(int i = 0; i < size; i++){for(int j = 0; j < size; j++){if(e.getSource()==board[j][i]){
          for(int k = i-1; k <= i+1; k++){for(int l = j-1; l <= j+1; l++){if(k >= 0 && k < size && l >= 0 && l < size){
                board[l][k].change();
          }}}
    }}}
    checkwin();
  }
}
