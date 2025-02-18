package servicios;

import controladores.Inicio;

public class MenuImplementacion implements MenuInterfaz {
	
	@Override
	public void menuBasico() {
		
		System.out.println("====Menu====");
		System.out.println("1.Version Empleado");
		System.out.println("2.Version Cliente");
		System.out.println("3.Cerrar Menu");
		System.out.println("===============");
		Inicio.opcionUsuario = Inicio.sc.nextInt();
		
		
	}
}
