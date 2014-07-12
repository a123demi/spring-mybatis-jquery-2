package com.kun.app.operater.model;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;

public class Operater{

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column operater.id
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column operater.type
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	private Integer type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column operater.code
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	private String code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column operater.name
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column operater.password
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column operater.superUser
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	private Integer superUser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column operater.email
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column operater.phone
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	private String phone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column operater.createTime
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column operater.updateTime
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column operater.operaterId
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	private Long operaterId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column operater.operaterCode
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	private String operaterCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column operater.status
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	private Integer status;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column operater.id
	 * @return  the value of operater.id
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column operater.id
	 * @param id  the value for operater.id
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column operater.type
	 * @return  the value of operater.type
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column operater.type
	 * @param type  the value for operater.type
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column operater.code
	 * @return  the value of operater.code
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column operater.code
	 * @param code  the value for operater.code
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column operater.name
	 * @return  the value of operater.name
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column operater.name
	 * @param name  the value for operater.name
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column operater.password
	 * @return  the value of operater.password
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	@JsonIgnore
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column operater.password
	 * @param password  the value for operater.password
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column operater.superUser
	 * @return  the value of operater.superUser
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public Integer getSuperUser() {
		return superUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column operater.superUser
	 * @param superUser  the value for operater.superUser
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public void setSuperUser(Integer superUser) {
		this.superUser = superUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column operater.email
	 * @return  the value of operater.email
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column operater.email
	 * @param email  the value for operater.email
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column operater.phone
	 * @return  the value of operater.phone
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column operater.phone
	 * @param phone  the value for operater.phone
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column operater.createTime
	 * @return  the value of operater.createTime
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column operater.createTime
	 * @param createTime  the value for operater.createTime
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column operater.updateTime
	 * @return  the value of operater.updateTime
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column operater.updateTime
	 * @param updateTime  the value for operater.updateTime
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column operater.operaterId
	 * @return  the value of operater.operaterId
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public Long getOperaterId() {
		return operaterId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column operater.operaterId
	 * @param operaterId  the value for operater.operaterId
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public void setOperaterId(Long operaterId) {
		this.operaterId = operaterId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column operater.operaterCode
	 * @return  the value of operater.operaterCode
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public String getOperaterCode() {
		return operaterCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column operater.operaterCode
	 * @param operaterCode  the value for operater.operaterCode
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public void setOperaterCode(String operaterCode) {
		this.operaterCode = operaterCode == null ? null : operaterCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column operater.status
	 * @return  the value of operater.status
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column operater.status
	 * @param status  the value for operater.status
	 * @mbggenerated  Thu Apr 24 23:56:12 CST 2014
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
}