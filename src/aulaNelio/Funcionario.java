package aulaNelio;

//CLASSE
public class Funcionario {

	//ATRIBUTOS (DADOS)
	public String nome;
	public  double valorPorHora;
    public int horas;
	
    
    //METODOS (FUNÇÕES) (COMPORTAMENTO)
    public double total() {
    	return valorPorHora * horas; 
    }
   
}
