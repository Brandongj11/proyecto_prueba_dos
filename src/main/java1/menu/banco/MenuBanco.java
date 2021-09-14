package menu.banco;

import java.util.Scanner;

public class MenuBanco {

	public static void main(String[] args) {

		Scanner tecladoInt = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);
		int opcion;
		int ca;

		System.out.println("Ingrese clave");
		String c = tecladoString.next();
		String clave = "85DB";
		Boolean com = c.equals(clave);
			do {
				System.out.println("Banco Pichincha elija una opción");
				System.out.println("1.Consultar pagos");
				System.out.println("2.Realizar transferencia");
				System.out.println("3.SALIR");
				opcion = tecladoInt.nextInt();
				if (opcion == 1) {
					System.out.println("No tiene ningun pago pendiente");
				} else if (opcion == 2) {
					System.out.println("Ingrese cuenta de destino");
					String cd = tecladoString.next();
					System.out.println("Monto a transferir");
					int mt = tecladoInt.nextInt();
					int s = 2500 - mt;
					System.out.println("Su saldo es:" + s);
				}
			} while (opcion != 3);
			do {
				System.out.println("Ingrese clave");
				ca = tecladoInt.nextInt();
				System.out.println("La clave no es la correcta");
			} while (ca != -1);
			System.out.println("Gracias por preferirnos");
		}
	}

