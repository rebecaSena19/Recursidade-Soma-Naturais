package Controller;

public class SomaNaturais {

	public SomaNaturais() {

		super();
	}

	public int SomaN(int N) {
		
		if (N <= 0) {
			return 0;

		}
		//fun��o do termo anterior 
		return N + SomaN(N - 1);
	}

}