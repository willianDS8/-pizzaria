
import javax.swing.JOptionPane;

public class Massas implements Imprimir{
    private String descricaoMassas[];
    private String ingredientesExtras[];
    private int quantidadeMassas[];
    private float valorMassas[];
    

    public Massas() {
    }

    public Massas(String[] descricaoMassas, String[] ingredientesExtras, int[] quantidadeMassas, float[] valorMassas, float tempoMassas) {
        this.descricaoMassas = descricaoMassas;
        this.ingredientesExtras = ingredientesExtras;
        this.quantidadeMassas = quantidadeMassas;
        this.valorMassas = valorMassas;
        
    }

   
    public String[] getDescricaoMassas() {
        return descricaoMassas;
    }

    public void setDescricaoMassas(String[] descricaoMassas) {
        this.descricaoMassas = descricaoMassas;
    }

    public String[] getIngredientesExtras() {
        return ingredientesExtras;
    }

    public void setIngredientesExtras(String[] ingredientesExtras) {
        this.ingredientesExtras = ingredientesExtras;
    }

    public int[] getQuantidadeMassas() {
        return quantidadeMassas;
    }

    public void setQuantidadeMassas(int[] quantidadeMassas) {
        this.quantidadeMassas = quantidadeMassas;
    }

    public float[] getValorMassas() {
        return valorMassas;
    }

    public void setValorMassas(float[] valorMassas) {
        this.valorMassas = valorMassas;
    }

    
    public float calculoMassas(){
        float vfinal=0;
        for(int i=0;i<this.descricaoMassas.length;i++){
            vfinal+=this.valorMassas[i]*this.quantidadeMassas[i];
        }
        
     
        float r=0;
        if(this.getIngredientesExtras()!=null){
            for(int i=0;i<this.ingredientesExtras.length;i++){
                r+=5.9;
            }
        }
        vfinal=vfinal+r;
       
        return vfinal;
    }
    
    public void leitura(){
        for(int i=0;i<this.descricaoMassas.length;i++){
            this.descricaoMassas[i]=JOptionPane.showInputDialog("Digite a Descrição");
        }
        for(int i=0;i<this.getIngredientesExtras().length;i++){
            this.getIngredientesExtras()[i]=JOptionPane.showInputDialog("Digite o Ingrediente Extra");
        }
        for(int i=0;i<this.quantidadeMassas.length;i++){
            this.quantidadeMassas[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade"));
        }
        for(int i=0;i<this.valorMassas.length;i++){
            this.valorMassas[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor"));
        }
        
    }
    
    public String print(){
        String saida="\nPIZZAS: ";
        for(int i=0;i<this.descricaoMassas.length;i++){
            saida+="\nDescrição da Massa "+(i+1)+": "+this.descricaoMassas[i];
        }
        if(this.getIngredientesExtras()!=null){
            for(int i=0;i<this.ingredientesExtras.length;i++){
                saida+="\nIngredientes Extras "+(i+1)+": "+this.ingredientesExtras[i];
            }
        }
        for(int i=0;i<this.quantidadeMassas.length;i++){
            saida+="\nQuantidade do Item "+this.descricaoMassas[i]+": "+this.quantidadeMassas[i];
        }
        for(int i=0;i<this.valorMassas.length;i++){
            saida+="\nValor do Item "+this.descricaoMassas[i]+(i+1)+": "+this.valorMassas[i];
        }
        
        
        return saida;
    }

    
}
