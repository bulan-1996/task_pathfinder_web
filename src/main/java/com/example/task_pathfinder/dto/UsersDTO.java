package com.example.task_pathfinder.dto;

/**
 * Users情報をセットするDTOクラス
 */
public class UsersDTO {
	/**
	 * id:
	 * name:名前
	 * email:メールアドレス
	 * emailVerified:メール認証
	 * uid:ユーザー識別子
	 */
	private int id;
	private String name;
	private String email;
	private Boolean emailVerified;
	private String uid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getEmailVerified() {
		return emailVerified;
	}
	public void setEmailVerified(Boolean emailVerified) {
		this.emailVerified = emailVerified;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
}
