import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.*;
class WTuto extends Window {
  JLabel text;
  JButton breturn;
  Window parent;
  WTuto(Window parent){
    this.parent = parent;
    
    //tutorial
    text = new JLabel("",JLabel.CENTER);
    text.setText("<html><body>"+
        "1.El objetivo del juego es convertir todas casillas<br>"+
        "de color negro a casillas de color blanco,<br>"+
        "para conseguirlo recuerda la siguiente<br>"+
        "Si presionas una casilla esa casillas y las 8 casillas<br>"+
        "<br"+
        "a su alrededor se volveran del color opuesto<br>"+
        "2.Cada ciertos niveles el tablero aumenta de tamano 1 casilla<br>"+
        "en lo ancho y largo"
        +"</body></html>");
    text.setBounds(0,0,800,400);
    //text.setLocation((800-text.getSize().width)/2,(600-text.getSize().height)/2);
    add(text);

    //return button
    breturn = new JButton("return");
    breturn.setBounds(100,400,600,100);
    breturn.addActionListener(this);
    add(breturn);

  }
  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==breturn){
      parent.setPrincipal(this);
    }
  }
}
