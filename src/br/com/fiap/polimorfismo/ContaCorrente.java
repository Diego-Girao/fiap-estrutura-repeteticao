package br.com.fiap.polimorfismo;

import br.com.fiap.polimorfismo.exception.SaldoInsuficienteException;

public class ContaCorrente {
    protected double saldo;

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        }
        saldo = saldo - valor;
    }
}
