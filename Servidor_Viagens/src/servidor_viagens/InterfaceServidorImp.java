/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor_viagens;

import Comunica.InterfaceCliente;
import Comunica.InterfaceServidor;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author a1555960
 */
public class InterfaceServidorImp extends UnicastRemoteObject implements InterfaceServidor{
    
    public InterfaceServidorImp() throws RemoteException{
        super();
    }

    @Override
    public void chama(String mensagem, InterfaceCliente referencia) throws RemoteException {
        System.out.println("Escutei a mensagem:" + mensagem);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
