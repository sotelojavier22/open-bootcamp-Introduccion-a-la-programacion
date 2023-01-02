package EjerciciosTema3.PrimeraParte;

public class Ejercicio3 {
    public static void main(String[] args) {
        int resultado = 0;
        resultado = suma(3, 21, 4);
        System.out.println(resultado);

    }

    public static int suma(int num1, int num2, int num3) {
        int resul = 0;
        resul = num1 + num2 + num3;
        return resul;
    }
}