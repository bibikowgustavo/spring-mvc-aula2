package br.usjt.arqsw.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.arqsw.dao.LoginDAO;
import br.usjt.arqsw.entity.Login;

/***
 * 
 * @author Gustavo Capistrano Bibikow 816118817  20/03/2018
 */


@Service
public class LoginService {
	private LoginDAO dao;
	
	@Autowired
	public LoginService(LoginDAO dao){
		this.dao = dao;
	}
	
	public boolean validarLogin(Login login) throws IOException{
		return dao.validarLogin(login);
	}
}
