package modelo;

public class Datos {
	private int[][] golesJornadasEquipos  = { { 2, 1, 0},
                                              { 1, 4, 2}, 
                                              { 2, 1, 0},
                                              { 1, 4, 2},
                                              { 3, 3, 5}		                         
                                            };
private String[] equipos = { "Real Madrid", "Barcelona", "Sevilla" };
private String[] jornadas = { "fecha1", "fecha2", "fecha3", "fecha4", "fecha5" };

public int[][] getGolesJornadasEquipos() {
	return golesJornadasEquipos;
}




public void setGolesJornadasEquipos(int[][] golesJornadasEquipos) {
	this.golesJornadasEquipos = golesJornadasEquipos;
}
public String[] getEquipos() {
	return equipos;
}
public void setEquipos(String[] equipos) {
	this.equipos = equipos;
}
public String[] getJornadas() {
	return jornadas;
}
public void setJornadas(String[] jornadas) {
	this.jornadas = jornadas;
}







}
