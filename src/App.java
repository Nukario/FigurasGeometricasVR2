import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        double radio = sc.nextDouble();
        Circulo circulo1 = new Circulo(radio);
        System.out.println("Area del circulo"+ circulo1.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo1.calcularPerimetro());

        System.out.println("\nIngrese el largo del rectángulo: ");
        double largo = sc.nextDouble();
        System.out.println("Ingrese el ancho del rectángulo: ");
        double ancho = sc.nextDouble();
        Rectangulo rectangulo1 = new Rectangulo(largo, ancho);
        System.out.println("Área del rectángulo: " + rectangulo1.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo1.calcularPerimetro());


        System.out.println("\nIngrese la base del triángulo: ");
        double base = sc.nextDouble();
        System.out.println("Ingrese la altura del triángulo: ");
        double altura = sc.nextDouble();
        System.out.println("Ingrese los tres lados del triángulo: ");
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();
        Triangulo triangulo1 = new Triangulo(base, altura, lado1, lado2, lado3);
        System.out.println("Área del triángulo: " + triangulo1.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo1.calcularPerimetro());
}
}

