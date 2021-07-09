package es.curso.examen.intercepta;

import es.curso.examen.logs.FicherosLog;
import es.curso.examen.modelo.Empleado;

public class Intercepta {
	
	private Empleado _empleado;
	
	public void createIntercept(Empleado e) {
		FicherosLog.grabarLog("Create of " + e, "src/logs/mi_log.txt");
	}
	
	public void deleteIntercept(int codigo) {
		FicherosLog.grabarLog("Delete with code: " + codigo, "src/logs/mi_log.txt");
	}

	public void updateIntercept(Empleado e) {
		FicherosLog.grabarLog("Update of " + e, "src/logs/mi_log.txt");
	}

	public Empleado get_empleado() {
		return _empleado;
	}

	public void set_empleado(Empleado _empleado) {
		this._empleado = _empleado;
	}
	
	
}
