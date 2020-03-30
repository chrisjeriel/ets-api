package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.UtilDao;
import ph.cpi.rest.api.model.utils.CLMR010B;
import ph.cpi.rest.api.model.utils.CLMR010D;
import ph.cpi.rest.api.model.utils.CLMR010H;
import ph.cpi.rest.api.model.utils.CLMR010I;
import ph.cpi.rest.api.model.utils.CLMR010J;
import ph.cpi.rest.api.model.utils.CLMR010K;
import ph.cpi.rest.api.model.utils.CLMR010M;
import ph.cpi.rest.api.model.utils.CLMR010N;
import ph.cpi.rest.api.model.utils.POLR044;
import ph.cpi.rest.api.model.utils.POLR044A;
import ph.cpi.rest.api.model.utils.POLR044B;
import ph.cpi.rest.api.model.utils.POLR044C;
import ph.cpi.rest.api.model.utils.POLR044D;
import ph.cpi.rest.api.model.utils.POLR044E;
import ph.cpi.rest.api.model.utils.POLR044F;
import ph.cpi.rest.api.model.utils.POLR044G;
import ph.cpi.rest.api.model.utils.POLR044H;
import ph.cpi.rest.api.model.utils.POLR044I;
import ph.cpi.rest.api.model.utils.POLR044J;
import ph.cpi.rest.api.model.utils.POLR044K;
import ph.cpi.rest.api.model.utils.POLR044L;
import ph.cpi.rest.api.model.utils.POLR044M;
import ph.cpi.rest.api.model.utils.POLR044N;
import ph.cpi.rest.api.model.utils.POLR044O;
import ph.cpi.rest.api.model.utils.POLR044P;
import ph.cpi.rest.api.model.utils.POLR044Q;
import ph.cpi.rest.api.model.utils.POLR044R;
import ph.cpi.rest.api.model.utils.POLR044S;
import ph.cpi.rest.api.model.utils.POLR044T;
import ph.cpi.rest.api.model.utils.POLR052A;
import ph.cpi.rest.api.model.utils.POLR052B;
import ph.cpi.rest.api.model.utils.POLR052C;
import ph.cpi.rest.api.model.utils.POLR052E;
import ph.cpi.rest.api.model.utils.POLR052F;

@Component
public class UtilDaoImpl implements UtilDao{
	
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(UtilDaoImpl.class);

	@Override
	public Integer extractReport(HashMap<String, Object> params) throws SQLException {
		logger.info("extractReport DAO : " + params);
		Integer resultCode = 99;
		String extractionMethod = "";
		String reportId = (String) params.get("reportId");
		
		if ("POLR044A".equalsIgnoreCase((String) params.get("reportId"))) {
            	extractionMethod = "extractPOLR044A";
        } else if ("POLR044B".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044B";
        } else if ("POLR044C".equalsIgnoreCase((String) params.get("reportId"))) {
            	extractionMethod = "extractPOLR044C";
        } else if ("POLR044D".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044D";
        } else if ("POLR044E".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044E";
        } else if ("POLR044F".equalsIgnoreCase((String) params.get("reportId"))) {
            	extractionMethod = "extractPOLR044F";
        } else if ("POLR044G".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044G";
        } else if ("POLR044H".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044H";
        } else if ("POLR044I".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044I";
        } else if ("POLR044J".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044J";
        } else if ("POLR044K".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044K";
        } else if ("POLR044L".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044L";
        } else if ("POLR044M".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044M";
        } else if ("POLR044N".equalsIgnoreCase((String) params.get("reportId"))) {
                extractionMethod = "extractPOLR044N";
        } else if ("POLR044O".equalsIgnoreCase((String) params.get("reportId"))) {
        	extractionMethod = "extractPOLR044O";
        } else if ("POLR044P".equalsIgnoreCase((String) params.get("reportId"))) {
        	extractionMethod = "extractPOLR044P";
        } else if ("POLR044Q".equalsIgnoreCase((String) params.get("reportId"))) {
        	extractionMethod = "extractPOLR044Q";
        } else if ("ACITR061F".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractACITR061F";
        } else if ("ACITR061G".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractACITR061G";
        } else if ("POLR044V".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR044V";
        } else if ("POLR044W".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR044W";
        } else if ("POLR044X".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR044X";
        } else if ("ACITR048A".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractACITR048A";
        } else if ("CLMR010A".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractCLMR010A";
        } else if ("POLR044OA".equalsIgnoreCase((String) params.get("reportId"))) {
        	extractionMethod = "extractPOLR044OA";
        } else if ("POLR044OB".equalsIgnoreCase((String) params.get("reportId"))) {
        	extractionMethod = "extractPOLR044OB";
        }
		
		
		if (reportId.toUpperCase().contains("ACITR052")) {
			extractionMethod = "extractBRDRX";
		}
		
		if ("POLR052A".equalsIgnoreCase((String) params.get("reportId"))) {
			extractionMethod = "extractPOLR052A";
		} else if ("POLR052B".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR052B";
        } else if ("POLR052C".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR052C";
        } else if ("POLR052D".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR052D";
        } else if ("POLR052E".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR052E";
        } else if ("POLR052F".equalsIgnoreCase((String) params.get("reportId"))) {
            extractionMethod = "extractPOLR052F";
        } else if (((String) params.get("reportId")).toUpperCase().contains("CLMR010")) {
            extractionMethod = "extract" + ((String) params.get("reportId"));
        } 
		
		resultCode = sqlSession.update(extractionMethod, params);
		
		return resultCode;
	}

