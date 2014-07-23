package week3;

import week3.game.GameLevel;
import week3.game.GameLevel1;
import week3.game.GameLevel2;
import week3.game.GameLevel3;

public class Player {
	GameLevel game;
	
	Player(){
		game = GameLevel1.getInstance();
	}
	
	public void upgradeLevel(){
		if (game instanceof GameLevel1) {
			game = GameLevel2.getInstance();
		}else if(game instanceof GameLevel2){
			game = GameLevel3.getInstance();
		}else{
			System.out.println("더 이상 업그레이드할 게임이 없음");
		}
	}
	
	public GameLevel getGameLevel(){
		return game;
	}

	public void attack() {
		game.play();
	}
}
