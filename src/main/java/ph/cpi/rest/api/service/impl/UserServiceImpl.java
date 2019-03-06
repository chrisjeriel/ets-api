package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UserDao;
import ph.cpi.rest.api.model.request.UserLoginRequest;
import ph.cpi.rest.api.model.response.UserLoginResponse;
import ph.cpi.rest.api.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	public UserLoginResponse userLogin(UserLoginRequest ulr) throws SQLException {
		UserLoginResponse ulResponse = new UserLoginResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("userId", ulr.getUserId());
		params.put("password", ulr.getPassword());
		
		ulResponse.setModulesList(userDao.userLogin(params));
		
		return ulResponse;
	} 

}
