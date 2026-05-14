package unidad3.Controller;

import unidad3.View.HomeView;

public class HomeController {
	
	private HomeView hv;
	
	public HomeController() {
		
		hv = new HomeView();
        //hv.home();
	}

	public void home()
	{
		
		hv.home();
	}
}