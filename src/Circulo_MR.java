
public class Circulo_MR extends FiguraGeometrica_MR {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_MR(double r, String tipoFigura) {
		super(tipoFigura);
		if (r < 0)
			Math.abs(r);
		radio = r;
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
