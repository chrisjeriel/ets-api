package ph.cpi.rest.api.model.maintenance;

public class AcseTranSeries {
	private Integer TranNo;

	public Integer getTranNo() {
		return TranNo;
	}

	public void setTranNo(Integer tranNo) {
		TranNo = tranNo;
	}

	@Override
	public String toString() {
		return "AcseTranSeries [TranNo=" + TranNo + "]";
	}
	
}
