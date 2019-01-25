package ph.cpi.rest.api.model.request;

public class RetrieveEndtCodeRequest {
	
	private String lineCd;
	private String endtCd;
	
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getEndtCd() {
		return endtCd;
	}
	public void setEndtCd(String endtCd) {
		this.endtCd = endtCd;
	}
	@Override
	public String toString() {
		return "RetrieveEndtCodeRequest [lineCd=" + lineCd + ", endtCd=" + endtCd + "]";
	}
	
}
