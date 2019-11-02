package games.rookDefenders.tower.core;

import games.rookDefenders.*;
import games.rookDefenders.Cell;

public abstract class GeneratorRessourceTower extends Tower{

	private int giveRessource;

	public GeneratorRessourceTower(Cell cellule, int cost, String name, int giveRessource) {
		super(cellule, cost, name);
		this.giveRessource = giveRessource;
	}

	public int getGiveRessource() {
		return giveRessource;
	}

	public void setGiveRessource(int giveRessource) {
		this.giveRessource = giveRessource;
	}

	public void action(){
		World4.setRessources(World4.getRessources()+this.giveRessource);
	}




}
