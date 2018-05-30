package MonModele;

public class WALL_Door extends WALL_Wall {

	//IMAGE gate-closed
	private String image = "C:/Users/Nicolas Drapier/git/Lorann-Java-Project----Exia-CESI-A1/Lorann/model/images/gate_closed.png";
	
	public WALL_Door()
	{
		this.setName("door");
		this.setImage(image);
	}
}
