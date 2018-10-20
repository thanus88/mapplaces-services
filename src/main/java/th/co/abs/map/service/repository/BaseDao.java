package th.co.abs.map.service.repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BaseDao {
    public void close(ResultSet rs) throws Exception {
        if (rs != null)
            rs.close();
    }

    public void close(CallableStatement cstmt) throws Exception {
        if (cstmt != null)
            cstmt.close();
    }

    public void close(PreparedStatement pstmt) throws Exception {
        if (pstmt != null)
            pstmt.close();
    }

    public void close(Connection fvConn) throws Exception {
        if (fvConn != null)
            fvConn.close();
    }
}