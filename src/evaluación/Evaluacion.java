/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluación;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Angie Castañeda
 */
public class Evaluacion extends JFrame implements ActionListener {
    
    private JPanel panel;
    private JButton JBavanza, JBfinaliza;
    private JLabel LPregunta, LNumPreg;
    private JRadioButton JRopc1, JRopc2, JRopc3, JRopc4;
    private ButtonGroup CBGroupResp;
    private String BTN_FIN = "BTN_FIN";
    
    public Evaluacion() {
        
        setSize(700, 400);
        setTitle("NUEVA EVALUACION");
        setLocation(500, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        
        String[]aux = r.setRespuesta(posi);
        
        LNumPreg = new JLabel("<html>1. SEGURIDAD ORGANZATIVA DE LA UNIDAD (este item se califica general por la Unidad)");
        LNumPreg.setForeground(Color.black);
        LNumPreg.setFont(new Font("Arial", 1, 16 ));
        LNumPreg.setBounds(10, 10, 640, 50);
        panel.add(LNumPreg);
        
        LPregunta = new JLabel("Pregunta");
        LPregunta.setText(p.getPregunta(posi));
        LPregunta.setForeground(Color.red);
        LPregunta.setFont(new Font("Arial", 0, 14 ));
        LPregunta.setBounds(10, 45, 640, 80);
        panel.add(LPregunta);
        
        JRopc1 = new JRadioButton();
        JRopc1.setBounds(20, 110, 630, 30);
        panel.add(JRopc1);
        
        JRopc2 = new JRadioButton();
        JRopc2.setBounds(20, 140, 630, 30);
        panel.add(JRopc2);
        
        JRopc3 = new JRadioButton();
        JRopc3.setBounds(20, 170, 630, 30);
        panel.add(JRopc3);
        
        JRopc4 = new JRadioButton();
        JRopc4.setBounds(20, 200, 630, 30);
        panel.add(JRopc4);
        
        CBGroupResp = new ButtonGroup();
        CBGroupResp.add(JRopc1);
        CBGroupResp.add(JRopc2);
        CBGroupResp.add(JRopc3);
        CBGroupResp.add(JRopc4);
        
        JBavanza = new JButton("Continuar >>");
        JBavanza.setBounds(390, 280, 150, 20);
        JBavanza.addActionListener((ActionListener)this);
        panel.add(JBavanza);
        
        JBfinaliza = new JButton("Finalizar");
        JBfinaliza.setBounds(390, 300, 150, 20);
        JBfinaliza.addActionListener((ActionListener)this);
        JBfinaliza.setActionCommand(BTN_FIN);
        panel.add(JBfinaliza);
        
        CBGroupResp.clearSelection();
        JRopc1.setText(aux[0]);
        JRopc2.setText(aux[1]);
        JRopc3.setText(aux[2]);
        JRopc4.setText(aux[3]);
        JRopc1.requestFocus();
        JBfinaliza.setEnabled(false);
        
        add(panel);
        setVisible(true);
        
    }
    
    int posi = 0;
    Respuestas1 r = new Respuestas1();
    Preguntas1 p = new Preguntas1();
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        posi++;
        
        if(posi<=48){
            if(posi==9){
                LNumPreg.setText( "<html>2. SEGURIDAD LÓGICA (A partir de este item se califica por sección)");
            }
            if(posi==17){
                LNumPreg.setText( "<html>3. SEGURIDAD LIGADA A LOS RECURSOS HUMANOS");
            }
            if(posi==22){
                LNumPreg.setText( "<html>4. GESTIÓN DE ACTIVOS DE INFORMACIÓN");
            }
            if(posi==28){
                LNumPreg.setText( "<html>5. CONTROL DE ACCESOS");
            }
            if(posi==33){
                LNumPreg.setText( "<html>6. CIFRADO DE INFORMACIÓN");
            }
            if(posi==36){
                LNumPreg.setText( "<html>7. SEGURIDAD EN LAS TELECOMUNICACIONES");
            }
            if(posi==40){
                LNumPreg.setText( "<html>8. SEGURIDAD FISICA Y DEL ENTORNO");
            }
            if(posi==44){
                LNumPreg.setText( "<html>9. SEGURIDAD EN LOS DOCUMENTOS");
            }
            if(posi==47){
                LNumPreg.setText( "<html>10. SEGURIDAD LEGAL");
            }
            
            LPregunta.setText(p.getPregunta(posi));
            String[]aux = r.setRespuesta(posi);
            CBGroupResp.clearSelection();
            JRopc1.setText(aux[0]);
            JRopc2.setText(aux[1]);
            JRopc3.setText(aux[2]);
            JRopc4.setText(aux[3]);
            JRopc1.requestFocus();
            JBfinaliza.setEnabled(false);
        }
        
        
        
        if (posi>48){
            JBavanza.setEnabled(false);
            JBfinaliza.setEnabled(true);
        }
        if(BTN_FIN.equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(this, "Evaluación finalizada.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);
        }
        
    }
}
