package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.MaintenanceDao;
import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.maintenance.Intermediary;
import ph.cpi.rest.api.model.maintenance.Line;
import ph.cpi.rest.api.model.maintenance.LineClass;

@Component
public class MaintenanceDaoImpl implements MaintenanceDao{

	@Autowired
	private SqlSession sqlSession;

	@Override
	public Alop retrieveQuoteAlop(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Alop alop = sqlSession.selectOne("retrieveMaintenanceSample", params);
		return alop;
	}

	@Override
	public List<Alop> retrieveQuoteAlopList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Alop> alopList = sqlSession.selectList("retrieveMaintenanceSample", params);
		return alopList;
	}

	@Override
	public Intermediary retrieveMntIntermediary(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Intermediary intermediary = sqlSession.selectOne("retrieveMntIntermediary", params);
		System.out.println("retrieveMntIntermediaryDAO : " + intermediary);
		return intermediary;
	}

	@Override
	public List<Line> retrieveMntLine(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Line> line = sqlSession.selectList("retrieveMntLine", params);
		return line;
	}

	@Override
	public LineClass retrieveMntLineClass(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		LineClass lineClass = sqlSession.selectOne("retrieveMntLineClass", params);
		System.out.println("retrieveMntLineClassDao : " + lineClass);
		return lineClass;
	}




	

}
