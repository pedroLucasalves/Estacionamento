/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import classededados.Estacionamento;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Pedro
 */
public class EstacionamentoDAO {

    public void incluir(Estacionamento parametro) throws SQLException {
        //criando a conexão com o banco
        Connection cnn = conexao.Conexao.getConexao();
        //cria a introducao SQL para inserçao no banco
        String sql = "INSERT INTO veiculos.estacionamento"
                + "(codigo,  id_veiculo, data_entrada) VALUES"
                + "(?,?, now());";

        //criando o procedimento armazenado a partir da conexao
        PreparedStatement ps = cnn.prepareStatement(sql);
        //seta os valores para o procedimentos
        ps.setInt(1, parametro.getCodigo());
        ps.setString(2, parametro.getIdVeiculo());
        //ps.setDate(3, (Date) parametro.getdataHoraDeEntrada());
        //executa o programa no banco
        ps.execute();
        cnn.close();

    }

    public void alterar(Estacionamento parametro) throws SQLException {
        String sql = "UPDATE veiculos.estacionamento SET id_veiculo = ?,data_saida = now(),valor = ?,"
                + " WHERE codigo = ?;";

        Connection cnn = conexao.Conexao.getConexao();
        PreparedStatement psd = cnn.prepareStatement(sql);

        psd.setString(1, parametro.getIdVeiculo());
        psd.setDate(2, (Date) parametro.getdataHoraDeEntrada());
        psd.setDate(3, (Date) parametro.getdataHoraDeSaida());
        psd.setDouble(4, parametro.getValor());
        psd.setInt(5, parametro.getCodigo());

        cnn.close();
        psd.close();
    }

    public Estacionamento consultar(int codigo) throws SQLException {
        String sql = "SELECT * FROM veiculos.estacionamento WHERE codigo = ?;";
        Connection cnn = conexao.Conexao.getConexao();
        PreparedStatement psd = cnn.prepareStatement(sql);
        psd.setInt(1, codigo);

        ResultSet rs = psd.executeQuery();

        Estacionamento objeto = null;
        if (rs.next()) {
            objeto = new Estacionamento();
            objeto.setCodigo(rs.getInt("codigo"));
            objeto.setIdVeiculo(rs.getString("id_veiculo"));
            objeto.setdataHoraDeEntrada(rs.getDate("data_entrada"));
            objeto.setdataHoraDeSaida(rs.getDate("data_saida"));
            objeto.setValor(rs.getInt("valor"));
        }
        psd.close();
        rs.close();
        cnn.close();
        return objeto;
    }
}
