package com.springcurso.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.springcurso.domain.enums.RequestState;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter 
public class Request {
	
	private Long id;
	
	private String subject;
	
	private String description;
	
	private Date creationDate;
	
	//TEM UM STATUS
	private RequestState state;
	
	//TEM UM USUARIO
	private User user;
	
	//TEM UMA LISTA DE  STAGIO
	private List<RequestStage> stages = new ArrayList<RequestStage>();

}
