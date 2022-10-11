package com.kainos.ea.resources;
import java.sql.*;
import com.kainos.ea.model.Employee;

public class EmployeeDao {

    public void insertEmployee(Employee employee, Connection connection) throws SQLException {

        String insertOrderQuery = "INSERT INTO `Sales` VALUES (10, 'Bob', 80000, '23454345', 'PJ8933856', ?, ?, ?)";

        PreparedStatement preparedStmt = connection.prepareStatement(insertOrderQuery);
        preparedStmt.setString(1, "07898463764");
        preparedStmt.setInt(2,2);
        preparedStmt.setInt(3,2);

        preparedStmt.execute();

    }


    public Employee getEmployee(Connection connection, int employeeID) throws SQLException {
        String query = "SELECT * FROM Sales WHERE salesEmpID = ?";
        PreparedStatement preparedStmt = connection.prepareStatement(query);
        preparedStmt.setInt(1, employeeID);
        preparedStmt.execute();
        ResultSet rs = preparedStmt.getResultSet();
        Employee dbEmployee = null;
        while (rs.next()) {
            dbEmployee = new Employee(rs.getInt("salesEmpID"),
                    rs.getString("sName"), rs.getInt("salary"),
                    rs.getString("bankNo"),
                    rs.getString("NIN"),
                    rs.getString("phoneNo"),
                    rs.getFloat("commissionRate"),
                    rs.getFloat("totalSales")
            );

            System.out.println(dbEmployee);
            System.out.println(employeeID);

        }
        System.out.println(dbEmployee);
        return (dbEmployee);

    }

}

