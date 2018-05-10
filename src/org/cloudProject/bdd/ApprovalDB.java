package org.cloudProject.bdd;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.cloudProject.beans.Approval;

public class ApprovalDB {

	public static List<Approval> ListApproval() {

		List<Approval> approvals = new ArrayList<>();

		System.out.println("-------- PostgreSQL JDBC Connection to ApprovalDB Starting ------------");

		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			System.out.println("No PostgreSQL JDBC Driver found.");
			e.printStackTrace();
			return approvals;

		}

		System.out.println("PostgreSQL JDBC Driver Registered!");

		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;

		try {

			connection = getConnection();
		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return approvals;

		} catch (URISyntaxException e) {
			System.err.println("URI problem append");
			e.printStackTrace();
		}

		if (connection != null) {
			System.out.println("connected");
			try {
				statement = connection.createStatement();
				result = statement.executeQuery("SELECT id, loanresponse FROM approval;");
				result = statement.executeQuery("SELECT id, loanresponse FROM approval;");

				while (result.next()) {
					Approval approval = new Approval();

					int id = result.getInt("id");
					boolean response = result.getBoolean("loanresponse");

					approval.setId(id);
					approval.setResponse(response);

					approvals.add(approval);

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (connection != null) {
						connection.close();
					}
					if (statement != null) {
						statement.close();
					}
					if (result != null) {
						result.close();
					}

				} catch (SQLException e) {
					System.out.println("Failed to close connection!");
					e.printStackTrace();
				}
			}

		} else {
			System.out.println("Failed to make connection!");
		}
		return approvals;
	}

	private static Connection getConnection() throws URISyntaxException, SQLException {
		URI dbUri = new URI(System.getenv("DATABASE_URL"));

		String username = dbUri.getUserInfo().split(":")[0];
		String password = dbUri.getUserInfo().split(":")[1];
		String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath()
				+ "?sslmode=require";

		return DriverManager.getConnection(dbUrl, username, password);
	}
}
