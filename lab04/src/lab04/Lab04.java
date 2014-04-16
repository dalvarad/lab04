package lab04;

public class Lab04 {
	private int puertas;
	
	public static int minimoPuertas;
	
	public Lab04(int puertas){
		this.puertas=puertas;
	}
	
	public int getPuertas(){
		return puertas;
	}
	
	public void setPuertas(int puertas){
		if (puertas > 0){
			this.puertas = puertas;
		}
	}
}
