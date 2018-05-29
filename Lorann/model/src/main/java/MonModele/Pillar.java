package MonModele;

public class Pillar extends Wall {
	
	//IMAGE bone
	private String image = "/images/bone";
	
	public Pillar(Position position)
	{
		this.x = position.getX();
		this.y = position.getY();
		
		this.setImage(image);
	}
}
