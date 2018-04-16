package de.saginfo.labyrind.ui.connectScreen;

import com.badlogic.gdx.Gdx;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import de.saginfo.labyrind.LabyRindMain;
import de.saginfo.labyrind.client.networkData.Connect;
import de.saginfo.labyrind.game.GameScreen;

/**
 *
 * @author sreis
 */
public class ConnectSystem extends Listener {

    public ConnectSystem() {
    }

    @Override
    public void received(Connection connection, Object object) {
        if (object instanceof Connect) {
            Gdx.app.postRunnable(new Runnable() {
                public void run() {
                    LabyRindMain.GAME_SINGLETON.setScreen(new GameScreen());
                }
            });
        }
    }
}
