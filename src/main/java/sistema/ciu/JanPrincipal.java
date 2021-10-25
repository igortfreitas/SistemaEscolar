package sistema.ciu;

import sistema.cci.ControladorPrincipal;

import javax.swing.*;
import java.awt.*;

public class JanPrincipal extends JFrame {
    public JPanel panel;
    private JButton cursoButton, alunoButton, professorButton, turmaButton, matriculaButton;

    public JanPrincipal(){
        super("SistemaEscolar");

        panel = new JPanel();
        panel.setBackground(new Color(-14738400));
        panel.setForeground(new Color(-14738400));

        cursoButton = new JButton("Curso");
        cursoButton.setForeground(new Color(0xFFFEFF));
        cursoButton.setBackground(new Color(0xFF3A3A3A, true));
        cursoButton.setBorderPainted(false);
        cursoButton.setFocusPainted(false);
        cursoButton.setFocusable(false);
        cursoButton.setOpaque(true);

        alunoButton = new JButton("Aluno");
        alunoButton.setForeground(new Color(0xFFFEFF));
        alunoButton.setBackground(new Color(0xFF3A3A3A, true));
        alunoButton.setBorderPainted(false);
        alunoButton.setFocusPainted(false);
        alunoButton.setFocusable(false);
        alunoButton.setOpaque(true);

        professorButton = new JButton("Professor");
        professorButton.setForeground(new Color(0xFFFEFF));
        professorButton.setBackground(new Color(0xFF3A3A3A, true));
        professorButton.setBorderPainted(false);
        professorButton.setFocusPainted(false);
        professorButton.setFocusable(false);
        professorButton.setOpaque(true);

        turmaButton = new JButton("Turma");
        turmaButton.setForeground(new Color(0xFFFEFF));
        turmaButton.setBackground(new Color(0xFF3A3A3A, true));
        turmaButton.setBorderPainted(false);
        turmaButton.setFocusPainted(false);
        turmaButton.setFocusable(false);
        turmaButton.setOpaque(true);

        matriculaButton = new JButton("Matricula");
        matriculaButton.setForeground(new Color(0xFFFEFF));
        matriculaButton.setBackground(new Color(0xFF3A3A3A, true));
        matriculaButton.setBorderPainted(false);
        matriculaButton.setFocusPainted(false);
        matriculaButton.setFocusable(false);
        matriculaButton.setOpaque(true);

        panel.add(cursoButton);
        panel.add(alunoButton);
        panel.add(professorButton);
        panel.add(turmaButton);
        panel.add(matriculaButton);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setResizable(false);
        this.setContentPane(panel);
        this.setVisible(true);

        cursoButton.addActionListener(e -> new ControladorPrincipal().exibirJanCadCurso());
    }
}
