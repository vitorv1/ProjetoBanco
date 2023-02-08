import java.util.Scanner;

public class Cliente {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private String cpf;
    private String email;
    private int idade;
    private Endereco endereco;


    //setters
    public void setNome(String nome){
        System.out.println("Digite seu nome");
        nome = sc.next();
        this.nome = nome;
    }
    public void setCpf(String cpf){
        System.out.println("Digite seu cpf");
        cpf = sc.next();
        this.cpf = cpf;
    }
    public void setEmail(String email){
        System.out.println("Digite seu email");
        email = sc.next();
        this.email = email;
    }
    public void setIdade(int idade){
        System.out.println("Digite sua idade");
        idade = sc.nextInt();
        this.idade = idade;
    }
    public void setEndereco(Endereco endereco){
        System.out.println("Digite seu endereço");

        this.endereco = endereco;
    }


    //getters
    public String getNome(){
        System.out.println(nome);
        return this.nome;
    }
    public String getCpf(){
        System.out.println(cpf);
        return this.cpf;
    }
    public String getEmail(){
        System.out.println(email);
        return this.email;
    }
    public int getIdade(){
        System.out.println(idade);
        return this.idade;
    }
    public Endereco getEndereco(){
        System.out.println(endereco);
        return  this.endereco;
    }

    public void criar (String nome,String cpf, String email, int idade, Endereco endereco){
        Cliente cliente = new Cliente();
        setNome(nome);
        setCpf(cpf);
        setEmail(email);
        setIdade(idade);
        setEndereco(endereco);
    }

    public void mostrar (){
        this.getNome();
        this.getCpf();
        this.getEmail();
        this.getIdade();
        this.getEndereco();
    }
}
