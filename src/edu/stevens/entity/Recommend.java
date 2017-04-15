package edu.stevens.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


public class Recommend implements java.io.Serializable {

	// Fields
	
	private Integer finalGrades;
	private Integer getGoodGrades;
	private Integer difficulty;
	private Integer assigment;
	private Integer pronunciation;
	private Integer recommendation;
	private Integer genderRate;
	private Integer teacherStyle;
	private Integer practicability;
	private ArrayList<String> focusArea;
	public Integer getFinalGrades() {
		return finalGrades;
	}
	public void setFinalGrades(Integer finalGrades) {
		this.finalGrades = finalGrades;
	}
	public Integer getGetGoodGrades() {
		return getGoodGrades;
	}
	public void setGetGoodGrades(Integer getGoodGrades) {
		this.getGoodGrades = getGoodGrades;
	}
	public Integer getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}
	public Integer getAssigment() {
		return assigment;
	}
	public void setAssigment(Integer assigment) {
		this.assigment = assigment;
	}
	public Integer getPronunciation() {
		return pronunciation;
	}
	public void setPronunciation(Integer pronunciation) {
		this.pronunciation = pronunciation;
	}
	public Integer getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(Integer recommendation) {
		this.recommendation = recommendation;
	}
	public Integer getGenderRate() {
		return genderRate;
	}
	public void setGenderRate(Integer genderRate) {
		this.genderRate = genderRate;
	}
	public Integer getTeacherStyle() {
		return teacherStyle;
	}
	public void setTeacherStyle(Integer teacherStyle) {
		this.teacherStyle = teacherStyle;
	}
	public Integer getPracticability() {
		return practicability;
	}
	public void setPracticability(Integer practicability) {
		this.practicability = practicability;
	}
	public ArrayList<String> getFocusArea() {
		return focusArea;
	}
	public void setFocusArea(ArrayList<String> focusArea) {
		this.focusArea = focusArea;
	}
	@Override
	public String toString() {
		return "Recommend [finalGrades=" + finalGrades + ", getGoodGrades="
				+ getGoodGrades + ", difficulty=" + difficulty + ", assigment="
				+ assigment + ", pronunciation=" + pronunciation
				+ ", recommendation=" + recommendation + ", genderRate="
				+ genderRate + ", teacherStyle=" + teacherStyle
				+ ", practicability=" + practicability + ", focusArea="
				+ focusArea + "]";
	}
	public Recommend(Integer finalGrades, Integer getGoodGrades,
			Integer difficulty, Integer assigment, Integer pronunciation,
			Integer recommendation, Integer genderRate, Integer teacherStyle,
			Integer practicability, ArrayList<String> focusArea) {
		super();
		this.finalGrades = finalGrades;
		this.getGoodGrades = getGoodGrades;
		this.difficulty = difficulty;
		this.assigment = assigment;
		this.pronunciation = pronunciation;
		this.recommendation = recommendation;
		this.genderRate = genderRate;
		this.teacherStyle = teacherStyle;
		this.practicability = practicability;
		this.focusArea = focusArea;
	}
	public Recommend() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((assigment == null) ? 0 : assigment.hashCode());
		result = prime * result
				+ ((difficulty == null) ? 0 : difficulty.hashCode());
		result = prime * result
				+ ((finalGrades == null) ? 0 : finalGrades.hashCode());
		result = prime * result
				+ ((focusArea == null) ? 0 : focusArea.hashCode());
		result = prime * result
				+ ((genderRate == null) ? 0 : genderRate.hashCode());
		result = prime * result
				+ ((getGoodGrades == null) ? 0 : getGoodGrades.hashCode());
		result = prime * result
				+ ((practicability == null) ? 0 : practicability.hashCode());
		result = prime * result
				+ ((pronunciation == null) ? 0 : pronunciation.hashCode());
		result = prime * result
				+ ((recommendation == null) ? 0 : recommendation.hashCode());
		result = prime * result
				+ ((teacherStyle == null) ? 0 : teacherStyle.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recommend other = (Recommend) obj;
		if (assigment == null) {
			if (other.assigment != null)
				return false;
		} else if (!assigment.equals(other.assigment))
			return false;
		if (difficulty == null) {
			if (other.difficulty != null)
				return false;
		} else if (!difficulty.equals(other.difficulty))
			return false;
		if (finalGrades == null) {
			if (other.finalGrades != null)
				return false;
		} else if (!finalGrades.equals(other.finalGrades))
			return false;
		if (focusArea == null) {
			if (other.focusArea != null)
				return false;
		} else if (!focusArea.equals(other.focusArea))
			return false;
		if (genderRate == null) {
			if (other.genderRate != null)
				return false;
		} else if (!genderRate.equals(other.genderRate))
			return false;
		if (getGoodGrades == null) {
			if (other.getGoodGrades != null)
				return false;
		} else if (!getGoodGrades.equals(other.getGoodGrades))
			return false;
		if (practicability == null) {
			if (other.practicability != null)
				return false;
		} else if (!practicability.equals(other.practicability))
			return false;
		if (pronunciation == null) {
			if (other.pronunciation != null)
				return false;
		} else if (!pronunciation.equals(other.pronunciation))
			return false;
		if (recommendation == null) {
			if (other.recommendation != null)
				return false;
		} else if (!recommendation.equals(other.recommendation))
			return false;
		if (teacherStyle == null) {
			if (other.teacherStyle != null)
				return false;
		} else if (!teacherStyle.equals(other.teacherStyle))
			return false;
		return true;
	}
	


}