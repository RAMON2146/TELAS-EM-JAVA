import javax.swing.*;
import java.awt.event.*; 
import java.awt.Color;
public class Telamenu {
public static void main(String[] args) {
JFrame frame = new JFrame("ECOBANCO-MENU");
JLabel label = new JLabel("Olá, o que deseja fazer hoje ?");
frame.getContentPane().add(label);
frame.getContentPane().setBackground(Color.blue);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
frame.setResizable(true);
frame.setSize(400, 400);
frame.setLayout(null); 

JButton t1=new JButton("DEPOSITO");  
t1.setBounds(20,30, 95,30);  
frame.add(t1); 

JButton t2=new JButton("SAQUE");  
t2.setBounds(20,80, 95,30);  
frame.add(t2); 

JButton t3=new JButton("SALDO");  
t3.setBounds(240,30, 95,30);  
frame.add(t3); 

JButton t4=new JButton("TRANSFERENCIA");  
t4.setBounds(240,80, 97,30);  
frame.add(t4);

JButton S2=new JButton("CONFIRMAR");  
S2.setBounds(140,200,95,30);  
frame.add(S2); 

/*b1.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
v.setText("SEU CPF AQUI");  
}
});   */ 

}
}