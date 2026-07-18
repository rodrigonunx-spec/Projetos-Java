package projetos;

public class Calculadora {

	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double sub(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double mult(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double div(double num1, double num2) {
		return num1 / num2;
	}
	
	public static double pot(double num1, double num2) {
		return Math.pow(num1, num2);
	}
	
	public static double root(double num1) {
		return Math.sqrt(num1);
	}
	
	public static double log(double num1) {
		return Math.log(num1);
	}
	
}

