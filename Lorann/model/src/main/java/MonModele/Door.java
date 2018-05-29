package MonModele;

public class Door extends Wall {

	//IMAGE gate-closed
	private String image = "/images/gate_closed";
	
	public Door(Position position)
	{
		this.x = position.getX();
		this.y = position.getY();
		
		this.setImage(image);
	}
}
