public class Calc {

    private double meuNumeroPreferido;

    public Calc(double meuNumeroPreferido) {
        this.meuNumeroPreferido = meuNumeroPreferido;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double somarComPreferido(double a) {
        return a + meuNumeroPreferido;
    }
}