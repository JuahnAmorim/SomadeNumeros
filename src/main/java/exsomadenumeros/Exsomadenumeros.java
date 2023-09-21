package exsomadenumeros;

public class Exsomadenumeros {

    public static void main(String[] args) {
        SomaNumeros s1 = new SomaNumeros();
        
        s1.adicionarNumero(2);
        s1.adicionarNumero(4);
        s1.adicionarNumero(10);
        
        s1.calcularSoma();
        
        s1.encontrarMaiorNumero();
        
        s1.encontrarMenorNumero();
        
        s1.exibirNumeros();
        
    }
}
