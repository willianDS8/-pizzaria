
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Pizzaria {
    public static void main(String[] args) {
        Pedido p;
         ArrayList<Pedido> pedido=new ArrayList();
        int x= - 1;
       int op;
       String am;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("Escolha uma Opção: \n1 - Cadastrar\n2 - Alterar\n3 - Excluir\n4 - Consultar\n5 - Sair"));
            switch (op){
                case 1:                   
                    p=new Pedido();
                    p.leituraCliente();
                    p.leituraPedido();                  
                    p.leituraMassas();  
                    p.brinde();
                    p.leituraBebidas(); 
                    p.calculapedido();
                    pedido.add(p);
                    JOptionPane.showMessageDialog(null,"Cadastro Feito com Sucesso!");
                    break;
                case 2:
                    int opa=Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n1 - Alterar Massas\n2 - Alterar Bebidas\n3 - Voltar"));
                    if(opa==1){
                        am=(JOptionPane.showInputDialog("Digite o Numero do Pedido"));
                        x=-1;
                            for(int i=0;i<pedido.size();i++){
                                if(pedido.get(i).getNumero().equals(am)){
                                    x=i;
                                }
                             }
                            if(x>=0){
                                int q=Integer.parseInt(JOptionPane.showInputDialog("Quantas Massas Deseja?"));
                                String[] k=new String[q];
                                for(int i=0;i<k.length;i++){            
                                    k[i]=JOptionPane.showInputDialog("Digite a Descrição da Massa"+(i+1));            
                                }        
                                pedido.get(x).getMassas().setDescricaoMassas(k);
                                
                                int e=0;
                                int opix=Integer.parseInt(JOptionPane.showInputDialog("Deseja Ingrediente Extra?\n1 - Sim\n2 - Não"));       
                                if(opix==1){           
                                    e=1;
                                    int qx=Integer.parseInt(JOptionPane.showInputDialog("Quantos Ingredientes Extras Deseja?"));
                                    String[] v=new String[qx];            
                                    for(int i=0;i<qx;i++){                
                                        v[i]=JOptionPane.showInputDialog("Digite o Ingrediente Extra");              
                                    }
                                    if(e==1){
                                    pedido.get(x).getMassas().setIngredientesExtras(v);                                    
                                    }
                                    if(e==0){
                                        if(pedido.get(x).getMassas().getIngredientesExtras()!=null){
                                            for(int i=0;i<pedido.get(x).getMassas().getIngredientesExtras().length;i++){
                                                pedido.get(x).getMassas().getIngredientesExtras()[i]=null;
                                            }
                                        }
                                    }
                                }
                                int[] qd=new int[q];
                                for(int i=0;i<q;i++){
                                    qd[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade do Item "+pedido.get(x).getMassas().getDescricaoMassas()[i]));           
                                }
                                pedido.get(x).getMassas().setQuantidadeMassas(qd);                        

                                float[] vq=new float[q];
                                for(int i=0;i<q;i++){
                                    vq[i]=Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor do Item "+pedido.get(x).getMassas().getDescricaoMassas()[i]));           
                                }
                                pedido.get(x).getMassas().setValorMassas(vq);                                
                                JOptionPane.showMessageDialog(null,"Cadastro Alterado com Sucesso!");
                            }
                            if(x<0){
                                JOptionPane.showMessageDialog(null,"Número de Pedido não Encontrado!");
                            }
                            
                    }       
                             if(opa==2){
                                am=(JOptionPane.showInputDialog("Digite o Número do Pedido"));
                                x=-1;
                                for(int i=0;i<pedido.size();i++){
                                    if(pedido.get(i).getNumero().equals(am)){
                                        x=i;
                                    }
                                }
                            if(x>=0){
                                int q=Integer.parseInt(JOptionPane.showInputDialog("Quantas Bebidas Deseja?"));
                                String[] k=new String[q];
                                for(int i=0;i<k.length;i++){            
                                    k[i]=JOptionPane.showInputDialog("Digite a Descrição da Bebida"+(i+1));            
                                }        
                                pedido.get(x).getBebidas().setDescricao(k);                                
                                    String[] v=new String[q];            
                                    for(int i=0;i<q;i++){                
                                        v[i]=JOptionPane.showInputDialog("Digite o Tamanho do Item "+pedido.get(x).getBebidas().getDescricao()[i]);              
                                    }
                                    pedido.get(x).getBebidas().setTamanho(v);                                    

                                int[] qd=new int[q];
                                for(int i=0;i<q;i++){
                                    qd[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade do Item "+pedido.get(x).getBebidas().getDescricao()[i]));           
                                }
                                pedido.get(x).getBebidas().setQtde(qd);                     

                                float[] vq=new float[q];
                                for(int i=0;i<q;i++){
                                    vq[i]=Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor do Item "+pedido.get(x).getBebidas().getDescricao()[i]));           
                                }
                                pedido.get(x).getBebidas().setValor(vq);
                                JOptionPane.showMessageDialog(null,"Cadastro Alterado com Sucesso!");
                                
                            }
                            if(x<0){
                                JOptionPane.showMessageDialog(null,"Número de Pedido não Encontrado!");                            
                            }
                        }
                    
                   break;
                case 3:
                    am=(JOptionPane.showInputDialog("Digite o Número do Pedido que Deseja Excluir"));
                    x=-1;
                    for(int i=0;i<pedido.size();i++){
                        if(pedido.get(i).getNumero().equals(am)){
                            x=i;
                        }
                    }
                    if(x>=0){
                        pedido.remove(x);
                        JOptionPane.showMessageDialog(null,"Cadastro Excluido com Sucesso!");
                    }
                    if(x<0){
                        JOptionPane.showMessageDialog(null,"Número de Pedido não Encontrado!");
                    }
                    break;
                
                case 4:
                    int opc=Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das Opção de Consulta:\n1 - Nome e Data\n2 - Número do Pedido\n3 - Consulta por Data\n4 - Relátorio Geral de Vendas\n5 - Voltar"));                    
                    if(opc==1){
                        int f=-1;                        
                        String n=JOptionPane.showInputDialog("Digite o Nome do Cliente");
                        String d=JOptionPane.showInputDialog("Digite a Data do Pedido");                        
                        
                        for(int i=0;i<pedido.size();i++){                            
                            if(pedido.get(i).getNome().equals(n) && pedido.get(i).getData().equals(d)){
                                JOptionPane.showMessageDialog(null,pedido.get(i).print()+"\n Valor Total R$:"+pedido.get(i).calculapedido());
                                f=i;
                            }                         
                        }
                        if(f<0){
                            JOptionPane.showMessageDialog(null,"Dados não Encontrado");
                        }
                    }
                    if(opc==2){
                        int f=-1;
                        String h=(JOptionPane.showInputDialog("Digite o Número do Pedido"));
                        for(int i=0;i<pedido.size();i++){
                            if(pedido.get(i).getNumero().equals(h)){
                                JOptionPane.showMessageDialog(null,pedido.get(i).print()+"\n Valor Total R$:"+pedido.get(i).calculapedido());
                                f=i;
                            }
                        }
                        if(f<0){
                            JOptionPane.showMessageDialog(null,"Pedido não Encontrado");
                        }
                        
                    }
                    if(opc==3){
                        int f=-1;
                        String d=JOptionPane.showInputDialog("Digite a Data do Pedido");
                        for(int i=0;i<pedido.size();i++){
                            if(pedido.get(i).getData().equals(d)){
                                JOptionPane.showMessageDialog(null,pedido.get(i).print()+"\n Valor Total R$:"+pedido.get(i).calculapedido());
                                f=i;
                            }
                        }
                        if(f<0){
                            JOptionPane.showMessageDialog(null,"Data não Encontrada");
                        }
                    }
                    if(opc==4){
                        JOptionPane.showMessageDialog(null,"Relatório de Todos os Pedidos Cadastrados !");
                        for(int i=0;i<pedido.size();i++){
                            JOptionPane.showMessageDialog(null,pedido.get(i).print()+"\n Valor Total R$:"+pedido.get(i).calculapedido());
                        }
                        float somaGeral=0;
                        for(int i=0;i<pedido.size();i++){
                            somaGeral+=pedido.get(i).calculapedido();
                        }
                        JOptionPane.showMessageDialog(null,"Faturamento Total: R$"+somaGeral);
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(op!= 1 || op!= 2 || op!= 3 || op!= 4 || op!= 5);
       
       
       
    }
    
}
