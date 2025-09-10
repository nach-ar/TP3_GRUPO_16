package dao;

import entidad.Categoria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DaoCategoria {

    private String host = "jdbc:mysql://localhost:3306/";
    private String user = "root";
    private String pass = "root";
    private String dbName = "bdinventario";

    public DaoCategoria() {}

    public int agregarCategoria(Categoria categoria) {

        String query = "INSERT INTO categorias(IdCategoria, Nombre) VALUES ('"+categoria.getId()+"', '"+categoria.getNombre()+"')";
        Connection cn = null;
        int filas = 0;

        try {
            cn = DriverManager.getConnection(host + dbName, user, pass);
            Statement st = cn.createStatement();
            filas = st.executeUpdate(query);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return filas;
    }
}
