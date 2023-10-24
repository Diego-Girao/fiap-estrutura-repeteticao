package br.com.fiap.polimorfismo;

public interface Transferivel {
    public boolean realizarDoc(int numBanco, int numAgencia, int numConta, double valor);

    public boolean realizarTed(int numBanco, int numAgencia, int numConta, double valor);

}
