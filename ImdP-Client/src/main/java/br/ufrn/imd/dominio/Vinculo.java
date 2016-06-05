package br.ufrn.imd.dominio;

import java.io.Serializable;
import java.util.Collection;

public class Vinculo implements Serializable {
	private static final long serialVersionUID = 118938217482360981L;

	private int idVinculo;
	private String descricao;

//	@JoinColumn(name = "idCargo")
	private Cargo cargo;

//	@JoinColumn(name = "idSetor")
	private Setor setor;

//	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	private Collection<Ponto> pontos;
	
//	@JoinColumn(name = "idPermissao")
	private Permissao permissao;
	
	private Collection<JustificativaFalta> justificativas;

	private int cargaHorariaDiaria;
	private int cargaHorariaSemanal;
	private int cargaHorariaMensal;
	private char situacao;

	public int getIdVinculo() {
		return idVinculo;
	}

	public void setIdVinculo(int idVinculo) {
		this.idVinculo = idVinculo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public int getCargaHorariaDiaria() {
		return cargaHorariaDiaria;
	}

	public void setCargaHorariaDiaria(int cargaHorariaDiaria) {
		this.cargaHorariaDiaria = cargaHorariaDiaria;
	}

	public int getCargaHorariaSemanal() {
		return cargaHorariaSemanal;
	}

	public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
		this.cargaHorariaSemanal = cargaHorariaSemanal;
	}

	public int getCargaHorariaMensal() {
		return cargaHorariaMensal;
	}

	public void setCargaHorariaMensal(int cargaHorariaMensal) {
		this.cargaHorariaMensal = cargaHorariaMensal;
	}

	public char getSituacao() {
		return situacao;
	}

	public void setSituacao(char situacao) {
		this.situacao = situacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Collection<Ponto> getPontos() {
		return pontos;
	}

	public void setPontos(Collection<Ponto> pontos) {
		this.pontos = pontos;
	}

	public Permissao getPermissao() {
		return permissao;
	}

	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}

	public Collection<JustificativaFalta> getJustificativas() {
		return justificativas;
	}

	public void setJustificativas(Collection<JustificativaFalta> justificativas) {
		this.justificativas = justificativas;
	}
	

}
