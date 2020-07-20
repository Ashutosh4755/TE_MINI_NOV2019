package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class contact1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<title>atozknowledge.com demo Regjsp</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("body {font-family: \"Times New Roman\", Georgia, Serif;}\r\n");
      out.write("h1,h2,h3,h4,h5,h6 {\r\n");
      out.write("    font-family: \"Playfair Display\";\r\n");
      out.write("    letter-spacing: 5px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("    <form action=\"myin.jsp\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

try{
String name1=request.getParameter("name");
	
String email1=request.getParameter("email");

String phone1=request.getParameter("phone");

String subject1=request.getParameter("subject");

String message1=request.getParameter("msg");

Class.forName("com.mysql.jdbc.Driver"); 

java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pranju","root",""); 
Statement st= con.createStatement(); 
ResultSet rs; 
int i=st.executeUpdate("insert into contact123 values ('"+name1+"','"+email1+"','"+phone1+"','"+subject1+"','"+message1+"')"); 

out.println("Registered"); 
}
catch(Exception e){}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Navbar (sit on top) -->\r\n");
      out.write("<div class=\"w3-top\">\r\n");
      out.write("  <div class=\"w3-bar w3-white w3-padding w3-card\" >\r\n");
      out.write("      <h1 class=\"w3-left\"><b><i>EVENT PLANNERS</i></b></h1>\r\n");
      out.write("    <!-- Right-sided navbar links. Hide them on small screens -->\r\n");
      out.write("    <div class=\"w3-right w3-hide-small\">\r\n");
      out.write("        <a href=\"mainpage.jsp\" class=\"w3-bar-item w3-button\">HOME</a>\r\n");
      out.write("      <a href=\"aboutus.jsp\" class=\"w3-bar-item w3-button\">OUR STORY</a>\r\n");
      out.write("      <a href=\"gallery.jsp\" class=\"w3-bar-item w3-button\">GALLERY</a>\r\n");
      out.write("      <a href=\"contact1.jsp\" class=\"w3-bar-item w3-button\">CONTACT</a>\r\n");
      out.write("         <div class=\"w3-dropdown-hover\">\r\n");
      out.write("  <button class=\"w3-button\">SERVICES</button>\r\n");
      out.write("  <div class=\"w3-dropdown-content w3-bar-block w3-border\">\r\n");
      out.write("    <a href=\"services1.jsp\" class=\"w3-bar-item w3-button\">WEDDING</a>\r\n");
      out.write("    <a href=\"services2.jsp\" class=\"w3-bar-item w3-button\">SOCIAL EVENTS</a>\r\n");
      out.write("    <a href=\"services3.jsp\" class=\"w3-bar-item w3-button\">CORPORATE EVENTS</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div> \r\n");
      out.write("                       \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"w3-dropdown-hover\">\r\n");
      out.write("  <button class=\"w3-button\">LOGIN</button>\r\n");
      out.write("  <div class=\"w3-dropdown-content w3-bar-block w3-border\">\r\n");
      out.write("    <a href=\"adminlogin.jsp\" class=\"w3-bar-item w3-button\">ADMIN LOGIN</a>\r\n");
      out.write("    <a href=\"userlogin.jsp\" class=\"w3-bar-item w3-button\">USER LOGIN</a>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("</div> \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("                                 <div class=\"w3-dropdown-hover\">\r\n");
      out.write("  <button class=\"w3-button\">ORGANIZER</button>\r\n");
      out.write("  <div class=\"w3-dropdown-content w3-bar-block w3-border\">\r\n");
      out.write("    <a href=\"cetring.jsp\" class=\"w3-bar-item w3-button\">CATERING </a>\r\n");
      out.write("    <a href=\"decoration.jsp\" class=\"w3-bar-item w3-button\">DECORATION</a>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("</div>  \r\n");
      out.write("       \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("    <div class=\"w3-container\">\r\n");
      out.write(" \r\n");
      out.write("  <p>Come enjoy every happy moment with us....</p>\r\n");
      out.write("  <img src=\"images/c1.jpg\" alt=\"Lights\" class=\"w3-image\" width=\"1600\" height=\"400\" style=\"width:100%\">\r\n");
      out.write("</div>\r\n");
      out.write("      \r\n");
      out.write("<div class=\"w3-content\" style=\"max-width:1100px\">\r\n");
      out.write("        <hr>\r\n");
      out.write("\r\n");
      out.write("  <!-- Contact Section -->\r\n");
      out.write("  <div class=\"w3-container w3-padding-64\" id=\"contact\">\r\n");
      out.write("   <h1>CONTACT US</h1><br>\r\n");
      out.write("    <p>EMS events provides services for wedding planning,corporate event management,brand promotions,and entertainment in fact one-stop-solutions to all your event management needs.</p>\r\n");
      out.write("    <p class=\"w3-text-blue-grey w3-large\"><b>EMS,Pune-33</b></p>\r\n");
      out.write("    <p>You can also contact us by phone 00553123-2323 or email ems@gmail.com, or you can send us a message here:</p>\r\n");
      out.write("\r\n");
      out.write("      <p><input class=\"w3-input w3-padding-16\" type=\"text\" id=\"name\" placeholder=\"name\" name=\"name\"></p>\r\n");
      out.write("      \r\n");
      out.write("      <p><input class=\"w3-input w3-padding-16\" type=\"text\" id=\"sname\" placeholder=\"email\" name=\"email\"></p>\r\n");
      out.write("      \r\n");
      out.write("      <p><input class=\"w3-input w3-padding-16\" type=\"text\" id=\"sname\" placeholder=\"phone\" name=\"phone\" ></p>\r\n");
      out.write("      \r\n");
      out.write("      <p><input class=\"w3-input w3-padding-16\" type=\"text\" id=\"sname\" placeholder=\"subject\" name=\"subject\"></p>\r\n");
      out.write("      \r\n");
      out.write("      <p><input class=\"w3-input w3-padding-16\" type=\"text\" id=\"sname\" placeholder=\"message\" name=\"msg\"></p>\r\n");
      out.write("      \r\n");
      out.write("      <p><button class=\"w3-button w3-light-grey w3-section\" type=\"submit\">SEND MESSAGE</button></p>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("<!-- End page content -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
