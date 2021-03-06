package br.ufrn.imd.dominio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Permissao implements Serializable {
	private static final long serialVersionUID = -6715065336143175013L;

	private int idPermissao;

	private String descricao;

	public Permissao() {
		super();
	}

	public Permissao(int idPermissao, String descricao) {
		super();
		this.idPermissao = idPermissao;
		this.descricao = descricao;
	}

	public Permissao(String descricao) {
		super();
		this.descricao = descricao;
	}

	public int getIdPermissao() {
		return idPermissao;
	}

	public void setIdPermissao(int idPermissao) {
		this.idPermissao = idPermissao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
