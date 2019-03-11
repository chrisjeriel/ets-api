package ph.cpi.rest.api.model.maintenance;

public class Reason {
	private String reasonCd;
	private String Description;
	
	
	public String getReasonCd() {
		return reasonCd;
	}
	public void setReasonCd(String reasonCd) {
		this.reasonCd = reasonCd;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "Reason [reasonCd=" + reasonCd + ", Description=" + Description + "]";
	}
	
	
}
