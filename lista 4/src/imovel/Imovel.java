package imovel;

public class Imovel {
    private String identificação;
    private double valorImposto;
    private int mesesAtrasados; // 2% por mes atrasado;

    public Imovel(String identificação, double valorImposto, int mesesAtrasados) {
        this.setIdentificação(identificação);
        this.setValorImposto(valorImposto);
        this.setMesesAtrasados(mesesAtrasados);
    }

    public Imovel() {
    }

    public int getMesesAtrasados() {
        return mesesAtrasados;
    }

    public void setMesesAtrasados(int mesesAtrasados) {
        this.mesesAtrasados = mesesAtrasados;
    }

    public double getValorImposto() {
        return valorImposto;
    }

    public void setValorImposto(double valorImposto) {
        this.valorImposto = valorImposto;
    }

    public String getIdentificação() {
        return identificação;
    }

    public void setIdentificação(String identificação) {
        this.identificação = identificação;
    }

    public double calculoMulta() {

        double multa = valorImposto * 0.02 * mesesAtrasados;

        return multa;
    }

    public String dados() {
        return "Dados do imovel: " + "\nIdentificação do imovel: " + identificação + "\nValor do imposto: "
                + valorImposto + " reais" + "\nMeses em atraso: " + mesesAtrasados + " meses" + "\nMulta a ser pago: "
                + calculoMulta() + " reais";
    }

}