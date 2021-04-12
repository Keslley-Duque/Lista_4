package imovel;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Imovel imovel = new Imovel();

        String id = JOptionPane.showInputDialog(null, "Digite a identificação do imovel: ");
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do imposto (aluguel): "));
        int mesesAtrasados = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Digite o numero de meses atrasados: "));

        imovel.setIdentificação(id);
        imovel.setValorImposto(valor);
        imovel.setMesesAtrasados(mesesAtrasados);

        JOptionPane.showMessageDialog(null, imovel.dados(), "Dados do imovel ", 1);

    }
}