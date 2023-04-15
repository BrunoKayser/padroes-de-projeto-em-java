package br.com.alura.loja.pedido;

import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidosObserver {

    public static void main(String[] args) {

        String cliente = "Bruno Kayser";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = 2;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GerarPedidoHandler handler = new GerarPedidoHandler(
                Arrays.asList(
                        new SalvarPedidoNoBancoDeDados(),
                        new EnviarEmailPedido())
        );

        handler.executa(gerador);

    }

}
