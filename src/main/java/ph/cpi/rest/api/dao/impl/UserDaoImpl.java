package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UserDao;
import ph.cpi.rest.api.model.maintenance.UserAmtLimit;
import ph.cpi.rest.api.model.maintenance.UserGrp;
import ph.cpi.rest.api.model.maintenance.Users;

@Component
public class UserDaoImpl implements UserDao{
	
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

	@Override
	public List<String> userLogin(HashMap<String, Object> params) throws SQLException {
		List<String> modulesList = sqlSession.selectList("userLogin", params);
		return modulesList;
	}
	
	@Override
	public List<Users> retMtnUsers(final HashMap<String, Object> params) throws SQLException{
		List<Users> usersList = sqlSession.selectList("retMtnUsers", params);
		return usersList;
	}

	@Override
	public List<Users> retrieveMtnUserAccess(HashMap<String, Object> params) throws SQLException {
		List<Users> userAccessList = sqlSession.selectList("retrieveMtnUserAccess", params);
		return userAccessList;
	}

	@Override
	public List<UserGrp> retrieveMtnUserGroup(HashMap<String, Object> params) throws SQLException {
		List<UserGrp> userGroupList = sqlSession.selectList("retrieveMtnUserGroup", params);
		return userGroupList;
	}

	@Override
	public List<UserGrp> retrieveMtnUserGroupAccess(HashMap<String, Object> params) throws SQLException {
		List<UserGrp> userGroupAccessList = sqlSession.selectList("retrieveMtnUserGroupAccess", params);
		return userGroupAccessList;
	}

	@Override
	public Integer saveApproval(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveApproval", params);
		return errorCode;
	}
	
	@Override
	public Users userAuthenticate(HashMap<String, Object> params) throws SQLException {
		return sqlSession.selectOne("userAuthenticate", params);
	}

	@Override
	public List<UserAmtLimit> retrieveMtnUserAmountLimit(HashMap<String, Object> params) throws SQLException {
		List<UserAmtLimit> userAmtLmtList = sqlSession.selectList("retrieveMtnUserAmountLimit", params);
		return userAmtLmtList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Integer saveMtnUser(HashMap<String, Object> params) throws SQLException {
		logger.info("saveMtnUser DAO : " + params);
		Integer resultCode = 99;
		for (Users user : ((List<Users>) params.get("usersList"))) {
			logger.info("Saving user : " + user);
			resultCode = sqlSession.update("saveMtnUser",user);
		}
		return resultCode;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Integer saveMtnUserGrp(HashMap<String, Object> params) throws SQLException {
		logger.info("saveMtnUserGrp DAO : " + params);
		Integer resultCode = 99;
		for (UserGrp userGrp : ((List<UserGrp>) params.get("delUserGrpList"))) {
			logger.info("Saving delUserGrp : " + userGrp);
			resultCode = sqlSession.update("delMtnUserGrp",userGrp);
		}
		for (UserGrp userGrp : ((List<UserGrp>) params.get("userGrpList"))) {
			logger.info("Saving userGrp : " + userGrp);
			resultCode = sqlSession.update("saveMtnUserGrp",userGrp);
		}
		return resultCode;
	}

}
