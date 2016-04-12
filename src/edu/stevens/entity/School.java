package edu.stevens.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * School entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "school", catalog = "ofCourse")
public class School implements java.io.Serializable {

	// Fields

	private Integer schoolCode;
	private String schoolName;

	// Constructors

	/** default constructor */
	public School() {
	}

	/** full constructor */
	public School(String schoolName) {
		this.schoolName = schoolName;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "schoolCode", unique = true, nullable = false)
	public Integer getSchoolCode() {
		return this.schoolCode;
	}

	public void setSchoolCode(Integer schoolCode) {
		this.schoolCode = schoolCode;
	}

	@Column(name = "schoolName")
	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}