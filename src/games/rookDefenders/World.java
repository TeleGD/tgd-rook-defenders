package games.rookDefenders;

import java.io.File;
import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

import games.rookDefenders.tower.core.Tower;

public class World extends BasicGameState{

	public final static String GAME_NAME="Rook Defenders";
	public final static String GAME_FOLDER_NAME="rookDefenders";
	public final static String DIRECTORY_SOUNDS="/sounds"+File.separator+GAME_FOLDER_NAME+File.separator;
	public final static String DIRECTORY_MUSICS="/musics"+File.separator+GAME_FOLDER_NAME+File.separator;
	public final static String DIRECTORY_IMAGES="/images"+File.separator+GAME_FOLDER_NAME+File.separator;

	private ArrayList<Ennemy> ennemy;
	private ArrayList<Tower> tower;
	private int score;
	private int ressources;
	private Map map;

	private int ID;
	private int state;

	public World(int ID) {
		this.ID = ID;
		this.state = 0;
	}

	@Override
	public int getID() {
		return this.ID;
	}

	@Override
	public void init(GameContainer container, StateBasedGame game) {
		/* Méthode exécutée une unique fois au chargement du programme */
	}

	@Override
	public void enter(GameContainer container, StateBasedGame game) {
		/* Méthode exécutée à l'apparition de la page */
		if (this.state == 0) {
			this.play(container, game);
		} else if (this.state == 2) {
			this.resume(container, game);
		}
	}

	@Override
	public void leave(GameContainer container, StateBasedGame game) {
		/* Méthode exécutée à la disparition de la page */
		if (this.state == 1) {
			this.pause(container, game);
		} else if (this.state == 3) {
			this.stop(container, game);
			this.state = 0; // TODO: remove
		}
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) {
		/* Méthode exécutée environ 60 fois par seconde */
		Input input = container.getInput();
		if (input.isKeyDown(Input.KEY_ESCAPE)) {
			this.setState(1);
			game.enterState(2, new FadeOutTransition(), new FadeInTransition());
		}
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics context) {
		/* Méthode exécutée environ 60 fois par seconde */
		/*
		arg2.setColor(Color.white);
		labyrinth.render(arg0, arg1, arg2);
		arg2.drawString("Bonjour 1", 500, 400);
		player.render(arg0, arg1, arg2);
		*/
		map.render(container, game, context);

	}

	public void play(GameContainer container, StateBasedGame game) {
		/* Méthode exécutée une unique fois au début du jeu */
		ennemy = new ArrayList<Ennemy>();
		tower = new ArrayList<Tower>();
		//ennemy.add(new Ennemy());
		map = new Map();
	}

	public void pause(GameContainer container, StateBasedGame game) {
		/* Méthode exécutée lors de la mise en pause du jeu */
	}

	public void resume(GameContainer container, StateBasedGame game) {
		/* Méthode exécutée lors de la reprise du jeu */
	}

	public void stop(GameContainer container, StateBasedGame game) {
		/* Méthode exécutée une unique fois à la fin du jeu */
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getState() {
		return this.state;
	}

	public int  getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setRessources(int amount) {
		ressources = amount;
	}

	public int getRessources(){
		return ressources;
	}

}
