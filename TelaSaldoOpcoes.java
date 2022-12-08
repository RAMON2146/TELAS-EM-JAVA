import javax.swing.*;
import java.awt.event.*; 
import java.awt.Color;
public class TelaSaldoOpcoes {
public static void main(String[] args) {
JFrame frame = new JFrame("ECOBANCO-SALDO-OPCOES");
JLabel t4 = new JLabel("OLA, O QUE DESEJA FAZER ?");
frame.getContentPane().add(t4);
frame.getContentPane().setBackground(Color.blue);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
frame.setResizable(false);
frame.setSize(400, 400);
frame.setLayout(null); 

JTextField TO1 = new JTextField ("OPCOES");
TO1.setBounds(100,40, 200,30);
frame.add(TO1);

JButton O1=new JButton("ADD A POUPANCA");  
O1.setBounds(150,80, 97,30);  
frame.add(O1); 

JButton O2=new JButton("INVESTIR");  
O2.setBounds(150,120, 97,30);  
frame.add(O2); 

JButton O3=new JButton("SEGUROS");  
O3.setBounds(150,170, 97,30);  
frame.add(O3); 

JButton O4=new JButton("CONFIRMAR");  
O4.setBounds(150,210, 97,30);  
frame.add(O4);

JButton O5=new JButton("VOLTAR");
O5.setBounds(150,270, 97,30);
frame.add(O5);


/*b1.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
v.setText("SEU CPF AQUI");  
}
});   */ 

}
}