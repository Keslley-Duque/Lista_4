package numeronatural;

public class Numero {
    private int num;

    public Numero() {
    }

    public Numero(int num) {
        this.setNum(num);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String verificaTriangulo() {
        for (int i = 1; i <= num; i++) {
            if (i * (i + 1) * (i + 2) == num) {
                return "É triangular";
            }
        }
        return "Não é tringular";
    }

}