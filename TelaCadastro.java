import javax.swing.*;
import java.awt.event.*; 
import java.awt.Color;
public class TelaCadastro {
public static void main(String[] args) {
JFrame frame = new JFrame("ECOBANCO-CADASTRO");
JLabel t5 = new JLabel("OLA, REALIZE SEU CADASTRO, ESCOLHA SEU TIPO DE CONTA ?");
frame.getContentPane().add(t5);
frame.getContentPane().setBackground(Color.blue);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
frame.setResizable(false);
frame.setSize(400, 600);
frame.setLayout(null); 

JTextField TC1 = new JTextField ("OPCOES");
TC1.setBounds(100,40, 200,30);
frame.add(TC1);

JTextField TC2=new JTextField("DIGITE SEU CPF AQUI");  
TC2.setBounds(20,90, 350,40); 
frame.add(TC2);

JTextField TC3=new JTextField("DIGITE SUA SENHA");  
TC3.setBounds(20,130, 350,40); 
frame.add(TC3);

JButton CO1=new JButton("CORRENTE");  
CO1.setBounds(150,200, 100,30);  
frame.add(CO1); 

JButton CO2=new JButton("POUPANÇA");  
CO2.setBounds(150,250, 100,30);  
frame.add(CO2); 

JButton CO3=new JButton("ÁREA ADM");  
CO3.setBounds(150,300, 100,30);  
frame.add(CO3); 

JButton CO4=new JButton("ÁREA SUPERVISOR(SUDO)");  
CO4.setBounds(150,350, 100,30);  
frame.add(CO4); 

JButton CO5=new JButton("CONFIRMAR");  
CO5.setBounds(140,400, 120,30);  
frame.add(CO5);

JButton CO6=new JButton("CANCELAR");
CO6.setBounds(140,450, 120,30);
frame.add(CO6);


/*b1.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
v.setText("SEU CPF AQUI");  
}
});   */ 

}
}