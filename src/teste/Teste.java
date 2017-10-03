/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import classededados.Estacionamento;
import classededados.Veiculo;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import persistencia.veiculoDAO;

/**
 *
 * @author Pedro
 */
public class Teste {

    public static void main(String[] args) throws SQLException, Exception {
        Veiculo inclui = new Veiculo();
        veiculoDAO per = new veiculoDAO();
        Estacionamento est = new Estacionamento();

        java.sql.Date data = null;
        java.util.Date dataUtil = new java.util.Date();
        java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());

//        Date data2 = new Date();
//        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
//        formatador.format("22/02/2017");

        est.setIdVeiculo("XXX-1233");
        est.setValor(6);
        
        //est.setdataHoraDeEntrada(dataSql);
        //        //incluir na tabela
        ////        inclui.setPlaca("xxx-0000");
        //        inclui.setMarca("marca");
        //        inclui.setModelo("modelo");
              //  per.incluir(inclui);

        //inclui
    }
}
