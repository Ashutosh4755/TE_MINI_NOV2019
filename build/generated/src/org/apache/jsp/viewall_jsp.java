package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class viewall_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("table {\r\n");
      out.write("  font-family: arial, sans-serif;\r\n");
      out.write("  border-collapse: collapse;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td, th {\r\n");
      out.write("  border: 1px solid #dddddd;\r\n");
      out.write("  text-align: left;\r\n");
      out.write("  padding: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:nth-child(even) {\r\n");
      out.write("  background-color: #dddddd;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#D2B4DE\">\r\n");
      out.write("     ");

      Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pranju","root","");  
        PreparedStatement ps=con.prepareStatement("select * from cetring");
         
       
        ResultSet rs=ps.executeQuery();
        
        
       
        
        
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("<a href=\"adminhome.jsp\"><h2>Home</h2></a>\r\n");
      out.write("\r\n");
      out.write("<h2>CATERING INFO</h2>\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>ID</th>\r\n");
      out.write("    <th>Name</th>\r\n");
      out.write("    <th>Veg</th>\r\n");
      out.write("    <th>Non-Veg</th>\r\n");
      out.write("    <th>Starter</th>\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

        while(rs.next())
        {
            
            
      out.write("\r\n");
      out.write("        \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>");
      out.print(rs.getInt(1));
      out.write("</td>\r\n");
      out.write("    \r\n");
      out.write("  <td>");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write(" \r\n");
      out.write("  <td>");
      out.print(rs.getInt(3));
      out.write("</td>\r\n");
      out.write("  <td>");
      out.print(rs.getInt(4));
      out.write("</td>\r\n");
      out.write("  \r\n");
      out.write("  <td>");
      out.print(rs.getInt(5));
      out.write("</td>\r\n");
      out.write(" \r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

        }
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("</table>\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
