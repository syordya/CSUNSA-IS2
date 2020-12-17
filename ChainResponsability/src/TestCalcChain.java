public class TestCalcChain {
	
	public static void main(String[] args){
		
		// Aquí defino todos los objetos de la cadena
		
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubtractNumbers();
		Chain chainCalc3 = new MultNumbers();
		Chain chainCalc4 = new DivideNumbers();
		
		// Aquí le digo a cada objeto donde reenviar los
		// datos si no puede procesar la solicitud
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		// Definir los datos en el objeto Numbers
		// y enviarlo al primer Objeto de la cadena
		
		Numbers request = new Numbers(7,12,"mult");
		
		chainCalc1.calculate(request);
		
	}

}