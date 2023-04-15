package br.com.alura.loja;


import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;


//Classe para representar a parada do padrão de projeto, ou seja, caso nenhuma regra se aplique, ao entrar na classe, o desconto é parado.
public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return true;
    }
}
