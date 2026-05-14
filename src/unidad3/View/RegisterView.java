package unidad3.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import unidad3.Model.AuthModel;

public class RegisterView {

    JFrame ventana;
    JTextField txtUser;
    JPasswordField txtPass;
    JButton btnGuardar;
    JButton btnCancelar;

    UserView userView; // referencia a la tabla

    public RegisterView(UserView userView) {

        this.userView = userView;

        ventana = new JFrame("Registro");
        ventana.setSize(400,300);
        ventana.setLayout(null);
        ventana.setLocationRelativeTo(null);

        JLabel l1 = new JLabel("Usuario");
        l1.setBounds(50,50,100,20);
        ventana.add(l1);

        txtUser = new JTextField();
        txtUser.setBounds(50,70,300,30);
        ventana.add(txtUser);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(50,110,100,20);
        ventana.add(l2);

        txtPass = new JPasswordField();
        txtPass.setBounds(50,130,300,30);
        ventana.add(txtPass);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(50,180,120,30);
        ventana.add(btnGuardar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(200,180,120,30);
        ventana.add(btnCancelar);

        // BOTON GUARDAR
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String user = txtUser.getText();
                String pass = new String(txtPass.getPassword());

                AuthModel model = new AuthModel();

                boolean ok = model.register(user, pass, user);

                if(ok){
                    JOptionPane.showMessageDialog(ventana, "Registrado");

                    ventana.dispose();

                    // 🔥 ESTA LINEA ES LA CLAVE
                    userView.cargarTabla();

                } else {
                    JOptionPane.showMessageDialog(ventana, "Error");
                }
            }
        });

        // BOTON CANCELAR
        btnCancelar.addActionListener(e -> ventana.dispose());

        ventana.setVisible(true);
    }
}