package modelos;

import interfaces.ContaInterface;

public abstract class Conta implements ContaInterface {

    private static final int AGENCIA = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private final Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {

        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, ContaInterface contaDestino) {

        if (saldo >= valor) {
            saldo -= valor;
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da conta " + numero);
        System.out.println("Saldo: " + saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
