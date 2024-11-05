// Copyright: Ruth Bautista
// Este proyecto es sobre un sistema de clases que representan diferentes figuras geométricas:
// Círculo, línea, triángulo y cuadrado.
// La clase abstracta Formas define lo que todas las figuras tienen en común.
// Y cada subclase tiene su propio método para dibujar y algunas calculan cosas como área.

package com.mycompany.figuras;
import java.util.Scanner;

abstract class Formas {
    private String color;

    public Formas(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void establecerColor(String color) {
        this.color = color;
    }

    public abstract void dibujar();
}

class Circulo extends Formas {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo de color: " + getColor());
    }

    public double getRadio() {
        return radio;
    }

    public static double calcularRadio(double area) {
        return Math.sqrt(area / Math.PI);
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Linea extends Formas {
    private double largo;

    public Linea(String color, double largo) {
        super(color);
        this.largo = largo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una línea de color: " + getColor());
    }

    public double calcularLargo() {
        return largo;
    }
}

class Triangulo extends Formas {
    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo de color: " + getColor());
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }
}

class Cuadrado extends Formas {
    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado de color: " + getColor());
    }

    public double calcularArea() {
        return lado * lado;
    }
}

public class Figuras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el color del círculo: ");
        String colorCirculo = scanner.nextLine();
        System.out.print("Ingrese el área del círculo: ");
        double areaCirculo = scanner.nextDouble();
        double radioCirculo = Circulo.calcularRadio(areaCirculo);
        Formas circulo = new Circulo(colorCirculo, radioCirculo);
        
        System.out.println();
        
        scanner.nextLine(); 
        System.out.print("Ingrese el color del triángulo: ");
        String colorTriangulo = scanner.nextLine();
        System.out.print("Ingrese la base del triángulo: ");
        double baseTriangulo = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double alturaTriangulo = scanner.nextDouble();
        Formas triangulo = new Triangulo(colorTriangulo, baseTriangulo, alturaTriangulo);
        
        System.out.println();
        
        
        scanner.nextLine(); 
        System.out.print("Ingrese el color del cuadrado: ");
        String colorCuadrado = scanner.nextLine();
        System.out.print("Ingrese el lado del cuadrado: ");
        double ladoCuadrado = scanner.nextDouble();
        Formas cuadrado = new Cuadrado(colorCuadrado, ladoCuadrado);
        
        System.out.println();

       
        scanner.nextLine(); 
        System.out.print("Ingrese el color de la línea: ");
        String colorLinea = scanner.nextLine();
        System.out.print("Ingrese el largo de la línea: ");
        double largoLinea = scanner.nextDouble();
        Formas linea = new Linea(colorLinea, largoLinea);
        
        System.out.println();

        
        circulo.dibujar();
        linea.dibujar();
        triangulo.dibujar();
        cuadrado.dibujar();
        
        System.out.println();

        
        System.out.println("Área del círculo: " + ((Circulo)circulo).calcularArea());
        System.out.println("Radio calculado del círculo: " + radioCirculo);
        System.out.println("Área del triángulo: " + ((Triangulo)triangulo).calcularArea());
        System.out.println("Área del cuadrado: " + ((Cuadrado)cuadrado).calcularArea());
        System.out.println("Largo de la línea: " + ((Linea)linea).calcularLargo());

        scanner.close();
    }
}