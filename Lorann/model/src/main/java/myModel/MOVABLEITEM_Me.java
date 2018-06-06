package myModel;

// TODO: Auto-generated Javadoc
/**
 * The Class MOVABLEITEM_Me.
 */
public class MOVABLEITEM_Me extends MOVABLEITEM_MovableItem {

	/** The speed. */
	private int speed = 48;
	
	/** The image. */
	private String image = "lorann_l.png";
	
	/** The weaponed. */
	private boolean weaponed = true;

	
	/**
	 * Instantiates a new MOVABLEITE M me.
	 */
	public MOVABLEITEM_Me()
	{
		this.setName("Lorann");
		this.setImage(image);		
	}
	
	/**
	 * Checks if is weapon.
	 *
	 * @return true, if is weapon
	 */
	public boolean isWeapon()
	{
		return this.weaponed;
	}
		
	/**
	 * Gets the speed.
	 *
	 * @return the speed
	 */
	public int getSpeed()
	{
		return this.speed;
	}
	
	/**
	 * Sets the speed.
	 *
	 * @param speed the new speed
	 */
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	/**
	 * Update.
	 */
	public void update()
	{
		
	}

	
	/*@Override
	public void run() 
	{
		while(true)
		{
			for(int i = 0; i<8; i++)
			{
				//this.setImage(this.images[i] + ".png");
				
				System.out.println(Thread.currentThread().getName() + "lorann2" + Thread.currentThread().getState() +"       " + i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
	}*/
	
}
