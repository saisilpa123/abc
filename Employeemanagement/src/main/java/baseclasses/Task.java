package baseclasses;
import javax.persistence.*;
import java.time.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String description;
	private String status;
	@CreationTimestamp  //stores the time when a task obj is created
	private LocalDateTime createdtime;
	@UpdateTimestamp //updates the time when a task is being modified
	private LocalDateTime endedtime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return description;
	}
	public void setDesc(String desc) {
		this.description = desc;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", description=" + description + ", status=" + status + ", createdtime=" + createdtime
				+ ", endedtime=" + endedtime + "]";
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getCreatedtime() {
		return createdtime;
	}
	public void setCreatedtime(LocalDateTime createdtime) {
		this.createdtime = createdtime;
	}
	public LocalDateTime getEndedtime() {
		return endedtime;
	}
	public void setEndedtime(LocalDateTime endedtime) {
		this.endedtime = endedtime;
	}

}
