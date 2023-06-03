package entity;

import java.util.List;

public class CanetaAzul implements Caneta {
	@Override
	public void marcar(List<String> letras) {
		letras.forEach(letra -> {
			System.out.println(letra);
		});
	}
}




