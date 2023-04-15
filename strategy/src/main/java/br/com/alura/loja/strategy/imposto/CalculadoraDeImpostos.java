package br.com.alura.loja.strategy.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    //STRATEGY
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }

//    ANTES O CÓDIGO ERA ASSIM, E FICOU CONFORME O DE CIMA
//    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
//        switch (tipoImposto) {
//            case tipoImposto.ICMS:
//                return orcamento.getValor().multiply(new BigDecimal("0.1"));
//            case tipoImposto.ISS:
//                return orcamento.getValor().multiply(new BigDecimal("0.06"));
//            default:
//                return BigDecimal.ZERO;
//
//        }
//    }
}
