public class Conta {
    private Cliente cliente;
    private int numeroConta;
    private double valorDaConta;


    //getters
    public int getNumeroConta(){
        return this.numeroConta;
    }
    public double getValorDaConta(){
        return this.valorDaConta;
    }

    //setters
    public void setNumeroConta(int numero){
        this.numeroConta = numero;
    }
    public void setValorDaConta(double valor){
        this.valorDaConta = valor;
    }


}
