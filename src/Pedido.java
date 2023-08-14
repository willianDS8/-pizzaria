
import javax.swing.JOptionPane;
import java.util.Random;
public class Pedido extends Cliente {
    private String numero;
    private String hora;
    private String data;    
    private Massas massas=new Massas();
    private Bebidas bebidas=new Bebidas();
    private float tempo;
    

    public Pedido() {
    }

    public Pedido(String numero, String hora, String data, float tempo, String nome, int telefone, int ddd, String logradouro, int numend, String cidade, int cep, String pontoReferencia) {
        super(nome, telefone, ddd, logradouro, numend, cidade, cep, pontoReferencia);
        this.numero = numero;
        this.hora = hora;
        this.data = data;
        this.tempo = tempo;
    }

  

   

    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Massas getMassas() {
        return massas;
    }

    public void setMassas(Massas massas) {
        this.massas = massas;
    }

    public Bebidas getBebidas() {
        return bebidas;
    }

    public void setBebidas(Bebidas bebidas) {
        this.bebidas = bebidas;
    }

    public float getTempo() {
        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }
    
   

   
    
    public void leituraMassas(){
        int q=Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Massas?"));
        String[] x=new String[q];
        for(int i=0;i<x.length;i++){            
            x[i]=JOptionPane.showInputDialog("Digite a Descrição da Massa"+(i+1));            
        }        
        massas.setDescricaoMassas(x);
        
        int opix=Integer.parseInt(JOptionPane.showInputDialog("Deseja Ingrediente Extra?\n1 - SIM\n2 - NÃO"));       
        if(opix==1){           
            int qx=Integer.parseInt(JOptionPane.showInputDialog("Quantos Ingredientes Extras Deseja?"));
            String[] v=new String[qx];            
            for(int i=0;i<qx;i++){                
                v[i]=JOptionPane.showInputDialog("Digite o Ingrediente Extra");              
            }
            massas.setIngredientesExtras(v);
        }
        int[] qd=new int[q];
        for(int i=0;i<q;i++){
            qd[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade do Item "+massas.getDescricaoMassas()[i]));           
        }
        massas.setQuantidadeMassas(qd);
        
        float[] vq=new float[q];
        for(int i=0;i<q;i++){
            vq[i]=Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor do Item "+massas.getDescricaoMassas()[i]));           
        }
        massas.setValorMassas(vq);
    }
    
    
    
    
     public void leituraBebidas(){
        int q=Integer.parseInt(JOptionPane.showInputDialog("Quantas Opções de Bebidas Deseja?"));
        String[] x=new String[q];
        for(int i=0;i<x.length;i++){            
            x[i]=JOptionPane.showInputDialog("Digite a Descrição da Bebida"+(i+1));            
        }        
        bebidas.setDescricao(x);           
            String[] v=new String[q];            
            for(int i=0;i<q;i++){                
                v[i]=JOptionPane.showInputDialog("Digite o Tamanho do Item "+bebidas.getDescricao()[i]);              
            }
            bebidas.setTamanho(v);
        
        int[] qd=new int[q];
        for(int i=0;i<q;i++){
            qd[i]=Integer.parseInt(JOptionPane.showInputDialog("Quantas "+bebidas.getDescricao()[i]+" Você Deseja?"));           
        }
        bebidas.setQtde(qd);
        
        float[] vq=new float[q];
        for(int i=0;i<q;i++){
            vq[i]=Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor do Item "+bebidas.getDescricao()[i]));           
        }
        bebidas.setValor(vq);
    }
    
     
     public void leituraCliente(){
         this.setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente: "));
         this.setDdd(Integer.parseInt(JOptionPane.showInputDialog("Digite o DDD do Telefone")));
         this.setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Digite o Número de Telefone")));
         this.setLogradouro(JOptionPane.showInputDialog("Digite o Endereço de Entrega"));
         this.setNumend(Integer.parseInt(JOptionPane.showInputDialog("Digite o Número do Endereço de Entrega")));
         this.setCidade(JOptionPane.showInputDialog("Digite a Cidade"));
         this.setCep(Integer.parseInt(JOptionPane.showInputDialog("Digite o Cep")));
         this.setPontoReferencia(JOptionPane.showInputDialog("Digite um Ponto de Referência"));
     }
     
     public void leituraPedido(){         
         this.setData(JOptionPane.showInputDialog("Informe a data"));
         this.setHora(JOptionPane.showInputDialog("Informe o horário"));         
         this.setNumero(JOptionPane.showInputDialog("Digite Número do Pedido:"));
         this.setTempo(Float.parseFloat(JOptionPane.showInputDialog("Digite o Tempo de Espera de Entrega")));
         	
        
     }
     
    public String print(){
        String saida=super.print();
        saida+="\nNumero do Pedido: "+this.numero+"\nData: "+this.data;
        saida+=this.massas.print();
        saida+=this.bebidas.print();        
        return saida;
        
    }
    
    public float calculapedido(){
        float valorTotal=massas.calculoMassas()+ bebidas.calculoBebidas();
        
        if(this.tempo>30){
            float x=(valorTotal*30)/100;
            valorTotal=valorTotal-x;
        }       
        return valorTotal;
        
    }
    
    public void brinde(){
        int r=0;
        for(int i=0;i<massas.getQuantidadeMassas().length;i++){
            if(massas.getQuantidadeMassas()[i]>1){
                r=1;
            }
        }
        
        if(r==1){
            JOptionPane.showMessageDialog(null,"Parabéns Você tem Direito a um Brinde, Retire no Balcão!");
        }
    }
    
}
