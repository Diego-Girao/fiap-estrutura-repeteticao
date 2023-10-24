package br.com.fiap.polimorfismo;

import br.com.fiap.polimorfismo.exception.SaldoInsuficienteException;

public final class ContaCorrenteEspecial extends ContaCorrente implements Transferivel {
    private double limite;

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo + limite) {
            throw new SaldoInsuficienteException();
        }
        saldo = saldo - valor;
    }

    @Override
    public double verificarSaldo() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean realizarDoc(int numBanco, int numAgencia, int numConta, double valor) {
        return false;
    }

    @Override
    public boolean realizarTed(int numBanco, int numAgencia, int numConta, double valor) {
        return false;
    }
}
