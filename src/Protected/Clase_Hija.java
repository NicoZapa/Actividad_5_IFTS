package Protected;

public class Clase_Hija extends Clase_Padre{

    public Clase_Hija(String nombre){
        super(nombre, "Gato");
    }

    @Override
    protected void hacerRuido() {
        System.out.println("MIAU MIAU");
    }

    @Override
    protected void describir() {
        super.describir();
        System.out.println("Me encanta subirme a los muebles mas altos\n");
    }
}
