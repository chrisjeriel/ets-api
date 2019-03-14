package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrieveMtnUsersRequest;
import ph.cpi.rest.api.model.request.UserLoginRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnUsersResponse;
import ph.cpi.rest.api.model.response.UserLoginResponse;

@Service
public interface UserService {

	public UserLoginResponse userLogin(UserLoginRequest ulr) throws SQLException;
	public RetrieveMtnUsersResponse retMtnUsers(RetrieveMtnUsersRequest rmur) throws SQLException;
	
}
