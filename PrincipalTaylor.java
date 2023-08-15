import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class PrincipalTaylor{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
		Ventas laVenta = new Ventas();
        int compara_local = 0;
        int cant_boletos = 0;
        int dineruco = 0;
		//Se muestra el menú
		int opcion = menu();
		NumberFormat formatoQ = NumberFormat.getCurrencyInstance();
		NumberFormat formatoDolar = NumberFormat.getCurrencyInstance(Locale.US);
	
		
		System.out.println("Bienvenido a Eras Tour");
		while (opcion !=6){
            if (opcion == 1){
                System.out.println("Ingrese la cantidad de boletos que desea:");
                cant_boletos = entrada.nextInt();

                System.out.println("Ingrese su presupuesto máximo:");
                dineruco = entrada.nextInt();

                laVenta.setNum_boletos(cant_boletos);
                laVenta.setPresupuesto(dineruco);

                System.out.println("CAMBIOS REALIZADOS CON ÉXITO.");
                opcion = menu();

            }
			if (opcion == 2){ //Opcion jugar
				if(laVenta.apto()){
                    System.out.println("Solicitud aceptada, usted puede comprar.");
                    laVenta.comprar();
                    System.out.println("#######################################");
                    System.out.println("");
                    System.out.println("Se ha realizado una compra en el local número " + laVenta.getRan_RanLocal() + " de " + laVenta.getNum_boletos() + " boletos. Su presupuesto actual es de: " + formatoDolar.format(laVenta.getPresupuesto()));
                    System.out.println("");
                    System.out.println("#######################################");
                }
				else{
					System.out.println("Solicitud rechazada, intentelo luego.");
					//opcion = 3;
				}
				opcion = menu();
			}
            if(opcion == 3){
                System.out.println("En el primer local hay: " + laVenta.getLocal1() + " boletos disponibles y se han vendido: " + (20 - laVenta.getLocal1()));
                System.out.println("En el segundo local hay: " + laVenta.getLocal2() + " boletos disponibles y se han vendido: " + (20 - laVenta.getLocal2()));
                System.out.println("En el tercer local hay: " + laVenta.getLocal3() + " boletos disponibles y se han vendido: " + (20 - laVenta.getLocal3()));

                
                opcion = menu();

            }
            if(opcion == 4){
                System.out.println("Ingrese el local que quiere consultar: ");
                compara_local = entrada.nextInt();
                if (compara_local == 1){
                    System.out.println("En el primer local hay: " + laVenta.getLocal1() + " boletos disponibles y se han vendido: " + (20 - laVenta.getLocal1()));
                } else if (compara_local == 2){
                    System.out.println("En el segundo local hay: " + laVenta.getLocal2() + " boletos disponibles y se han vendido: " + (20 - laVenta.getLocal2()));
                } else if (compara_local == 3){
                    System.out.println("En el tercer local hay: " + laVenta.getLocal3() + " boletos disponibles y se han vendido: " + (20 - laVenta.getLocal3()));
                } else {
                    System.out.println("Ingrese un número de local válido (1 - 3). :( ");
                }
                opcion = menu();

            }
            if (opcion == 5){
                System.out.println( "Las ventas totales son de: " + formatoDolar.format(( (20 - laVenta.getLocal1()) * 100) + ((20 - laVenta.getLocal2()) * 500) + ((20 - laVenta.getLocal3()) * 1000)));
                opcion = menu();
            }
		}
	
		 System.out.println("GRACIAS POR UTILIZAR NUESTRA APLICACIÓN.");
			
    }

    public static int menu(){
		Scanner teclado = new Scanner(System.in);
		String opString = ""; //Opción sin validar
		boolean bueno = false;
		int opcion = 0; //opcion para validar

		while (!bueno){
			System.out.println("Menú");
			System.out.println("1. Nuevo Comprador");
			System.out.println("2. Nueva solicitud de boletos");
			System.out.println("3. Disponibilidad total");
            System.out.println("4. Disponibilidad Individual");
            System.out.println("5. Reporte total");
            System.out.println("6. Salir");
			System.out.println("\nSeleccione la opción que desea: ");
			opString = teclado.nextLine();
			
			try{
				opcion = Integer.parseInt(opString);
				if (opcion<1 || opcion>6) //Debe ser una opción válida
					System.out.println("Debe ingresar una de las opciones del menú");
				else
					bueno = true;
			}
			catch(Exception e){
				System.out.println("Debe ingresar un número entero\n");
			}
		}
		return opcion;
	}
}