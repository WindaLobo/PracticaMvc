

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsuarioIU {

    static Controller miControlador;
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextArea textArea1;
    private JButton crearUsuarioButton;

    public UsuarioIU() {
        miControlador = new Controller();
        crearUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = textField1.getText();
                String apellido = textField2.getText();
                textArea1.setText(nombre + " " + apellido);

            }
        });

    }

    public static UsuarioIU crearVentana() {
        JFrame jframe = new JFrame("App ");
        UsuarioIU form = new UsuarioIU();
        jframe.setContentPane(form.panel1);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);
        jframe.setBounds(600, 300, 400, 200);
        return form;
    }


}
