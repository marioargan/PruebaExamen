package controladores;

import java.util.ArrayList;
import java.util.Scanner;

import dto.Dto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.SubMenuImplementacion;
import servicios.SubMenuInterfaz;

public class Inicio {
	
	public static Scanner sc = new Scanner(System.in);
	public static int opcionUsuario;
	public static byte opcionUsuario2;
	public static boolean cerrarMenu = false;
	public static ArrayList<Dto> clientes = new ArrayList<Dto>();
	
	
	public static void main(String[] args) {
	
		
		MenuInterfaz menu  = new MenuImplementacion();
		SubMenuInterfaz subMenu = new SubMenuImplementacion();
		
		
		
		do {
			
			menu.menuBasico();
			switch (opcionUsuario) {
			case 1: {
				subMenu.menuEmpleado();
				
				
				break;
			
			}
			case 2: {
				subMenu.menuCliente();
				break;
			}
			case 3: {
				subMenu.cerrarMenu();
				break;
			}	
			default:
				System.out.println("La opcion no existe");
			}
		
		} while (!cerrarMenu);
		
	}

}

