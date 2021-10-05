package interfaz;

import java.util.Scanner;

import dominio.CambioDeTiempoYFinalizarPartido;
import dominio.EquipoLocal;
import dominio.EquipoVisitante;

public class Tablero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//ME FALTA EL 3ER SWITCH Y CAMBIAR DEL PRIMER A SEGUNDO TIEMPO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		System.out.println("*******************************************");
		System.out.println("**             Bienvenido                **");
		System.out.println("**                 al                    **");
		System.out.println("**      Tablero Partido De Futbol        **");
		System.out.println("**                                       **");
		System.out.println("*******************************************");

		System.out.println("\nDigite nombre del equipo local");
		String equipoLocal = entrada.next();
		System.out.println("\nDigite nombre del equipo visitante");
		String equipoVisitante = entrada.next();

		EquipoLocal equipo1 = new EquipoLocal(equipoLocal);
		EquipoVisitante equipo2 = new EquipoVisitante(equipoVisitante);
		CambioDeTiempoYFinalizarPartido empezarOFinalizar = new CambioDeTiempoYFinalizarPartido();
		

		System.out.println("Nombre del equipo local " +equipoLocal);
		System.out.println("Nombre del equipo visitante " +equipoVisitante);
		System.out.println("Digite 1 para empezar el partido");
		Integer empezarPartido = entrada.nextInt();
		if (empezarPartido == 1) {
			System.out.println(empezarOFinalizar.getEmpezarPartido() +" Partido empezado");
		}
		else if(empezarPartido >= 2) {
			System.out.println("Numero incorrecto, el partido no empezo.");
		}
		
		Integer numeroPartido;
		
		do {
			Integer golesLocales = equipo1.setGolLocal(equipo1.getGolLocal());
			Integer golesVisitantes = equipo2.setGolVisitante(equipo2.getGolVisitante());
			var cambiarTiempo = empezarOFinalizar.setPrimerTiempo(empezarOFinalizar.getPrimerTiempo());

			Integer golVisita = 0;
			System.out.println("*******************************************"		  );
			System.out.println("                             					  	 ");
			System.out.println("         PARTIDO DE FULVO             		         ");
			System.out.println("                             					  	 ");
			System.out.println("    EQUIPO "+equipo1+ ": "+golesLocales+			"");
			System.out.println("    EQUIPO " +equipo2+ ": "+golesVisitantes+		"");
			System.out.println("                             					  	 ");
			System.out.println("    TIEMPO: "+cambiarTiempo+"                        ");
			System.out.println("                               					     ");
			System.out.println("*******************************************");
			System.out.println("Digite 1 para sumar gol al equipo local");
			System.out.println("Digite 2 para sumar gol al equipo visitante");
			System.out.println("Digite 3 para finalizar el primer tiempo");
			numeroPartido = entrada.nextInt();
			switch (numeroPartido) {
			case 1:
				equipo1.getGolLocal();
				break;
			case 2:
				equipo2.getGolVisitante();
				break;
			case 3:
				cambiarTiempo = empezarOFinalizar.setSegundoTiempo(empezarOFinalizar.getSegundoTiempo());
				break;
			
			}
		} while (numeroPartido != 3);
		
		
		Integer numeroPartidoDos;
		do {
			Integer golesLocales = equipo1.setGolLocal(equipo1.getGolLocal());
			Integer golesVisitantes = equipo2.setGolVisitante(equipo2.getGolVisitante());
			var cambiarTiempo = empezarOFinalizar.setSegundoTiempo(empezarOFinalizar.getSegundoTiempo());
			System.out.println("*******************************************"		  );
			System.out.println("                             					  	 ");
			System.out.println("         PARTIDO DE FULVO             		         ");
			System.out.println("                             					  	 ");
			System.out.println("    EQUIPO LOCAL "+golesLocales+			"");
			System.out.println("    EQUIPO VISITANTE " +golesVisitantes+	"");
			System.out.println("                             					  	 ");
			System.out.println("    TIEMPO: "+cambiarTiempo+"                        ");
			System.out.println("                               					     ");
			System.out.println("*******************************************");
			System.out.println("Digite 1 para sumar gol al equipo local");
			System.out.println("Digite 2 para sumar gol al equipo visitante");
			System.out.println("Digite 3 para finalizar el partido");
			numeroPartidoDos = entrada.nextInt();
			switch (numeroPartidoDos) {
			case 1:
				equipo1.getGolLocal();
				break;
			case 2:
				equipo2.getGolVisitante();
				break;
			case 3:
				empezarOFinalizar.getFinalizarPartido();
				System.out.println("\n\n\nPartido terminado.");
				System.out.println("Resultado final:");
				System.out.println("\n\n*******************************************"		  );
				System.out.println("                             					  	 ");
				System.out.println("         RESULTADO DEL PARTIDO DE FULVO     	         ");
				System.out.println("                             					  	 ");
				System.out.println("    EQUIPO LOCAL "+golesLocales+			"");
				System.out.println("    EQUIPO VISITANTE " +golesVisitantes+	"");
				System.out.println("                             					  	 ");
				System.out.println("    TIEMPO: "+cambiarTiempo+"                        ");
				System.out.println("                               					     ");
				System.out.println("*******************************************");
				if (golesLocales == golesVisitantes) {
					System.out.println("Empate");
				} else if(golesVisitantes >= golesLocales){
					System.out.println("Gana el equipo visitante");
				} else if(golesLocales >= golesVisitantes){
					System.out.println("Gana el equipo local");
				}
			}
		} while (numeroPartidoDos  != 3);

	}

}
