package unidad3.View;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RegisterView extends JFrame {

    public RegisterView() {
        setTitle("Registro");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Vista de Registro funcionando");
        add(label);

        setVisible(true);

        System.out.println("RegisterView abierta correctamente");
    }
}