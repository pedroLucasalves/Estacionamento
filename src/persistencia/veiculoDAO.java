/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import classededados.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Pedro
 */
public class veiculoDAO {
    //  iniciando o metodo incluir
    public void incluir(Veiculo parametro) throws Exception{
        //criando a conexão com o banco
        Connection cnn = conexao.Conexao.getConexao();
        //cria a introducao SQL para inserçao no banco
        String sql = "INSERT INTO veiculos.veiculo" 
                     + "(placa,marca,modelo) VALUES"
                     + "(?,?,?);";
        
        //criando o procedimento armazenado a partir da conexao
        PreparedStatement ps = cnn.prepareStatement(sql);
        //seta os valores para o procedimentos
        ps.setString(1,parametro.getPlaca());
        ps.setString(2,parametro.getMarca());
        ps.setString(3, parametro.getModelo());
        //executa o programa no banco
        ps.execute();
        cnn.close();
        
        
    }
     public ArrayList<Veiculo> listar() throws SQLException {
        String sql = "SELECT * FROM tipoassociado WHERE codigo = ?;";
        Connection cnn = conexao.Conexao.getConexao();
        Statement stm = cnn.createStatement();
        ResultSet rs = stm.executeQuery(sql);

        ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
        while (rs.next()) {
            Veiculo objeto = new Veiculo();
            objeto.setPlaca(rs.getString("placa"));
            objeto.setMarca(rs.getString("marca"));
            objeto.setModelo(rs.getString("modelo"));
            lista.add(objeto);
        }
        stm.close();
        rs.close();
        cnn.close();
        return lista;

    }
    
}
