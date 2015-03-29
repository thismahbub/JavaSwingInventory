package project.ui;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;

public class MyiReportViewer extends JInternalFrame
{

    public MyiReportViewer(String fileName)
    {
        this(fileName,null);
    }

    public MyiReportViewer(String fileName,HashMap parameter)
    {
        super("Report",true,true,true,true);

        try
        {

            /* load the required JDBC driver and create the connection
            here JDBC-ODBC Bridge Driver is used*/
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/project","admin","admin");
            JasperPrint print = JasperFillManager.fillReport(fileName, parameter, con);
            
            setLayout(new BorderLayout());

            JRViewer viewer=new JRViewer(print);

            add(viewer);

        }
        catch(ClassNotFoundException cnfe)
        {
            cnfe.printStackTrace();
        }
        catch(SQLException sqle)
        {
            sqle.printStackTrace();
        }
        catch(JRException jre)
        {
            jre.printStackTrace();
        }

    }

}