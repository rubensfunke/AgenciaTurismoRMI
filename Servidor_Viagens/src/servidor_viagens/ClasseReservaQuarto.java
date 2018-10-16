/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor_viagens;

import java.util.Date;

/**
 *
 * @author rubens
 */
public class ClasseReservaQuarto {
    
    Date dataEntrada;
    Date dataSaida; 
    
    public ClasseReservaQuarto(Date dataEntrada, Date dataSaida){
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;        
    }
    
    public ClasseReservaQuarto(){
       
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }   
}
