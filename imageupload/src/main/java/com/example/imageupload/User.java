package com.example.imageupload;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
int userid;
String username;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Column(length=64)
String photo;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}

public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}

}
