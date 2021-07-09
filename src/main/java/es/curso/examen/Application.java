package es.curso.examen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import es.curso.examen.dao.IEmpleadoDAO;
import es.curso.examen.modelo.Empleado;

public class Application {
	

	public static void main(String[] args) {
		pruebaConXML();
	}
		

	private static void pruebaConXML() {
		// Cargar el contexto para XML
		ApplicationContext context;
		
		context = new ClassPathXmlApplicationContext("Context_xml.xml");
		
		Empleado emp = (Empleado) context.getBean("empleado");
		
		IEmpleadoDAO empDAO = (IEmpleadoDAO) context.getBean("empleadoDAO");
		empDAO.create(emp);
		empDAO.delete(emp.getCodigo());
		empDAO.update(emp);
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
