/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "JUEGO_INTRODUCCION.java."

import java.io.*;
import java.math.*;

public class juego_introduccion {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double acumulador;
		double contador;
		int moneda;
		int monto;
		String respuesta;
		String respuesta_2;
		String respuesta_3;
		String respuesta_4;
		double total_apuesta;
		double total_resta;
		double total_suma;
		contador = 0;
		acumulador = 0;
		System.out.println("�Tirar moneda? Si/No");
		respuesta = bufEntrada.readLine();
		while (respuesta.equals("Si")) {
			System.out.println("�cuanto desea apostar?:");
			monto = Integer.parseInt(bufEntrada.readLine());
			moneda = Math.floor(Math.random()*2)+1;
			if (moneda==1) {
				respuesta_2 = "Cara";
			} else {
				respuesta_2 = "Sello";
			}
			System.out.println("Cara o Sello");
			respuesta_3 = bufEntrada.readLine();
			System.out.println("La moneda cayo en:"+respuesta_2);
			if (respuesta_2.equals(respuesta_3)) {
				System.out.println("Gano el juego");
				total_suma = monto*2;
				System.out.println("Gano la cantidad de:"+total_suma);
			} else {
				System.out.println("Perdio el juego");
				total_resta = total_suma-monto;
				System.out.println("Perdio la cantidad de :"+total_resta);
			}
			total_apuesta = total_suma+total_resta;
			System.out.println("El valor total ganado es de:"+total_apuesta);
			System.out.println("�Desea realizar otro lanzamiento? Si/No");
			respuesta = bufEntrada.readLine();
			contador = contador+1;
			acumulador = acumulador+monto;
		}
		System.out.println(" La cantidad de veces que jugo fueron:"+contador);
		System.out.println(" El dinero acumulado en apuestas fue de:"+acumulador);
	}


}

