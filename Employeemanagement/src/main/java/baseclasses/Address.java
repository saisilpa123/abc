package baseclasses;
import javax.persistence.*;
@Entity
public class Address {
	private String lane;
	private String city;
	@Id
	private int id;
	private String state;
	private String country;
	private int pincode;
	public String getLane() {
		return lane;
	}
	public void setLane(String lane) {
		this.lane = lane;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [lane=" + lane + ", city=" + city + ", id=" + id + ", state=" + state + ", country=" + country
				+ ", pincode=" + pincode + "]";
	}

}
