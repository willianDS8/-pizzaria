
import javax.swing.JOptionPane;

public class Cliente extends Contato implements Imprimir {
    private String nome;

    public Cliente() {
    }

    public Cliente(String nome, int telefone, int ddd, String logradouro, int numend, String cidade, int cep, String pontoReferencia) {
        super(telefone, ddd, logradouro, numend, cidade, cep, pontoReferencia);
        this.nome = nome;
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void leitura(){
        nome=JOptionPane.showInputDialog("Digite o nome");
    }
    
    public String print(){
       String saida=super.print();
       saida+="\nNome: "+this.nome;
       return saida;
        
    }
    
    
}
