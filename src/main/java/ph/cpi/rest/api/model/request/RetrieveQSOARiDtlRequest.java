package ph.cpi.rest.api.model.request;

public class RetrieveQSOARiDtlRequest {

	private Integer qsoaId;
	private String from;

	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	@Override
	public String toString() {
		return "RetrieveQSOARiDtlRequest [qsoaId=" + qsoaId + ", from=" + from + "]";
	}
}
