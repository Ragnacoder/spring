package mx.com.ragnacode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.ragnacode.beans.Marca;
import mx.com.ragnacode.dao.DAOMarca;

@Service
public class ServiceMarcaImpl implements ServiceMarca{
	
	@Autowired
	DAOMarca daoMarca;
	
	public void registrar(Marca marca) throws Exception {
		
		try {
			
			daoMarca.registrar(marca);
			
		}catch(Exception ex) {
			throw ex;
		}
		
	}

}
