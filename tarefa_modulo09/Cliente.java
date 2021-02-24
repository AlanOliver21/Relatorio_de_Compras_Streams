package tarefa_modulo09;

public class Cliente{

    final int total = 0;
    final String nomeCliente;
    final double quantidade;

    public Cliente(String nomeCliente, int quantidade){
        this.nomeCliente = nomeCliente;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return nomeCliente + ", quantidadeDeProdutos=" + quantidade;
    }

   
    
}
