/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classededados;

import java.util.Date;

/**
 *
 * @author Pedro
 */
public class Estacionamento {

    private Date dataHoraDeEntrada;
    private Date dataHoraDeSaida;

    public Date getdataHoraDeEntrada() {
        return dataHoraDeEntrada;
    }

    public void setdataHoraDeEntrada(Date hrDeEntrada) {
        this.dataHoraDeEntrada = hrDeEntrada;
    }

    public Date getdataHoraDeSaida() {
        return dataHoraDeSaida;
    }

    public void setdataHoraDeSaida(Date hrDeSaida) {
        this.dataHoraDeSaida = hrDeSaida;
    }
    public Double calcularValor(){
        Date dataAtual = new Date();
        long dif = dataAtual.getTime() - dataHoraDeEntrada.getTime();
        long difHours = dif / (60 * 60 * 1000)%24;
        return difHours * 6.0;
    }
}
