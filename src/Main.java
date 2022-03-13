public class Main {
    public static void main(String[] args) {
        Cliente nome = new Cliente();
        nome.setNome("Rafael");

        Cliente nome2 = new Cliente();
        nome2.setNome("Andressa");

        Conta cc = new ContaCorrente(nome);
        Conta poupanca = new ContaPoupanca(nome2);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
