package de.saginfo.labyrind.game;

import static de.saginfo.labyrind.game.GameScreen.GAMESCREEN_SINGLETON;
import de.saginfo.labyrind.grafik.SpriteVisual;

/**
 * 
 */
public class Game {
    
    public Game() {
        //Test Graphics
        
        SpriteVisual test2 = new SpriteVisual("img\\map\\edge.png");
        test2.setZIndex(2);
        GAMESCREEN_SINGLETON.renderSystem.addSprite(test2);
        
        SpriteVisual test3 = new SpriteVisual("img\\map\\dot.png");
        test3.setPosition(144, 0);
        test3.setZIndex(3);
        GAMESCREEN_SINGLETON.renderSystem.addSprite(test3);
        
        SpriteVisual test1 = new SpriteVisual("img\\map\\bg.png");
        test1.setZIndex(0);
        GAMESCREEN_SINGLETON.renderSystem.addSprite(test1);
    }
    
    public void update(float delta){
        
    }
    
    /**called when the user closes the window*/
    public void close(){
        
    }
}
