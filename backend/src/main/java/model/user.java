package model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "USER1")
public class user {
	

		private int contact;
		private String username;
		private String password;
		@Id
		private String email;
		public int getContact() {
			return contact;
		}

		public void setContact(int contact) {
			this.contact = contact;
		}

	

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		

		// other getters and setters are hidden for brevity

	}


