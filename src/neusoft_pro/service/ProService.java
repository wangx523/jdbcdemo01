package neusoft_pro.service;

import com.neusoft.entity.Pro;

import java.sql.SQLException;
import java.util.List;

public interface ProService {
    Pro findByPid(int pro_id) throws SQLException;

    List<Pro> findByPri(double price) throws SQLException;
}
