public class Main {
    public static void main(String[] args) {
        clientes murilo = new clientes();
        murilo.setNome("Murilo");


        Conta cc = new contaCorrente(murilo);
        Conta poupanca = new contaPoupanca(murilo);

        cc.depositar(100.00);
        cc.transferir(100.00, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
