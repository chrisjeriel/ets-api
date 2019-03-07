package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public interface UserDao {

	public List<String> userLogin(final HashMap<String, Object> params) throws SQLException;
	
}
