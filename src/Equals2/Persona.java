/*
Considero de que no es una buena practica porque facilmente puede traer a la confusion o generar problemas
en varios procedimientos tanto legales como cotidianos. A primera vista podria parecer una solucion rapida
y sencilla pero que a la larga traeria problemas a la hora de evaluar el DNI de
cada persona, ya que, realmente, es mas eficiente tener un numero que identifique univocamente
a cada uno, aunque si pensamos del lado de economizar y facilitar la emision de DNIs sin necesidad de gastar
un presupuesto alto podriamos considerarlo como una solucion práctica.
*/

package Equals2;

public class Persona {
    protected int dni;
    protected boolean sexo;
    protected String nombre;

    public Persona(int dni, boolean sexo, String nombre){
        this.dni = dni;
        this.sexo = sexo;
        this.nombre = nombre;
    }

    void mismaPersona(Persona persona){
        if(this.equals(persona)){
            System.out.println("COINCIDENCIA DNI Y SEXO\nSon la misma persona");
        }else{
            System.out.println("NO COINCIDEN\nSon diferentes personas\n");
        }

    }

    @Override
    public boolean equals(Object a){
        Persona persona = (Persona) a;

        if(this.dni == persona.dni && this.sexo == persona.sexo){
            return true;
        }else{
            return false;
        }
    }
}
