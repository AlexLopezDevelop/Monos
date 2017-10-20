import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MONOS {
	public static void main(String[] args) {

		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			int opcion = 4;
			
			int mediaedadCHIMPA = 0;
			int contadoredadCHIMPA =0;
			int mediapesoCHIMPA = 0;
			int contadorpesoCHIMPA=0;
			
			int mediaedadGORI = 0;
			int contadoredadGORI =0;
			int mediapesoGORI = 0;
			int contadorpesoGORI=0;
			
			int masviejoGORI = Integer.MIN_VALUE;
			int masjovenGORI = Integer.MAX_VALUE;
			
			int masviejoCHIMPA = Integer.MIN_VALUE;
			int masjovenCHIMPA = Integer.MAX_VALUE;
			
			int maspesoGORI = 0;
			int menospesoGORI = Integer.MAX_VALUE;
			
			int maspesoCHIMPA = Integer.MIN_VALUE;
			int menospesoCHIMPA = Integer.MAX_VALUE;
			
			
			
			while (opcion != 0) {

				System.out.println("***** Menu Principal *****");
				System.out.println("==========================");
				System.out.println("[1] Registrar Ingresos");
				System.out.println("[2] Estadisticas");
				System.out.println("[3] Reiniciar");
				System.out.println("[0] Salir");
				System.out.println("Seleciona una opcion:");
				String opcion1 = buffer.readLine();
				opcion = Integer.parseInt(opcion1);

				switch (opcion) {

				case 1:

					System.out.println("Introduzca cunatos ingrsos quiere registrar");
					String cantidad = buffer.readLine();
					int cantidadi = Integer.parseInt(cantidad);

					while (cantidadi > 0) {
						cantidadi--;

						System.out.println("Tipo de simio:");
						String tipo = buffer.readLine();
						int tiposimio = Integer.parseInt(tipo);
						int error = 1;
						while (error != 0) {
							if (tiposimio == 1 || tiposimio == 2) {
								error = 0;
							} else {
								System.out.println("Tipo de simio erroneo [1-chimpance / 2-gorila]:");
								System.out.println(" ");
								System.out.println("Tipo de simio:");
								tipo = buffer.readLine();
								tiposimio = Integer.parseInt(tipo);
							}
						}

						System.out.println("Edad del simio:");
						String edad = buffer.readLine();
						int edadsimio = Integer.parseInt(edad);
						if (tiposimio == 1) {
							while (edadsimio > 50 || edadsimio < 0) {
								System.out.println("Edad del simio erroneo [Chimpance edad:0-50]");
								System.out.println("Edad del simio:");
								edad = buffer.readLine();
								edadsimio = Integer.parseInt(edad);
							}
							System.out.println("Peso del simio:");
							String peso = buffer.readLine();
							int pesosimio = Integer.parseInt(peso);
							
							//Guardar datos
							mediaedadCHIMPA = mediaedadCHIMPA + edadsimio;
							contadoredadCHIMPA++;
							mediapesoCHIMPA = mediapesoCHIMPA + pesosimio;
							contadorpesoCHIMPA++;
							//comparador
							if (edadsimio>masviejoCHIMPA)masviejoCHIMPA=edadsimio;
							if (edadsimio<masjovenCHIMPA)masjovenCHIMPA=edadsimio;
							
							if (pesosimio>maspesoCHIMPA)maspesoCHIMPA=pesosimio;
							if (pesosimio<menospesoCHIMPA)menospesoCHIMPA=pesosimio;
							
						}
						if (tiposimio == 2) {
							while (edadsimio > 40 || edadsimio < 0) {
								System.out.println("Edad del simio erroneo [gorila edad:0-50]");
								System.out.println("Edad del simio:");
								edad = buffer.readLine();
								edadsimio = Integer.parseInt(edad);
							}
							System.out.println("Peso del simio:");
							String peso = buffer.readLine();
							int pesosimio = Integer.parseInt(peso);
							
							//Guardar datos
							
							mediaedadGORI = mediaedadGORI + edadsimio;
							contadoredadGORI++;
							mediapesoGORI = mediapesoGORI + pesosimio;
							contadorpesoGORI++;
							//comparador
							if (edadsimio>maspesoGORI)maspesoGORI=pesosimio;
							if (edadsimio<menospesoGORI)menospesoGORI=pesosimio;
							
						}
						
					}
					
					
					break;
					
				case 2:
					
					System.out.println("Chimpance mas viejo: "+masviejoCHIMPA);
					System.out.println("Chimpance mas joven: "+masjovenCHIMPA);
					System.out.println("Edad media chimpance: "+mediaedadCHIMPA/contadoredadCHIMPA);
					System.out.println("Chimpance con mayor peso: "+maspesoCHIMPA);
					System.out.println("Chimpance con menor peso: "+menospesoCHIMPA);
					System.out.println("peso medio chimpance: "+mediapesoCHIMPA/contadorpesoCHIMPA);
					
					System.out.println("Gorila con mayor peso: "+masviejoGORI);
					System.out.println("Gorila con menor peso :"+masjovenGORI);
					System.out.println("Edad media Gorila: "+mediaedadGORI/contadoredadGORI);
					System.out.println("Gorila con mayor peso: "+maspesoGORI);
					System.out.println("Gorila con menor peso: "+menospesoGORI);
					System.out.println("peso medio Gorila: "+mediapesoGORI/contadorpesoGORI);
					break;
					
				case 3:
					
					mediaedadCHIMPA = 0;
					contadoredadCHIMPA =0;
					mediapesoCHIMPA = 0;
					contadorpesoCHIMPA=0;
					
					mediaedadGORI = 0;
					contadoredadGORI =0;
					mediapesoGORI = 0;
					contadorpesoGORI=0;
					
					masviejoGORI = Integer.MIN_VALUE;
					masjovenGORI = Integer.MAX_VALUE;
					
					masviejoCHIMPA = Integer.MIN_VALUE;
					masjovenCHIMPA = Integer.MAX_VALUE;
					
					maspesoGORI = 0;
					menospesoGORI = Integer.MAX_VALUE;
					
					maspesoCHIMPA = Integer.MIN_VALUE;
					menospesoCHIMPA = Integer.MAX_VALUE;
					
					
					break;
				
				}

			}System.out.println("Programa terminado.");

		} catch (Exception e) {
			System.out.println("Error al introducir Datos");
		}
	}
}