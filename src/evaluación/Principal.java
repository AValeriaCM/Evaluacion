/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluación;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Angie Castañeda
 */
public class Principal extends JFrame implements ActionListener{
    
    private JPanel panel;
    private JLabel LTitulo, LDescrip;
    private JButton JBnext, JBinicia, JBconsulta;
    private String BTN_CONTINUA = "BTN_CONTINUA";
    private String BTN_INICIA = "BTN_INICIA";
    private String BTN_CONSULTA = "BTN_CONSULTA";
    protected String lugaryfecha, personalRA, personalC, personalAC, motivos;
    
    /**
     *  Constructor de la clase
     */
    public Principal() {
        setSize(520, 250);
        setTitle("NUEVA EVALUACION");
        setLocation(500, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        
        LTitulo = new JLabel("EVALUACIÓN TÉCNICA DE SEGURIDAD DE LA INFORMACIÓN ");
        LTitulo.setForeground(Color.red);
        LTitulo.setBounds(100, 20, 500, 20);
        panel.add(LTitulo);
        
        LDescrip = new JLabel("¡BIENVENIDO!    Para continuar, escoja una opción:");
        LDescrip.setBounds(120, 70, 500, 20);
        panel.add(LDescrip);
        
        JBinicia = new JButton("Iniciar Evaluacion");
        JBinicia.setBounds(160, 130, 180, 20);
        JBinicia.addActionListener((ActionListener)this);
        JBinicia.setActionCommand(BTN_INICIA);
        panel.add(JBinicia);
        
        JBconsulta = new JButton("Consultar Base de Datos");
        JBconsulta.setBounds(160, 160, 180, 20);
        JBconsulta.addActionListener((ActionListener)this);
        JBconsulta.setActionCommand(BTN_CONSULTA);
        panel.add(JBconsulta);
        
        JBnext = new JButton("Continuar >>");
        JBnext.setBounds(390, 280, 150, 20);
        JBnext.addActionListener((ActionListener)this);
        JBnext.setActionCommand(BTN_CONTINUA);
        panel.add(JBnext);
        
        
        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(BTN_INICIA.equals(e.getActionCommand())){
            setVisible(false);
            InfoInicial i = new InfoInicial();
            i.setVisible(true);
            
//              JOptionPane.showMessageDialog(this, "Iniciará evaluación.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
//              setVisible(false);
//              Evaluacion ev = new Evaluacion();
//              
//              ev.setVisible(true);
        }
    }

}
