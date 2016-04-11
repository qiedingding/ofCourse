package edu.stevens.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user", catalog = "ofcourse")
public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private String userPwd;
	private Integer userType;
	private Integer gender;
	private Integer age;
	private String email;
	private String tel;
	private String address;
	private String registerTime;
	private String lastLoginTime;
	private String lastLoginIp;
	private String icon;
	private Integer major;
	private Integer degree;
	private Integer school;
	private String intro;
	private Integer nation;
	private String intrests;
	private String enroll;
	private String wechat;
	private String facebook;
	private String birthday;
	private Integer collectionId;
	private Integer commentId;
	private Integer rateId;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String userName, String userPwd, Integer userType) {
		this.userName = userName;
		this.userPwd = userPwd;
		this.userType = userType;
	}

	/** full constructor */
	public User(String userName, String userPwd, Integer userType,
			Integer gender, Integer age, String email, String tel,
			String address, String registerTime, String lastLoginTime,
			String lastLoginIp, String icon, Integer major, Integer degree,
			Integer school, String intro, Integer nation, String intrests,
			String enroll, String wechat, String facebook, String birthday,
			Integer collectionId, Integer commentId, Integer rateId) {
		this.userName = userName;
		this.userPwd = userPwd;
		this.userType = userType;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.tel = tel;
		this.address = address;
		this.registerTime = registerTime;
		this.lastLoginTime = lastLoginTime;
		this.lastLoginIp = lastLoginIp;
		this.icon = icon;
		this.major = major;
		this.degree = degree;
		this.school = school;
		this.intro = intro;
		this.nation = nation;
		this.intrests = intrests;
		this.enroll = enroll;
		this.wechat = wechat;
		this.facebook = facebook;
		this.birthday = birthday;
		this.collectionId = collectionId;
		this.commentId = commentId;
		this.rateId = rateId;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "userId", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "userName", nullable = false, length = 20)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "userPwd", nullable = false, length = 20)
	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	@Column(name = "userType", nullable = false)
	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	@Column(name = "gender")
	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	@Column(name = "age")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "tel")
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "address")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "registerTime")
	public String getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}

	@Column(name = "lastLoginTime")
	public String getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	@Column(name = "lastLoginIp")
	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	@Column(name = "icon")
	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Column(name = "major")
	public Integer getMajor() {
		return this.major;
	}

	public void setMajor(Integer major) {
		this.major = major;
	}

	@Column(name = "degree")
	public Integer getDegree() {
		return this.degree;
	}

	public void setDegree(Integer degree) {
		this.degree = degree;
	}

	@Column(name = "school")
	public Integer getSchool() {
		return this.school;
	}

	public void setSchool(Integer school) {
		this.school = school;
	}

	@Column(name = "intro")
	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	@Column(name = "nation")
	public Integer getNation() {
		return this.nation;
	}

	public void setNation(Integer nation) {
		this.nation = nation;
	}

	@Column(name = "intrests")
	public String getIntrests() {
		return this.intrests;
	}

	public void setIntrests(String intrests) {
		this.intrests = intrests;
	}

	@Column(name = "enroll")
	public String getEnroll() {
		return this.enroll;
	}

	public void setEnroll(String enroll) {
		this.enroll = enroll;
	}

	@Column(name = "wechat")
	public String getWechat() {
		return this.wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	@Column(name = "facebook")
	public String getFacebook() {
		return this.facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	@Column(name = "birthday")
	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Column(name = "collectionId")
	public Integer getCollectionId() {
		return this.collectionId;
	}

	public void setCollectionId(Integer collectionId) {
		this.collectionId = collectionId;
	}

	@Column(name = "commentId")
	public Integer getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	@Column(name = "rateId")
	public Integer getRateId() {
		return this.rateId;
	}

	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}

}