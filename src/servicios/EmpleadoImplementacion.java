package servicios;

import controladores.Inicio;
import dto.Dto;

public class EmpleadoImplementacion implements EmpleadoInterfaz {

	

	
	
	public void validarCliente() {
		
		
		for ( Dto cliente : Inicio.clientes) {
			
			if (cliente.isEsValido()==false) {
				System.out.println(cliente.toString());
			}
			
		}
			System.out.println("Inserte el DNI del Usuario que deseas validar");
			String dniElegido = Inicio.sc.next();
			
		for ( Dto cliente : Inicio.clientes) {
				
			if (cliente.getDni().equals(dniElegido)) {
					cliente.setEsValido(true);
			}
				
		}
		
	}
	@Override
	public void borrarCliente() {
		ClienteInterfaz clienteInterfaz = new ClienteImplementacion();
		boolean dniValidado=false;
		boolean clienteBorrar=false;
		Dto clienteAuxiliar = new Dto();
		for ( Dto cliente : Inicio.clientes) {
			System.out.println(cliente.toString());
		}
		do {
			System.out.println("Ingrese su DNI: ");
			String dni = Inicio.sc.next();
			do {
				
				String letraDni = clienteInterfaz.validarDni(dni);
				if (dni.substring(8).equalsIgnoreCase(letraDni)&&dni.length()<=9) {
					System.out.println("DNI es correcto");
					dniValidado= true;
					break;
				}
				else {
					System.out.println("El DNI no es correcto");
				}
				
			} while (!dniValidado);
			
			for ( Dto cliente : Inicio.clientes) {
				if (cliente.getDni().equals(dni)) {
					clienteBorrar= true;
					clienteAuxiliar=cliente;
					
					
				}
				
			}
			
		} while (!clienteBorrar);
		Inicio.clientes.remove(clienteAuxiliar);
	}
	@Override
	public void mostrarClientes() {
		
		/*for ( Dto cliente : Inicio.clientes) {
			if (cliente.isEsValido()) {
				System.out.println(cliente.toString());;
				4
			}
		}*/
		
		for (Dto cliente : Inicio.clientes) {
			System.out.println(cliente.toString());
		}
	}
}

