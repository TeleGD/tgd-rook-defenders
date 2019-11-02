package games.rookDefenders;

import java.io.File;
import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import games.rookDefenders.tower.core.*;

public class World extends BasicGameState{

	public static int ID=4;

	public final static String GAME_NAME="Rook Defenders";
	public final static String GAME_FOLDER_NAME="rookDefenders";
	public final static String DIRECTORY_SOUNDS="sounds"+File.separator+GAME_FOLDER_NAME+File.separator;
	public final static String DIRECTORY_MUSICS="musics"+File.separator+GAME_FOLDER_NAME+File.separator;
	public final static String DIRECTORY_IMAGES="images"+File.separator+GAME_FOLDER_NAME+File.separator;

	private static ArrayList<Ennemy> ennemy;
	private static ArrayList<Tower> tower;
	private static int score;
	private static int ressources;
	private static Map map;

	@Override
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		//Ici ne mettre que des initialisations de variables


	}

	@Override
	public void enter(GameContainer arg0, StateBasedGame arg1){
		//Ici mettre tous les chargement d'image, creation de perso/decor et autre truc qui mettent du temps
		ennemy = new ArrayList<Ennemy>();
		tower = new ArrayList<Tower>();
		//ennemy.add(new Ennemy());
		map = new Map();
	}


	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics arg2) throws SlickException {
		//Affichage
		/*
		arg2.setColor(Color.white);
		labyrinth.render(arg0, arg1, arg2);
		arg2.drawString("Bonjour 1", 500, 400);
		player.render(arg0, arg1, arg2);
		*/
		map.render(arg0, arg1, arg2);

	}

	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException {
		// TODO Auto-generated method stub
	}

	@Override
	public int getID() {
		return ID;
	}

	public static void reset() {
		// TODO Auto-generated method stub
	}

	public static int  getScore() {
		return score;
	}

	public static void setScore(int score) {
		World.score = score;
	}

	public static void setRessources(int amount){
		ressources = amount;
	}

	public static int getRessources(){
		return ressources;
	}

}
