package persistence;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "KichCo")
public class Size {
	@Id
	@Column(name = "KiHieu")
	private Integer id;
	@Column(name = "MoTa")
	private String desciption;

	
	public Size() {
		
	}

	public Size(Integer id, String desciption) {
		super();
		this.id = id;
		this.desciption = desciption;
	}

	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	@Override
	public String toString() {
		return "Size [id=" + id + ", desciption=" + desciption + "]";
	}

}
