package Equals1;

public class Main {
    public static void main(String[] args){

        Album album1 = new Album("Cerati", "Bocanada");
        Album album2 = new Album("Luis Miguel", "Romance");
        Album album3 = new Album("Cerati", "Bocanada");

        System.out.println("EQUALS: " + album1.equals(album2));
        System.out.println("==: " + album1.sonIguales(album2));

        System.out.println("EQUALS: " + album1.equals(album3));
        System.out.println("==: " + album1.sonIguales(album3));

    }
}
