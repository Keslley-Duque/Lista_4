package appprofessor;

import javax.swing.JOptionPane;

public class Professor {
    private String matricula, nome;
    private boolean ativo;
    private int horasTrabalhadasMes;
    private double valorHora;

    public Professor(String nome, String matricula, boolean ativo, int horasTrabalhadasMes, double valorHora) {

        this.nome = nome;
        this.matricula = matricula;
        this.ativo = true;
        this.horasTrabalhadasMes = horasTrabalhadasMes;
        this.valorHora = valorHora;
    }

    public Professor(String nome, String matricula, int horasTrabalhadasMes, double valorHora) {

        this.nome = nome;
        this.matricula = matricula;
        this.ativo = true;
        this.horasTrabalhadasMes = horasTrabalhadasMes;
        this.valorHora = valorHora;
    }

    public Professor(String nome, String matricula, double valorHora) {

        this.nome = nome;
        this.matricula = matricula;
        this.ativo = true;
        this.valorHora = valorHora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadasMes() {
        return horasTrabalhadasMes;
    }

    public void setHorasTrabalhadasMes(int horasTrabalhadasMes) {
        this.horasTrabalhadasMes = horasTrabalhadasMes;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double salarioBrutoMensal() {
        double salarioBruto = horasTrabalhadasMes * valorHora;
        return salarioBruto;
    }

    public double inss() {
        int desc;

        if (salarioBrutoMensal() <= 1174.86) {
            desc = 8;
        } else if (salarioBrutoMensal() <= 1958.10) {
            desc = 9;
        } else if (salarioBrutoMensal() <= 3916.20) {
            desc = 11;
        } else {
            desc = 11;
        }

        double inss = salarioBrutoMensal() * desc / 100;
        return inss;
    }

    public double impostoRenda() {
        double desc;
        if (salarioBrutoMensal() <= 1566.61) {
            desc = 0;
        } else if (salarioBrutoMensal() <= 2347.85) {
            desc = 7.5;
        } else if (salarioBrutoMensal() <= 3130.51) {
            desc = 15;
        } else if (salarioBrutoMensal() <= 3911.63) {
            desc = 22.5;
        } else {
            desc = 27.5;
        }
        double imp = salarioBrutoMensal() * desc / 100;
        return imp;
    }

    public double salarioLiquido() {
        return salarioBrutoMensal() - (inss() + impostoRenda());
    }

    public void encerraContrato() {
        if (ativo == true) {
            JOptionPane.showMessageDialog(null, "O professor tabalha nesta instituição.");
        } else {
            JOptionPane.showMessageDialog(null, "O professor não tabalha mais nesta instituição.");
        }
    }

    public String dados() {
        return "Dados do Professor" + "\nNome do Professor: " + nome + "\nMatricula: " + matricula
                + "\nHoras trabalhadas no mes: " + horasTrabalhadasMes + "\nValor por Hora trabalhada: " + valorHora
                + "\nSalario Bruto: " + salarioBrutoMensal() + "\nSalario Liquido: " + salarioLiquido() + "\nINSS: "
                + inss() + "\n Imposto de renda: " + impostoRenda();
    }

}