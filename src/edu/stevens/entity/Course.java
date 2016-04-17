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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((core == null) ? 0 : core.hashCode());
		result = prime * result
				+ ((courseId == null) ? 0 : courseId.hashCode());
		result = prime * result + ((credits == null) ? 0 : credits.hashCode());
		result = prime * result
				+ ((degreeId == null) ? 0 : degreeId.hashCode());
		result = prime * result + ((form == null) ? 0 : form.hashCode());
		result = prime * result
				+ ((formOfExam == null) ? 0 : formOfExam.hashCode());
		result = prime * result + ((intro == null) ? 0 : intro.hashCode());
		result = prime * result
				+ ((keywords == null) ? 0 : keywords.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pic == null) ? 0 : pic.hashCode());
		result = prime * result + ((session == null) ? 0 : session.hashCode());
		result = prime * result
				+ ((teacherId == null) ? 0 : teacherId.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		Course other = (Course) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (core == null) {
			if (other.core != null)
				return false;
		} else if (!core.equals(other.core))
			return false;
		if (courseId == null) {
			if (other.courseId != null)
				return false;
		} else if (!courseId.equals(other.courseId))
			return false;
		if (credits == null) {
			if (other.credits != null)
				return false;
		} else if (!credits.equals(other.credits))
			return false;
		if (degreeId == null) {
			if (other.degreeId != null)
				return false;
		} else if (!degreeId.equals(other.degreeId))
			return false;
		if (form == null) {
			if (other.form != null)
				return false;
		} else if (!form.equals(other.form))
			return false;
		if (formOfExam == null) {
			if (other.formOfExam != null)
				return false;
		} else if (!formOfExam.equals(other.formOfExam))
			return false;
		if (intro == null) {
			if (other.intro != null)
				return false;
		} else if (!intro.equals(other.intro))
			return false;
		if (keywords == null) {
			if (other.keywords != null)
				return false;
		} else if (!keywords.equals(other.keywords))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pic == null) {
			if (other.pic != null)
				return false;
		} else if (!pic.equals(other.pic))
			return false;
		if (session == null) {
			if (other.session != null)
				return false;
		} else if (!session.equals(other.session))
			return false;
		if (teacherId == null) {
			if (other.teacherId != null)
				return false;
		} else if (!teacherId.equals(other.teacherId))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	

}