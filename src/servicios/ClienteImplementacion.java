package servicios;

import controladores.Inicio;
import dto.Dto;

public class ClienteImplementacion implements ClienteInterfaz {
		
	
	@Override
	public void nuevoCliente() {
		Dto registroDto = new Dto();
		System.out.println("Ingrese su nombre completo con espacios: ");
		Inicio.sc.nextLine();
		registroDto.setNombreCompleto(Inicio.sc.nextLine());
		System.out.println("Ingrese su DNI: ");
		registroDto.setDni(Inicio.sc.next());
		registroDto.setIdCliente(idAutoNumerico());
		Inicio.clientes.add(registroDto);
		String[] fragmento = registroDto.getNombreCompleto().split(" ");
		
		if (fragmento.length == 3) {
			registroDto.setNombre(fragmento[0]);
			registroDto.setApellido1(fragmento[1]);
			registroDto.setApellido2(fragmento[2]);
		}
		else {
			registroDto.setNombre(fragmento[0]);
			registroDto.setApellido1(fragmento[1]);
			registroDto.setApellido2("");
		}
		for ( Dto cliente : Inicio.clientes) {
			System.out.println(cliente.toString());
		}
		

	}
	
	
	
	private long  idAutoNumerico() {
		long idAux = 0;
		long idCliente;
		idCliente = idAux + 1;
		idAux = idCliente;
		return idCliente;
	}
	
	
	private  void validarDni() {
		 char[] letraDni = {  'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',  'X',  'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		 String comprobarDni=Inicio.sc.next();
		 Dto registroDto = new Dto();
		
	}
}
