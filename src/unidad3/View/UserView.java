package unidad3.View;

import unidad3.Model.AuthModel;
import unidad3.Model.User;

import java.util.ArrayList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

public class UserView {

    JFrame ventana;

    JTable tabla;

    DefaultTableModel model;

    public UserView() {

        ventana = new JFrame();

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setSize(600, 400);

        ventana.setLocationRelativeTo(null);

        ventana.setLayout(null);



        // TABLA

        tabla = new JTable();

        JScrollPane scroll = new JScrollPane(tabla);

        scroll.setBounds(20,20,540,250);

        ventana.add(scroll);



        // MODELO

        model = new DefaultTableModel();

        model.addColumn("ID");

        model.addColumn("USERNAME");

        model.addColumn("NOMBRE");

        tabla.setModel(model);



        // CARGAR TABLA

        cargarTabla();



        // BOTON NUEVO REGISTRO

        JButton nuevo = new JButton("Nuevo Registro");

        nuevo.setBounds(180,300,200,30);

        ventana.add(nuevo);



        nuevo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

               new AuthViews().registro();
            }
        });



        ventana.setVisible(true);
    }




    public void cargarTabla(){


        model.setRowCount(0);



        AuthModel auth = new AuthModel();

        ArrayList<User> usuarios = auth.obtenerUsuarios();



        for(User user : usuarios){

            model.addRow(new Object[]{

                user.getId(),

                user.getUsername(),

                user.getNombreCompleto()
            });
        }
    }
}