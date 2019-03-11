package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UserDao;
import ph.cpi.rest.api.model.request.RetrieveMtnUsersRequest;
import ph.cpi.rest.api.model.request.UserLoginRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnUsersResponse;
import ph.cpi.rest.api.model.response.UserLoginResponse;
import ph.cpi.rest.api.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteServiceImpl.class);

	@Override
	public UserLoginResponse userLogin(UserLoginRequest ulr) throws SQLException {
		UserLoginResponse ulResponse = new UserLoginResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("userId", ulr.getUserId());
		params.put("password", ulr.getPassword());
		
		ulResponse.setModulesList(userDao.userLogin(params));
		
		return ulResponse;
	}
	
	@Override
	public RetrieveMtnUsersResponse retMtnUsers(RetrieveMtnUsersRequest rmur) throws SQLException{
		RetrieveMtnUsersResponse uResponse = new RetrieveMtnUsersResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
	
		params.put("userId", rmur.getUserId());
		params.put("position", rmur.getPaginationRequest().getPosition());
		params.put("count", rmur.getPaginationRequest().getCount());
		params.put("sortKey", rmur.getSortRequest().getSortKey());
		params.put("order", rmur.getSortRequest().getOrder());
		
		uResponse.setUsersList(userDao.retMtnUsers(params));
		
		uResponse.getPaginationResponse().setPosition(rmur.getPaginationRequest().getPosition());
		uResponse.getPaginationResponse().setCount(rmur.getPaginationRequest().getCount());
		uResponse.getSortResponse().setSortKey(rmur.getSortRequest().getSortKey());
		uResponse.getSortResponse().setOrder(rmur.getSortRequest().getOrder());
		
		logger.info("retrieveMtnUsersResponse : " + uResponse.toString());
		return uResponse;
	}

}
