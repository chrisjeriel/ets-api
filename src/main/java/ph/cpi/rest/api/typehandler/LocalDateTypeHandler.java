package ph.cpi.rest.api.typehandler;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;


@MappedTypes(LocalDateTime.class)
public class LocalDateTypeHandler implements TypeHandler
{

    /* (non-Javadoc)
     * @see org.apache.ibatis.type.TypeHandler#setParameter(java.sql.PreparedStatement, int, java.lang.Object, org.apache.ibatis.type.JdbcType)
     */
    public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException
    {
        LocalDate date = (LocalDate) parameter;
        if (date != null)
        {
            ps.setDate(i, new Date(date.toDateTimeAtStartOfDay().toDate().getTime()));
        }
        else
        {
            ps.setDate(i, null);
        }
    }

    /* (non-Javadoc)
     * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.ResultSet, java.lang.String)
     */
    public Object getResult(ResultSet rs, String columnName) throws SQLException
    {
    	
        Date date = rs.getDate(columnName);
        if (date != null)
        {
            return new LocalDateTime(date.getTime());
        }
        else
        {
            return null;
        }
    }

    /* (non-Javadoc)
     * @see org.apache.ibatis.type.TypeHandler#getResult(java.sql.CallableStatement, int)
     */
    public Object getResult(CallableStatement cs, int columnIndex) throws SQLException
    {
        Date date = cs.getDate(columnIndex);
        if (date != null)
        {
            return new LocalDateTime(date.getTime());
        }
        else
        {
            return null;
        }
    }

	@Override
	public Object getResult(ResultSet rs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		Date date = rs.getDate(columnIndex);
        if (date != null)
        {
            return new LocalDateTime(date.getTime());
        }
        else
        {
            return null;
        }
	}

}