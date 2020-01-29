package games.rookDefenders.tower.towers;

import games.rookDefenders.Cell;
import games.rookDefenders.World;
import games.rookDefenders.tower.core.GeneratorRessourceTower;

public class BasicRessourceTower extends GeneratorRessourceTower {

	public BasicRessourceTower(World world, Cell cellule) {
		super(world,cellule,5,"BasicRessourceTower",1);
	}

}
