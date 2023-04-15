package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        var desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaValorMaiorQueQuinhentos(
                        new SemDesconto())
        );
        return desconto.calcular(orcamento);

    }

   /* Códgo antigo
    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        } else if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }
        return BigDecimal.ZERO;
    }*/


}
