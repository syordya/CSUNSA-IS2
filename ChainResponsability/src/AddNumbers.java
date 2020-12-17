public class AddNumbers implements Chain{

	private  Chain nextInChain;
	
	// Define el siguiente Objeto para recibir los
	// datos si este no puede usarlo
	
	public void setNextChain(Chain nextChain) {
		
		nextInChain = nextChain;
		
	}

	// Intenta calcular los datos o los pasa
	// al objeto definido en el método setNextChain()
	
	public void calculate(Numbers request) {
		
		if(request.getCalcWanted() == "add"){
			
			System.out.print(request.getNumber1() + " + " + request.getNumber2() + " = "+
					(request.getNumber1()+request.getNumber2()));
			
		} else {
			
			nextInChain.calculate(request);
			
		}
		
	}
}