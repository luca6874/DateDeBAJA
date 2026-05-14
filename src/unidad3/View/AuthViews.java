package unidad3.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import unidad3.Model.AuthModel;

public class AuthViews implements ActionListener {

    JFrame ventana;

    JTextField txtCorreo;
    JPasswordField txtPassword;

    JButton btnAcceder;
    JButton btnCrear;

    public AuthViews() {

    }

    public void dasclogin() {

        ventana = new JFrame();

        ventana.setTitle("Login - UABCS");
        ventana.setSize(500, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);

        JLabel l1 = new JLabel("Correo");
        l1.setBounds(50, 50, 150, 20);
        ventana.add(l1);

        txtCorreo = new JTextField();
        txtCorreo.setBounds(50, 75, 350, 30);
        ventana.add(txtCorreo);

        JLabel l2 = new JLabel("Contraseña");
        l2.setBounds(50, 120, 150, 20);
        ventana.add(l2);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(50, 145, 350, 30);
        ventana.add(txtPassword);

        btnAcceder = new JButton("ACCEDER");
        btnAcceder.setBounds(50, 200, 350, 35);
        btnAcceder.addActionListener(this);
        ventana.add(btnAcceder);

        btnCrear = new JButton("Crear cuenta");
        btnCrear.setBounds(50, 250, 350, 30);
        btnCrear.addActionListener(this);
        ventana.add(btnCrear);

        ventana.setVisible(true);
    }

    @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == btnAcceder) {

                String correo = txtCorreo.getText().trim();
                String password = new String(
                    txtPassword.getPassword()
                ).trim();

                if (correo.isEmpty() || password.isEmpty()) {

                    JOptionPane.showMessageDialog(
                        ventana,
                        "Llena todos los campos"
                    );

                    return;
                }

                // LOGIN

                if (ventana.getTitle().equals("Login - UABCS")) {

                    AuthModel auth = new AuthModel();

                    /*
                    if (auth.access(correo, password)) {

                        JOptionPane.showMessageDialog(
                            ventana,
                            "Bienvenido"
                        );

                    } else {

                        JOptionPane.showMessageDialog(
                            ventana,
                            "Datos incorrectos"
                        );
                    }
                    */

                    JOptionPane.showMessageDialog(
                        ventana,
                        "Intentando login"
                    );

                }

                // REGISTRO

                else if (ventana.getTitle().equals("Registro")) {

                    JOptionPane.showMessageDialog(
                        ventana,
                        "Usuario registrado"
                    );
                }
            }

            // BOTON SECUNDARIO

            if (e.getSource() == btnCrear) {

                // DESDE LOGIN -> REGISTRO

                if (ventana.getTitle().equals("Login - UABCS")) {

                    ventana.dispose();

                    registro();
                }

                // DESDE REGISTRO -> LOGIN

                else if (ventana.getTitle().equals("Registro")) {

                    ventana.dispose();

                    dasclogin();
                }
            }
    }

    public void registro() {

            ventana = new JFrame();

            ventana.setTitle("Registro");
            ventana.setSize(850, 550);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setLocationRelativeTo(null);
            ventana.setLayout(null);

            JLabel titulo = new JLabel("REGISTRO");
            titulo.setBounds(100, 50, 200, 30);

            ventana.add(titulo);

            JLabel l1 = new JLabel("Correo");
            l1.setBounds(50, 120, 150, 20);

            ventana.add(l1);

            txtCorreo = new JTextField();
            txtCorreo.setBounds(50, 145, 350, 30);

            ventana.add(txtCorreo);

            JLabel l2 = new JLabel("Contraseña");
            l2.setBounds(50, 200, 150, 20);

            ventana.add(l2);

            txtPassword = new JPasswordField();
            txtPassword.setBounds(50, 225, 350, 30);

            ventana.add(txtPassword);

            btnAcceder = new JButton("Registrarse");
            btnAcceder.setBounds(50, 300, 350, 35);

            btnAcceder.addActionListener(this);

            ventana.add(btnAcceder);

            btnCrear = new JButton("Volver al login");
            btnCrear.setBounds(50, 350, 350, 35);

            btnCrear.addActionListener(this);

            ventana.add(btnCrear);

            ventana.setVisible(true);
    }
}