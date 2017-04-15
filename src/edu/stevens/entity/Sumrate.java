package edu.stevens.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Sumrate entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sumrate", catalog = "ofcourse")
public class Sumrate implements java.io.Serializable {

	// Fields

	private Integer rateId;
	private Integer courseId;
	private Double finalGrades;
	private Double getGoodGrades;
	private Double difficulty;
	private Double assigment;
	private Double pronunciation;
	private String recommendreason;
	private Double recommendation;
	private Double genderRate;
	private Double teacherStyle;
	private Double practicability;
	private Double number;

	// Constructors

	/** default constructor */
	public Sumrate() {
	}

	/** full constructor */
	public Sumrate(Integer courseId, Double finalGrades, Double getGoodGrades,
			Double difficulty, Double assigment, Double pronunciation,
			String recommendreason, Double recommendation, Double genderRate,
			Double teacherStyle, Double practicability, Double number) {
		this.courseId = courseId;
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
		this.number = number;
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

	@Column(name = "courseId")
	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	@Column(name = "finalGrades", precision = 11, scale = 0)
	public Double getFinalGrades() {
		return this.finalGrades;
	}

	public void setFinalGrades(Double finalGrades) {
		this.finalGrades = finalGrades;
	}

	@Column(name = "getGoodGrades", precision = 11, scale = 0)
	public Double getGetGoodGrades() {
		return this.getGoodGrades;
	}

	public void setGetGoodGrades(Double getGoodGrades) {
		this.getGoodGrades = getGoodGrades;
	}

	@Column(name = "difficulty", precision = 11, scale = 0)
	public Double getDifficulty() {
		return this.difficulty;
	}

	public void setDifficulty(Double difficulty) {
		this.difficulty = difficulty;
	}

	@Column(name = "assigment", precision = 11, scale = 0)
	public Double getAssigment() {
		return this.assigment;
	}

	public void setAssigment(Double assigment) {
		this.assigment = assigment;
	}

	@Column(name = "pronunciation", precision = 11, scale = 0)
	public Double getPronunciation() {
		return this.pronunciation;
	}

	public void setPronunciation(Double pronunciation) {
		this.pronunciation = pronunciation;
	}

	@Column(name = "recommendreason")
	public String getRecommendreason() {
		return this.recommendreason;
	}

	public void setRecommendreason(String recommendreason) {
		this.recommendreason = recommendreason;
	}

	@Column(name = "recommendation", precision = 11, scale = 0)
	public Double getRecommendation() {
		return this.recommendation;
	}

	public void setRecommendation(Double recommendation) {
		this.recommendation = recommendation;
	}

	@Column(name = "genderRate", precision = 11, scale = 0)
	public Double getGenderRate() {
		return this.genderRate;
	}

	public void setGenderRate(Double genderRate) {
		this.genderRate = genderRate;
	}

	@Column(name = "teacherStyle", precision = 11, scale = 0)
	public Double getTeacherStyle() {
		return this.teacherStyle;
	}

	public void setTeacherStyle(Double teacherStyle) {
		this.teacherStyle = teacherStyle;
	}

	@Column(name = "practicability", precision = 11, scale = 0)
	public Double getPracticability() {
		return this.practicability;
	}

	public void setPracticability(Double practicability) {
		this.practicability = practicability;
	}

	@Column(name = "number", precision = 11, scale = 0)
	public Double getNumber() {
		return this.number;
	}

	public void setNumber(Double number) {
		this.number = number;
	}

}