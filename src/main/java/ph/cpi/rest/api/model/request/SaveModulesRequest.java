package ph.cpi.rest.api.model.request;

import java.util.List;

import ph.cpi.rest.api.model.maintenance.SaveModule;

public class SaveModulesRequest {
	
	String accessLevel;
	List<SaveModule> moduleList;
	public String getAccessLevel() {
		return accessLevel;
	}
	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}
	public List<SaveModule> getModuleList() {
		return moduleList;
	}
	public void setModuleList(List<SaveModule> moduleList) {
		this.moduleList = moduleList;
	}
	@Override
	public String toString() {
		return "SaveModulesRequest [accessLevel=" + accessLevel + "]";
	}
	
}
