package metier.entities;

import java.util.ArrayList;

public class Engine extends Composant {
	private ArrayList<ComponentEngine> componentEngines;

	public ArrayList<ComponentEngine> getComponentEngines() {
		return componentEngines;
	}

	public void setComponentEngines(ArrayList<ComponentEngine> componentEngines) {
		this.componentEngines = componentEngines;
	}
	
	
}
