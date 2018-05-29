package MonModele;

import java.awt.Image;

public class BoneWallH extends Wall {

	//IMAGE horizontal_bone
	private String image = "/images/horizontal_bone";
	public BoneWallH(Position position)
	{
		this.x = position.getX();
		this.y = position.getY();
		
		this.setImage(this.image);
	}
}
