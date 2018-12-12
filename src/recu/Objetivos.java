package recu;

import java.util.Arrays;

import modelo.Datos;
import modelo.MyClass;

public class Objetivos {

	// Desarrolllar los métodos del examen AQUI (ver Objetivos)
	
	//apartado 3.
	public void listaGoles() {
		Datos dato= new Datos();
		String[] jornadas = dato.getJornadas();
		 int[][] golesJornadasEquipos = dato.getGolesJornadasEquipos();
		 for (int i = 0; i < golesJornadasEquipos.length; i++) {
			 int acumulado = 0;

			for (int j = 0; j < golesJornadasEquipos[0].length; j++) {
				acumulado += golesJornadasEquipos[i][j];
				
			}
			System.out.println(jornadas[i] + ":" + acumulado );
		}
		 
		
	}
	
	//apartado4.
	
/*	 public int dividirDosNumeros (int a, int b) {
		 int resultado;
		 while(a-b != 0) {
			 resultado = a-b;
			 a = resultado;
		 }
		return a-b;
	 }  probar 27/3*/
	
	
	//apartado5.
	 public void listaGolesJornada() {
		 Datos dato= new Datos();
		 int[][] golesJornadasEquipos = dato.getGolesJornadasEquipos();
		 String[] equipos = dato.getEquipos();
		 for (int j = 0; j < golesJornadasEquipos[0].length; j++) {
			int acumulado = 0;
			for (int i = 0; i < golesJornadasEquipos.length; i++) {
				acumulado += golesJornadasEquipos[i][j];	
			}
			System.out.println(equipos[j] + ":" + acumulado);
		}
	 }
	 
	 
	 //apartado 6.
	 
	 public MyClass[] creaObjetosMyClass(int n) {
		  MyClass[] array= new MyClass[n];
		  int i=0;
		 while(i < n) {
			array[i++] = new MyClass();
		 }
		return array;
	 }
	 
	 
	 
	public static void main(String[] args) {
		// Hacer las llamadas a los métodos AQUI.
		// (no olvidar recoger los valores devueltos
		
		// apartado 2.1
		MyClass objeto1 = new MyClass();
		MyClass objeto2 = new MyClass();
		MyClass objeto3 = new MyClass();
		
		//apartado 2.2
		MyClass[] array = {objeto1,objeto2,objeto3,null,null};
		
		//apartado 3.
		Objetivos objetivo= new Objetivos();
		//objetivo.listaGoles();
		
		//apartado 4.
		// int resultado4 = objetivo.dividirDosNumeros(10,9);
		 
		 //apartado 5.
		 //objetivo.listaGolesJornada();
		 
		 //apartos 6.
		MyClass[] resultado6 = objetivo.creaObjetosMyClass(2);
	}
}
