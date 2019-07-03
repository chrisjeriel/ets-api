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
import ph.cpi.rest.api.model.claims.Attachment;
import ph.cpi.rest.api.model.claims.ClaimApprovedAmt;
import ph.cpi.rest.api.model.claims.ClaimReserve;
import ph.cpi.rest.api.model.claims.Claims;

@Component
public class ClaimsDaoImpl implements ClaimsDao {
	
	@Autowired
	private SqlSession sqlSession;

	private static final Logger logger = LoggerFactory.getLogger(ClaimsDaoImpl.class);

//	@Override
//	public List<ClaimHistory> retrieveClaimHistory(HashMap<String, Object> params) throws SQLException {
//		List<ClaimHistory> clmHistory = sqlSession.selectList("retrieveClaimHistory", params);
//		return clmHistory;
//	}
	
	@Override
	public List<ClaimReserve> retrieveClaimHistory(HashMap<String, Object> params) throws SQLException {
		List<ClaimReserve> clmHistoryList = sqlSession.selectList("retrieveClaimHistory", params);
		return clmHistoryList;
	}

	@Override
	public Integer saveClaimHistory(HashMap<String, Object> params) throws SQLException {
		Integer saveClaimHistory = sqlSession.update("saveClaimHistory",params);
		return saveClaimHistory;
	}

	public List<Claims> retrieveClaimListing(HashMap<String, Object> params) throws SQLException {
		List<Claims> res = sqlSession.selectList("retrieveClaimListing", params);
		return res;
	}

	@Override
	public Claims retrieveClmGenInfo(HashMap<String, Object> params) throws SQLException {
		Claims claim = sqlSession.selectOne("retrieveClmGenInfo", params);
		return claim;
	}
	
	@Override
	public Claims retrieveClaimSecCover(HashMap<String, Object> params) throws SQLException {
		Claims claims = sqlSession.selectOne("retrieveClaimSecCover",params);
		return claims;
	}

	@Override
	public HashMap<String, Object> saveClaimSecCover(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveClaimSecCover",params);
		params.put("errorCode", errorCode);
		return params;
	}


	@Override
	public HashMap<String, Object> saveClaimsAttachment(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer errorCode = sqlSession.update("saveClaimsAttachment",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<Attachment> retrieveClaimsAttachmentList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Attachment> claimsAttachmentList = sqlSession.selectList("retrieveClaimsAttachment", params);
		return claimsAttachmentList;
	}

	@Override
	public List<ClaimApprovedAmt> retrieveClaimApprovedAmt(HashMap<String, Object> params) throws SQLException {
		List<ClaimApprovedAmt> clmApprovedAmt = sqlSession.selectList("retrieveClaimApprovedAmt", params);
		return clmApprovedAmt;
	}

	@Override
	public Integer saveClaimApprovedAmt(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveClaimApprovedAmt",params);
		return errorCode;
	}

	@Override
	public List<Claims> retrieveChangeClmStatus(HashMap<String, Object> params) throws SQLException {
		List<Claims> res = sqlSession.selectList("retrieveChangeClmStatus", params);
		return res;
	}

	@Override
	public List<Claims> retrieveClaimReserve(HashMap<String, Object> params) throws SQLException {
		List<Claims> clmReserve = sqlSession.selectList("retrieveClaimReserve", params);
		return clmReserve;
	}

	@Override
	public Integer updateClaimStatus(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("updateClaimStatus",params);
		return res;
	}

	@Override
	public Integer saveClmAdjuster(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveClmAdjuster",params);
		return res;
	}

	@Override
	public HashMap<String, Object> saveClmGenInfo(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveClmGenInfo", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> saveClaimResStat(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveClaimResStat",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public Integer updateClmDetails(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("updateClmDetails",params);
		return res;
	}

}
