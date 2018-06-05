package MonModele;

/**********************************************************************************
**																				 **
**							  	   Class Hero								 	 **
**																				 **
**							@author Nicolas Drapier								 **
**																				 **
**							       Copyright 									 **
**																				 **
**********************************************************************************/

public class MOVABLEITEM_Me extends MOVABLEITEM_MovableItem implements Runnable {

	private int speed = 48;
	//private String[] images = {"lorann_l.png","lorann_ul.png","lorann_u.png","lorann_ur.png","lorann_r.png","lorann_br.png","lorann_b.png","lorann_bl.png"};
	private String[] images;
	private boolean weaponed = true;


	public MOVABLEITEM_Me()
	{
		this.setName("Lorann");
		this.setImage("lorann_l.png");
		this.images = new String[8];
		this.images[0] = "lorann_l";
		this.images[1] = "lorann_ul";
		this.images[2] = "lorann_u";
		this.images[3] = "lorann_ur";
		this.images[4] = "lorann_r";
		this.images[5] = "lorann_br";
		this.images[6] = "lorann_b";
		this.images[7] = "lorann_bl";
		
	}
	
	public boolean isWeapon()
	{
		return this.weaponed;
	}
		
	public int getSpeed()
	{
		return this.speed;
	}
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	public void update()
	{
		
	}

	@Override
	public void run() {
		while(true)
		{
			for(int i = 0; i<8; i++)
			{
				//this.setImage(this.images[i] + ".png");
				System.out.println(Thread.currentThread().getName() + "lorann" + Thread.currentThread().getState());
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
