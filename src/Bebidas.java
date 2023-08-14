
import javax.swing.JOptionPane;

public class Bebidas implements Imprimir{
    private String descricao[];
    private String tamanho[];
    private int qtde[];
    private float valor[];
    

    public Bebidas() {
    }

    public Bebidas(String[] descricao, String[] tamanho, int[] qtde, float[] valor, float tempoBebidas) {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.qtde = qtde;
        this.valor = valor;        
    }

    

   

    public String[] getDescricao() {
        return descricao;
    }

    public void setDescricao(String[] descricao) {
        this.descricao = descricao;
    }

    public String[] getTamanho() {
        return tamanho;
    }

    public void setTamanho(String[] tamanho) {
        this.tamanho = tamanho;
    }

    public int[] getQtde() {
        return qtde;
    }

    public void setQtde(int[] qtde) {
        this.qtde = qtde;
    }

    public float[] getValor() {
        return valor;
    }

    public void setValor(float[] valor) {
        this.valor = valor;
    }
    
    
    
    public float calculoBebidas(){
        float vfinal=0;
        for(int i=0;i<this.descricao.length;i++){
            vfinal+=valor[i]*qtde[i];
        }
       
        return vfinal;
    }
    
    public void leitura(){
        for(int i=0;i<this.descricao.length;i++){
        this.descricao[i]=JOptionPane.showInputDialog("Digite a Descrição da Bebida "+i);
        }
         for(int i=0;i<this.tamanho.length;i++){
        this.tamanho[i]=JOptionPane.showInputDialog("Digite o Tamanho "+i);
        }
        for(int i=0;i<this.qtde.length;i++){
        this.qtde[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite Quantidade "+i));
        }
        for(int i=0;i<this.valor.length;i++){
        this.valor[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor "+i));
        }
        
        
    }
    
    public String print(){
        String saida="\nBEBIDAS";
        for(int i=0;i<this.descricao.length;i++){
            saida+="\nDescrição da Bebida "+(i+1)+": "+this.descricao[i];
        }
        for(int i=0;i<this.tamanho.length;i++){
            saida+="\nTamanho da Bebida "+this.descricao[i]+": "+this.tamanho[i];
        }
        for(int i=0;i<this.qtde.length;i++){
            saida+="\nQuantidade da Bebida "+this.descricao[i]+": "+this.qtde[i];
        }
        for(int i=0;i<this.valor.length;i++){
            saida+="\nValor da Bebida "+this.descricao[i]+": "+this.valor[i];
        }
        return saida;
    }
}
