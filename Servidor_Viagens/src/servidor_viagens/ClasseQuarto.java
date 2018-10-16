/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor_viagens;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author rubens
 */
public class ClasseQuarto {
    int tamanho;
    List<ClasseReservaQuarto> datasReservadas;    
    String localidade;
    Double precoQuarto;
    ClasseReservaQuarto datas;
    
    public ClasseQuarto(int tamanho, String localidade, Double precoQuarto, Date dataEntrada, Date dataSaida){
        this.datasReservadas = new ArrayList<ClasseReservaQuarto>();
        
        this.tamanho = tamanho;
        this.localidade = localidade;
        this.precoQuarto = precoQuarto;
        
        this.datas.dataEntrada = dataEntrada;
        this.datas.dataSaida = dataSaida;
       
        this.datasReservadas.add(this.datas);
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public List<ClasseReservaQuarto> getDatasReservadas() {
        return datasReservadas;
    }

    public void setDatasReservadas(List<ClasseReservaQuarto> datasReservadas) {
        this.datasReservadas = datasReservadas;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public Double getPrecoQuarto() {
        return precoQuarto;
    }

    public void setPrecoQuarto(Double precoQuarto) {
        this.precoQuarto = precoQuarto;
    }
    
    
}
