package maVue;
import monController;
import java.util.Observable;

import javax.swing.SwingUtilities;

import jpu2016.dogfight.view.EventPerformer;
import jpu2016.dogfight.view.GraphicsBuilder;


public class MainFrame implements java.lang.Runnable,iView {
	private final GraphicsBuilder graphicsBuilder;
	private final Event	eventPerformer;
	private final Observable observable;
	private GameFrame gameFrame;
	
	public MainFrame(iOrderPerformer orderPerformer,iModel LorannModel,Observable observable)
	{
		this.observable = observable;
		this.graphicsBuilder = new GraphicsBuilder(dogfightModel);
		this.eventPerformer = new EventPerformer(orderPerformer);
		SwingUtilities.invokeLater(this);
	}
	
	public void run() 
	{
		this.gameFrame = new GameFrame("Lorann", this.event, this.graphicsBuilder, this.observable);

	}
	public String displayMessage(String message)
	{
		return message;
	}
	public void exit()
	{
		
	}
}
