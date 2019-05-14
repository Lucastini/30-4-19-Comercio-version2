
package negocio;

public class Item {
    
    private Articulo art;
    private int cant;
    private int codigo;
    private static int staticCod=1;
    
    public Item(Articulo ar, int cant){
        art=ar;
        this.cant=cant;
        codigo=staticCod;
        staticCod++;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static int getStaticCod() {
        return staticCod;
    }
    public static void setStaticCod(int staticCod) {
        Item.staticCod = staticCod;
    }

    public Articulo getArt() {
        return art;
    }
    public void setArt(Articulo art) {
        this.art = art;
    }

    public int getCant() {
        return cant;
    }
    public void setCant(int cant) {
        this.cant = cant;
    }
    
    @Override
    public String toString(){
        return "Cant.: "+cant+", "+art;
    }
    
    public double valorCompraItem(){
        return art.getCostoUnitario()*cant;
    }
    
    public double valorVentaItem(){
        return art.precioFinal()*cant;
    }
    
    
    
    
}
