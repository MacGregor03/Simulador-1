import java.util.Scanner;
public class Planificador{
	public static void main(String[] args) {
	int opcion;
	Scanner teclado = new Scanner(System.in); 
	do{
		System.out.println("\tPlanificador de Procesos \nSelecciona una Opcion para continuar:\n1.-Simular con Planificación Round Robin\n2.-Simular con Planificación Prioridad Apropiativa \n3.-Salir");
		opcion=teclado.nextInt();
		
		switch (opcion){
			case 1:{
			Robin r = new Robin();
      			Cola s = new Cola();         
		          int op,a;  
       			int lim = (int) Math.floor(Math.random()*32);
		    	Scanner tec = new Scanner(System.in);
    			do{
			   s.VaciarCola();
				System.out.println("\tSimulador de Planificador Round Robin\nSelecciona una Opcion para continuar:\n1.-ingresar nombres de procesos\n2.-Correr simulador con numeros aleatorios\n3.-Salir");  
    				op=tec.nextInt();
    				switch(op){
					case 1:{
			   int proce,id,rafaga,prioridad,tamanio;
               		   System.out.println("Dame el numero de procesos que quieres crear:");
              		   proce = tec.nextInt();
             		   for (int j=0;j<proce;j++) {	
				System.out.println("Dame los sig datos:\n id:");
                   		id= tec.nextInt();
                   		System.out.println("Rafaga:");
		                rafaga= tec.nextInt();
                    		System.out.println("Prioridad:");
                    		prioridad= tec.nextInt();
                    		System.out.println("Tamaño:");
                    		tamanio= tec.nextInt();
                    		s.push(id,rafaga,rafaga,prioridad,tamanio);
			 } 
			 r.robin(s,lim);
			}
			 	break;
				case 3:
				break;
				default:
				break;}
			}while(op!=3);
	}
			case 2:
				System.out.print("Esta en la opcion 2");
				break;
			case 3:
				break;
		}
	}while(opcion!=3);
	}
}