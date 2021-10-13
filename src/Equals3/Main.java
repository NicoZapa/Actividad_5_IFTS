package Equals3;

public class Main {
    public static void main(String[] args){
        Perro firulais = new Perro(8, "Bulldog");
        Perro scooby = new Perro(20, "Ovejero");
        Perro mora = new Perro(8, "Bulldog");

        firulais.mismoPerro(scooby);
        firulais.mismoPerro(mora);
    }

}
