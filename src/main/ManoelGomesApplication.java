package main;

import entity.CanetaAzul;
import entity.Escritor;

public class ManoelGomesApplication {
	public static void main(String[] args) {
		CanetaAzul canetaAzulMusical = new CanetaAzul();
		canetaAzulMusical.marcar(Escritor.minhaMarca());
		canetaAzulMusical.marcar(Escritor.quandoViajo());
	}
}
