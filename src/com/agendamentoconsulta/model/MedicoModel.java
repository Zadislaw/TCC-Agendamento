package com.agendamentoconsulta.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MedicoModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	Integer crmMedico;
	String 	nmMedico;
	String 	nmEspecialidade;
	
	public MedicoModel(){
		
	}
	
			
	public MedicoModel(Integer crmMedico, String nmMedico, String nmEspecialidade) {
		this.crmMedico = crmMedico;
		this.nmMedico = nmMedico;
		this.nmEspecialidade = nmEspecialidade;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((crmMedico == null) ? 0 : crmMedico.hashCode());
		result = prime * result + ((nmEspecialidade == null) ? 0 : nmEspecialidade.hashCode());
		result = prime * result + ((nmMedico == null) ? 0 : nmMedico.hashCode());
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
		MedicoModel other = (MedicoModel) obj;
		if (crmMedico == null) {
			if (other.crmMedico != null)
				return false;
		} else if (!crmMedico.equals(other.crmMedico))
			return false;
		if (nmEspecialidade == null) {
			if (other.nmEspecialidade != null)
				return false;
		} else if (!nmEspecialidade.equals(other.nmEspecialidade))
			return false;
		if (nmMedico == null) {
			if (other.nmMedico != null)
				return false;
		} else if (!nmMedico.equals(other.nmMedico))
			return false;
		return true;
		
	}
	public Integer getCrmMedico() {
		return crmMedico;
	}
	public void setCrmMedico(Integer crmMedico) {
		this.crmMedico = crmMedico;
	}
	public String getNmMedico() {
		return nmMedico;
	}
	public void setNmMedico(String nmMedico) {
		this.nmMedico = nmMedico;
	}
	public String getNmEspecialidade() {
		return nmEspecialidade;
	}
	public void setNmEspecialidade(String nmEspecialidade) {
		this.nmEspecialidade = nmEspecialidade;
	}
	
	

}
