package games.rookDefenders.tower.core;

import games.rookDefenders.Cell;

public class DommageRangeTower extends RangeTower {

	private int dommage;

	public DommageRangeTower(Cell cellule, int cost, String name, int rangeMin, int rangeMax, int dommage1) {
		super(cellule, cost, name, rangeMin, rangeMax);
		dommage = dommage1;
	}

	@Override
	public void action() {
		//TODO TAPER pvDecrease
	}

}
