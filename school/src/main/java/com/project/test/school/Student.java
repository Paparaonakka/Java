package com.project.test.school;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Student {
	
	
         @Id
		int Studentrollno;
		String Studentname;
		String email;
		int age;
		public Student(int Studentrollno, String Studentname, String email, int age) {
			
			
			this.Studentrollno = Studentrollno;
			this.Studentname = Studentname;
			this.email = email;
			this.age = age;
		}
		public Student() {}
		
		public int getStudentRollno() {
			return Studentrollno;
		}
		public void setStudentRollno(int Studentrollno) {
			this.Studentrollno = Studentrollno;
		}
		public String getStudentName() {
			return Studentname;
		}
		public void setStudentName(String Studentname) {
			this.Studentname = Studentname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
}
	}
