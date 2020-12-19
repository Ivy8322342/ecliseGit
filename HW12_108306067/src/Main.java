import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println(new GoogleQuery("¥@¬ÉÆ[").query());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}