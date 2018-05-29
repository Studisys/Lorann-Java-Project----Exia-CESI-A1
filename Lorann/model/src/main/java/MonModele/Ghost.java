package MonModele;

public class Ghost extends Ennemy {

//	IMAGE = "/images/monster_1";
	
	public Ghost(Direction direction, Position position, String image) {
		super(direction, position, image);
		// TODO Auto-generated constructor stub
		this.setImage(image);
	}

}
