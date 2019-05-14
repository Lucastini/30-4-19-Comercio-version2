
package negocio;

import java.util.LinkedList;

public class PedidoEnConstruccion {
    
    private LinkedList<Item> detallePedido;
    
    public PedidoEnConstruccion(){
        detallePedido=new LinkedList();
        Item.setStaticCod(1);
    }
    
    public boolean addItem(Item i){
        return detallePedido.add(i);
    }
    public boolean removeItem(int c){
        boolean res=false;
        LinkedList<Item>copiaDetallePedido=new LinkedList<>(detallePedido);
        for(Item iter:copiaDetallePedido)
            if(iter.getCodigo()==c){
                detallePedido.remove(iter);
                res=true;
            }
        return res;
    }

    public LinkedList<Item> getDetallePedido(){
        return detallePedido;
    }
    
    public double montoTotalPedido(){
        double res=0f;
        for(Item iter: detallePedido)
            res+=iter.valorCompraItem();
        return res;
    }
    
}
