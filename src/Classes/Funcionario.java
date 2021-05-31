import java.util.InputMismatchException;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;



    public Funcionario(String nome, String cpf, double salario) {
    setNome (nome);
    setCpf (cpf);
    setSalario(salario);
    }


    @Override
    public String toString() {
        return "Funcionario cpf:" + cpf + ", nome:" + nome + ", salario:" + salario + "]";
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {

        if (nome.matches(".*\\d.")){
            System.out.println("Nome não pode conter numeros!");
        } else 
        this.nome = nome;
    }
        
    public String getCpf() {
        return cpf;
    }
    public String setCpf(String cpf) {
        if (cpf == null) {
            throw new NullPointerException("O CPF estar nulo");
        }
    
        cpf = cpf.trim().replace(".", "").replace("-", "");
    
        if (cpf.length() == 11){
        this.cpf = cpf;
        } else {}
            throw new NumberFormatException ("Numeros de caracteres invalidos para o CPF.");
        }
    

        public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario <=0) {
            throw new InputMismatchException ("Salario negativado");
         } else
        this.salario = salario;
    }

    

    
}
