
package obj;


public class Teste {
   
    public static void main(String[] args) {
        
        Funcionario obj1 = new Funcionario("João Vitor", 1000.00, "Auxiliar", 0.10);
        
        System.out.println(obj1.NovoSalario());
    }
}
