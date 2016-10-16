package org.apache.jsp.login.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.durcframework.autocode.common.AutoCodeContext;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<div id=\"menu\"></div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("(function(){\n");
      out.write("\tvar treeData = [\n");
      out.write("\t    {\n");
      out.write("\t\t    text : \"生成代码\",\n");
      out.write("\t\t    attributes : {\n");
      out.write("\t            url : \"generator/generator.jsp\"\n");
      out.write("\t        }\n");
      out.write("\t\t}\n");
      out.write("\t    ,{\n");
      out.write("\t\t    text : \"配置数据源\",\n");
      out.write("\t\t    attributes : {\n");
      out.write("\t            url : \"config/dataSource.jsp\"\n");
      out.write("\t        }\n");
      out.write("\t\t}\n");
      out.write("\t    ,{\n");
      out.write("\t\t    text : \"配置模板\",\n");
      out.write("\t\t    attributes : {\n");
      out.write("\t            url : \"config/template.jsp\"\n");
      out.write("\t        }\n");
      out.write("\t\t}\n");
      out.write("\t    ");
if(AutoCodeContext.getInstance().isAdmin()){
      out.write("\n");
      out.write("\t    ,{\n");
      out.write("\t\t    text : \"用户管理\",\n");
      out.write("\t\t    attributes : {\n");
      out.write("\t            url : \"config/backUser.jsp\"\n");
      out.write("\t        }\n");
      out.write("\t\t}\n");
      out.write("\t    ");
}
      out.write("\n");
      out.write("\t    \n");
      out.write("\t];\n");
      out.write("\t$(\"#menu\").tree({\n");
      out.write("\t    data : treeData,\n");
      out.write("\t    lines : true,\n");
      out.write("\t    onClick : function (node) {\n");
      out.write("\t        if (node.attributes) {\n");
      out.write("\t        \topenTab(node.text, node.attributes.url);\n");
      out.write("\t        }\n");
      out.write("\t    }\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t//在右边center区域打开菜单，新增tab\n");
      out.write("\tfunction openTab(text, url) {\n");
      out.write("\t    if ($(\"#mainTab\").tabs('exists', text)) {\n");
      out.write("\t        $('#mainTab').tabs('select', text);\n");
      out.write("\t    } else {\n");
      out.write("\t        $('#mainTab').tabs('add', {\n");
      out.write("\t            title : text,\n");
      out.write("\t            closable : true,\n");
      out.write("\t           // href : ctx + url\n");
      out.write("\t            content : '<iframe src=\"'+ ctx + url+'\" scrolling=\"yes\" frameborder=\"0\" style=\"width:100%;height:100%;\"></iframe>'\n");
      out.write("\t        });\n");
      out.write("\t    }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("})();\n");
      out.write("\n");
      out.write("</script>\n");
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
