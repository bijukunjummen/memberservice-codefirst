package org.bk.memberservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "MemberDetail", namespace="http://bk.org/memberservice/")
public class MemberDetail {
	public MemberDetail() {

	}

	public MemberDetail(String name, String phone, String city, String state) {
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.state = state;
	}

	private String name;
	private String phone;
	private String city;
	private String state;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}