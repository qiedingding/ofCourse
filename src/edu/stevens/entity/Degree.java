package edu.stevens.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Degree entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "degree", catalog = "ofCourse")
public class Degree implements java.io.Serializable {

	// Fields

	private Integer degreeId;
	private String degreeName;

	// Constructors

	/** default constructor */
	public Degree() {
	}

	/** full constructor */
	public Degree(String degreeName) {
		this.degreeName = degreeName;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "degreeId", unique = true, nullable = false)
	public Integer getDegreeId() {
		return this.degreeId;
	}

	public void setDegreeId(Integer degreeId) {
		this.degreeId = degreeId;
	}

	@Column(name = "degreeName")
	public String getDegreeName() {
		return this.degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

}