/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor_viagens;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author rubensFunke
 */
public class Servidor_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Servidor_Main servidor = new Servidor_Main();

        try {
            InterfaceServidorImp serverInterface = new InterfaceServidorImp();
            Registry registro = LocateRegistry.createRegistry(8080);
            registro.bind("server", serverInterface);
            System.out.println("Servidor pronto");
            new telaServidor(serverInterface);
        } catch (Exception e) {
            System.out.println("Servidor fora de serviço!!!");
        }

    }

}
