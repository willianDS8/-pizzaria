
import javax.swing.JOptionPane;
public class Contato extends Endereco implements Imprimir{
    private int telefone;
    private int ddd;

    public Contato() {
    }

    public Contato(int telefone, int ddd, String logradouro, int numend, String cidade, int cep, String pontoReferencia) {
        super(logradouro, numend, cidade, cep, pontoReferencia);
        this.telefone = telefone;
        this.ddd = ddd;
    }

    

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }
    
    public void leitura(){
        ddd=Integer.parseInt(JOptionPane.showInputDialog("Digite o DDD"));
        telefone=Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
    }
    
    public String print(){
        String saida=super.print();
        saida+="\nDDD: "+this.ddd+"\nTelfone: "+this.telefone;
        return saida;
    }
    
    
}
