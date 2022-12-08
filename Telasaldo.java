import javax.swing.*;
import java.awt.event.*; 
import java.awt.Color;
public class Telasaldo {
public static void main(String[] args) {
JFrame frame = new JFrame("ECOBANCO-SALDO");
frame.getContentPane().setBackground(Color.blue);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
frame.setResizable(true);
frame.setSize(500, 500);
frame.setLayout(null); 

JTextField sst1 = new JTextField ("SALDO:**********");
sst1.setBounds(130,70, 200,30);
frame.add(sst1);

JTextField sst2 = new JTextField ("CONFIRME OS DADOS:");
sst2.setBounds(130,120, 200,30);
frame.add(sst2);

JTextField sst3 = new JTextField ("insira a senha");
sst3.setBounds(130,170, 200,30);
frame.add(sst3);

JButton SS1=new JButton("CONFIRMAR");  
SS1.setBounds(10,250, 97,30);  
frame.add(SS1); 

JButton SS2=new JButton("CORRIGE");  
SS2.setBounds(180,250, 97,30);  
frame.add(SS2); 

JButton SS3=new JButton("CANCELAR");  
SS3.setBounds(350,250, 97,30);  
frame.add(SS3); 

JButton SS4=new JButton("VOLTAR");  
SS4.setBounds(10,330, 97,30);  
frame.add(SS4);

JButton SS5=new JButton("OPÇOES");  
SS5.setBounds(355,330, 97,30);  
frame.add(SS5);

/*b1.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
v.setText("SEU CPF AQUI");  
}
});   */ 

}
}