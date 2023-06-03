package entity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Escritor {
	public static List<String> duply(List<String> letra) {
		return Collections
				.nCopies(2, letra)
				.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
	}
	
    public static List<String> minhaMarca() {
    	return duply(Arrays.asList(
    			"Caneta azul, azul caneta",
    			"Caneta azul tá marcada com minha letra"
    			));
    }
    
    public static List<String> quandoViajo() {
    	return duply(Arrays.asList(
    			"Todo dia eu viajo",
    			"Com uma azul e uma amarela",
    			"Eu perdi minha caneta",
    			"Quem achou, devolva ela"
    			));
    }
}