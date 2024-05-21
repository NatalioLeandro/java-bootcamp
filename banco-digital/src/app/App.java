package app;

import modelos.*;

public class App {

    public static void main(String[] args) {

        Banco banco = new Banco("Banco do Brasil");

        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");

        ContaCorrente cc1 = new ContaCorrente(cliente1);
        ContaPoupanca cp1 = new ContaPoupanca(cliente2);

        banco.getContas().add(cc1);
        banco.getContas().add(cp1);

        System.out.println("Banco: " + banco.getNome());
        System.out.println("Contas: " + banco.getContas().size());
        for (Conta conta : banco.getContas()) {
            System.out.println(conta);
        }

        cc1.depositar(1000);
        cp1.depositar(500);

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();

        cc1.sacar(100);
        cp1.sacar(50);

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();

    }

}
