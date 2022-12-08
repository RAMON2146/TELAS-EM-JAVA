import javax.swing.*;
import java.awt.event.*; 
import java.awt.Color;
public class Telasaque {
public static void main(String[] args) {
JFrame frame = new JFrame("ECOBANCO-SAQUE");
JLabel t2 = new JLabel("Olá, seu SALDO É: R$1000, quanto quer sacar ?");
frame.getContentPane().add(t2);
frame.getContentPane().setBackground(Color.blue);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
frame.setResizable(true);
frame.setSize(500, 500);
frame.setLayout(null); 

JTextField st1 = new JTextField ("informe o valor");
st1.setBounds(130,70, 200,30);
frame.add(st1);

JTextField st2 = new JTextField ("************");
st2.setBounds(130,120, 200,30);
frame.add(st2);

JTextField st3 = new JTextField ("VALOR A SACAR É:");
st3.setBounds(130,170, 200,30);
frame.add(st3);

JButton S1=new JButton("CONFIRMAR");  
S1.setBounds(10,250, 97,30);  
frame.add(S1); 

JButton S2=new JButton("CORRIGE");  
S2.setBounds(180,250, 97,30);  
frame.add(S2); 

JButton S3=new JButton("CANCELAR");  
S3.setBounds(350,250, 97,30);  
frame.add(S3); 

JButton S4=new JButton("VOLTAR");  
S4.setBounds(180,330, 97,30);  
frame.add(S4);

/*b1.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
v.setText("SEU CPF AQUI");  
}
});   */ 

}
}