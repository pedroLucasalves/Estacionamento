/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the edior.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Pedro
 */
public class Conexao {

    private static Connection conexao;

    public static Connection connection;

    public static Connection getConexao() {
        try {
            if (conexao == null || conexao.isClosed()) {
                conexao = conectar();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return conexao;
    }

    private static Connection conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/estacionamento", "postgres", "123456");
        } catch (ClassNotFoundException e) {
            System.out.println("a aplicacao  nao contem no driver para o banco");
            return null;
        }catch(SQLException e){
            System.out.println("erro no banco verifique o url ou nome e senha");
            return null;
        }
    }

}
