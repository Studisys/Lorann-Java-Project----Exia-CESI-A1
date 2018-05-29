package MonModele;

public class BoneWallY extends Wall {

	//IMAGE vertical_bone
	private String image = "/images/vertical_bone";
	
	public BoneWallY(Position position)
	{
		this.x = position.getX();
		this.y = position.getY();
		
		this.setImage(image);
	}
}
