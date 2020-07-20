package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <title>Register</title>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"style2.css\">\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("  <section class=\"section\">\r\n");
      out.write("    <header>\r\n");
      out.write("      <h3>Register</h3>\r\n");
      out.write("      <h4>Please fill your information in this form</h4>\r\n");
      out.write("    </header>\r\n");
      out.write("    \r\n");
      out.write("      <form action=\"insertuser.jsp\" method=\"post\">\r\n");
      out.write("        <div class=\"form-item box-item\">\r\n");
      out.write("          <input type=\"text\" name=\"name\" class=\"tx1\" placeholder=\"Name\" required>\r\n");
      out.write("          <small class=\"errorReq\"><i class=\"fa fa-asterisk\" aria-hidden=\"true\"></i> required field</small>\r\n");
      out.write("        </div>\r\n");
      out.write("          \r\n");
      out.write("           <div class=\"form-item box-item\">\r\n");
      out.write("               <input type=\"text\" name=\"mob\" class=\"tx1\" minlength=\"10\" maxlength=\"10\" placeholder=\"Mobile\" required>\r\n");
      out.write("          <small class=\"errorReq\"><i class=\"fa fa-asterisk\" aria-hidden=\"true\"></i> required field</small>\r\n");
      out.write("        </div>\r\n");
      out.write("          \r\n");
      out.write("           <div class=\"form-item box-item\">\r\n");
      out.write("          <input type=\"text\" name=\"user\" class=\"tx1\" placeholder=\"Username\" required>\r\n");
      out.write("          <small class=\"errorReq\"><i class=\"fa fa-asterisk\" aria-hidden=\"true\"></i> required field</small>\r\n");
      out.write("        </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("              <div class=\"form-item box-item\">\r\n");
      out.write("          <input type=\"text\" name=\"pass\" class=\"tx1\" placeholder=\"Password\" required>\r\n");
      out.write("          <small class=\"errorReq\"><i class=\"fa fa-asterisk\" aria-hidden=\"true\"></i> required field</small>\r\n");
      out.write("        </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("        \r\n");
      out.write("          \r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("          <input type=\"submit\" span id=\"submit\" class=\"submit\" value=\"submit\" >\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("      </form>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <i class=\"wave\"></i>\r\n");
      out.write("  </section>\r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
