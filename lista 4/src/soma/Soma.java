package soma;

public class Soma {
    private int inicio, fim;

    public int getInicio() {
        return inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public Soma(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public Soma() {
    }

    public int verificaNumero() {
        if (inicio % 2 == 0) {
            inicio += 1;
        } else {
            inicio += 2;
        }
        return inicio;
    }

    public int calculaSoma() {

        int i, soma = 0;
        for (i = verificaNumero(); i < getFim(); i++) {
            soma += i++;
        }

        return soma;
    }

}