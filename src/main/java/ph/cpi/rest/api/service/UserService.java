package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrieveMtnUserAccessRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnUserGroupAccessRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnUserGroupRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnUsersRequest;
import ph.cpi.rest.api.model.request.UserLoginRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnUserAccessResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnUserGroupAccessResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnUserGroupResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnUsersResponse;
import ph.cpi.rest.api.model.response.UserLoginResponse;

@Service
public interface UserService {

	public UserLoginResponse userLogin(UserLoginRequest ulr) throws SQLException;
	public RetrieveMtnUsersResponse retMtnUsers(RetrieveMtnUsersRequest rmur) throws SQLException;
	public RetrieveMtnUserAccessResponse retrieveMtnUserAccess(RetrieveMtnUserAccessRequest rmuar) throws SQLException;
	public RetrieveMtnUserGroupResponse retrieveMtnUserGroup(RetrieveMtnUserGroupRequest rmugr) throws SQLException;
	public RetrieveMtnUserGroupAccessResponse retrieveMtnUserGroupAccess(RetrieveMtnUserGroupAccessRequest rmugar) throws SQLException;
}
