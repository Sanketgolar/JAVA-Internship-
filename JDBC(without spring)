
import java.sql.*;


public class JDBC {

    public static void main(String args[]) throws SQLException
    {
        String url="jdbc:mysql://localhost/sanket";
        String uname="root";
        String password="ssg12345";
        String query="select * from employee;";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(Exception e){e.printStackTrace();}
        try{
            Connection con=DriverManager.getConnection(url,uname,password);
            Statement st= con.createStatement();
                ResultSet res=st.executeQuery(query);

                while(res.next())
                {
                    String data="";
                    for (int i=1;i<=4;i++)
                    {
                        data+=res.getString(i)+" ->";
                    }
                    System.out.println(data);
                }
        }catch(SQLException e){e.printStackTrace();}


    }
}
