/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.saginfo.labyrind.client;

import com.esotericsoftware.kryonet.Client;
import de.saginfo.labyrind.client.networkData.*;
import java.io.IOException;

/**
 *
 * @author sreis
 */
public class GameClient extends Client {

    private final int TIMEOUT = 5000;
    private final int TCP_PORT = 54777;
    private final int UDP_PORT = 54779;

    public GameClient() {
        registerClasses();
    }
    
    public void connectToServer(String ip) throws IOException {
        super.start();
        super.connect(TIMEOUT, ip, TCP_PORT, UDP_PORT);
    }
    
    private void registerClasses(){
        getKryo().register(Connect.class);
    }
}
