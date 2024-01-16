import java.util.Scanner;


// crea un calculadora que sume, reste, multiplique y divida dos numeros.
// tiene que tener un menu para que el usuario elija la operacion que quiere hacer.
// tiene que tener un metodo para cada operacion.
// tiene que tener un metodo para pedir los numeros al usuario.
// tiene que tener un metodo para mostrar el resultado.
// tiene que tener un metodo para mostrar el menu.
// tiene que tener un metodo para salir del programa.
// tiene que tener un metodo para controlar que el usuario solo pueda introducir numeros.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 5);
    }

    public static void sumar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("La suma es: " + (num1 + num2));
    }

    public static void restar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("La resta es: " + (num1 - num2));
    }

    public static void multiplicar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("La multiplicacion es: " + (num1 * num2));
    }

    public static void dividir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("La division es: " + (num1 / num2));
    }
}


