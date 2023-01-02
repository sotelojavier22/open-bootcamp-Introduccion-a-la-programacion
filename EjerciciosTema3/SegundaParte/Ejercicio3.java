package EjerciciosTema3.SegundaParte;

public class Ejercicio3 {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println("Cantidad de puertas: " + miCoche.getNumeroPuertas());
    }
}
