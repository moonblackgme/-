/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-04-12 05:24:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.rrr;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("    <script language=\"javascript\">\r\n");
      out.write("    function writeCheck() {\r\n");
      out.write("    \tvar form = document.writeform;\r\n");
      out.write("    \tif( !form.name.value) {\r\n");
      out.write("    \t alert(\"이름을 적어주세요\");\r\n");
      out.write("    \tform = name.focus();\r\n");
      out.write("    \treturn; }\r\n");
      out.write("    \tif( !form.password.value) {\r\n");
      out.write("    \t\talert(\"비밀번호를 적어주세요\");\r\n");
      out.write("    \t\tform = password.focus();\r\n");
      out.write("    \t\treturn; }\r\n");
      out.write("    \tif( !form.title.value) {\r\n");
      out.write("    \t\talert(\"제목을 적어주세요\");\r\n");
      out.write("    \t\tform.title.focus();\r\n");
      out.write("    \t\treturn; }\r\n");
      out.write("    \tif( !form.memo.value) {\r\n");
      out.write("    \t\talert(\"내용을 적어주세요\");\r\n");
      out.write("    \t\tform.memo.focus();\r\n");
      out.write("    \t\treturn; }\r\n");
      out.write("    form.submit();\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
      out.write("    ");
 String checkName ="";
    checkName = (String)session.getAttribute("s_Name"); 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>게시판</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table>\r\n");
      out.write("<form name=writeform method=post action=\"writesave.jsp\">\r\n");
      out.write("<tr> <td> <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("<tr style=\"background:url('images/table_mid.gif') repeat=x; text-align:center;\">\r\n");
      out.write("<td width=\"5\"><img src=\"images/table_left.gif\" width=\"5\" height=\"30\" /></td>\r\n");
      out.write("<td>글쓰기</td> <td width=\"5\"><img src=\"images/table.right.gif\" width=\"5\" height=\"30\" /></td></tr></table>\r\n");
      out.write("<table> <tr> <td>&nbsp;</td> <td align=\"center\">제목</td>\r\n");
      out.write("<td><input name=\"title\" size=\"50\" maxlength=\"100\"></td>\r\n");
      out.write("<td>&nbsp;</td></tr><tr height=\"1\" bgcolor=\"#dddddd\">\r\n");
      out.write("<td colspan=\"4\"></td></tr><tr><td>&nbsp;</td>\r\n");
      out.write("<td align=\"center\">이름</td>\r\n");
      out.write("<td><input name=\"name\" size=\"50\" maxlength=\"50\" value=");
      out.print(checkName );
      out.write("></td>\r\n");
      out.write("<td>&nbsp;</td></tr><tr height=\"1\" bgcolor=\"#dddddd\"><td colspan=\"4\"></td></tr>\r\n");
      out.write("<tr> <td>&nbsp;</td>\r\n");
      out.write("<td align=\"center\">비밀번호</td>\r\n");
      out.write("<td><input type=\"password\" name=\"password\" size=\"50\" maxlength=\"50\"></td>\r\n");
      out.write("<td>&nbsp;</td></tr><tr height=\"1\" bgcolor=\"#dddddd\">\r\n");
      out.write("<td colspan=\"4\"></td></tr>\r\n");
      out.write("<tr><td>&nbsp;</td>\r\n");
      out.write("<td align=\"center\">내용</td>\r\n");
      out.write("<td><textarea name=\"memo\" cols=\"50\" rows=\"13\"></textarea></td>\r\n");
      out.write("<td>&nbsp;</td></tr>\r\n");
      out.write("<tr height=\"1\" bgcolor=\"#dddddd\">\r\n");
      out.write("<td colspan=\"4\"></td></tr>\r\n");
      out.write("<tr height=\"1\" bgcolor=\"#82B5DF\"><td colspan=\"4\"></td></tr>\r\n");
      out.write("<tr align=\"center\"><td>&nbsp;</td>\r\n");
      out.write("<td colspan=\"2\"><input type=button value=\"등록\" onclick=\"javascript:writeCheck();\">\r\n");
      out.write("<input type=button value=\"취소\" onclick=\"javascript:history.back(-1)\">\r\n");
      out.write("<td>&nbsp;</td></tr></table></td></tr></form></table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}