package one_to_one_unidirectional.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
// Table is used to provide name of tabular
@Table(name = "Adhar")
public class Adhar {

	@Id

	@Column(name = " adharno", length = 12, updatable = false)
	private long adharNumber;

	@Column(name = "fathername", length = 30)
	private String fatherName;
	private String address;
	private LocalDate dob;

}
