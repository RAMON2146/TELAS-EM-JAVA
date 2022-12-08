import javax.swing.*;
import java.awt.event.*; 
import java.awt.Color;
public class TelaTransferencia {
public static void main(String[] args) {
JFrame frame = new JFrame("ECOBANCO-TRANSFERÊNCIA");
JLabel t3 = new JLabel("QUANTO QUER TRANSFERIR ?");
frame.getContentPane().add(t3);
frame.getContentPane().setBackground(Color.blue);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
frame.setResizable(true);
frame.setSize(500, 500);
frame.setLayout(null); 

JTextField tt1 = new JTextField ("SALDO:R$ 10000");
tt1.setBounds(20,40, 200,30);
frame.add(tt1);

JTextField tt2 = new JTextField ("PARA: *********");
tt2.setBounds(250,40, 200,30);
frame.add(tt2);

JTextField tt3 = new JTextField ("VALOR A TRANSFERIR: R$ 0.00 ");
tt3.setBounds(150,150, 200,30);
frame.add(tt3);

JTextField tt4 = new JTextField ("Digitie sua senha... ");
tt4.setBounds(150,190, 200,30);
frame.add(tt4);

JButton T1=new JButton("CONFIRMAR");  
T1.setBounds(10,250, 97,30);  
frame.add(T1); 

JButton T2=new JButton("CORRIGE");  
T2.setBounds(180,250, 97,30);  
frame.add(T2); 

JButton T3=new JButton("CANCELAR");  
T3.setBounds(350,250, 97,30);  
frame.add(T3); 

JButton T4=new JButton("VOLTAR");  
T4.setBounds(180,330, 97,30);  
frame.add(T4);


/*b1.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
v.setText("SEU CPF AQUI");  
}
});   */ 

}
}