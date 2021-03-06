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

    private int codigo;
    private String idVeiculo;
    private Date dataHoraDeEntrada;
    private Date dataHoraDeSaida;
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(String idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

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

    public Double calcularValor() {
        Date dataAtual = new Date();
        long dif = dataAtual.getTime() - dataHoraDeEntrada.getTime();
        long difHours = dif / (60 * 60 * 1000) % 24;
        return difHours * 6.0;
    }
}
