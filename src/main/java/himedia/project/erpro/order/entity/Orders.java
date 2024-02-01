package himedia.project.erpro.order.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "b_nm")
	private String bNm;
	
	@Column(name = "b_no")
	private String bNo;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "due_date")
	private String dueDate;
	
	@Column(name = "completion_date")
	private String completionDate;
}
