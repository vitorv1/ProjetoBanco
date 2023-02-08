public class Operacao {
    private Conta conta;
    private double saldo = 0;

    public void sacar(double saque){
        if(this.saldo > 0) {
            this.saldo = this.saldo - saque;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void depositar(double depositar){
        this.saldo = this.saldo + depositar;
    }
    public void tansacao(double valor){

    }
}
