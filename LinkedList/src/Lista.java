
public class Lista {
	public Nodo inicio= null;
	public int tamanio=0;
	Nodo nodito = new Nodo();
	
	
	
	
	public boolean esVacia(){
        return inicio == null;
    }
	public int getTamanio() {
		System.out.println("\nCantidad de nodos: "+tamanio);
		return tamanio;
	}
	
	public void agregarAlInicio(int valor){
		
        nodito.setValor(valor);
        nodito.setSiguiente(inicio);           
        inicio = nodito;
        System.out.println("Nodo: "+nodito.getValor());
        tamanio++;       
    }
	
	
}
