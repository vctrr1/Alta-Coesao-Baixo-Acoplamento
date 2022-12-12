
public class BrincandoComAsFigurasGeometricas {

	public static void main(String[] args){

		FigurasGeometricas figura = new FigurasGeometricas(10, 5, 7, 25);

		figura.CalcularAreaFigura(TipoFiguraG.RETANGULO);
		figura.CalcularAreaFigura(TipoFiguraG.QUADRADO);
		figura.CalcularAreaFigura(TipoFiguraG.CIRCULO);

		try {
			figura.CalcularPerimetroFig(TipoFiguraG.RETANGULO);
			figura.CalcularPerimetroFig(TipoFiguraG.QUADRADO);
			figura.CalcularPerimetroFig(TipoFiguraG.CIRCULO);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(figura.toStringFigura(TipoFiguraG.RETANGULO));
		System.out.println(figura.toStringFigura(TipoFiguraG.QUADRADO));
		System.out.println(figura.toStringFigura(TipoFiguraG.CIRCULO));	

	}

}
