/*
Al colocar en private los atributos podemos seguir accediendo debido a que desde las clases hijas no
accediamos a los atributos. Funcionará a no ser que coloquemos en private el metodo, por ejemplo,
el metodo describir. En ese caso, con el private, nos dará error porque no podremos acceder con las clases
hijas.

Protected -> Mismo paquete, Clases Hijas y Misma clase
Private -> Misma clase
*/

package Protected;

abstract public class Clase_Padre {

    private String nombre;
    private String especie;

    public Clase_Padre(String nombre, String especie){
        this.nombre = nombre;
        this.especie = especie;
    }

    abstract protected void hacerRuido();

    protected void describir(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especie: " + this.especie);
    }
}
