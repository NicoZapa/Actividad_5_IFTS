package Equals2;

public class Main {
    public static void main(String[] args){
        Persona nicolas = new Persona(39626252, false, "Nicolas");
        Persona victor = new Persona(39626252, false, "Victor");
        Persona lucia = new Persona(42123532, true, "Lucia");

        nicolas.mismaPersona(lucia);
        nicolas.mismaPersona(victor);
    }
}
