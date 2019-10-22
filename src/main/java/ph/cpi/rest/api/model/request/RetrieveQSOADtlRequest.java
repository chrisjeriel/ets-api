package ph.cpi.rest.api.model.request;

public class RetrieveQSOADtlRequest {

	private Integer qsoaId;

	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
	}

	@Override
	public String toString() {
		return "RetrieveQSOADtlRequest [qsoaId=" + qsoaId + "]";
	}
}
