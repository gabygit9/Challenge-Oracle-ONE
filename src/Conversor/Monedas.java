package Conversor;

import javax.swing.JOptionPane;

import java.math.RoundingMode;
import java.math.BigDecimal;

public class Monedas extends MenuPrincipal{
	double moneda = MenuPrincipal.dineroConvertir;
	
	public static void ArgsADolar(double moneda) {
		try {
			BigDecimal monto = new BigDecimal(moneda);
			BigDecimal operacion = new BigDecimal("0.00383");
			BigDecimal resultado = monto.multiply(operacion);
			BigDecimal totalFinal = resultado.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "Tienes $"+String.valueOf(totalFinal)+" Dólares");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
		
	}
	public static void ArgsAEuro(double moneda) {
		try {
			BigDecimal monto = new BigDecimal(moneda);
			BigDecimal operacion = new BigDecimal("0.00349");
			BigDecimal resultado = monto.multiply(operacion);
			BigDecimal totalFinal = resultado.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "Tienes €"+String.valueOf(totalFinal)+" Euros");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}
	public static void ArgsALibra(double moneda) {
		try {
			BigDecimal monto = new BigDecimal(moneda);
			BigDecimal operacion = new BigDecimal("0.0029842");
			BigDecimal resultado = monto.multiply(operacion);
			BigDecimal totalFinal = resultado.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "Tienes £"+String.valueOf(totalFinal)+" Libras");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}
	public static void ArgsAYen(double moneda) {
		try {
			BigDecimal monto = new BigDecimal(moneda);
			BigDecimal operacion = new BigDecimal("0.544407");
			BigDecimal resultado = monto.multiply(operacion);
			BigDecimal totalFinal = resultado.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "Tienes ¥"+String.valueOf(totalFinal)+" Yenes");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}
	public static void ArgsAWonCoreano(double moneda) {
		try {
			BigDecimal monto = new BigDecimal(moneda);
			BigDecimal operacion = new BigDecimal("4.97626");
			BigDecimal resultado = monto.multiply(operacion);
			BigDecimal totalFinal = resultado.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "Tienes ₩"+String.valueOf(totalFinal)+" Wones Coreanos");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}
	public static void DolarAARgs(double moneda) {
		try {
			BigDecimal monto = new BigDecimal(moneda);
			BigDecimal operacion = new BigDecimal("260.983");
			BigDecimal resultado = monto.multiply(operacion);
			BigDecimal totalFinal = resultado.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "Tienes $"+String.valueOf(totalFinal)+" Pesos Argentinos");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}
	public static void EuroAARgs(double moneda) {
		try {
			BigDecimal monto = new BigDecimal(moneda);
			BigDecimal operacion = new BigDecimal("286.19");
			BigDecimal resultado = monto.multiply(operacion);
			BigDecimal totalFinal = resultado.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "Tienes $"+String.valueOf(totalFinal)+" Pesos Argentinos");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}
	public static void LibraAARgs(double moneda) {
		try {
			BigDecimal monto = new BigDecimal(moneda);
			BigDecimal operacion = new BigDecimal("335.07900");
			BigDecimal resultado = monto.multiply(operacion);
			BigDecimal totalFinal = resultado.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "Tienes $"+String.valueOf(totalFinal)+" Pesos Argentinos");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}
	public static void YenAARgs(double moneda) {
		try {
			BigDecimal monto = new BigDecimal(moneda);
			BigDecimal operacion = new BigDecimal("1.80655");
			BigDecimal resultado = monto.multiply(operacion);
			BigDecimal totalFinal = resultado.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "Tienes $"+String.valueOf(totalFinal)+" Pesos Argentinos");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}
	public static void WonCoreanoAARgs(double moneda) {
		try {
			BigDecimal monto = new BigDecimal(moneda);
			BigDecimal operacion = new BigDecimal("0.20088");
			BigDecimal resultado = monto.multiply(operacion);
			BigDecimal totalFinal = resultado.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null, "Tienes $"+String.valueOf(totalFinal)+" Pesos Argentinos");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}
}
