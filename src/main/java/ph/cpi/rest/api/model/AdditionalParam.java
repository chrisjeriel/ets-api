package ph.cpi.rest.api.model;

public class AdditionalParam {
	private String column;
	private String val;
	public String getColumn() {
		return column;
	}
	public void setColumn(String column) {
		this.column = column;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	@Override
	public String toString() {
		return "AdditionalParam [column=" + column + ", val=" + val + "]";
	}
	
}
