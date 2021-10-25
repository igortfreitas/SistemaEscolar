package sistema.cci;

import sistema.cgt.AplGerenciarCurso;
import sistema.ciu.JanCadCurso;
import sistema.ciu.JanPrincipal;

import javax.swing.*;

public class ControladorPrincipal {

    public static void main(String[] args) {
        new JanPrincipal();
    }
    public void exibirJanCadCurso(){
        new JanCadCurso();
    }
    public void cadastrarCurso(JTextField nomeTextfield, JTextField chTextfield){
        new AplGerenciarCurso().cadcurso(nomeTextfield, chTextfield);
    }
}
