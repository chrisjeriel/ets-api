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

}
