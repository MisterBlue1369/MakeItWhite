import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.io.*;
import java.awt.event.*;
class WTuto extends JFrame implements ActionListener{
  JLabel text;
  JButton breturn;
  WPrincipal parent;
  WTuto(WPrincipal parent){
    this.parent = parent;
    
    //Frame
    setSize(800,600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(false);

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
    text.setLocation((800-text.getSize().width)/2,(600-text.getSize().height)/2);
    add(text);

    //return button
    breturn = new JButton("return");
    breturn.setBounds((800-breturn.getSize().width)/2,400,100,50);
    breturn.addActionListener(this);
    this.add(breturn);
  }
  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==breturn){
      parent.setPrincipal(this);
    }
  }
  public void setPrincipal(JFrame toprincipal, JFrame close){
    toprincipal.setVisible(true);
    close.setVisible(false);
  }
}
