package exsomadenumeros;

import java.util.ArrayList;

public class SomaNumeros {
    public ArrayList<Integer> listaNumeros = new ArrayList<>();
    
    public SomaNumeros(){}
    
    public void adicionarNumero(int numero){
        this.listaNumeros.add(numero);
    }
    
    public void calcularSoma(){
        int soma = 0;
        if(!listaNumeros.isEmpty()){
            for(Integer i : listaNumeros){
                soma += i;
            }
            System.out.println(soma);
        }else{
            System.out.println("A lista esta vazia!");
        }
    }
    
    public void encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!listaNumeros.isEmpty()){
            for(Integer i : listaNumeros){
                if(i >= maiorNumero){
                    maiorNumero = i;
                }
            }
            System.out.println(maiorNumero);
        }else{
            System.out.println("A lista esta vazia!");
        }
    }
    
    public void encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!listaNumeros.isEmpty()){
            for(Integer i : listaNumeros){
                if(i <= menorNumero){
                    menorNumero = i;
                }
            }
            System.out.println(menorNumero);
        }else{
            System.out.println("A lista esta vazia!");
        }
    }
    
    public ArrayList<Integer> exibirNumeros(){
        return listaNumeros;
    }
}
