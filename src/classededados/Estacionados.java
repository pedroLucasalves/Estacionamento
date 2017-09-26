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
public class Estacionados {
    private  int codigoVaga;
    private  Date hrDeEntrada;
    private Date hrDeSaida;
    

    public int getCodigoVaga() {
        return codigoVaga;
    }

    public void setCodigoVaga(int codigoVaga) {
        this.codigoVaga = codigoVaga;
    }

    public Date getHrDeEntrada() {
        return hrDeEntrada;
    }

    public void setHrDeEntrada(Date hrDeEntrada) {
        this.hrDeEntrada = hrDeEntrada;
    }

    public Date getHrDeSaida() {
        return hrDeSaida;
    }

    public void setHrDeSaida(Date hrDeSaida) {
        this.hrDeSaida = hrDeSaida;
    }

    public int getNumeroDeVaga() {
        return codigoVaga;
    }

    public void setNumeroDeVaga(int numeroDeVaga) {
        this.codigoVaga = numeroDeVaga;
    }
    
    
}
