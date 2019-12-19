package test_package;

//import java.util.Scanner;

public class PRIMAv5 {
	
	/**
	 * Calcular prima
	 * @param age Entero de edad
	 * @param points Puntos de la licencia
	 * @return Valor a pagar por prima
	 */
	public static double getPrima(int age,double points){
		
		int discount = 0;
		double factor = 0;
		
		if(points <= 0){
			System.out.println("Debe tener mas de 0 puntos en la licencia");
			return 0;
		}
		if(points>30) {
			System.out.println("No se puede tener mas de 30 puntos en la licencia.");
			return 0;
		}
		if(age>=18 && age<25){
			discount = (points>=29)?50:0;
			factor = 2.8;
		}
		else if(age>=25 && age<35){
			discount = (points>=27)?50:0;
			factor = 1.8;
		}
		else if(age>=35 && age<45){
			discount = (points>=25)?100:0;
			factor = 1.0;
		}
		else if(age>=45 && age<65){
			discount = (points>=23)?150:0;
			factor = 0.8;
		}
		else if(age>=65 && age <=90){
			discount = (points>=25)?200:0;
			factor = 1.5;
		}else {
			System.out.println("Error, edad fuera de rango.");
		}
		
		double prima = 500*factor - discount;
		
		return prima;
	}
	
}
