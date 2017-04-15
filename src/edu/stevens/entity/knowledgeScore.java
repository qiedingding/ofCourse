package edu.stevens.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


public class knowledgeScore implements java.io.Serializable {
	
	private Integer courseId;
	private double difficultyScore;
	private double recommendationScore;
	private double practicabilityScore;
	private double focusAreaScore;
	private double totalScore;

	public knowledgeScore(Integer courseId, double difficultyScore,
			double recommendationScore, double practicabilityScore,
			double focusAreaScore, double totalScore) {
		super();
		this.courseId = courseId;
		this.difficultyScore = difficultyScore;
		this.recommendationScore = recommendationScore;
		this.practicabilityScore = practicabilityScore;
		this.focusAreaScore = focusAreaScore;
		this.totalScore = totalScore;
	}

	
	public Integer getCourseId() {
		return courseId;
	}







	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}







	public double getDifficultyScore() {
		return difficultyScore;
	}







	public void setDifficultyScore(double difficultyScore) {
		this.difficultyScore = difficultyScore;
	}







	public double getRecommendationScore() {
		return recommendationScore;
	}







	public void setRecommendationScore(double recommendationScore) {
		this.recommendationScore = recommendationScore;
	}







	public double getPracticabilityScore() {
		return practicabilityScore;
	}







	public void setPracticabilityScore(double practicabilityScore) {
		this.practicabilityScore = practicabilityScore;
	}







	public double getFocusAreaScore() {
		return focusAreaScore;
	}







	public void setFocusAreaScore(double focusAreaScore) {
		this.focusAreaScore = focusAreaScore;
	}







	public double getTotalScore() {
		return totalScore;
	}







	public void setTotalScore(double totalScore) {
		this.totalScore = totalScore;
	}


	@Override
	public String toString() {
		return "knowledgeScore [courseId=" + courseId + ", difficultyScore="
				+ difficultyScore + ", recommendationScore="
				+ recommendationScore + ", practicabilityScore="
				+ practicabilityScore + ", focusAreaScore=" + focusAreaScore
				+ ", totalScore=" + totalScore + "]";
	}

}