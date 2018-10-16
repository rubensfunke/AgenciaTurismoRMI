/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor_viagens;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rubens
 */
public class ClasseVoo {
    Date dataVoo;
    int qtdLugares;
    int passagensVendidas;
    String origem;
    String destino;
    Double precoVoo;
    
    public ClasseVoo(String dataVoo, int qtdLugares, int passagensVendidas, String origem, String destino, Double precoVoo) throws ParseException{
        
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = (Date)formatter.parse(dataVoo);
        
        this.qtdLugares = qtdLugares;
        this.dataVoo = date;
        this.passagensVendidas = passagensVendidas;
        this.origem = origem;
        this.destino = destino;
        this.precoVoo = precoVoo;
    }

    public Date getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(Date dataVoo) {
        this.dataVoo = dataVoo;
    }

    public int getQtdLugares() {
        return qtdLugares;
    }

    public void setQtdLugares(int qtdLugares) {
        this.qtdLugares = qtdLugares;
    }

    public int getPassagensVendidas() {
        return passagensVendidas;
    }

    public void setPassagensVendidas(int passagensVendidas) {
        this.passagensVendidas = passagensVendidas;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String Destino) {
        this.destino = Destino;
    }

    public Double getPrecoVoo() {
        return precoVoo;
    }

    public void setPrecoVoo(Double precoVoo) {
        this.precoVoo = precoVoo;
    }
    
    
}
