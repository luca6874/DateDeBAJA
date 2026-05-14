package unidad3;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Registro extends JFrame implements ActionListener {

    private JTextField txtEmail;
    private JPasswordField txtPass;
    private JButton btnAcceder, btnLogin;
    private JCheckBox chkTerminos;
    private JMenuItem itemAcceder;

    public Registro() {
        setTitle("Registro");
        setSize(850, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
      
        getContentPane().setBackground(new Color(236, 153, 93));

        // MENU
        JMenuBar mb = new JMenuBar();
        JMenu mCuenta = new JMenu("Cuenta");
        itemAcceder = new JMenuItem("Acceder");
        itemAcceder.addActionListener(this);
        mCuenta.add(itemAcceder);
        mb.add(new JMenu("Archivo")); mb.add(new JMenu("Ayuda")); mb.add(mCuenta);
        setJMenuBar(mb);

        // TÍTULO
        JLabel titulo = new JLabel("Registrarse");
        titulo.setFont(new Font("Serif", Font.BOLD, 32)); 
        titulo.setBounds(120, 40, 300, 40);
        add(titulo);

        // FORMULARIO 
        JLabel l1 = new JLabel("Ingrese su email:");
        l1.setFont(new Font("Serif", Font.BOLD, 18));
        l1.setBounds(50, 110, 300, 25);
        add(l1);

        txtEmail = new JTextField();
        txtEmail.setBounds(50, 140, 350, 35);
        add(txtEmail);

        JLabel l2 = new JLabel("Ingrese su contraseña:");
        l2.setFont(new Font("Serif", Font.BOLD, 18));
        l2.setBounds(50, 200, 300, 25);
        add(l2);

        txtPass = new JPasswordField();
        txtPass.setBounds(50, 230, 350, 35);
        add(txtPass);

        chkTerminos = new JCheckBox("Acepto los términos");
        chkTerminos.setOpaque(false);
        chkTerminos.setBounds(50, 280, 200, 20);
        add(chkTerminos);

        JLabel lblOlvido = new JLabel("¿Olvidó su contraseña?");
        lblOlvido.setBounds(200, 310, 180, 20);
        add(lblOlvido);

        //BOTONES 
        btnAcceder = new JButton("ACCEDER");
        btnAcceder.setBounds(110, 360, 230, 45);
        btnAcceder.setFont(new Font("Serif", Font.BOLD, 18));
        btnAcceder.setBackground(Color.WHITE);
        btnAcceder.setBorder(new LineBorder(Color.RED, 3)); 
        btnAcceder.addActionListener(this);
        add(btnAcceder);

        btnLogin = new JButton("Ir al login");
        btnLogin.setBounds(110, 430, 230, 45);
        btnLogin.setFont(new Font("Serif", Font.BOLD, 18));
        btnLogin.setBackground(Color.WHITE);
        btnLogin.setBorder(new LineBorder(Color.RED, 3));
        btnLogin.addActionListener(this);
        add(btnLogin);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin || e.getSource() == itemAcceder) {
            new dasclogin().setVisible(true);
            this.dispose();
        }
        if (e.getSource() == btnAcceder) {
            if(chkTerminos.isSelected()) {
                JOptionPane.showMessageDialog(this, "Registro exitoso");
            } else {
                JOptionPane.showMessageDialog(this, "Debes aceptar los términos");
            }
        }
    }
}