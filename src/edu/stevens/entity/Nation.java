package edu.stevens.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Nation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "nation", catalog = "ofCourse")
public class Nation implements java.io.Serializable {

	// Fields

	private Integer nationCode;
	private String nationName;

	// Constructors

	/** default constructor */
	public Nation() {
	}

	/** full constructor */
	public Nation(String nationName) {
		this.nationName = nationName;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "nationCode", unique = true, nullable = false)
	public Integer getNationCode() {
		return this.nationCode;
	}

	public void setNationCode(Integer nationCode) {
		this.nationCode = nationCode;
	}

	@Column(name = "nationName")
	public String getNationName() {
		return this.nationName;
	}

	public void setNationName(String nationName) {
		this.nationName = nationName;
	}
}