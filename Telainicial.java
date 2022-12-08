import javax.swing.*;
import java.awt.event.*; 
import java.awt.Color;
public class Telainicial {
public static void main(String[] args) {
JFrame frame = new JFrame("ECOBANCO");
final JTextField v=new JTextField();  
v.setBounds(130,90, 150,40); 
v.setText("******************");
frame.add(v);
JLabel label = new JLabel("");
frame.getContentPane().add(label);
frame.getContentPane().setBackground(Color.blue);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
frame.setResizable(true);
frame.setSize(400, 400);
frame.setLayout(null); 

JButton b1=new JButton("LOGIN");  
b1.setBounds(150,150,95,30);  
frame.add(b1); 

JButton b2=new JButton("CONFIRMAR");  
b2.setBounds(150,200,95,30);  
frame.add(b2); 

b1.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
v.setText("SEU CPF AQUI");  
}
});   

}
}