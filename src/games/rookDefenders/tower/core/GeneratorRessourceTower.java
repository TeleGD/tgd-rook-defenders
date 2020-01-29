package games.rookDefenders.tower.core;

import games.rookDefenders.Cell;
import games.rookDefenders.World;

public abstract class GeneratorRessourceTower extends Tower {

	private World world;
	private int giveRessource;

	public GeneratorRessourceTower(World world, Cell cellule, int cost, String name, int giveRessource) {
		super(cellule, cost, name);
		this.world = world;
		this.giveRessource = giveRessource;
	}

	public int getGiveRessource() {
		return giveRessource;
	}

	public void setGiveRessource(int giveRessource) {
		this.giveRessource = giveRessource;
	}

	public void action() {
		this.world.setRessources(this.world.getRessources()+this.giveRessource);
	}

}
