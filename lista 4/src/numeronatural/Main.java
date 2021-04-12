package numeronatural;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Numero numero = new Numero();

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a ser verificado: ",
                "Verificando se o numero é tringular", 3));
        numero.setNum(num);

        JOptionPane.showMessageDialog(null, numero.verificaTriangulo(), "Numero Verificado", 2);
        System.exit(0);
    }
}