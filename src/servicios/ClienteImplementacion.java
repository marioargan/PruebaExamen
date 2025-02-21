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
		
		String dni;
		boolean dniValidado=false;
		do {
			System.out.println("Ingrese su DNI: ");
			dni = Inicio.sc.next();
			String letraDni = validarDni(dni);
			if (dni.substring(8).equalsIgnoreCase(letraDni)&&dni.length()<=9) {
				System.out.println("DNI es correcto");
				dniValidado= true;
			}
			else {
				System.out.println("El DNI no es correcto");
			}
		} while (!dniValidado);
		
		registroDto.setDni(dni);
		
		
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
	
	public String validarDni(String dni) {
		String[] letra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		 String numero = dni.substring(0,8);
		 int resto = Integer.parseInt(numero) % 23;
		 String letraDni = letra[resto];
		 return letraDni;
		 
		
	}  
}
