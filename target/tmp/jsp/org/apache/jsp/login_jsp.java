package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>用户登录</title>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "easyui_lib.jsp", out, false);
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".login_msg {\n");
      out.write("color:red;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"win\" class=\"easyui-window\" \n");
      out.write("\tstyle=\"width:350px;height:230px;\"\n");
      out.write("\ttitle=\"用户登录\" \n");
      out.write("\tcollapsible=\"false\" minimizable=\"false\" maximizable=\"false\" \n");
      out.write("\tclosable=\"false\" draggable=\"false\">\n");
      out.write("\t\n");
      out.write("\t<form id=\"fm\" style=\"padding:10px 20px 10px 40px;\" onkeypress=\"keyPress(event)\">\n");
      out.write("\t\t<p id=\"msg\" class=\"login_msg\">&nbsp;</p>\n");
      out.write("\t\t<table>\n");
      out.write("\t\t\t<tr><td>用户名: </td><td><input value=\"admin\" name=\"username\" type=\"text\" class=\"easyui-validatebox\" required=\"true\"></td></tr>\n");
      out.write("\t\t\t<tr><td>密    码: </td><td><input value=\"admin\" name=\"password\" type=\"password\" class=\"easyui-validatebox\" required=\"true\"></td></tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t<td></td>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\t<div style=\"padding:5px;\">\n");
      out.write("\t\t\t\t\t<a href=\"javascript:void(0)\" onclick=\"login();\" class=\"easyui-linkbutton\" icon=\"icon-ok\">登录</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t</form>\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var $msg = $('#msg');\n");
      out.write("\n");
      out.write("function login(){\n");
      out.write("\t\n");
      out.write("\t$('#fm').form('submit',{\n");
      out.write("\t\turl: ctx + 'login.do',\n");
      out.write("\t\tonSubmit: function(){\n");
      out.write("\t\t\treturn $(this).form('validate');\n");
      out.write("\t\t},\n");
      out.write("\t\tsuccess: function(resultTxt){\n");
      out.write("\t\t\tvar result = $.parseJSON(resultTxt);\n");
      out.write("\t\t\tif (result.success){\n");
      out.write("\t\t\t\twindow.location = ctx + 'login/main.jsp';\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tvar errorMsg = result.errorMsg;\n");
      out.write("\t\t\t\t$msg.html(errorMsg);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("function keyPress(event){\n");
      out.write("\tif(event.keyCode == 13){\n");
      out.write("\t\tlogin();\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("// 自动登录\n");
      out.write("// $('#fm').form('load',{username:'admin',password:'admin'});\n");
      out.write("// login();\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
