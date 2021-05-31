
import java.util.Scanner;

public class CadastroFuncionario extends Funcionario {


    public CadastroFuncionario(String nome, String cpf, double salario) {
        super(nome, cpf, salario);

    }



    public Funcionario cadastroFuncionario( Scanner ler){

        
        System.out.println("\nDigite nome do funcionario:");
        setNome(ler.nextLine());


        try{
        System.out.println("\nDigite Cpf do funcionario:");
         setCpf( ler.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Encerrando, pois sem CPF nao da pra continuar!");
            
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("Cpf nulo. Utilizando o cpf padrao 000.000.000-00");
            setCpf("00000000000");
        }

        System.out.println("Digite salario do funcionario:");
        setSalario(ler.nextDouble());
        return new Funcionario( getNome(), getCpf(), getSalario());
    }
    }
    

