package Conversor;

import javax.swing.JOptionPane;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Temperatura extends MenuPrincipal {
	double grado = MenuPrincipal.gradosConvertir;
	
	public static void Cel_Fah(double grado) {
		try {
			BigDecimal operacion = new BigDecimal((grado*9/5)+32);
			BigDecimal totalFinal = operacion.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,grado+" Cº son "+totalFinal+" Fº");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}
	public static void Cel_Kel(double grado) {
		try {
			BigDecimal operacion = new BigDecimal(grado+273);
			BigDecimal totalFinal = operacion.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,grado+" Cº son "+totalFinal+" Kº");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
		
	}
	public static void Fah_Cel(double grado) {
		try {
			BigDecimal operacion = new BigDecimal((grado-32)*5/9);
			BigDecimal totalFinal = operacion.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,grado+" Fº son "+totalFinal+" Cº");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
		
	}
	public static void Fah_Kel(double grado) {
		try {
			BigDecimal operacion = new BigDecimal(((grado-32)*5/9)+273);
			BigDecimal totalFinal = operacion.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,grado+" Fº son "+totalFinal+" Kº");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
		
	}
	public static void Kel_Cel(double grado) {
		try {
			BigDecimal operacion = new BigDecimal(grado-273);
			BigDecimal totalFinal = operacion.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,grado+" Kº son "+totalFinal+" Cº");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
		
	}
	public static void Kel_Fah(double grado) {
		try {
			BigDecimal operacion = new BigDecimal(((grado-273)*9/5)+32);
			BigDecimal totalFinal = operacion.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,grado+" Kº son "+totalFinal+" Fº");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
		
	}
}
