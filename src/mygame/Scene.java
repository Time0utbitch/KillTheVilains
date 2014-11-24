package mygame;

import com.jme3.app.Application;
import com.jme3.app.SimpleApplication;
import com.jme3.app.state.AbstractAppState;
import com.jme3.app.state.AppStateManager;
import com.jme3.asset.AssetManager;
import com.jme3.bullet.BulletAppState;
import com.jme3.input.InputManager;
import com.jme3.scene.Node;


/**
 * Contient toutes les informations de la scène principale
 * @author Marcello
 */
public abstract class Scene extends AbstractAppState {
    protected SimpleApplication app;
    protected AssetManager assetManager; 
    protected Node rootNode;
    protected BulletAppState physics;
    protected AppStateManager stateManager;
    protected InputManager inputManager;

    @Override
    public void initialize(AppStateManager stateManager, Application app) {
      this.app = (SimpleApplication)app;
      this.assetManager = this.app.getAssetManager();
      this.rootNode = this.app.getRootNode();
      this.stateManager = this.app.getStateManager();
      this.physics = this.stateManager.getState(BulletAppState.class);
      this.inputManager = this.app.getInputManager();
     }  
}
