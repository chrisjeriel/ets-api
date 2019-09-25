package ph.cpi.rest.api.model.request;

import java.util.List;

import ph.cpi.rest.api.model.maintenance.Module;
import ph.cpi.rest.api.model.maintenance.SaveModule;

public class SaveModulesRequest {
	
	String accessLevel;
	List<SaveModule> moduleList;
	List<Module> mtnModuleList;
	List<Module> delMtnModuleList;
	
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
	public List<Module> getMtnModuleList() {
		return mtnModuleList;
	}
	public void setMtnModuleList(List<Module> mtnModuleList) {
		this.mtnModuleList = mtnModuleList;
	}
	public List<Module> getDelMtnModuleList() {
		return delMtnModuleList;
	}
	public void setDelMtnModuleList(List<Module> delMtnModuleList) {
		this.delMtnModuleList = delMtnModuleList;
	}
	
}
