
package negocio;

import java.util.LinkedList;

public class PresupuestoEnConstruccion {

    private LinkedList<Item> detallePresupuesto;
    
    public PresupuestoEnConstruccion(){
        detallePresupuesto=new LinkedList();
        Item.setStaticCod(1);
    }

    public LinkedList<Item> getDetallePresupuesto() {
        return detallePresupuesto;
    }

    public boolean addItem(Item i){
        //valida que haya en stock la cantidad detallada en el del articulo que se desea agregar en el 
        //presupuesto para posterior venta y devuelve false si el stock no alcanzara para la venta en preparacion.
        boolean res=false;
        if(i.getCant()<=i.getArt().getStock())
            res=detallePresupuesto.add(i);
        return res;
    }
    public boolean removeItem(int c){
        boolean res=false;
        for(Item iter:detallePresupuesto)
            if(iter.getCodigo()==c){
                detallePresupuesto.remove(iter);
                res=true;
            }
        return res;
    }
    
    public double montoTotalVenta(){
        double res=0d;
        for(Item iter: detallePresupuesto)
            res+=iter.valorVentaItem();
        return res;
    }
}
