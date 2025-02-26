package servicios;

import controladores.Inicio;

public class SubMenuImplementacion implements SubMenuInterfaz {

	@Override
	public void menuEmpleado() {
		
		
		System.out.println("====Empleado====");
		System.out.println("1.Validar Cliente");
		System.out.println("2.Borrar Cliente");
		System.out.println("3.MostrarCliente");
		System.out.println("4.Menu Inicial");
		System.out.println("==================");
		EmpleadoInterfaz menuEmpleado = new EmpleadoImplementacion();
			switch (Inicio.opcionUsuario2 = Inicio.sc.nextByte()) {
			case 1: {
				menuEmpleado.validarCliente();
				
				break;
			}
			case 2: {
				menuEmpleado.borrarCliente();
				break;
			}
			case 3: {
				menuEmpleado.mostrarClientes();
				break;
			}	
			case 4: {
				
				break;
				
			}
			default:
				System.out.println("La opcion no existe");
			}

	}
	
	@Override
	public void menuCliente() {
		
		ClienteInterfaz registroCliente = new ClienteImplementacion();
			System.out.println("====Cliente====");
			System.out.println("1.Registro Cliente");
			System.out.println("2.Acceso Cliente");
			System.out.println("3.Menu Inicial");
			System.out.println("==================");
			switch (Inicio.opcionUsuario2 = Inicio.sc.nextByte()) {
			case 1: {
				
				registroCliente.nuevoCliente();
				break;
			}
			case 2: {
				registroCliente.accederCliente();
				break;
				
			}
			case 3: {
				
				
				break;
			}
			default:
				System.out.println("La opcion no existe");			}
		
	}
	@Override	
	public void cerrarMenu() {
		System.out.println("¿Deseas cerrar el menu?");
		String eleccionUsuario = Inicio.sc.next();
		if (eleccionUsuario.equals("si")) {
			Inicio.cerrarMenu = true;
		}
		
		
	}
	
}