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
}
