package com.springcurso.domain;

import java.util.ArrayList;
import java.util.List;

import com.springcurso.domain.enums.RequestState;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor //CONSTRUTOR SEM ASGS
@AllArgsConstructor//CONSTRUTOR COM ARGS
@Getter @Setter
public class User {
	
	private Long id;
	private String name;
	private String email;
	private String password;
	//USUARIO TEM UM LISTA DE PEDIDO:
	private List<Request> requests = new ArrayList<Request>();
	//UM USUARIO TEM UMA LISTA DE ESTAGIO
	private List<RequestState> states = new ArrayList<RequestState>();
	
	
	
	



	

	
	
	

	
	
	
	
	
	
	

}
