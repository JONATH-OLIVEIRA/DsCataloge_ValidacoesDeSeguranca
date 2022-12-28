package com.devsuperior.dscatalog.dto;

import java.io.Serializable;

import com.devsuperior.dscatalog.entities.Role;

public class RoleDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String Authority;


	public RoleDTO(){
	}

	public RoleDTO(Long id, String authority) {
		super();
		this.id = id;
		Authority = authority;
	}

	public RoleDTO(Role role) {
		super();
		this.id = role.getId();
		Authority = role.getAuthority();
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthority() {
		return Authority;
	}

	public void setAuthority(String authority) {
		Authority = authority;
	}


}
