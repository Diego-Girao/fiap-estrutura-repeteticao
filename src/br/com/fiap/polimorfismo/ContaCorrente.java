package br.com.fiap.polimorfismo;

import br.com.fiap.polimorfismo.exception.SaldoInsuficienteException;

public abstract class ContaCorrente {
    protected double saldo;
    public static final int BANCO = 71;

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        }
        saldo = saldo - valor;
    }
}
