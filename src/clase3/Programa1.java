package clase3;

public class Programa1 {
    
    public static void main(String[] args){
    
        Empleado e1 = new Empleado("juan","Perez","10","300");
        
        Administrativo a1 = new Administrativo("julia","Lopez","11","301",10000);
        
        Profesor p1 = new Profesor("juana","Manso","12","302","java",300);
        
        a1.trabajar();
        p1.trabajar();
        a1.cobrarSueldo();
        p1.cobrarSueldo();
        
    }
}
