public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(9);
        //testar soma
        double soma = calc.somar(2, 3);
        System.out.println(soma);
        System.out.print(soma);
    
        //testar subtracao
        double sub = calc.subtrair(2, 3);
        System.out.println(sub); 
    }
}
