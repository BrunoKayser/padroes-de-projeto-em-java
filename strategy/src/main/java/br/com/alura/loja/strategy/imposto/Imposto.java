package br.com.alura.loja.strategy.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}
