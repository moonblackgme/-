/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-04-26 00:16:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.junhbo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class subInsert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/junhbo/footer.jsp", Long.valueOf(1618965581611L));
    _jspx_dependants.put("/junhbo/header.jsp", Long.valueOf(1619050604180L));
    _jspx_dependants.put("/junhbo/nav.jsp", Long.valueOf(1619076768519L));
  }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script>\r\n");
      out.write("function check(){\r\n");
      out.write("\tif(document.form.id.value==\"\"){\r\n");
      out.write("\t\talert(\"교과목코드 입력되지 않음\");\r\n");
      out.write("\t\tdocument.form.id.focus();\r\n");
      out.write("\t}else if(document.form.subject_name.value==\"\"){\r\n");
      out.write("\t\talert(\"교과명 입력되지 않음\");\r\n");
      out.write("\t\tdocument.form.subject_name.focus();\r\n");
      out.write("\t}else if(document.form.credit.value==\"\"){\r\n");
      out.write("\t\talert(\"학점 입력되지 않음\");\r\n");
      out.write("\t\tdocument.form.credit.focus();\r\n");
      out.write("\t}else if(document.form.lecturer.value==\"\"){\r\n");
      out.write("\t\talert(\"담당강사 입력되지 않음\");\r\n");
      out.write("\t\tdocument.form.lecturer.focus();\r\n");
      out.write("\t}else if(document.form.start_hour.value==\"\"){\r\n");
      out.write("\t\talert(\"시작시간 입력되지 않음\");\r\n");
      out.write("\t\tdocument.form.start_hour.focus();\r\n");
      out.write("\t}else if(document.form.end_hour.value==\"\"){\r\n");
      out.write("\t\talert(\"종료시간 입력되지 않음\");\r\n");
      out.write("\t\tdocument.form.end_hour.focus();\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\tdocument.form.submit();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"common.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>학사/수강정보 관리 ver1.0\r\n");
      out.write("\r\n");
      out.write("</header>\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"common.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li><a href=\"hakInsert.jsp\">학사정보추가</a></li>\r\n");
      out.write("\t\t<li><a href=\"subInsert.jsp\">교과목추가</a></li>\r\n");
      out.write("\t\t<li><a href=\"teacherInsert.jsp\">강사추가</a></li>\r\n");
      out.write("\t\t<li><a href=\"studentSelect.jsp\">학사정보조회</a></li>\r\n");
      out.write("\t\t<li><a href=\"subSelect.jsp\">교과목조회</a></li>\r\n");
      out.write("\t\t<li><a href=\"teacherSelect.jsp\">강사조회</a></li>\r\n");
      out.write("\t\t<li><a href=\"index.jsp\">홈으로</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("<form name=\"form\" method=\"post\" action=\"subProcess.jsp\">\r\n");
      out.write("<table border=\"1\" id=\"table1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th width=\"30%\">교과목코드</th>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"id\" id=\"in1\" ");
      out.write("></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th width=\"30%\">과목명</th>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"subject_name\" id=\"in1\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th width=\"30%\">학점</th>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"credit\" id=\"in1\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th width=\"30%\">담당강사</th>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<select name=\"lecturer\" id=\"in1\">\r\n");
      out.write("\t\t<option>담당강사 선택</option>\r\n");
      out.write("\t\t<option value=\"1\">김교수</option>\r\n");
      out.write("\t\t<option value=\"2\">이교수</option>\r\n");
      out.write("\t\t<option value=\"3\">박교수</option>\r\n");
      out.write("\t\t<option value=\"4\">우교수</option>\r\n");
      out.write("\t\t<option value=\"5\">최교수</option>\r\n");
      out.write("\t\t<option value=\"6\">강교수</option>\r\n");
      out.write("\t\t<option value=\"7\">황교수</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th width=\"30%\">요일</th>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<input type=\"radio\" name=\"week\"  value=\"1\" id=\"in1\">월\r\n");
      out.write("\t\t<input type=\"radio\" name=\"week\"  value=\"2\" id=\"in1\">화\r\n");
      out.write("\t\t<input type=\"radio\" name=\"week\"  value=\"3\" id=\"in1\">수\r\n");
      out.write("\t\t<input type=\"radio\" name=\"week\"  value=\"4\" id=\"in1\">목\r\n");
      out.write("\t\t<input type=\"radio\" name=\"week\"  value=\"5\" id=\"in1\">금\r\n");
      out.write("\t\t<input type=\"radio\" name=\"week\"  value=\"6\" id=\"in1\">토\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th width=\"30%\">시작</th>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"start_hour\"  id=\"in1\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th width=\"30%\">종료</th>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"end_hour\"  id=\"in1\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=2 class=\"center\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"등록\" onclick=\"javascript:check()\">\r\n");
      out.write("\t\t<input type=\"reset\" value=\"취소\">\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<input id=\"in1\" type=\"button\" value=\"학사정보추가\" >\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"common.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<footer>\r\n");
      out.write("HRDKorea Copyright2021\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
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