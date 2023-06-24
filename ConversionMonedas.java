package Ejercicios;

import java.util.Scanner;

public class ConversionMonedas {
	
	
    private double CambioSolesToDollar;
    private double CambioSolesToMXN;
    private double CambioSolesToQTZ;

    public ConversionMonedas(double CambioSolesToDollar, double CambioSolesToMXN, double CambioSolesToQTZ) {
        this.CambioSolesToDollar = CambioSolesToDollar;
        this.CambioSolesToMXN = CambioSolesToMXN;
        this.CambioSolesToQTZ = CambioSolesToQTZ;
    }

    public double convertirSolesADolares(double soles) {
        return soles / CambioSolesToDollar;
    }

    public double convertirSolesAPesos(double soles) {
        return soles / CambioSolesToMXN;
    }

    public double convertirSolesAQuetzales(double soles) {
        return soles * CambioSolesToQTZ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Anote la cantidad en soles: ");
        double soles = input.nextDouble();

        double tipoCambioPENtoDollar = 0.3;
        double tipoCambioPENtoMXN = 4.7;
        double tipoCambioPENtoQTZ = 2.2;


        ConversionMonedas conversor = new ConversionMonedas(tipoCambioPENtoDollar, tipoCambioPENtoMXN, tipoCambioPENtoQTZ);

        double dolares = conversor.convertirSolesADolares(soles);
        double pesos = conversor.convertirSolesAPesos(soles);
        double quetzales = conversor.convertirSolesAQuetzales(soles);

        System.out.println("Dólares: " + dolares);
        System.out.println("Pesos: " + pesos);
        System.out.println("Quetzales: " + quetzales);
    
}

}

