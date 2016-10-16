package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/login/../taglib.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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

      out.write('\n');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setVar("easyui");
      _jspx_th_c_set_0.setValue(request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/easyui/" );
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_1.setPageContext(_jspx_page_context);
      _jspx_th_c_set_1.setParent(null);
      _jspx_th_c_set_1.setVar("ctx");
      _jspx_th_c_set_1.setValue(request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/" );
      int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
      if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>代码生成系统</title>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../easyui_lib.jsp", out, false);
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<body id=\"mainLayout\" class=\"easyui-layout\">\n");
      out.write("\t<div data-options=\"region:'north',border:false\" style=\"height:30px;padding:5px;\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/header.jsp", out, false);
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div data-options=\"region:'west',split:true,title:'菜单'\" style=\"width:150px;padding:10px;\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/menu.jsp", out, false);
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div data-options=\"region:'east',split:false,collapsed:true,title:'Velocity参数列表'\" style=\"width:360px;\">\n");
      out.write("\t\t<div id=\"vcPg\"></div>\n");
      out.write("\t</div>\n");
      out.write("\t<div data-options=\"region:'center'\">\n");
      out.write("\t\t<div id=\"mainTab\" class=\"easyui-tabs\" data-options=\"fit:true,border:false\">\n");
      out.write("\t\t\t<div title=\"首页\" style=\"padding:10px\">\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "welcome.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- \t<div data-options=\"region:'south',border:false\" style=\"height:25px;\"> -->\n");
      out.write("\n");
      out.write("<!-- \t</div> -->\n");
      out.write("\t\n");
      out.write("\t<div id=\"tabsMenu\" class=\"easyui-menu\" style=\"width:120px;\">\n");
      out.write("\t  <div name=\"Refresh\">刷新</div>  \n");
      out.write("\t  <div name=\"Other\">关闭其他</div>  \n");
      out.write("\t  <div name=\"All\">关闭所有</div>\n");
      out.write("\t</div>  \n");
      out.write("\t\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function(){\n");
      out.write("\tVelocityContext.createGrid('vcPg');\n");
      out.write("})\n");
      out.write("//绑定tabs的右键菜单\n");
      out.write("$(\"#mainTab\").tabs({\n");
      out.write("    onContextMenu : function (e, title) {\n");
      out.write("        e.preventDefault();\n");
      out.write("        $('#tabsMenu').menu('show', {\n");
      out.write("            left : e.pageX,\n");
      out.write("            top : e.pageY\n");
      out.write("        }).data(\"tabTitle\", title);\n");
      out.write("    }\n");
      out.write("});\n");
      out.write("\n");
      out.write("\t//实例化menu的onClick事件\n");
      out.write("$(\"#tabsMenu\").menu({\n");
      out.write("    onClick : function (item) {\n");
      out.write("        closeTab(this, item.name);\n");
      out.write("    }\n");
      out.write("});\n");
      out.write("\n");
      out.write("\t//几个关闭事件的实现\n");
      out.write("function closeTab(menu, type) {\n");
      out.write("    var curTabTitle = $(menu).data(\"tabTitle\");\n");
      out.write("    var tabs = $(\"#mainTab\");\n");
      out.write("    \n");
      out.write("    if (type === \"close\") {\n");
      out.write("        tabs.tabs(\"close\", curTabTitle);\n");
      out.write("        return;\n");
      out.write("    }\n");
      out.write("    if (type === \"Refresh\") {\n");
      out.write("    \tvar currTab =  tabs.tabs('getSelected'); //获得当前tab\n");
      out.write("        var url = $(currTab.panel('options').content).attr('src');\n");
      out.write("    \tif(url){\n");
      out.write("   \t\t  tabs.tabs('update', {\n");
      out.write("   \t        \ttab : currTab,\n");
      out.write("   \t\t\t\toptions : {\n");
      out.write("   \t            \tcontent : '<iframe src=\"'+ url+'\" scrolling=\"yes\" frameborder=\"0\" style=\"width:100%;height:100%;\"></iframe>'\n");
      out.write("   \t            }\n");
      out.write("   \t\t\t});\n");
      out.write("    \t}\n");
      out.write("\t\treturn;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    var allTabs = tabs.tabs(\"tabs\");\n");
      out.write("    var closeTabsTitle = [];\n");
      out.write("    \n");
      out.write("    $.each(allTabs, function () {\n");
      out.write("        var opt = $(this).panel(\"options\");\n");
      out.write("        if (opt.closable && opt.title != curTabTitle && type === \"Other\") {\n");
      out.write("            closeTabsTitle.push(opt.title);\n");
      out.write("        } else if (opt.closable && type === \"All\") {\n");
      out.write("            closeTabsTitle.push(opt.title);\n");
      out.write("        } \n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    for (var i = 0; i < closeTabsTitle.length; i++) {\n");
      out.write("        tabs.tabs(\"close\", closeTabsTitle[i]);\n");
      out.write("    }\n");
      out.write("}\n");
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
