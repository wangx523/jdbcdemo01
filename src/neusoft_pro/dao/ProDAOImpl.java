package neusoft_pro.dao;

import com.neusoft.entity.Pro;
import com.neusoft.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProDAOImpl implements ProDAO {
    private final String URL = "jdbc:mariadb://localhost:3306/product";
    private final String USER = "root";
    private final String PASSWORD = "mariadb";

    public Pro findByPid(int pro_id) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        Pro pro = null;

        try {
            connection = DBUtil.getConnection(URL, USER, PASSWORD);
            final String SQL = "SELECT pro_id,sku,title,price from product where pro_id = ?;";
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, pro_id);
            resultSet = preparedStatement.executeQuery(SQL);
            while (resultSet.next()) {
                pro = new Pro(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDouble(4));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }

        }
        return pro;
    }

    public List<Pro> findByPri(double price) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        List<Pro> pros = new ArrayList<>();
        try {
            connection = DBUtil.getConnection(URL, USER, PASSWORD);
            final String SQL = "SELECT pro_id,sku,title,price from product where price > ?;";
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setDouble(1, price);
            resultSet = preparedStatement.executeQuery(SQL);
            while (resultSet.next()) {
                pros.add(new Pro(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDouble(4)));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        }
        return pros;
    }
}
