public class Endereco {
    private String rua;
    private String longradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    //setters
    public void setRua(String rua){
        this.rua = rua;
    }
    public void setLongradouro(String longradouro){
        this.longradouro = longradouro;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setPais(String pais){
        this.pais = pais;
    }



    //getters
    public String getRua(){
        return this.rua;
    }
    public String getLongradouro(){
        return this.longradouro;
    }
    public int getNumero(){
        return this.numero;
    }
    public String getBairro(){
        return this.bairro;
    }
    public String getCidade(){
        return this.cidade;
    }
    public String getEstado(){
        return this.estado;
    }
    public String getPais(){
        return this.pais;
    }
    public void criar (String rua, String longradouro, int numero, String bairro, String cidade, String estado, String pais){
        setRua(rua);
        setLongradouro(longradouro);
        setNumero(numero);
        setBairro(bairro);
        setCidade(cidade);
        setEstado(estado);
        setPais(pais);
    }
}
