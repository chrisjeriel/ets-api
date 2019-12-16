package ph.cpi.rest.api.model.workflowmanager;

public class NRStatus {
	
	private String type;
	private Integer id;
	private String status;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
		return "NRStatus [type=" + type + ", id=" + id + ", status=" + status + "]";
	}
	
}
