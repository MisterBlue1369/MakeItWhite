import java.awt.event.*;
class GBoard implements ActionListener{
  GBox[][] board;
  int BSize;
  int size;
  WPlay parent;
  int level;
  GBoard (int size, WPlay parent){
    this.size = size;
    this.parent = parent;
    level = 1;
  }
  void onCreate(){
    BSize = 500/size;
    board = new GBox[size][size];
    for(int i = 0; i < size; i++){ 
      for(int j = 0; j < size; j++){
        board[j][i] = new GBox();
        board[j][i].setBounds((j*BSize)+150,i*BSize,BSize,BSize);
        parent.add(board[j][i]);
        board[j][i].addActionListener(this);
      }
    }
    if (checkwin())MakeRandom();
  }
  public void Makebigger(){
    for(int i = 0; i < size; i++){ 
      for(int j = 0; j < size; j++){
        parent.remove(board[j][i]);
      }
    }
    board = null;
    size++;
    onCreate();
  }
  public void MakeRandom(){
    for(int i = 1; i <= level; i++){
      clickbutton((int)(Math.random()*size),(int)(Math.random()*size));
    }
  }
  public void makewhite(){
    for(int i = 0; i < size; i++){ 
      for(int j = 0; j < size; j++){
        board[j][i].changeto(true);
      }
    }
  }
  public void win(){
    level++;
    if(level> size*size){
      level = 1;
      Makebigger();
    }
    MakeRandom();
    parent.level.setText("level "+level);
  }
  public boolean checkwin(){
    boolean gwin = true;
    for(int i = 0; i < size; i++){ 
      for(int j = 0; j < size; j++){
        if(!board[j][i].state){
          gwin = false;
        }
      }
    }
    return gwin;
  }
  public void clickbutton(int j, int i){
    for(int k = i-1; k <= i+1; k++){for(int l = j-1; l <= j+1; l++){if(k >= 0 && k < size && l >= 0 && l < size){
      board[l][k].change();
    }}}
  }
  @Override
  public void actionPerformed(ActionEvent e){
    for(int i = 0; i < size; i++){for(int j = 0; j < size; j++){if(e.getSource()==board[j][i]){
      clickbutton(j, i);
    }}}
    if(checkwin()){
      win();
    }
  }
}
