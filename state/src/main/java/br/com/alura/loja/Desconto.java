package br.com.alura.loja;


import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

//Classe abstrata para essa não ser instanciada e somente as filhas
public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    //Esse método valida se a regra deve ser applicada (o if)
    protected abstract boolean deveAplicar(Orcamento orcamento);

    //Caso atenda a regra, essa classe realiza o regra de negócio(O que tem dentro do if)
    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        if(deveAplicar(orcamento)) {
            return efetuarCalculo(orcamento);
        } else {
            return proximo.calcular(orcamento);
        }
    }
}
