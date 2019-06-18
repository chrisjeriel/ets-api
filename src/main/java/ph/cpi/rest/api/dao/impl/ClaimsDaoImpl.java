package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.ClaimsDao;
import ph.cpi.rest.api.model.claims.ClaimHistory;
import ph.cpi.rest.api.model.claims.Claims;

@Component
public class ClaimsDaoImpl implements ClaimsDao {
	
	@Autowired
	private SqlSession sqlSession;

	private static final Logger logger = LoggerFactory.getLogger(ClaimsDaoImpl.class);

	@Override
	public List<ClaimHistory> retrieveClaimHistory(HashMap<String, Object> params) throws SQLException {
		List<ClaimHistory> clmHistory = sqlSession.selectList("retrieveClaimHistory", params);
		return clmHistory;
	}

	@Override
	public Integer saveClaimHistory(HashMap<String, Object> params) throws SQLException {
		Integer saveClaimHistory = sqlSession.update("saveClaimHistory",params);
		return saveClaimHistory;
	}

	@Override
	public List<Claims> retrieveClaimsAttachmentList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Claims> claimsAttachmentList = sqlSession.selectList("retrieveClaimsAttachment", params);
		return claimsAttachmentList;
	}

	@Override
	public Integer saveClaimsAttachment(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer errorCode = sqlSession.update("saveClaimsAttachment",params);
		return errorCode;
	}
}
