package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>首页</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<p style=\"font-size:14px\">欢迎使用代码生成系统</p>\n");
      out.write("如果您首次使用本系统，请按以下步骤操作：\n");
      out.write("<ol>\n");
      out.write("\t<li>配置数据源。模板的生成需要依赖数据库表</li>\n");
      out.write("\t<li>配置模板。基于Velocity模板引擎，<a href=\"javascript:void(0)\" onclick=\"showVelocity(); return false;\">点此查看</a>Velocity参数列表</li>\n");
      out.write("\t<li>生成代码。只需三步即可生成代码文件</li>\n");
      out.write("</ol>\n");
      out.write("\n");
      out.write("<strong>示例:</strong><br>\n");
      out.write("=======表结构=======<br>\n");
      out.write("<img src=\"../table.png\">\n");
      out.write("<div class=\"easyui-tabs\" style=\"width:800px;height:400px;\">\n");
      out.write("<div title=\"模板内容\" style=\"padding:5px\">\n");
      out.write("<pre>\n");
      out.write("package &#36;{context.packageName}.entity;\n");
      out.write("\n");
      out.write("import org.durcframework.entity.BaseEntity;\n");
      out.write("\n");
      out.write("public class &#36;{context.javaBeanName} extends BaseEntity {\n");
      out.write("## 此处用foreach循环构建java类中的属性\n");
      out.write("#foreach(&#36;column in &#36;columns) \n");
      out.write("    private &#36;{column.javaType} &#36;{column.javaFieldName};\n");
      out.write("#end\n");
      out.write("\n");
      out.write("## 此处用foreach循环构建属性的get/set方法\n");
      out.write("#foreach(&#36;{column} in &#36;{columns}) \n");
      out.write("    public void set&#36;{column.javaFieldNameUF}(&#36;{column.javaType} &#36;{column.javaFieldName}){\n");
      out.write("        this.&#36;{column.javaFieldName} = &#36;{column.javaFieldName};\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    public &#36;{column.javaType} get&#36;{column.javaFieldNameUF}(){\n");
      out.write("        return this.&#36;{column.javaFieldName};\n");
      out.write("    }\n");
      out.write("\n");
      out.write("#end\n");
      out.write("}\n");
      out.write("</pre>\n");
      out.write("\t</div>\n");
      out.write("\t<div title=\"生成后的代码\" style=\"padding:5px\">\n");
      out.write("<pre>\n");
      out.write("package datasourceconfig.entity;\n");
      out.write("\n");
      out.write("import org.durcframework.entity.BaseEntity;\n");
      out.write("\n");
      out.write("publc class DatasourceConfig extends BaseEntity {\n");
      out.write("    private int dcId;\n");
      out.write("    private String name;\n");
      out.write("    private String driverClass;\n");
      out.write("    private String jdbcUrl;\n");
      out.write("    private String username;\n");
      out.write("    private String password;\n");
      out.write("    private String backUser;\n");
      out.write("\n");
      out.write("    public void setDcId(int dcId){\n");
      out.write("        this.dcId = dcId;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    public int getDcId(){\n");
      out.write("        return this.dcId;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    public void setName(String name){\n");
      out.write("        this.name = name;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    public String getName(){\n");
      out.write("        return this.name;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    public void setDriverClass(String driverClass){\n");
      out.write("        this.driverClass = driverClass;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    public String getDriverClass(){\n");
      out.write("        return this.driverClass;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    public void setJdbcUrl(String jdbcUrl){\n");
      out.write("        this.jdbcUrl = jdbcUrl;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    public String getJdbcUrl(){\n");
      out.write("        return this.jdbcUrl;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    public void setUsername(String username){\n");
      out.write("        this.username = username;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    public String getUsername(){\n");
      out.write("        return this.username;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    public void setPassword(String password){\n");
      out.write("        this.password = password;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    public String getPassword(){\n");
      out.write("        return this.password;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    public void setBackUser(String backUser){\n");
      out.write("        this.backUser = backUser;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    public String getBackUser(){\n");
      out.write("        return this.backUser;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("}\n");
      out.write("</pre>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("js/VelocityContext.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function showVelocity(){\n");
      out.write("\t$('#mainLayout').layout('expand','east');\n");
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
