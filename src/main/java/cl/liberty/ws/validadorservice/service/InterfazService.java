package cl.liberty.ws.validadorservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.liberty.ws.validadorservice.dao.IInterfazDAO;
import cl.liberty.ws.validadorservice.entity.Interfaz;

@Service
public class InterfazService implements IInterfazService {
	@Autowired
	private IInterfazDAO interfazDAO;

	@Override
	public List<Interfaz> getAllArticles() {
		return interfazDAO.getAllArticles();
	}
}
