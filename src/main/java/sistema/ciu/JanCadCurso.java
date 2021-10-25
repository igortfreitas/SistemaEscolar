package sistema.ciu;

import sistema.cci.ControladorPrincipal;

import javax.swing.*;
import java.awt.*;

public class JanCadCurso extends JFrame {
    private JPanel panel;
    private JTextField chTextfield,nomeTextfield;
    private JButton cadastrarButton;
    private JLabel label1, label2;

    public JanCadCurso() {
        super("Curso");

        panel = new JPanel();
        panel.setBackground(new Color(-14738400));
        panel.setForeground(new Color(-14738400));

        label1 = new JLabel("Nome: ");
        label1.setForeground(new Color(0xFFFEFF));
        label1.setPreferredSize(new Dimension(100,30));
        label2 = new JLabel("Carga Horária: ");
        label2.setForeground(new Color(0xFFFEFF));
        label2.setPreferredSize(new Dimension(100,30));

        chTextfield = new JTextField();
        chTextfield.setPreferredSize(new Dimension(150,30));
        nomeTextfield = new JTextField();
        nomeTextfield.setPreferredSize(new Dimension(150,30));

        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setForeground(new Color(0xFFFEFF));
        cadastrarButton.setBackground(new Color(0xFF3A3A3A, true));
        cadastrarButton.setBorderPainted(false);
        cadastrarButton.setFocusPainted(false);
        cadastrarButton.setFocusable(false);
        cadastrarButton.setOpaque(true);

        nomeTextfield.setDocument(new Reg());
        chTextfield.setDocument(new Reg2());

        panel.add(label1);
        panel.add(nomeTextfield);
        panel.add(label2);
        panel.add(chTextfield);
        panel.add(cadastrarButton);

        this.setContentPane(panel);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(300, 300);
        this.setResizable(false);
        this.setVisible(true);
        cadastrarButton.addActionListener(e -> cadastrar());
    }
    void cadastrar() {
        if (!nomeTextfield.getText().isEmpty() && !chTextfield.getText().isEmpty()) {
            new ControladorPrincipal().cadastrarCurso(nomeTextfield, chTextfield);
        } else {
            JOptionPane.showMessageDialog(null, "Campos não podem ficar vazios");
        }
    }
}