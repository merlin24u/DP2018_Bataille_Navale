package view;

import java.awt.Graphics;
import controller.MapController;
import model.Map;

public class ViewOpponentMap extends ViewMap {

	private MapController controller;

	public ViewOpponentMap(Map m) {
		super(m);
		controller = new MapController();
		this.addMouseListener(controller);
	}

	@Override
	public void draw(Graphics g) {
		// ne fait rien
	}

	public MapController getController() {
		return controller;
	}
}
