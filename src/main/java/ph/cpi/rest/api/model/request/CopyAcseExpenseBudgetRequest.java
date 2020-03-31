package ph.cpi.rest.api.model.request;

public class CopyAcseExpenseBudgetRequest {
	private Integer originYear;
	private Integer desYear;
	private String force;
	
	public Integer getOriginYear() {
		return originYear;
	}
	public void setOriginYear(Integer originYear) {
		this.originYear = originYear;
	}
	public Integer getDesYear() {
		return desYear;
	}
	public void setDesYear(Integer desYear) {
		this.desYear = desYear;
	}
	public String getForce() {
		return force;
	}
	public void setForce(String force) {
		this.force = force;
	}
	@Override
	public String toString() {
		return "CopyAcseExpenseBudgetRequest [originYear=" + originYear + ", desYear=" + desYear + ", force=" + force
				+ "]";
	}
}
