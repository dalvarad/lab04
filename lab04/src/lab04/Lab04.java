package lab04;

public class Lab04 {
	private int puertas;
	public int getPuertas(){
		return puertas;
	}
	
	public void setPuertas(int puertas){
		if (puertas > 0){
			this.puertas = puertas;
		}
	}

}
