package MonModele;

public class StormTrooper extends Ennemy {

//	IMAGE = "/images/monster_4";
	
	public StormTrooper(Direction direction, Position position, String image) {
		super(direction, position, image);
		// TODO Auto-generated constructor stub
		
		this.setImage(image);
	}

}
