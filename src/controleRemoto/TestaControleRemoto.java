package controleRemoto;

public class TestaControleRemoto {
	
	public static void main(String[] args) {
		
		ControleRemoto cce = new ControleRemoto();
		
		cce.ligar();
		cce.maisVolume();
		cce.ligarMudo();
		cce.maisVolume();
		cce.maisVolume();
		cce.abrirMenu();
	}

}
