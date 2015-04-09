/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import upnp.IPUtil;
import upnp.UPnP;

/**
 *
 * @author mouadh
 */
public class UpnpPortForwarding {
    
    private int port;

    public UpnpPortForwarding() {
    }

    public UpnpPortForwarding(int port) {
        this.port = port;
        
        IPUtil.printExternalIP();
	IPUtil.printInternalIP();
        
        UPnP.RegisterPort(port);
    }
    
    
}
