package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GerarPedidoHandler;

import java.math.BigDecimal;

public class TestesPedidosCommand {

    public static void main(String[] args) {
        String cliente = "Bruno Kayser";
        BigDecimal valorOrcamento = new BigDecimal("600");
        int quantidadeItens = 2;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GerarPedidoHandler handler = new GerarPedidoHandler(/*dependências*/);
        handler.executa(gerador);

    }

}
