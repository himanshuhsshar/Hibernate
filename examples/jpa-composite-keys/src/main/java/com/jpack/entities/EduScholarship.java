package com.jpack.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "edu_scholarship")
public class EduScholarship implements Serializable {
	@EmbeddedId
	protected EduScholarshipNo eduScholarshipNo;
	@Column(name = "full_name")
	protected String fullName;
	protected String dob;
	protected String gender;
	protected int grade;
	protected String medium;
	@Column(name = "academic_year")
	protected String academicYear;
	@Column(name = "grant_amount")
	protected float grantAmount;

	public EduScholarshipNo getEduScholarshipNo() {
		return eduScholarshipNo;
	}

	public void setEduScholarshipNo(EduScholarshipNo eduScholarshipNo) {
		this.eduScholarshipNo = eduScholarshipNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public float getGrantAmount() {
		return grantAmount;
	}

	public void setGrantAmount(float grantAmount) {
		this.grantAmount = grantAmount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(academicYear, dob, eduScholarshipNo, fullName, gender, grade, grantAmount, medium);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EduScholarship other = (EduScholarship) obj;
		return Objects.equals(academicYear, other.academicYear) && Objects.equals(dob, other.dob)
				&& Objects.equals(eduScholarshipNo, other.eduScholarshipNo) && Objects.equals(fullName, other.fullName)
				&& Objects.equals(gender, other.gender) && grade == other.grade
				&& Float.floatToIntBits(grantAmount) == Float.floatToIntBits(other.grantAmount)
				&& Objects.equals(medium, other.medium);
	}

	@Override
	public String toString() {
		return "EduScholarship [eduScholarshipNo=" + eduScholarshipNo + ", fullName=" + fullName + ", dob=" + dob
				+ ", gender=" + gender + ", grade=" + grade + ", medium=" + medium + ", academicYear=" + academicYear
				+ ", grantAmount=" + grantAmount + "]";
	}

}
