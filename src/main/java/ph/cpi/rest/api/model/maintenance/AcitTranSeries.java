package ph.cpi.rest.api.model.maintenance;

public class AcitTranSeries {
	private Integer TranNo;

	public Integer getTranNo() {
		return TranNo;
	}

	public void setTranNo(Integer tranNo) {
		TranNo = tranNo;
	}

	@Override
	public String toString() {
		return "AcitTranSeries [TranNo=" + TranNo + "]";
	}
	
}
