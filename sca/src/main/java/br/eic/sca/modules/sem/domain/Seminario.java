package br.eic.sca.modules.sem.domain;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="sem_seminario")
@Entity(name="Seminario")
public class Seminario implements Comparable<Seminario>
{
	//
	// Atributos Mapeados
	//	
	@Id    
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String titulo;
	
	@Column
	private String resumo;
	

	@Column(name="data")
	private Date data;
	
	@Column(name="hora_inicio")
	private LocalTime horaInicio;	
	
	@Column(name="hora_fim")
	private LocalTime horaFim;
	
	@Column(name="palavras_chave")
	private String palavra_chave;
	
	@Column
	private String palestrantes;
	
	//
	// Métodos de Acesso
	//
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getPalavra_chave() {
		return palavra_chave;
	}
	public void setPalavra_chave(String palavra_chave) {
		this.palavra_chave = palavra_chave;
	}
	public String getPalestrantes() {
		return palestrantes;
	}
	public void setPalestrantes(String palestrantes) {
		this.palestrantes = palestrantes;
	}
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}
	public LocalTime getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(LocalTime horaFim) {
		this.horaFim = horaFim;
	}
	
	//
	// Métodos Auxiliares
	//
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seminario other = (Seminario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	@Override
	public int compareTo(Seminario o) 
	{
		return id.compareTo(o.id);
	}
	
	@Override
	public String toString() {
		return "Seminario [id=" + id + ", titulo=" + titulo + ", resumo=" + resumo + ", data=" + data + ", horaInicio="
				+ horaInicio + ", horaFim=" + horaFim + ", palavra_chave=" + palavra_chave + ", palestrantes="
				+ palestrantes + "]";
	}
	
	
}








