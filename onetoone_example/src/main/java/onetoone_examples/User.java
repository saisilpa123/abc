package onetoone_examples;
import java.util.*;
import javax.persistence.*;

@Entity
public class User {
	String username;
	@Id
	int userid;
	@Column(unique=true)
	String usermail;
	String userpassword;
	long userphone;
	@OneToOne
	private Pan pan;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public long getUserphone() {
		return userphone;
	}
	public void setUserphone(long i) {
		this.userphone = i;
	}
	public Pan getPan() {
		return pan;
	}
	public void setPan(Pan pan) {
		this.pan = pan;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", userid=" + userid + ", usermail=" + usermail + ", userpassword="
				+ userpassword + ", userphone=" + userphone + ", pan=" + pan + "]";
	}
	
	

}
