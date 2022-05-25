package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdateProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/main.css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("<div class=\"container bootstrap snippets bootdeys\">\n");
      out.write("<div class=\"row\">\n");
      out.write("  <div class=\"col-xs-12 col-sm-9\">\n");
      out.write("    <form class=\"form-horizontal\">\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("          <div class=\"panel-body text-center\">\n");
      out.write("           <img src=\"https://bootdey.com/img/Content/avatar/avatar6.png\" class=\"img-circle profile-avatar\" alt=\"User avatar\">\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      <div class=\"panel panel-default\">\n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">User info</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label class=\"col-sm-2 control-label\">Location</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("              <select class=\"form-control\">\n");
      out.write("                <option selected=\"\">Select country</option>\n");
      out.write("                <option>Belgium</option>\n");
      out.write("                <option>Canada</option>\n");
      out.write("                <option>Denmark</option>\n");
      out.write("                <option>Estonia</option>\n");
      out.write("                <option>France</option>\n");
      out.write("              </select>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label class=\"col-sm-2 control-label\">Company name</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("              <input type=\"text\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label class=\"col-sm-2 control-label\">Position</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("              <input type=\"text\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"panel panel-default\">\n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">Contact info</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label class=\"col-sm-2 control-label\">Work number</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("              <input type=\"tel\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label class=\"col-sm-2 control-label\">Mobile number</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("              <input type=\"tel\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label class=\"col-sm-2 control-label\">E-mail address</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("              <input type=\"email\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label class=\"col-sm-2 control-label\">Work address</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("              <textarea rows=\"3\" class=\"form-control\"></textarea>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"panel panel-default\">\n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("        <h4 class=\"panel-title\">Security</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label class=\"col-sm-2 control-label\">Current password</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("              <input type=\"password\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label class=\"col-sm-2 control-label\">New password</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("              <input type=\"password\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <div class=\"col-sm-10 col-sm-offset-2\">\n");
      out.write("              <div class=\"checkbox\">\n");
      out.write("                <input type=\"checkbox\" id=\"checkbox_1\">\n");
      out.write("                <label for=\"checkbox_1\">Make this account public</label>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <div class=\"col-sm-10 col-sm-offset-2\">\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("              <button type=\"reset\" class=\"btn btn-default\">Cancel</button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>");
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
