/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import classededados.Veiculo;
import java.sql.SQLException;
import persistencia.veiculoDAO;

/**
 *
 * @author Pedro
 */
public class Teste {
    public static void main(String [] args) throws SQLException, Exception{
        Veiculo inclui = new Veiculo();
        veiculoDAO per = new veiculoDAO();
        
        //incluir na tabela
        inclui.setPlaca("xxx-0000");
        inclui.setMarca("marca");
        inclui.setModelo("modelo");
        per.incluir(inclui);
    }
}
