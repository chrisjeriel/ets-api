package ph.cpi.rest.api.model.maintenance;

public class AcseTranSeries {
	private String allowGenerate;

	public String getAllowGenerate() {
		return allowGenerate;
	}

	public void setAllowGenerate(String allowGenerate) {
		this.allowGenerate = allowGenerate;
	}

	@Override
	public String toString() {
		return "AcseTranSeries [allowGenerate=" + allowGenerate + "]";
	}

	
}
