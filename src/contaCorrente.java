public class contaCorrente extends Conta{
    public contaCorrente(clientes cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        imprimirInfosComuns();
    }


}
