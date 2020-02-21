package ph.cpi.rest.api.model.response;

public class CreateOcAltResponse {
	private String policyIdOc;
	private String policyNoOc;
	private String msg;
	public String getPolicyIdOc() {
		return policyIdOc;
	}
	public void setPolicyIdOc(String policyIdOc) {
		this.policyIdOc = policyIdOc;
	}
	public String getPolicyNoOc() {
		return policyNoOc;
	}
	public void setPolicyNoOc(String policyNoOc) {
		this.policyNoOc = policyNoOc;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "CreateOcAltResponse [policyIdOc=" + policyIdOc + ", policyNoOc=" + policyNoOc + ", msg=" + msg + "]";
	}
	
}
