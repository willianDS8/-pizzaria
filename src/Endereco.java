
import javax.swing.JOptionPane;


public abstract class Endereco implements Imprimir{
    private String logradouro;
    private int numend;
    private String cidade;
    private int cep;
    private String pontoReferencia;

    public Endereco() {
    }

    public Endereco(String logradouro, int numend, String cidade, int cep, String pontoReferencia) {
        this.logradouro = logradouro;
        this.numend = numend;
        this.cidade = cidade;
        this.cep = cep;
        this.pontoReferencia = pontoReferencia;
    }

  

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumend() {
        return numend;
    }

    public void setNumend(int numend) {
        this.numend = numend;
    } 

   
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }
    
    public void leitura(){
        logradouro=JOptionPane.showInputDialog("Digite o Endereço de Entrega");
        numend=Integer.parseInt("Digite o Número do Endereço de Entrega");
        cidade=JOptionPane.showInputDialog("Digite a Cidade");
        cep=Integer.parseInt(JOptionPane.showInputDialog("Digite o CEP"));
        pontoReferencia=JOptionPane.showInputDialog("Digite o Ponto de Referência");
    }
    
    public String print(){
        String saida="Logradouro: "+this.logradouro+"\nNumero: "+this.numend+
                "\nCidade: "+this.cidade+"\nCep: "+this.cep+"\nPonto de Referência: "+this.pontoReferencia;
        return saida;
        }
    }
