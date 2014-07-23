package week3.game;

public class GameLevel1 extends GameLevel{
	private static GameLevel1 instance; 
	
	public GameLevel1(){
		setGameLevel("level1");
	}
	
	static public GameLevel1 getInstance(){
		if(instance == null)
			instance = new GameLevel1();
		return instance;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println(getGameLevel() + " simple attack : 메롱~~~");
	}

	@Override
	public void turnAttack() {
		System.out.println(getGameLevel() + " turn attack : 못하지롱");		
	}

	@Override
	public void flyingAttack() {
		System.out.println(getGameLevel() + " flying attack : 이것도 못하지롱");
	}

}
