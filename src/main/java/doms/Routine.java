package doms;

import javax.persistence.*;

@Entity
@Table(name="routines")
public class Routine {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@Column
	private String name;

	protected Routine() {
	}

	public Routine(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
