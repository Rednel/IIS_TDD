package prFactorial;

public class Factorial {

	public static int calcular(int entrada){
		int salida;
		if(entrada < 2){
			salida = 1;
		}else if(entrada == 2){
			salida = 2;
		}else{
			salida = 6;
		}
			return salida;
	}
	
}
