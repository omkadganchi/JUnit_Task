

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeJUNIT {
	
	
	static int sum(int a, int b) {
		return a+b;
	}

	static int insertData() throws Exception {
		// System.out.println(1);
		Class.forName("com.mysql.jdbc.Driver");
		// System.out.println(2);

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_1169", "root", "root");
		// System.out.println(3);

		Statement statement = con.createStatement();

		String sql = "insert into employee (NAME,ROLE,SALARY) values('Om Kadganchi','Software Trainee Engineer',32000)";

		int updatecount = statement.executeUpdate(sql);
		System.out.println(updatecount);
		return updatecount;
	}

	public static void main(String[] args) throws Exception {
		EmployeeJUNIT employeeJUNIT = new EmployeeJUNIT();
		int receivedCount = employeeJUNIT.insertData();
		if (receivedCount == 1) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}
}
