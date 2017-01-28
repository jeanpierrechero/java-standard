package laboratorio2;

import java.util.Date;

public class Cuidador extends Persona {
    
    private int cantidadDeRaciones;

    public Cuidador(String nombre, Date fechaDeNacimiento, int cantidadDeRaciones) {
        super(nombre, fechaDeNacimiento);
        this.cantidadDeRaciones = cantidadDeRaciones;
    }

    public int getCantidadDeRaciones() {
        return cantidadDeRaciones;
    }

    public void setCantidadDeRaciones(int cantidadDeRaciones) {
        this.cantidadDeRaciones = cantidadDeRaciones;
    }
    
    
    
}
