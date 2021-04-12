package appprofessor;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {

        Professor professor = null;

        String nome = JOptionPane.showInputDialog(null, "Digite o nome do Professor: ");
        String matricula = JOptionPane.showInputDialog("Informe o numero da matricula: ");
        int horasTrabalhadasMes = Integer
                .parseInt(JOptionPane.showInputDialog("Informe o numero de horas trabalhadas no mes: "));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hora trabalhada: "));
        JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");

        professor = new Professor(nome, matricula, horasTrabalhadasMes, valorHora);
        String menu = "";
        String[] opcoes = { "Vizualizar Informações", "Reajustar Valor da hora do Professor", "Demitir Professor",
                "Encerrar" };

        do {
            menu = (String) JOptionPane.showInputDialog(null, "Selecione a opção desejada", "Opções", 3, null, opcoes,
                    opcoes[0]);
            switch (menu) {
            case "Vizualizar Informações":

                if (professor == null) {
                    JOptionPane.showMessageDialog(null, "Cadastre as informações do professor primeiro");

                } else {
                    JOptionPane.showMessageDialog(null, professor.dados(), "Dados do professor " + professor.getNome(),
                            1);
                }

                break;
            case "Reajustar Valor da hora do Professor":

                if (professor == null) {
                    JOptionPane.showMessageDialog(null, "Cadastre as informações do professor primeiro");
                } else {
                    double valor = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Informe o valor a ser reajustado: ", "Reajustando Salario" + professor.getNome(), 1));
                    professor.setValorHora(valor);
                    JOptionPane.showMessageDialog(null, "Valor reajustado para: " + professor.getValorHora());
                }
                break;
            case "Demitir Professor":
                if (professor == null) {
                    JOptionPane.showMessageDialog(null, "Cadastre as informações do professor primeiro");
                } else {
                    boolean ativo = Boolean.parseBoolean(JOptionPane.showInputDialog(null,
                            "Deseja demitir o professor (Digite true para demitir): ", "Demitindo Professor", 1));
                    professor.setAtivo(ativo);
                    if (ativo == true) {
                        JOptionPane.showMessageDialog(null, "O Professor foi demitido e suas dados foram apagados!");
                        professor = null;
                    } else {
                        JOptionPane.showMessageDialog(null, "Professor não demitido!");
                    }
                }
                break;
            }
        } while (!menu.equals("Encerrar"));
        JOptionPane.showMessageDialog(null, "Finalizando a Aplicação");
        System.exit(0);
    }
}