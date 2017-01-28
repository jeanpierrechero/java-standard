/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import java.util.Date;

/**
 *
 * @author educacionit
 */
public class Zoologico {
    
    Cuidador c1 = new Cuidador("juan",new Date("01-01-2017"),300);
    
    public final int CANTIDAD_ANIMALES = 25;
    public final int RACIONES_POR_ANIMAL = 5;    
    private Boolean abierto;

    public Boolean getAbierto() {
        return abierto;
    }
 
    public void abrir(){
        this.abierto = true;
    }
    
    public void cerrar(){
        this.abierto = false;
    }
    
    public void alimentarAnimales(int cantidadDeRaciones) {
        
    }
}
