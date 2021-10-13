package Equals3;

abstract public class Animal {
    protected String especie;
    protected float peso;
    private int cont = 0;

    public Animal(String especie, float peso){
        this.especie = especie;
        this.peso = peso;
    }

    protected void alimentar(float pesoComida){
        this.peso += pesoComida;
        cont++;
    }

    @Override
    public boolean equals(Object a){
        Animal animal = (Animal) a;

        if(this.peso == animal.peso && this.especie.equals(animal.especie)){
            return true;
        }else{
            return false;
        }
    }
}
