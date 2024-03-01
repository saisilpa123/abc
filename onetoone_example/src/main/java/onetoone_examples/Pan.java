package onetoone_examples;
import javax.persistence.*;

@Entity
public class Pan {
	private String pannum;
	private String fathername;
	private String panname;
	@Id
	private int panId;
	public String getPannum() {
		return pannum;
	}
	public void setPannum(String pannum) {
		this.pannum = pannum;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getPanname() {
		return panname;
	}
	public void setPanname(String panname) {
		this.panname = panname;
	}
	public int getPanId() {
		return panId;
	}
	public void setPanId(int panId) {
		this.panId = panId;
	}
	

}
