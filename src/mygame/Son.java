package mygame;

import com.jme3.app.Application;
import com.jme3.app.state.AppStateManager;
import com.jme3.audio.AudioNode;

/**
 * Les sons du jeu
 * @author Simon Quentin
 */
public class Son extends Scene{
    
    private AudioNode music;    
    private AudioNode sonTir;
    private AudioNode sonReload;
    private AudioNode sonTakeDommage;
    private AudioNode sonEnnemieDie;
    private AudioNode sonEnnemieTir;
    private AudioNode sonGrenade;
    
    
    /**
     * Initialise les sons
     * @param stateManager Le gestionnaire d'état
     * @param app L'application du jeu
     */
    public Son(AppStateManager stateManager, Application app){
        initialize(stateManager, app);
        
        this.sonTir = new AudioNode(assetManager, "Sounds/tir.ogg");
        this.sonTir.setLooping(false);
        this.sonTir.setVolume(0.6f);
        
        this.sonReload = new AudioNode(assetManager, "Sounds/reload.ogg");
        this.sonReload.setLooping(false);
        this.sonReload.setVolume(0.4f);
        
        this.sonTakeDommage = new AudioNode(assetManager, "Sounds/aie.ogg");
        this.sonTakeDommage.setLooping(false);
        this.sonTakeDommage.setVolume(0.4f);
        
        this.sonEnnemieDie = new AudioNode(assetManager, "Sounds/vilainDie.ogg");
        this.sonEnnemieDie.setLooping(false);
        this.sonEnnemieDie.setVolume(0.4f);
        
        this.sonEnnemieTir = new AudioNode(assetManager, "Sounds/vilainShoot.ogg");
        this.sonEnnemieTir.setLooping(false);
        this.sonEnnemieTir.setVolume(0.4f);
        
        this.sonGrenade = new AudioNode(assetManager, "Sounds/grenade.ogg");
        this.sonGrenade.setLooping(false);
        this.sonGrenade.setVolume(0.4f);
            
        this.music = new AudioNode(assetManager, "Sounds/ambiance.ogg");
        this.music.setLooping(true);
        this.music.setVolume(0.2f);
        this.music.play();
    }
    
    
    /**
     * Bruit lorsque le joueur tir
     */
    public void playTir(){
        this.sonTir.play();
    }
    
    /**
     * Bruit lorsqu'un ennemie meurt
     */
    public void playEnnemieDie(){
        this.sonEnnemieDie.play();
    }
    
    /**
     * Bruit lorsque le joueur prend un dommage
     */
    public void playTakeDommage(){
        this.sonTakeDommage.play();
    }
    
    /**
     * Bruit lorsqu'une grenade explose
     */
    public void playGrenade(){
        this.sonGrenade.play();
    }
    
    /**
     * Bruit lorsqu'un ennemie tir
     */
    public void playEnnemieTir(){
        this.sonEnnemieTir.play();
    }
    
    /**
     * Bruit lorsque le joueur recharge son arme
     */
    public void playReload(){
        this.sonReload.play();
    }
}
