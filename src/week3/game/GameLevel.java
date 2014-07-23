package week3.game;

abstract public class GameLevel {
	String gameLevel;
	
	public abstract void simpleAttack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
	
	public void play(){
		System.out.println("====== "+gameLevel +"start ======");
		simpleAttack();
		turnAttack();
		flyingAttack();
		System.out.println("====== "+gameLevel +"end ======\n");
	}

	public void setGameLevel(String gameLevel) {
		this.gameLevel = gameLevel;
	}
	
	public String getGameLevel(){
		return this.gameLevel;
	}
}
