package edu.stevens.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Favorite entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "favorite", catalog = "ofcourse")
public class Favorite implements java.io.Serializable {

	// Fields

	private Integer favoriteId;
	private Integer userId;
	private Integer courseId;

	// Constructors

	/** default constructor */
	public Favorite() {
	}

	/** full constructor */
	public Favorite(Integer userId, Integer courseId) {
		this.userId = userId;
		this.courseId = courseId;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "favoriteId", unique = true, nullable = false)
	public Integer getFavoriteId() {
		return this.favoriteId;
	}

	public void setFavoriteId(Integer favoriteId) {
		this.favoriteId = favoriteId;
	}

	@Column(name = "userId", nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "courseId", nullable = false)
	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

}