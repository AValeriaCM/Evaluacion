/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluación;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Angie Castañeda
 */
public class InfoInicial extends JFrame implements ActionListener{
    
    private JPanel panel;
    private JTextField lugaryfecha, personalRA, personalC, personalAC, motivos;
    private JLabel Ltitulo, Llugaryf, Lpersonal1, Lpersonal2, Lpersonal3, Lmotiv;
    private JButton JBcontinuar;
    private String BTN_CONTINUA = "BTN_CONTINUA";

    
    public InfoInicial() {
        setSize(500, 400);
        setTitle("INFORMACION INICIAL");
        setLocation(500, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //setResizable(false);
        
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        
        Ltitulo = new JLabel("PARA CONTINUAR, DEBE INGRESAR LA INFORMACION SOLICITADA");
        Ltitulo.setForeground(Color.red);
        Ltitulo.setBounds(70, 20, 500, 20);
        panel.add(Ltitulo);
        
        Llugaryf = new JLabel("<html>Lugar y fecha donde se realizó la verificación: (Lugar, dd/mm/aaa)");
        Llugaryf.setBounds(30, 70, 250, 30);
        panel.add(Llugaryf);
        
        lugaryfecha = new JTextField("");
        lugaryfecha.setBounds(250, 70, 200, 30);
        panel.add(lugaryfecha);
        
        Lpersonal1 = new JLabel("<html>Personal que realizó el acompañamiento:");
        Lpersonal1.setBounds(30, 110, 200, 30);
        panel.add(Lpersonal1);
        
        personalRA = new JTextField("");
        personalRA.setBounds(250, 110, 200, 30);
        panel.add(personalRA);
        
        Lpersonal2 = new JLabel("<html>Personal con que se realizó la coordinación inicial:");
        Lpersonal2.setBounds(30, 150, 200, 30);
        panel.add(Lpersonal2);
        
        personalC = new JTextField("");
        personalC.setBounds(250, 150, 200, 30);
        panel.add(personalC);
        
        Lpersonal3 = new JLabel("<html>Personal acompañante:");
        Lpersonal3.setBounds(30, 190, 200, 30);
        panel.add(Lpersonal3);
        
        personalAC = new JTextField("");
        personalAC.setBounds(250, 190, 200, 30);
        panel.add(personalAC);
        
        Lmotiv = new JLabel("<html>Motivos para el desarrollo del trabajo:");
        Lmotiv.setBounds(30, 230, 200, 30);
        panel.add(Lmotiv);
        
        motivos = new JTextField("");
        motivos.setBounds(250, 230, 200, 30);
        panel.add(motivos);
        
        JBcontinuar = new JButton("Continuar>>");
        JBcontinuar.setBounds(160, 290, 180, 20);
        JBcontinuar.addActionListener((ActionListener)this);
        JBcontinuar.setActionCommand(BTN_CONTINUA);
        panel.add(JBcontinuar);
        
        add(panel);
        setVisible(true);
    }

    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(BTN_CONTINUA.equals(e.getActionCommand())){
            if(validaCampos()){
            JOptionPane.showMessageDialog(this, "Iniciará evaluación.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);
            Evaluacion ev = new Evaluacion();
            vaciarDatos();
            ev.setVisible(true);
            }
        }
    }
    
    
    private boolean validaCampos(){
        
        if(lugaryfecha.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos", "Mensaje", JOptionPane.ERROR_MESSAGE);
            Llugaryf.setForeground(Color.red);
            return false;
        } else if(personalRA.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos", "Mensaje", JOptionPane.ERROR_MESSAGE);
            Lpersonal1.setForeground(Color.red);
            return false;
        } else if(personalC.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos", "Mensaje", JOptionPane.ERROR_MESSAGE);
            Lpersonal2.setForeground(Color.red);
            return false;
        } else if(personalAC.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos", "Mensaje", JOptionPane.ERROR_MESSAGE);
            Lpersonal3.setForeground(Color.red);
            return false;
        } else if(motivos.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos", "Mensaje", JOptionPane.ERROR_MESSAGE);
            Lmotiv.setForeground(Color.red);
            return false;
        }
        
        return true;
    }
        
    private void vaciarDatos() {
        lugaryfecha.setText("");
        Llugaryf.setForeground(Color.BLACK);
        personalRA.setText("");
        Lpersonal1.setForeground(Color.BLACK);
        personalC.setText("");
        Lpersonal2.setForeground(Color.BLACK);
        personalAC.setText("");
        Lpersonal3.setForeground(Color.BLACK);
        motivos.setText("");
        Lmotiv.setForeground(Color.BLACK);
        
    }
    
    
}
