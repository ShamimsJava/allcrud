package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.shamim.dao.UserDao;
import com.shamim.bean.User;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String id = request.getParameter("id");
            User user = UserDao.getRecordById(Integer.parseInt(id));
        
      out.write("\n");
      out.write("\n");
      out.write("        <h1>Update Form</h1>\n");
      out.write("        <form action=\"#\">\n");
      out.write("            <input type=\"hidden\" name=\"id\" value=\"");
      out.print(user.getId());
      out.write("\">\n");
      out.write("            <b>First Name</b>\n");
      out.write("            <input type=\"text\" name=\"fname\" value=\"");
      out.print(user.getFname());
      out.write("\"><br>\n");
      out.write("            <b>Last Name</b>\n");
      out.write("            <input type=\"text\" name=\"lname\" value=\"");
      out.print(user.getLname());
      out.write("\"><br>\n");
      out.write("            <b>Username</b>\n");
      out.write("            <input type=\"text\" name=\"username\" value=\"");
      out.print(user.getUsername());
      out.write("\"><br>\n");
      out.write("            <b>Password</b>\n");
      out.write("            <input type=\"password\" name=\"password\" value=\"");
      out.print(user.getPassword());
      out.write("\"><br><br>\n");
      out.write("            <input type=\"submit\" value=\"Update\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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