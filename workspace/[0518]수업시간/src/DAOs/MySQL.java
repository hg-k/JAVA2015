package DAOs;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

import entity.CEntity;

public class MySQL implements IDAO{
	
	private final static String DRIVER = "com.mysql.jdbc.Driver";	//드라이버 경로
	private final static String URL = "jdbc:mysql://localhost:3306/javalms";	
	private final static String ID = "java";		//account의 id, pw
	private final static String PASSWORD = "mju12345";
	
	private Connection connection;
	private Statement statement;	//데이터를 보내는 채널
	private PreparedStatement pstatement;
	private ResultSet resultSet;	//데이터를 받는 채널
	private String tableName;
	
	public MySQL() throws ClassNotFoundException{
		Class.forName(DRIVER); //MySQL에 자바 클래스를 올림
	}
	
	
	@Override
	public void createAccount() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
			, "root"
			, "mju12345");
		String sql = "grant all privileges on *.* to java@localhost "
				+"identified by 'mju12345' with grant option;";
		statement = connection.createStatement();
		statement.executeUpdate(sql);
		connection.close();
		statement.close();
	}
	
	@Override
	public void createDB() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
				, ID
				, PASSWORD);
			String sql = "create database javalms;";
			statement = connection.createStatement();
			statement.executeUpdate(sql);
			connection.close();
			statement.close();
	}

	@Override
	public void createTable() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL
		,ID
		,PASSWORD);
			String sql = "create table user "
						+"(id varchar(10) not null primary key,"
						+"password varchar(10) not null,"
						+"name varchar(10) not null);";
			statement = connection.createStatement();
			statement.executeUpdate(sql);
			connection.close();
			statement.close();
	}

	@Override
	public void insertData() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL
				,ID
				,PASSWORD);
					String sql = "insert into user(id,password,name)"
							+"values(?,?,?);";
					pstatement = (PreparedStatement) connection.prepareStatement(sql);
					pstatement.setString(1,"id0");
					pstatement.setString(2,"pw0");
					pstatement.setString(3,"name0");
					pstatement.executeUpdate();
					pstatement = (PreparedStatement) connection.prepareStatement(sql);
					pstatement.setString(1,"id1");
					pstatement.setString(2,"pw1");
					pstatement.setString(3,"name1");
					pstatement.executeUpdate();
					pstatement = (PreparedStatement) connection.prepareStatement(sql);
					pstatement.setString(1,"id2");
					pstatement.setString(2,"pw2");
					pstatement.setString(3,"name2");
					pstatement.executeUpdate();
					pstatement = (PreparedStatement) connection.prepareStatement(sql);
					pstatement.setString(1,"id3");
					pstatement.setString(2,"pw3");
					pstatement.setString(3,"name3");
					pstatement.executeUpdate();
					pstatement = (PreparedStatement) connection.prepareStatement(sql);
					pstatement.setString(1,"id4");
					pstatement.setString(2,"pw4");
					pstatement.setString(3,"name4");
					pstatement.executeUpdate();
					
					connection.close();
					pstatement.close();		
	}

	@Override
	public void updateData() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL
				,ID
				,PASSWORD);
					String sql = "update user set id = 'id5' , password = 'pw5', "
							+"name = 'name5' where id = 'id0';";		
					statement = connection.createStatement();
					statement.executeUpdate(sql);
					connection.close();
					statement.close();
	}
	
	@Override
	public void selectData() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL
				,ID
				,PASSWORD);
					String sql = "select * from user;";
					statement = connection.createStatement();
					resultSet = statement.executeQuery(sql);
					
					while(resultSet.next()){
						String id = resultSet.getString("id");
						String password = resultSet.getString("password");
						String name = resultSet.getString("name");
						System.out.println(id+""+password+""+name);
					}
					connection.close();
					statement.close();
					resultSet.close();
	}

	@Override
	public void deleteData() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL
				,ID
				,PASSWORD);
					String sql = "delete from user where id = 'id5';";	
					statement = connection.createStatement();
					statement.executeUpdate(sql);
					connection.close();
					statement.close();
	}

	@Override
	public void droptable() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL
				,ID
				,PASSWORD);
					String sql = "drop table user;";	
					statement = connection.createStatement();
					statement.executeUpdate(sql);
					connection.close();
					statement.close();
	}

	@Override
	public void dropDB() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL
				,ID
				,PASSWORD);
					String sql = "drop database javalms;";	
					statement = connection.createStatement();
					statement.executeUpdate(sql);
					connection.close();
					statement.close();
	}

	@Override
	public void dropAccount() throws SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306"
				, "root"
				, "mju12345");
					String sql = "drop user java@localhost;";	
					statement = connection.createStatement();
					statement.executeUpdate(sql);
					connection.close();
					statement.close();
	}
	@Override
	public void connect(String name) throws IOException, SQLException {
		// TODO Auto-generated method stub
		connection = DriverManager.getConnection(URL, ID, PASSWORD);		//DB에 로그인한것
		this.tableName = name;
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select* from "+ this.tableName);	//테이블에서 데이터를 홀라당 받아와라
	}
	
	@Override
	public void disconnect() throws IOException, SQLException {
		// TODO Auto-generated method stub
		if(connection==null){
			return;
		}
		connection.close();
		statement.close();
		resultSet.close();
	}

	@Override
	public CEntity read(CEntity entity, String ID) throws SQLException {
		// TODO Auto-generated method stub
		while(resultSet.next()){
			entity.DBRead(resultSet);
			if(entity.getID().equals(ID)){
				return entity;
			}
		}
		return null;
	}

	@Override
	public CEntity readNext(CEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void write(CEntity entity) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	


	

}
