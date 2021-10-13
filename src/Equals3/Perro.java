package Equals3;

public class Perro extends Animal{

    protected String raza;

    protected Perro(float peso, String raza){
        super("Perro", peso);
        this.raza = raza;
    }

    //--EQUALS
    protected void mismoPerro(Perro perro){
        if(this.equals(perro)){
            System.out.println("** MISMO PERRO **\n");
        }else{
            System.out.println("** DIFERENTES PERROS **\n");
        }
    }

    @Override
    public boolean equals(Object a){
        Perro perro = (Perro) a;

        if(super.equals(perro) && this.raza.equals(perro.raza)){
            return true;
        }else{
            return false;
        }
    }
}
