package mx.com.ragnacode.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.com.ragnacode.beans.Marca;

import java.sql.Connection;

import java.sql.PreparedStatement;

@Repository
public class DAOMarcaImpl implements DAOMarca{

	@Autowired
	private DataSource dataSource;
	
	public void registrar(Marca marca) throws Exception {
		String sql = "INSERT INTO marca(identificador,marcacol) values (?,?)";
		Connection con = null;
		
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, marca.getIdentificador());
			ps.setString(2, marca.getNombre());
			ps.executeUpdate();
			ps.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			if(con != null) {
				con.close();
			}
		}
		
	}

}
