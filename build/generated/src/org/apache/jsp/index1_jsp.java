package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<style>\r\n");
      out.write("body {font-family: \"Times New Roman\", Georgia, Serif;}\r\n");
      out.write("h1,h2,h3,h4,h5,h6 {\r\n");
      out.write("    font-family: \"Playfair Display\";\r\n");
      out.write("    letter-spacing: 5px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"w3-top\">\r\n");
      out.write("  <div class=\"w3-bar w3-white w3-padding w3-card\" >\r\n");
      out.write("      <h1 class=\"w3-left\"><b><i>EVENT PLANNERS</i></b></h1>\r\n");
      out.write("    <!-- Right-sided navbar links. Hide them on small screens -->\r\n");
      out.write("    <div class=\"w3-right w3-hide-small\">\r\n");
      out.write("        <a href=\"index1.jsp\" class=\"w3-bar-item w3-button\">HOME</a>\r\n");
      out.write("      <a href=\"adminlogin.jsp\" class=\"w3-bar-item w3-button\">Admin Login</a>\r\n");
      out.write("      <a href=\"userlogin.jsp\" class=\"w3-bar-item w3-button\">User Login</a>\r\n");
      out.write("    <a href=\"cetring.jsp\" class=\"w3-bar-item w3-button\">Cetring Regi</a>\r\n");
      out.write("     <a href=\"decoration.jsp\" class=\"w3-bar-item w3-button\">Decoration Regi</a>\r\n");
      out.write("         <div class=\"w3-dropdown-hover\">\r\n");
      out.write("  <button class=\"w3-button\">SERVICES</button>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("</div> \r\n");
      out.write("      \r\n");
      out.write("               <div class=\"w3-dropdown-hover\">\r\n");
      out.write("  <button class=\"w3-button\">LOGIN</button>\r\n");
      out.write("  <div class=\"w3-dropdown-content w3-bar-block w3-border\">\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header class=\"w3-display-container w3-content w3-wide\" style=\"max-width:1600px;min-width:500px\" id=\"home\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div class=\"w3-content w3-section\" style=\"max-width:1500px\">\r\n");
      out.write("  <img class=\"mySlides\" src=\"images/image1.jpg\" style=\"width:100%\">\r\n");
      out.write("  <img class=\"mySlides\" src=\"images/image2.jpg\" style=\"width:100%\">\r\n");
      out.write("  <img src=\"images/image10.jpg\" style=\"width:100%\">\r\n");
      out.write("      \r\n");
      out.write("    <img class=\"mySlides\" src=\"images/wed.jpg\" style=\"width:100%\">\r\n");
      out.write("    <img class=\"mySlides\" src=\"images/naming.jpg\" style=\"width:100%\">  \r\n");
      out.write("    <img class=\"mySlides\" src=\"images/birth1.jpg\" style=\"width:100%\">\r\n");
      out.write("    <img class=\"mySlides\" src=\"images/birth.jpg\" style=\"width:100%\">\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var myIndex = 0;\r\n");
      out.write("carousel();\r\n");
      out.write("\r\n");
      out.write("function carousel() {\r\n");
      out.write("    var i;\r\n");
      out.write("    var x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("    for (i = 0; i < x.length; i++) {\r\n");
      out.write("       x[i].style.display = \"none\";  \r\n");
      out.write("    }\r\n");
      out.write("    myIndex++;\r\n");
      out.write("    if (myIndex > x.length) {myIndex = 1}    \r\n");
      out.write("    x[myIndex-1].style.display = \"block\";  \r\n");
      out.write("    setTimeout(carousel, 6000); // Change image every 2 seconds\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body> \r\n");
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