	@Override
	public String getReportFileName(HashMap<String, Object> params) throws SQLException {
		System.out.println(params);
		
		String fileName = sqlSession.selectOne("getReportFileName", params);
		return fileName;
	}

	@Override
	public String getReportPath() throws SQLException {
		String path = sqlSession.selectOne("getReportPath");
		return path;
	}

	@Override
	public List<POLR044E> retrievePolR044e(HashMap<String, Object> params) throws SQLException {
		List<POLR044E> retrievePolR044e = sqlSession.selectList("retrievePolR044e",params);
		return retrievePolR044e;
	}
	
	@Override
	public List<POLR044A> retrievePolR044a(HashMap<String, Object> params) throws SQLException {
		List<POLR044A> retrievePolR044a = sqlSession.selectList("retrievePolR044a",params);
		return retrievePolR044a;
	}

	@Override
	public List<POLR044B> retrievePolR044b(HashMap<String, Object> params) throws SQLException {
		List<POLR044B> retrievePolR044b = sqlSession.selectList("retrievePolR044b",params);
		return retrievePolR044b;
	}

	@Override
	public List<POLR044C> retrievePolR044c(HashMap<String, Object> params) throws SQLException {
		List<POLR044C> retrievePolR044c = sqlSession.selectList("retrievePolR044c",params);
		return retrievePolR044c;
	}

	@Override
	public List<POLR044D> retrievePolR044d(HashMap<String, Object> params) throws SQLException {
		List<POLR044D> retrievePolR044d = sqlSession.selectList("retrievePolR044d",params);
		return retrievePolR044d;
	}

	@Override
	public List<POLR044F> retrievePolR044f(HashMap<String, Object> params) throws SQLException {
		List<POLR044F> retrievePolR044f = sqlSession.selectList("retrievePolR044f",params);
		return retrievePolR044f;
	}

	@Override
	public List<POLR044G> retrievePolR044g(HashMap<String, Object> params) throws SQLException {
		List<POLR044G> retrievePolR044g = sqlSession.selectList("retrievePolR044g",params);
		return retrievePolR044g;
	}

	@Override
	public List<POLR044H> retrievePolR044h(HashMap<String, Object> params) throws SQLException {
		List<POLR044H> retrievePolR044h = sqlSession.selectList("retrievePolR044h",params);
		return retrievePolR044h;
	}

	@Override
	public List<POLR044I> retrievePolR044i(HashMap<String, Object> params) throws SQLException {
		List<POLR044I> retrievePolR044i = sqlSession.selectList("retrievePolR044i",params);
		return retrievePolR044i;
	}

	@Override
	public List<POLR044J> retrievePolR044j(HashMap<String, Object> params) throws SQLException {
		List<POLR044J> retrievePolR044j = sqlSession.selectList("retrievePolR044j",params);
		return retrievePolR044j;
	}

	@Override
	public List<POLR044K> retrievePolR044k(HashMap<String, Object> params) throws SQLException {
		List<POLR044K> retrievePolR044k = sqlSession.selectList("retrievePolR044k",params);
		return retrievePolR044k;
	}

	@Override
	public List<POLR044L> retrievePolR044l(HashMap<String, Object> params) throws SQLException {
		List<POLR044L> retrievePolR044l = sqlSession.selectList("retrievePolR044l",params);
		return retrievePolR044l;
	}

	@Override
	public List<POLR044M> retrievePolR044m(HashMap<String, Object> params) throws SQLException {
		List<POLR044M> retrievePolR044m = sqlSession.selectList("retrievePolR044m",params);
		return retrievePolR044m;
	}

	@Override
	public List<POLR044N> retrievePolR044n(HashMap<String, Object> params) throws SQLException {
		List<POLR044N> retrievePolR044n = sqlSession.selectList("retrievePolR044n",params);
		return retrievePolR044n;
	}

