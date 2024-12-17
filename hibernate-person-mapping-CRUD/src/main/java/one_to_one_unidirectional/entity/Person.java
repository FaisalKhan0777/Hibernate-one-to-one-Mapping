package one_to_one_unidirectional.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	
	@Id 
	private int id ;
	private String name ;
	private String eamil ;
	private long phone ;
	
	
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE ,CascadeType.DETACH})
	
	//@JoinColumn(name  = "adhar-no")
	private Adhar adhar ;
	
	
	public Person(int id ,String name ,String email ,long phone)
	{ 
		
	super();
	this.id =id ;
	this.name=name ;
	this.eamil =email ;
	this.phone=phone ;
	
	
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", eamil=" + eamil + ", phone=" + phone + ", adhar=" + adhar
				+ "]";
	}
	
}
