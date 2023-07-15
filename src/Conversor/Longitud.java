package Conversor;

import javax.swing.JOptionPane;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Longitud extends MenuPrincipal{
	double longitud = MenuPrincipal.longitudConvertir;
	
	public static void CmM(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud/100);
			BigDecimal totalFinal = operacion.setScale(1, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" cm son: "+totalFinal+" Metros");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}
	public static void CmKm(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud/100000);
			BigDecimal totalFinal = operacion.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" cm son: "+totalFinal+" Kilómetros");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}
	public static void CmMillas(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud/160900);
			BigDecimal totalFinal = operacion.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" cm son: "+totalFinal+" Millas");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}public static void CmPulgadas(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud/2.54);
			BigDecimal totalFinal = operacion.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" cm son: "+totalFinal+" Pulgadas");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}public static void MCm(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud*100);
			BigDecimal totalFinal = operacion.setScale(0, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" m son: "+totalFinal+" Centímetros");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}public static void MKm(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud/1000);
			BigDecimal totalFinal = operacion.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" m son: "+totalFinal+" Kilómetros");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}public static void MMillas(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud/1609);
			BigDecimal totalFinal = operacion.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" m son: "+totalFinal+" Millas");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}public static void MPulgadas(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud*39.37);
			BigDecimal totalFinal = operacion.setScale(0, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" m son: "+totalFinal+" Pulgadas");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}public static void KmCm(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud*100000);
			BigDecimal totalFinal = operacion.setScale(0, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" km son: "+totalFinal+" Centímetros");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}public static void KmM(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud*1000);
			BigDecimal totalFinal = operacion.setScale(0, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" km son: "+totalFinal+" Metros");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}public static void KmMillas(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud/1.609);
			BigDecimal totalFinal = operacion.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" km son: "+totalFinal+" Millas");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}public static void KmPulgadas(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud*39370);
			BigDecimal totalFinal = operacion.setScale(0, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" km son: "+totalFinal+" Pulgadas");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}public static void MillasCm(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud*160900);
			BigDecimal totalFinal = operacion.setScale(0, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" millas son: "+totalFinal+" Centímetros");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}public static void MillasM(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud*1609);
			BigDecimal totalFinal = operacion.setScale(0, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" millas son: "+totalFinal+" Metros");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}public static void MillasKm(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud*1.609);
			BigDecimal totalFinal = operacion.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" millas son: "+totalFinal+" Kilómetros");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}public static void MillasPulgadas(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud*63360);
			BigDecimal totalFinal = operacion.setScale(0, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" millas son: "+totalFinal+" Pulgadas");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}public static void PulgadasCm(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud*2.54);
			BigDecimal totalFinal = operacion.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" pulgadas son: "+totalFinal+" Centímetros");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}public static void PulgadasM(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud/39.37);
			BigDecimal totalFinal = operacion.setScale(2, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" pulgadas son: "+totalFinal+" Metros");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}public static void PulgadasKm(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud/39370);
			BigDecimal totalFinal = operacion.setScale(4, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" pulgadas son: "+totalFinal+" Kilómetros");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}public static void PulgadasMillas(double longitud) {
		try {
			BigDecimal operacion = new BigDecimal(longitud/63360);
			BigDecimal totalFinal = operacion.setScale(4, RoundingMode.HALF_UP);
			JOptionPane.showMessageDialog(null,longitud+" pulgadas son: "+totalFinal+" Millas");
		} catch (NumberFormatException e) {
			System.out.println("Valor no válido");
		}
	}
}