	@Override
	public List<POLR044O> retrievePolR044o(HashMap<String, Object> params) throws SQLException {
		List<POLR044O> retrievePolR044o = sqlSession.selectList("retrievePolR044o",params);
		return retrievePolR044o;
	}

	@Override
	public List<POLR044P> retrievePolR044p(HashMap<String, Object> params) throws SQLException {
		//List<POLR044P> retrievePolR044p = sqlSession.selectList("retrievePolR044p",params);
		return null;
	}

	@Override
	public List<POLR044Q> retrievePolR044q(HashMap<String, Object> params) throws SQLException {
		//List<POLR044Q> retrievePolR044q = sqlSession.selectList("retrievePolR044q",params);
		return null;
	}

	@Override
	public List<POLR044R> retrievePolR044r(HashMap<String, Object> params) throws SQLException {
		//List<POLR044R> retrievePolR044r = sqlSession.selectList("retrievePolR044r",params);
		return null;
	}

	@Override
	public List<POLR044S> retrievePolR044s(HashMap<String, Object> params) throws SQLException {
		//List<POLR044S> retrievePolR044s = sqlSession.selectList("retrievePolR044s",params);
		return null;
	}

	@Override
	public List<POLR044T> retrievePolR044t(HashMap<String, Object> params) throws SQLException {
		//List<POLR044T> retrievePolR044t = sqlSession.selectList("retrievePolR044t",params);
		return null;
	}

	@Override
	public List<POLR052A> retrievePolR052a(HashMap<String, Object> params) throws SQLException {
		List<POLR052A> retrievePolR052a = sqlSession.selectList("retrievePolR052a",params);
		return retrievePolR052a;
	}

	@Override
	public List<POLR052B> retrievePolR052b(HashMap<String, Object> params) throws SQLException {
		List<POLR052B> retrievePolR052b = sqlSession.selectList("retrievePolR052b",params);
		return retrievePolR052b;
	}

	@Override
	public List<POLR052C> retrievePolR052c(HashMap<String, Object> params) throws SQLException {
		List<POLR052C> retrievePolR052c = sqlSession.selectList("retrievePolR052c",params);
		return retrievePolR052c;
	}

	@Override
	public List<POLR052E> retrievePolR052e(HashMap<String, Object> params) throws SQLException {
		List<POLR052E> retrievePolR052e = sqlSession.selectList("retrievePolR052e",params);
		return retrievePolR052e;
	}

	@Override
	public List<POLR052F> retrievePolR052f(HashMap<String, Object> params) throws SQLException {
		List<POLR052F> retrievePolR052f = sqlSession.selectList("retrievePolR052f",params);
		return retrievePolR052f;
	}

	@Override
	public List<CLMR010B> retrieveClmR010b(HashMap<String, Object> params) throws SQLException {
		List<CLMR010B> retrieveClmR010b = sqlSession.selectList("retrieveClmR010b",params);
		return retrieveClmR010b;
	}

	@Override
	public List<CLMR010H> retrieveClmR010h(HashMap<String, Object> params) throws SQLException {
		List<CLMR010H> retrieveClmR010h = sqlSession.selectList("retrieveClmR010h",params);
		return retrieveClmR010h;
	}

	@Override
	public List<CLMR010I> retrieveClmR010i(HashMap<String, Object> params) throws SQLException {
		List<CLMR010I> retrieveClmR010i = sqlSession.selectList("retrieveClmR010i",params);
		return retrieveClmR010i;
	}

	@Override
	public List<CLMR010J> retrieveClmR010j(HashMap<String, Object> params) throws SQLException {
		List<CLMR010J> retrieveClmR010j = sqlSession.selectList("retrieveClmR010j",params);
		return retrieveClmR010j;
	}

	@Override
	public List<CLMR010D> retrieveClmR010d(HashMap<String, Object> params) throws SQLException {
		List<CLMR010D> retrieveClmR010d = sqlSession.selectList("retrieveClmR010d",params);
		return retrieveClmR010d;
	}

	@Override
	public List<CLMR010K> retrieveClmR010k(HashMap<String, Object> params) throws SQLException {
		List<CLMR010K> retrieveClmR010k = sqlSession.selectList("retrieveClmR010k",params);
		return retrieveClmR010k;
	}

	@Override
	public List<CLMR010M> retrieveClmR010m(HashMap<String, Object> params) throws SQLException {
		List<CLMR010M> retrieveClmR010m = sqlSession.selectList("retrieveClmR010m",params);
		return retrieveClmR010m;
	}

	@Override
	public List<CLMR010N> retrieveClmR010n(HashMap<String, Object> params) throws SQLException {
		List<CLMR010N> retrieveClmR010n = sqlSession.selectList("retrieveClmR010n",params);
		return retrieveClmR010n;
	}
	
}
