/*
NIM:10116502
NAMA:KEN WITE ARIING CAHYU
KELAS: PBO-11
 */
package latihanmvcjdbc.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import latihanmvcjdbc.impl.PelangganDaoImpl;
import latihanmvcjdbc.service.PelangganDao;

/**
 *
 * @author ASUS
 */
public class KingsBarbershopDatabase {
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    
    public static Connection getConnection() throws SQLException{
        if (connection==null){
            MysqlDataSource dataSource= new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        
        return connection;
        
    }
    
    public static PelangganDao getPelangganDao() throws SQLException{
    
            if(pelangganDao==null){
            pelangganDao = new PelangganDaoImpl(getConnection());
    }
            return pelangganDao;
            
}
    
}
