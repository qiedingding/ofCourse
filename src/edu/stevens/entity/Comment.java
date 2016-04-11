package edu.stevens.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "comment", catalog = "ofcourse")
public class Comment implements java.io.Serializable {

	// Fields

	private Integer commentId;
	private String content;
	private Integer agree;
	private Integer disagree;
	private Integer type;
	private Integer courseId;
	private Integer userId;
	private String date;

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** full constructor */
	public Comment(String content, Integer agree, Integer disagree,
			Integer type, Integer courseId, Integer userId, String date) {
		this.content = content;
		this.agree = agree;
		this.disagree = disagree;
		this.type = type;
		this.courseId = courseId;
		this.userId = userId;
		this.date = date;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "commentId", unique = true, nullable = false)
	public Integer getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	@Column(name = "content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "agree")
	public Integer getAgree() {
		return this.agree;
	}

	public void setAgree(Integer agree) {
		this.agree = agree;
	}

	@Column(name = "disagree")
	public Integer getDisagree() {
		return this.disagree;
	}

	public void setDisagree(Integer disagree) {
		this.disagree = disagree;
	}

	@Column(name = "type")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name = "courseId")
	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	@Column(name = "userId")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "date")
	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}