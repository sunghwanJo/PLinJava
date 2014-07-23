package week3.game;

public class GameLevel2 extends GameLevel{
	private static GameLevel2 instance; 
	
	public GameLevel2(){
		setGameLevel("level2");
	}
	
	static public GameLevel2 getInstance(){
		if(instance == null)
			instance = new GameLevel2();
		return instance;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println(getGameLevel() + " simple attack : 메롱~ 메롱~");
	}

	@Override
	public void turnAttack() {
		System.out.println(getGameLevel() + " turn attack : 돌려차기 쓍~~~");		
	}

	@Override
	public void flyingAttack() {
		System.out.println(getGameLevel() + " flying attack : 이 못하지롱");
	}
}
