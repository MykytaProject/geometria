
public class Rectangulo_MR extends FiguraGeometrica_MR {
	private double l1;
	private double l2;
	
	public Rectangulo_MR(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	
	/** 
	 * @autor Mykyta Ryasny
	 * @version 1.2
	 * Multiplica un lado del rectángulo por el otro.
	 * @return double
	 * Nos devuelve el área del rectangulo.
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	
	/** 
	 * @autor Mykyta Ryasny
	 * @version 1.2
	 * Multiplica por dos cada lado y los suma
	 * @return double
	 * Nos devuelve el perímetro del rectángulo.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
