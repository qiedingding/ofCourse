package edu.stevens.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "course", catalog = "ofcourse")
public class Course implements java.io.Serializable {

	// Fields

	private Integer courseId;
	private String name;
	private String code;
	private Integer teacherId;
	private String pic;
	private String intro;
	private String keywords;
	private Integer formOfExam;
	private Integer session;
	private Integer credits;
	private Integer form;
	private String url;
	private Integer core;
	private Integer degreeId;

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** minimal constructor */
	public Course(String name, String code, Integer teacherId) {
		this.name = name;
		this.code = code;
		this.teacherId = teacherId;
	}

	/** full constructor */
	public Course(String name, String code, Integer teacherId, String pic,
			String intro, String keywords, Integer formOfExam,
			Integer session, Integer credits, Integer form, String url,
			Integer core, Integer degreeId) {
		this.name = name;
		this.code = code;
		this.teacherId = teacherId;
		this.pic = pic;
		this.intro = intro;
		this.keywords = keywords;
		this.formOfExam = formOfExam;
		this.session = session;
		this.credits = credits;
		this.form = form;
		this.url = url;
		this.core = core;
		this.degreeId = degreeId;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "courseId", unique = true, nullable = false)
	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "code", nullable = false)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "teacherId", nullable = false)
	public Integer getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	@Column(name = "pic")
	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	@Column(name = "intro")
	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	@Column(name = "keywords")
	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	@Column(name = "formOfExam")
	public Integer getFormOfExam() {
		return this.formOfExam;
	}

	public void setFormOfExam(Integer formOfExam) {
		this.formOfExam = formOfExam;
	}

	@Column(name = "session")
	public Integer getSession() {
		return this.session;
	}

	public void setSession(Integer session) {
		this.session = session;
	}

	@Column(name = "credits")
	public Integer getCredits() {
		return this.credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	@Column(name = "form")
	public Integer getForm() {
		return this.form;
	}

	public void setForm(Integer form) {
		this.form = form;
	}

	@Column(name = "url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "core")
	public Integer getCore() {
		return this.core;
	}

	public void setCore(Integer core) {
		this.core = core;
	}

	@Column(name = "degreeId")
	public Integer getDegreeId() {
		return this.degreeId;
	}

	public void setDegreeId(Integer degreeId) {
		this.degreeId = degreeId;
	}

}