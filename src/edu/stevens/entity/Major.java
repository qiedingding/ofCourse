package edu.stevens.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Major entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "major", catalog = "ofCourse")
public class Major implements java.io.Serializable {

	// Fields

	private Integer majorId;
	private Integer majorCode;
	private String majorName;

	// Constructors

	/** default constructor */
	public Major() {
	}

	/** full constructor */
	public Major(Integer majorCode, String majorName) {
		this.majorCode = majorCode;
		this.majorName = majorName;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "majorId", unique = true, nullable = false)
	public Integer getMajorId() {
		return this.majorId;
	}

	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}

	@Column(name = "majorCode")
	public Integer getMajorCode() {
		return this.majorCode;
	}

	public void setMajorCode(Integer majorCode) {
		this.majorCode = majorCode;
	}

	@Column(name = "majorName")
	public String getMajorName() {
		return this.majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

}