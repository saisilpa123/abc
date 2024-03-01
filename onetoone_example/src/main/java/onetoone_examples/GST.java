package onetoone_examples;
import javax.persistence.*;
@Entity
public class GST {
	private long gstnum;
	@Id
	private long id;
	private String status;
	public long getGstnum() {
		return gstnum;
	}
	public void setGstnum(long gstnum) {
		this.gstnum = gstnum;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "GST [gstnum=" + gstnum + ", id=" + id + ", status=" + status + "]";
	}

}
