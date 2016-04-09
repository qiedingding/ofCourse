package edu.stevens.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Custom entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "custom", catalog = "ofCourse")
public class Custom implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer customid;
	private String cname;
	private String caddress;
	private String cemail;
	private String cpost;

	// Constructors

	/** default constructor */
	public Custom() {
	}

	/** minimal constructor */
	public Custom(String cname, String caddress, String cemail) {
		this.cname = cname;
		this.caddress = caddress;
		this.cemail = cemail;
	}

	/** full constructor */
	public Custom(String cname, String caddress, String cemail, String cpost) {
		this.cname = cname;
		this.caddress = caddress;
		this.cemail = cemail;
		this.cpost = cpost;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "customid", unique = true, nullable = false)
	public Integer getCustomid() {
		return this.customid;
	}

	public void setCustomid(Integer customid) {
		this.customid = customid;
	}

	@Column(name = "cname", nullable = false, length = 20)
	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Column(name = "caddress", nullable = false, length = 20)
	public String getCaddress() {
		return this.caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	@Column(name = "cemail", nullable = false, length = 100)
	public String getCemail() {
		return this.cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	@Column(name = "cpost", length = 13)
	public String getCpost() {
		return this.cpost;
	}

	public void setCpost(String cpost) {
		this.cpost = cpost;
	}

	@Override
	public String toString() {
		return "Custom [customid=" + customid + ", cname=" + cname
				+ ", caddress=" + caddress + ", cemail=" + cemail + ", cpost="
				+ cpost + "]";
	}
	

}