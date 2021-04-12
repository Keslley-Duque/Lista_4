package soma;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();

        int inicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o limite inferior da soma: "));
        int fim = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o limite superior da soma: "));
        soma.setInicio(inicio);
        soma.setFim(fim);

        JOptionPane.showMessageDialog(null, "\nSoma dos numeros impares dentro do limite: " + soma.calculaSoma(),
                "Limite e Soma", 1);
    }
}