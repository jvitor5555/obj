
package obj;

// Toda classe java é criada com class NomedaClasse{}

public class Funcionario {   // classe pública 
    
    
    // Declaração dos atributos
    private String nome;
    private Double salario;
    private String cargo;
    private Double bonificacao;
    
    // Atributos private só podem ser acessados dentro da própria classe
    
    // Inserir os parametros do Construtor da classe
    public Funcionario(String nome, Double salario, String cargo, Double bonificacao){
        
    this.nome = nome;
    this.salario = salario;
    this.cargo = cargo;
    this.bonificacao = bonificacao;
}
    
    // Métodos get permitem acessar atributos privados
    
    public String getNome(){
        return nome;
    }
    
    public Double getSalario(){
        return salario;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public Double getBonificacao(){
        return bonificacao;
    }
    
    // Podemos criar método para calcular valores baseados nos atributos da classe
    
    public Double CalcularBonificacao(){
        
        Double resultado = salario * bonificacao;
        return resultado;
    }
    
    public Double NovoSalario(){
        Double resultado = salario * bonificacao;
        salario = salario + resultado;
        return salario;
    }
    
    // Podemos criar métodos void para exibir informações sem retornar nada
    
    public void exibirDados(){
        System.out.println("Funcionario: " + nome);
        System.out.println("Sálario: " + salario);
        System.out.println("Valor da Bonificação: " + bonificacao);
        System.out.println("Valor do Novo Sálario: " + CalcularBonificacao());
    }
    
}
