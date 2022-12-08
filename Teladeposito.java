import javax.swing.*;
import java.awt.event.*; 
import java.awt.Color;
public class Teladeposito {
public static void main(String[] args) {
JFrame frame = new JFrame("ECOBANCO-DEPÓSITO");
JLabel t1 = new JLabel("Olá, quanto quer transferir");
frame.getContentPane().add(t1);
frame.getContentPane().setBackground(Color.blue);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
frame.setResizable(true);
frame.setSize(500, 500);
frame.setLayout(null); 
JTextField lt1 = new JTextField ("informe o valor aqui");
lt1.setBounds(130,70, 200,30);
frame.add(lt1);
JTextField vt1 = new JTextField ("informe o valor");
vt1.setBounds(130,120, 200,30);
frame.add(vt1);
JTextField st1 = new JTextField ("SALDO: R$1000");
st1.setBounds(130,170, 200,30);
frame.add(st1);

JButton D1=new JButton("CONFIRMAR");  
D1.setBounds(10,250, 97,30);  
frame.add(D1); 

JButton D2=new JButton("CORRIGE");  
D2.setBounds(180,250, 97,30);  
frame.add(D2); 

JButton D3=new JButton("CANCELAR");  
D3.setBounds(350,250, 97,30);  
frame.add(D3); 

JButton D4=new JButton("VOLTAR");  
D4.setBounds(180,330, 97,30);  
frame.add(D4);

/*b1.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
v.setText("SEU CPF AQUI");  
}
});   */ 

}
}