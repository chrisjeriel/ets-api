package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.maintenance.UserAmtLimit;
import ph.cpi.rest.api.model.maintenance.UserGrp;
import ph.cpi.rest.api.model.maintenance.Users;

public interface UserDao {

	public List<String> userLogin(final HashMap<String, Object> params) throws SQLException;
	public Users userAuthenticate(final HashMap<String, Object> params) throws SQLException;
	public List<Users> retMtnUsers(final HashMap<String, Object> params) throws SQLException;
	public List<Users> retrieveMtnUserAccess(final HashMap<String, Object> params) throws SQLException;
	public List<UserGrp> retrieveMtnUserGroup(final HashMap<String, Object> params) throws SQLException;
	public List<UserGrp> retrieveMtnUserGroupAccess(final HashMap<String, Object> params) throws SQLException;
	public List<UserAmtLimit> retrieveMtnUserAmountLimit(final HashMap<String, Object> params) throws SQLException;
	public Integer saveApproval(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnUser(final HashMap<String, Object> params) throws SQLException;
	public Integer saveMtnUserGrp(final HashMap<String, Object> params) throws SQLException;
	
}
