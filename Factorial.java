package prFactorial;

public class Factorial {

	public static int calcular(int entrada){
		int salida;
		if(entrada < 2){
			salida = 1;
		}else{
			salida = entrada*calcular(entrada-1);
		}
		return salida;
	}
	
}
