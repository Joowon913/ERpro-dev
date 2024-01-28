package himedia.project.erpro.user.entity;

import java.time.LocalDate;

import himedia.project.erpro.user.enums.Department;
import himedia.project.erpro.user.enums.Role;
import himedia.project.erpro.user.enums.UserRank;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private LocalDate birth;	
	private String phone;
	private String email;
	
	@Enumerated(EnumType.STRING)
	private Department department;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "user_rank")
	private UserRank userRank;

	@Enumerated(EnumType.STRING)
	private Role role;

	@Column(name = "work_type")
	private String workType;
	@Column(name = "insert_date")
	private LocalDate insertDate;
	@Column(name = "retire_date")
	private LocalDate retireDate;
	private String password;
}
