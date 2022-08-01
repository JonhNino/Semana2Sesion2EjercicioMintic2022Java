
package poo_vendedor_g01;


public class Vendedor {
    //Definición de los atributos
    private long documento;
    private String nombre;
    private int tipo;
    private double ventas;
    //Definición de los métodos
    //Constructor

    public Vendedor(long documento, String nombre, int tipo, double ventas) {
        this.documento = documento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.ventas = ventas;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    
    
    public double pagoComision(){
        double comision=0;
        if(this.tipo==1){
            comision=this.ventas*0.25;
        }
        else{
            comision=this.ventas*0.20;
        }
        return comision;
    }
    
}
