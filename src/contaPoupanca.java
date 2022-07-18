public class contaPoupanca extends Conta {
    protected static final clientes cliente = new clientes();

    public contaPoupanca(clientes cliente) {
        super(cliente);
    }



    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        imprimirInfosComuns();
    }
}
