package Ejercicios;

import java.util.Scanner;

public class CalculadoraConPorcentaje {
	
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Anote la cantidad deseada: ");
	        double cantidad = input.nextDouble();

	        double iva = cantidad * 0.16; 

	        double precioConIVA = cantidad + iva;

	        double descuento;
	        if (cantidad > 50) {
	            descuento = cantidad * 0.10; 
	        } else {
	            descuento = cantidad * 0.05;
	        }

	        double cantidadFinal = precioConIVA - descuento;

	        System.out.println("Cantidad: " + cantidad);
	        System.out.println("IVA: " + iva);
	        System.out.println("Descuento: " + descuento);
	        System.out.println("Cantidad final: " + cantidadFinal);
	    }
	}

