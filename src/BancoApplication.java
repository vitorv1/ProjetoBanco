import java.util.Scanner;

public class BancoApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String cpf;
        String email;
        String rua;
        String longradouro;
        int numero;
        String bairro;
        String cidade;
        String estado;
        String pais;
        int idade;
        int scanner;
        Endereco endereco = new Endereco();
        Cliente clinte = new Cliente();
        Conta conta = new Conta();
        Operacao operacao = new Operacao();
        System.out.println("Escolha as opções digitando o que é pedido");
        System.out.println("Caso seje Clinte novo, digite '1' para se cadstrar");
        System.out.println("Caso já seje cliente, e deseja alterar alguma informação, digite '2'");
        System.out.println("Caso deseje criar sua conta digite '3' para criar");
        System.out.println("Caso deseje alterar alguma informação de sua conta, digite '4'");
        System.out.println("Caso deseje ver algum dado da sua conta digite '5'");
        System.out.println("Caso deseje depositar algum valor em sua cona digite '6'");
        System.out.println("Caso deseje sacar algum valor de sua conta digite '7'");
        System.out.println("Caso deseje transferir um valor para outra conta digite '8'");
        scanner = sc.nextInt();
        if (scanner == 1){
            System.out.println("Digite seu nome:");
            nome = sc.next();
            System.out.println("Digite seu cpf");
            cpf = sc.next();
            System.out.println("Digite seu email");
            email = sc.next();
            System.out.println("Digite sua idade");
            idade = sc.nextInt();
            System.out.println("Digite sua rua");
            rua = sc.next();
            System.out.println("Digite seu longradouro");
            longradouro = sc.next();
            System.out.println("Digite o numero do seu endereço");
            numero = sc.nextInt();
            System.out.println("Digite seu bairro");
            bairro = sc.next();
            System.out.println("Digite o nome da sua cidade");
            cidade = sc.next();
            System.out.println("Digite o nome de seu estado");
            estado = sc.next();
            System.out.println("Digite seu pais");
            pais = sc.next();
            clinte.criar(nome, cpf, email, idade, endereco);
            endereco.criar(rua, longradouro, numero, bairro, cidade, estado, pais);
        }
        else if (scanner == 2){
            clinte.mostrar();
            System.out.println("Caso queire alterar o 'nome', digite '1'");
            scanner = sc.nextInt();
            System.out.println("Caso queire alterar o 'cpf', digite '2'");
            scanner = sc.nextInt();
            System.out.println("Caso queire alterar o 'email', digite '3'");
            scanner = sc.nextInt();
            System.out.println("Caso queire alterar o 'idade', digite '4'");
            scanner = sc.nextInt();
            System.out.println("Caso queire alterar o 'rua', digite '5'");
            scanner = sc.nextInt();
            System.out.println("Caso queire alterar o 'longradouro', digite '6'");
            scanner = sc.nextInt();
            System.out.println("Caso queire alterar o 'numero', digite '7'");
            scanner = sc.nextInt();
            System.out.println("Caso queire alterar o 'bairro', digite '8'");
            scanner = sc.nextInt();
            System.out.println("Caso queire alterar o 'cidade', digite '9'");
            scanner = sc.nextInt();
            System.out.println("Caso queire alterar o 'estado', digite '10'");
            scanner = sc.nextInt();
            System.out.println("Caso queire alterar o 'pais', digite '11'");
            scanner = sc.nextInt();
            if (scanner == 1){
                System.out.println("Digite seu novo nome");
                nome = sc.next();
                clinte.setNome(nome);
                System.out.println("Alterado com sucesso");
            }
            else if (scanner == 2){
                System.out.println("Digite seu novo cpf");
                cpf = sc.next();
                clinte.setCpf(cpf);
                System.out.println("Alterado com sucesso");
            }
            else if (scanner == 3){
                System.out.println("Digite seu novo email");
                email = sc.next();
                clinte.setEmail(email);
                System.out.println("Alterado com sucesso");
            }
            else if (scanner == 4){
                System.out.println("Digite seu nova idade");
                idade = sc.nextInt();
                clinte.setIdade(idade);
                System.out.println("Alterado com sucesso");
            }
            else if (scanner == 5){
                System.out.println("Digite sua nova rua");
                rua = sc.next();
                endereco.setRua(rua);
                System.out.println("Alterado com sucesso");
            }
            else if (scanner == 6) {
                System.out.println("Digite sua novo longradouro");
                longradouro = sc.next();
                endereco.setLongradouro(longradouro);
                System.out.println("Alterado com sucesso");
            }
            else if(scanner == 7){
                System.out.println("Digite sua novo numero");
                numero = sc.nextInt();
                endereco.setNumero(numero);
                System.out.println("Alterado com sucesso");
            }
            else if (scanner == 8){
                System.out.println("Digite sua novo bairro");
                bairro = sc.next();
                endereco.setBairro(bairro);
                System.out.println("Alterado com sucesso");
            }
            else if (scanner == 9){
                System.out.println("Digite sua nova cidade");
                cidade = sc.next();
                endereco.setCidade(cidade);
                System.out.println("Alterado com sucesso");
            }
            else if (scanner == 10){
                System.out.println("Digite sua novo estado");
                estado = sc.next();
                endereco.setEstado(estado);
                System.out.println("Alterado com sucesso");
            }
            else if (scanner == 11){
                System.out.println("Digite sua novo pais");
                pais = sc.next();
                endereco.setPais(pais);
                System.out.println("Alterado com sucesso");
            }

        }
        else if (scanner == 3){

        }



    }

}