// El patrón de cadena de responsabilidad tiene un 
// grupo de objetos que se espera que entre
// ellos podrán resolver un problema. 
// Si el primer Objeto no puede resolverlo, pasa
// los datos al siguiente objeto de la cadena

public interface Chain {

	// Define el siguiente Objeto para recibir los datos
	// si este objeto no puede procesarlo
	
	public void setNextChain(Chain nextChain);
	
	// O resuelve el problema o pasa los datos
	// al siguiente objeto de la cadena
	
	public void calculate(Numbers request);
	
}