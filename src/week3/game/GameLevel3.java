package week3.game;

public class GameLevel3 extends GameLevel{
	private static GameLevel3 instance; 
	
	public GameLevel3(){
		setGameLevel("level3");
	}
	
	static public GameLevel3 getInstance(){
		if(instance == null)
			instance = new GameLevel3();
		return instance;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println(getGameLevel() + " simple attack : 메롱~ 메롱~ 메롱~");
	}

	@Override
	public void turnAttack() {
		System.out.println(getGameLevel() + " turn attack : 뒤돌려차기 앞돌려차기");		
	}

	@Override
	public void flyingAttack() {
		System.out.println(getGameLevel() + " flying attack : 날라차기 휙~~~");
	}
}
