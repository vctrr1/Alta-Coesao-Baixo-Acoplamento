import javax.management.RuntimeErrorException;

public class FigurasGeometricas {
	
	private int alturaRetangulo;
	private int larguraRetangulo;
	private int ladoQuadrado;
	private int raioCirculo; 
	
	public FigurasGeometricas(int altura, int largura, int lado, int raio){
		this.alturaRetangulo = altura;
		this.larguraRetangulo = largura;
		this.ladoQuadrado = lado;
		this.raioCirculo = raio;
	}

	public void CalcularAreaFigura(TipoFiguraG tipeF){

		if(tipeF == TipoFiguraG.RETANGULO){
			System.out.println("A area deste Retangulo eh: " + AreaRetangulo(alturaRetangulo, larguraRetangulo));

		}else if(tipeF == TipoFiguraG.QUADRADO){
			System.out.println("A area desde Quadrado eh: " + AreaQuadrado(ladoQuadrado));

		}else if(tipeF == TipoFiguraG.CIRCULO){
			System.out.println("A area desde Circulo eh: " + AreaCirculo(raioCirculo));

		}else{
			System.out.println("Erro, Não é figura");
		}
	}

	public int CalcularPerimetroFig(TipoFiguraG tipeF) throws Exception{

		int perimetro;

		if(tipeF == TipoFiguraG.RETANGULO){
			perimetro = PerimetroRetangulo(alturaRetangulo, larguraRetangulo);
			System.out.println("O perimetro do retangulo eh: " + perimetro);

		}else if(tipeF == TipoFiguraG.QUADRADO){
			perimetro =  PerimetroQuadrado(ladoQuadrado);
			System.out.println("O perimetro do Quadrado eh: " + perimetro);

		}else if(tipeF == TipoFiguraG.CIRCULO){
			perimetro = PerimetroCirculo(raioCirculo);
			System.out.println("O perimetro do Circulo eh: " + perimetro);

		}else if(tipeF == TipoFiguraG.NAOEHFIGURA){
			throw new RuntimeErrorException(null, "Não é figura");

		}else{
			throw new RuntimeErrorException(null, "Error");
		}

		return perimetro;
	}

	public String toStringFigura(TipoFiguraG tipeF){
		if(tipeF == TipoFiguraG.RETANGULO){
			return String.format("O retangulo criado tem altura de tamanho: %s e largura de tamanho: %s",alturaRetangulo, larguraRetangulo);

		}else if(tipeF == TipoFiguraG.QUADRADO){
			return String.format("O quadrado criado tem lados de tamanho: ", ladoQuadrado);

		}else if(tipeF == TipoFiguraG.CIRCULO){
			return String.format("O circulo criado tem raio de tamanho: %s", raioCirculo);

		}else{
			return String.format("O retangulo criado tem altura: %s e largura de: %s ,o quadrado criado tem lados de: %s , o circulo criado tem raio de: %s", alturaRetangulo, larguraRetangulo, ladoQuadrado, raioCirculo);
		}
	}


	//-----------------------------------------Area-------------------------------------------------------

	public int AreaRetangulo(int altura,int largura){
		int areaR = alturaRetangulo * larguraRetangulo;
		return areaR;

	}
	public int AreaQuadrado(int lado){
		int areaQ = 2 * ladoQuadrado;
		return areaQ;

	}
	public int AreaCirculo(int raio){
		int raioC = (int) (2 * 3.14 * raioCirculo);
		return raioC;
	}


	//---------------------------------Perimetro---------------------------------------------------------

	public int PerimetroRetangulo(int altura, int largura){
		int perimetroR = (2 * alturaRetangulo) + (2 * larguraRetangulo); 
		return perimetroR;
	}
	public int PerimetroQuadrado(int lado){
		int perimetroQ = (4 * ladoQuadrado);
		return perimetroQ;
	}
	public int PerimetroCirculo(int raio){
		int perimetroC = (int) (3.14 * raioCirculo);
		return perimetroC;
	}
}
