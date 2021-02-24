package tarefa_modulo09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Relatorio {

    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("João",  20);
        Cliente c2 = new Cliente("Maria", 5);
        Cliente c3 = new Cliente("Pedro", 8);
        Cliente c4 = new Cliente("Ana", 17);
        Cliente c5 = new Cliente("Jose", 23);
        Cliente c6 = new Cliente("Bia", 27);
        Cliente c7 = new Cliente("Alan", 34);
        Cliente c8 = new Cliente("Pablo", 38);
        Cliente c9 = new Cliente("Jaque", 12);
        Cliente c10 = new Cliente("Luna", 16);

        List<Cliente> clientes = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10);

        Comparator<Cliente>qtdCompras = (cliente1, cliente2) -> {
            if (cliente1.quantidade > cliente2.quantidade) return 1;
            if (cliente1.quantidade < cliente2.quantidade) return -1;
            return 0;
        };
    
        //interfaces funcionais sendo usadas aqui
        Function<Cliente, Double> qtd = a -> a.quantidade; // expressao lambda sendo usada aqui
        BinaryOperator<Double> soma = (x, y) -> x + y;

        Double somatorio = clientes.stream().map(qtd).reduce(soma).get();

        BinaryOperator<Double> calculoMedia = (n1, n2) -> somatorio / clientes.size();
        Double media = clientes.stream().map(qtd).reduce(calculoMedia).get();
    
        //1.Qual foi o cliente que mais fez compra?                         //stream sendo usada aqui//
        System.out.println("\nO cliente que  fez mais compras foi: " + clientes.stream().max(qtdCompras).get());
        //2.Qual foi o cliente que fez menos compra?
        System.out.println("\nO cliente que  fez menos compras foi: " + clientes.stream().min(qtdCompras).get());
        //3.Qual a média das compras dos clientes da lista?
        System.out.println("\nA media das compras dos clientes foi : " + media);
    
    }

}
