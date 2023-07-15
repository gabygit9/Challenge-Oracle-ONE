package Conversor;

import javax.swing.JOptionPane;

public class MenuPrincipal {
	static String salida;
	static double dineroConvertir;
	static double gradosConvertir;
	static double longitudConvertir;
	
	public static void main(String[] args) {
		boolean[] continuar = {true};
		while(continuar[0]) {
			String[] conversores = {"Conversor de Monedas","Conversor de Temperatura","Conversor de Longitud"};
			String salida = (String) (JOptionPane.showInputDialog(
					null, 
					"Seleccione una opción de conversión", 
					"Menú", 
					JOptionPane.PLAIN_MESSAGE,
					null, 
					conversores, 
					conversores[0]));	
			if(salida == null) {
				salidaVacia(continuar);
			}else if(salida.equals("Conversor de Monedas")) {
				String input = JOptionPane.showInputDialog(
						null, 
						"Ingrese la cantidad de dinero que desea convertir", 
						"Input", 
						JOptionPane.PLAIN_MESSAGE);
		        if(input==null||input.isBlank()) {
		        	inputVacio(continuar);
		        	break;
		        
		        }else if(validar(input)) {
					dineroConvertir = Double.parseDouble(input);
				} else {
					valorInvalido(continuar);
					break;
				};
				
				String moneda = (String) (JOptionPane.showInputDialog(
						null, 
						"Elije la moneda a la que deseas convertir tu dinero", 
						"Moneda", 
						JOptionPane.PLAIN_MESSAGE,
						null, 
						new Object[]{"De Pesos a Dólar","De Pesos a Euro","De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano",
								"De Dólar a Pesos","De Euro a Pesos","De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, 
							"Selecciona"));
				if(moneda==null) {
					salidaVacia(continuar);
				}else if(moneda.equals("De Pesos a Dólar")) {
					Monedas.ArgsADolar(dineroConvertir);
				}else if (moneda.equals("De Pesos a Euro")) {
					Monedas.ArgsAEuro(dineroConvertir);
				}else if (moneda.equals("De Pesos a Libras")) {
					Monedas.ArgsALibra(dineroConvertir);
				}else if (moneda.equals("De Pesos a Yen")) {
					Monedas.ArgsAYen(dineroConvertir);
				}else if (moneda.equals("De Pesos a Won Coreano")) {
					Monedas.ArgsAWonCoreano(dineroConvertir);
				}else if (moneda.equals("De Dólar a Pesos")) {
					Monedas.DolarAARgs(dineroConvertir);
				}else if (moneda.equals("De Euro a Pesos")) {
					Monedas.EuroAARgs(dineroConvertir);
				}else if (moneda.equals("De Libras a Pesos")) {
					Monedas.LibraAARgs(dineroConvertir);
				}else if (moneda.equals("De Yen a Pesos")) {
					Monedas.YenAARgs(dineroConvertir);
				}else if (moneda.equals("De Won Coreano a Pesos")) {;
					Monedas.WonCoreanoAARgs(dineroConvertir);
				}
				opcion(continuar);
				
			} else if(salida.equals("Conversor de Temperatura")) {
				 String input = JOptionPane.showInputDialog(
						null, 
						"Ingrese los grados que desea convertir", 
						"Input", 
						JOptionPane.PLAIN_MESSAGE);
				 if(input==null||input.isBlank()) {
					 inputVacio(continuar);
					 break;
				 }else if(validar(input)) {
					gradosConvertir = Double.parseDouble(input);
				} else {
					valorInvalido(continuar);
					break;
				}
				String grados = (String) (JOptionPane.showInputDialog(
						null, 
						"Elije la escala a la que deseas convertir los grados", 
						"Grados", 
						JOptionPane.PLAIN_MESSAGE,
						null, 
						new Object[]{"De Celsius a Fahrenheit","De Celsius a Kelvin","De Fahrenheit a Celsius","De Fahrenheit a Kelvin","De Kelvin a Celsius",
								"De Kelvin a Fahrenheit"}, 
							"Selecciona"));	
				if(grados==null) {
					salidaVacia(continuar);
				}else if(grados.equals("De Celsius a Fahrenheit")) {
				    Temperatura.Cel_Fah(gradosConvertir);
				}else if (grados.equals("De Celsius a Kelvin")) {
					Temperatura.Cel_Kel(gradosConvertir);
				}else if (grados.equals("De Fahrenheit a Celsius")) {
					Temperatura.Fah_Cel(gradosConvertir);
				}else if (grados.equals("De Fahrenheit a Kelvin")) {
					Temperatura.Fah_Kel(gradosConvertir);
				}else if (grados.equals("De Kelvin a Celsius")) {
					Temperatura.Kel_Cel(gradosConvertir);
				}else if (grados.equals("De Kelvin a Fahrenheit")) {
					Temperatura.Kel_Fah(gradosConvertir);
				}
				opcion(continuar);
			}else if(salida.equals("Conversor de Longitud")) {
				String input = JOptionPane.showInputDialog(
						null, 
						"Ingrese la cantidad que desea convertir", 
						"Input", 
						JOptionPane.PLAIN_MESSAGE);
				if(input==null||input.isBlank()) {
					inputVacio(continuar);
					break;
				}else if(validar(input)) {
					longitudConvertir = Double.parseDouble(input);
				}else {
					valorInvalido(continuar);
					break;
				}
				String[] unid = {"Centímetros","Metros","Kilómetros","Millas","Pulgadas"};

				int seleccion = JOptionPane.showOptionDialog(
						null, 
						"Seleccione una unidad de medida", 
						"Unidad", 
						JOptionPane.DEFAULT_OPTION, 
						JOptionPane.PLAIN_MESSAGE, 
						null,
						unid, 
						unid[0]
						);
			
				if(seleccion == -1) {
					salidaVacia(continuar);
				}else if (seleccion == 0) {
					String cm = (String) (JOptionPane.showInputDialog(
						null, 
						"Seleccione una opción", 
						"Centímetros", 
						JOptionPane.PLAIN_MESSAGE,
						null, 
						new Object[]{"Centímetros a Metros","Centímetros a Kilómetros","Centímetros a Millas","Centímetros a Pulgadas"}, 
						"Selecciona"));	
					if(cm == null) {
						salidaVacia(continuar);
					}else if(cm.equals("Centímetros a Metros")) {		
						Longitud.CmM(longitudConvertir);
					}else if(cm.equals("Centímetros a Kilómetros")) {
						Longitud.CmKm(longitudConvertir);
					}else if(cm.equals("Centímetros a Millas")) {
						Longitud.CmMillas(longitudConvertir);
					}else if(cm.equals("Centímetros a Pulgadas")) {
						Longitud.CmPulgadas(longitudConvertir);
					}
				}else if(seleccion == 1) {
					String m = (String) (JOptionPane.showInputDialog(
						null, 
						"Seleccione una opción", 
						"Metros", 
						JOptionPane.PLAIN_MESSAGE,
						null, 
						new Object[]{"Metros a Centímetros","Metros a Kilómetros","Metros a Millas","Metros a Pulgadas"}, 
						"Selecciona"));	
					if(m == null) {
						salidaVacia(continuar);
					}else if(m.equals("Metros a Centímetros")) {		
						Longitud.MCm(longitudConvertir);
					}else if(m.equals("Metros a Kilómetros")) {
						Longitud.MKm(longitudConvertir);
					}else if(m.equals("Metros a Millas")) {
						Longitud.MMillas(longitudConvertir);
					}else if(m.equals("Metros a Pulgadas")) {
						Longitud.MPulgadas(longitudConvertir);
					}
				}else if(seleccion == 2) {
					String km = (String) (JOptionPane.showInputDialog(
						null, 
						"Seleccione una opción", 
						"Kilómetros", 
						JOptionPane.PLAIN_MESSAGE,
						null, 
						new Object[]{"Kilómetros a Centímetros","Kilómetros a Metros","Kilómetros a Millas","Kilómetros a Pulgadas"}, 
						"Selecciona"));	
					if(km == null) {
						salidaVacia(continuar);
					}else if(km.equals("Kilómetros a Centímetros")) {	
						Longitud.KmCm(longitudConvertir);
					}else if(km.equals("Kilómetros a Metros")) {
						Longitud.KmM(longitudConvertir);
					}else if(km.equals("Kilómetros a Millas")) {
						Longitud.KmMillas(longitudConvertir);
					}else if(km.equals("Kilómetros a Pulgadas")) {
						Longitud.KmPulgadas(longitudConvertir);
					}
				}else if(seleccion == 3) {
					String mile = (String) (JOptionPane.showInputDialog(
						null, 
						"Seleccione una opción", 
						"Millas", 
						JOptionPane.PLAIN_MESSAGE,
						null, 
						new Object[]{"Millas a Centímetros","Millas a Metros","Millas a Kilómetros","Millas a Pulgadas"}, 
						"Selecciona"));
					if(mile == null) {
						salidaVacia(continuar);
					}else if(mile.equals("Millas a Centímetros")) {	
						Longitud.MillasCm(longitudConvertir);
					}else if(mile.equals("Millas a Metros")) {
						Longitud.MillasM(longitudConvertir);
					}else if(mile.equals("Millas a Kilómetros")) {
						Longitud.MillasKm(longitudConvertir);
					}else if(mile.equals("Millas a Pulgadas")) {
						Longitud.MillasPulgadas(longitudConvertir);
					}
				}else if(seleccion == 4) {
					String inch = (String) (JOptionPane.showInputDialog(
						null, 
						"Seleccione una opción", 
						"Pulgadas", 
						JOptionPane.PLAIN_MESSAGE,
						null, 
						new Object[]{"Pulgadas a Centímetros","Pulgadas a Metros","Pulgadas a Kilómetros","Pulgadas a Millas"}, 
						"Selecciona"));
					if(inch == null) {
						salidaVacia(continuar);
					}else if(inch.equals("Pulgadas a Centímetros")) {		
						Longitud.PulgadasCm(longitudConvertir);
					}else if(inch.equals("Pulgadas a Metros")) {
						Longitud.PulgadasM(longitudConvertir);
					}else if(inch.equals("Pulgadas a Kilómetros")) {
						Longitud.PulgadasKm(longitudConvertir);
					}else if(inch.equals("Pulgadas a Millas")) {
						Longitud.PulgadasMillas(longitudConvertir);
					}
				}
				opcion(continuar);
			}
		}		
	}

	private static boolean validar(String input) {
		 return input.matches("[0-9.]*");
	}
	static void opcion(boolean[] continuar){
		int option = JOptionPane.showConfirmDialog(null, "Desea continuar?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);
		switch(option) {
		case 0:
			continuar[0]= true;
			break;
		case 1: JOptionPane.showMessageDialog(null, "Programa Finalizado");
			continuar[0] = false;
			break;
		case 2: JOptionPane.showMessageDialog(null, "Programa Finalizado");
			continuar[0] = false;
			break;
		default:
			System.out.println("Opción inválida");
			break;
		}
		
	}
	static void salidaVacia(boolean continuar[]) {
		JOptionPane.showMessageDialog(null,"No seleccionó ninguna opción");
		continuar[0]=false;
	}
	static void inputVacio(boolean continuar[]) {
		JOptionPane.showMessageDialog(null,"No ingresó ningun número");
		continuar[0]=false;
	}
	static void valorInvalido(boolean continuar[]) {
		JOptionPane.showMessageDialog(null,"Valor inválido");
		continuar[0]=false;
	}

}
	
