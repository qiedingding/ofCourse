package edu.stevens.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Individualrate entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "individualrate", catalog = "ofcourse")
public class Individualrate implements java.io.Serializable {

	// Fields

	private Integer rateId;
	private Integer courseId;
	private Integer userId;
	private Integer finalGrades;
	private Integer getGoodGrades;
	private Integer difficulty;
	private Integer assigment;
	private Integer pronunciation;
	private String recommendreason;
	private Integer recommendation;
	private Integer genderRate;
	private Integer teacherStyle;
	private Integer practicability;
	private String comment;

	// Constructors

	/** default constructor */
	public Individualrate() {
	}

	/** minimal constructor */
	public Individualrate(Integer courseId, Integer userId) {
		this.courseId = courseId;
		this.userId = userId;
	}

	/** full constructor */
	public Individualrate(Integer courseId, Integer userId,
			Integer finalGrades, Integer getGoodGrades, Integer difficulty,
			Integer assigment, Integer pronunciation, String recommendreason,
			Integer recommendation, Integer genderRate, Integer teacherStyle,
			Integer practicability, String comment) {
		this.courseId = courseId;
		this.userId = userId;
		this.finalGrades = finalGrades;
		this.getGoodGrades = getGoodGrades;
		this.difficulty = difficulty;
		this.assigment = assigment;
		this.pronunciation = pronunciation;
		this.recommendreason = recommendreason;
		this.recommendation = recommendation;
		this.genderRate = genderRate;
		this.teacherStyle = teacherStyle;
		this.practicability = practicability;
		this.comment = comment;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "rateId", unique = true, nullable = false)
	public Integer getRateId() {
		return this.rateId;
	}

	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}

	@Column(name = "courseId", nullable = false)
	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	@Column(name = "userId", nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "finalGrades")
	public Integer getFinalGrades() {
		return this.finalGrades;
	}

	public void setFinalGrades(Integer finalGrades) {
		this.finalGrades = finalGrades;
	}

	@Column(name = "getGoodGrades")
	public Integer getGetGoodGrades() {
		return this.getGoodGrades;
	}

	public void setGetGoodGrades(Integer getGoodGrades) {
		this.getGoodGrades = getGoodGrades;
	}

	@Column(name = "difficulty")
	public Integer getDifficulty() {
		return this.difficulty;
	}

	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}

	@Column(name = "assigment")
	public Integer getAssigment() {
		return this.assigment;
	}

	public void setAssigment(Integer assigment) {
		this.assigment = assigment;
	}

	@Column(name = "pronunciation")
	public Integer getPronunciation() {
		return this.pronunciation;
	}

	public void setPronunciation(Integer pronunciation) {
		this.pronunciation = pronunciation;
	}

	@Column(name = "recommendreason")
	public String getRecommendreason() {
		return this.recommendreason;
	}

	public void setRecommendreason(String recommendreason) {
		this.recommendreason = recommendreason;
	}

	@Column(name = "recommendation")
	public Integer getRecommendation() {
		return this.recommendation;
	}

	public void setRecommendation(Integer recommendation) {
		this.recommendation = recommendation;
	}

	@Column(name = "genderRate")
	public Integer getGenderRate() {
		return this.genderRate;
	}

	public void setGenderRate(Integer genderRate) {
		this.genderRate = genderRate;
	}

	@Column(name = "teacherStyle")
	public Integer getTeacherStyle() {
		return this.teacherStyle;
	}

	public void setTeacherStyle(Integer teacherStyle) {
		this.teacherStyle = teacherStyle;
	}

	@Column(name = "practicability")
	public Integer getPracticability() {
		return this.practicability;
	}

	public void setPracticability(Integer practicability) {
		this.practicability = practicability;
	}

	@Column(name = "comment")
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}