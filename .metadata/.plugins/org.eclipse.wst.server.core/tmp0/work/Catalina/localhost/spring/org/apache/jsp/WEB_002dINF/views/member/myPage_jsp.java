/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-06-24 07:20:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/menubar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("        <br><br>\r\n");
      out.write("        <div class=\"innerOuter\">\r\n");
      out.write("            <h2>마이페이지</h2>\r\n");
      out.write("            <br>\r\n");
      out.write("\r\n");
      out.write("            <form action=\"update.do\" method=\"post\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"userId\">* ID : </label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"userId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ sessionScope.loginUser.userId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"userId\" readonly> <br>\r\n");
      out.write("\r\n");
      out.write("                    <label for=\"userName\">* Name : </label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"userName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ sessionScope.loginUser.userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"userName\" required> <br>\r\n");
      out.write("\r\n");
      out.write("                    <label for=\"email\"> &nbsp; Email : </label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ sessionScope.loginUser.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"email\"> <br>\r\n");
      out.write("\r\n");
      out.write("                    <label for=\"age\"> &nbsp; Age : </label>\r\n");
      out.write("                    <input type=\"number\" class=\"form-control\" id=\"age\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ sessionScope.loginUser.age}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"age\"> <br>\r\n");
      out.write("\r\n");
      out.write("                    <label for=\"phone\"> &nbsp; Phone : </label>\r\n");
      out.write("                    <input type=\"tel\" class=\"form-control\" id=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ sessionScope.loginUser.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"phone\"> <br>\r\n");
      out.write("                    \r\n");
      out.write("                    <label for=\"address\"> &nbsp; Address : </label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ sessionScope.loginUser.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"address\"> <br>\r\n");
      out.write("                    \r\n");
      out.write("                    <label for=\"\"> &nbsp; Gender : </label> &nbsp;&nbsp;\r\n");
      out.write("                    <input type=\"radio\" id=\"Male\" value=\"M\" name=\"gender\">\r\n");
      out.write("                    <label for=\"Male\">남자</label> &nbsp;&nbsp;\r\n");
      out.write("                    <input type=\"radio\" id=\"Female\" value=\"F\" name=\"gender\">\r\n");
      out.write("                    <label for=\"Female\">여자</label> &nbsp;&nbsp;\r\n");
      out.write("                    \r\n");
      out.write("                    <script>\r\n");
      out.write("						window.onload = () => {\r\n");
      out.write("							\r\n");
      out.write("							//속성 선택자\r\n");
      out.write("							//SessionScope.loginUser.gender\r\n");
      out.write("							//javascript\r\n");
      out.write("							//document.querySelector('input[value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginUser.gender}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("]').checked = true;\r\n");
      out.write("						}\r\n");
      out.write("						\r\n");
      out.write("						//jquery\r\n");
      out.write("						$(() => {\r\n");
      out.write("							\r\n");
      out.write("							//콘솔에 출력\r\n");
      out.write("							//console.dir($('input[value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginUser.gender}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"]'));\r\n");
      out.write("							\r\n");
      out.write("							$('input[value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginUser.gender}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"]').attr('checked', true);\r\n");
      out.write("						})\r\n");
      out.write("							\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("					</script>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </div> \r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"btns\" align=\"center\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">수정하기</button>\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#deleteForm\">회원탈퇴</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br><br>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 회원탈퇴 버튼 클릭 시 보여질 Modal -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"deleteForm\">\r\n");
      out.write("        <div class=\"modal-dialog modal-sm\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Modal Header -->\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <h4 class=\"modal-title\">회원탈퇴</h4>\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <form action=\"delete.do\" method=\"post\">\r\n");
      out.write("                <!-- 회원탈퇴시 비밀번호는 암호화값이 중복될수 있기 때문에 해당 회원만 식별할 수 있는 아이디(PK) 값도 같이 있어야함 -->\r\n");
      out.write("                	<input type=\"hidden\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ sessionScope.loginUser.userId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"userId\"/>\r\n");
      out.write("                    <!-- Modal body -->\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <div align=\"center\">\r\n");
      out.write("                            탈퇴 후 복구가 불가능합니다. <br>\r\n");
      out.write("                            정말로 탈퇴 하시겠습니까? <br>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <br>\r\n");
      out.write("                            <label for=\"userPwd\" class=\"mr-sm-2\">Password : </label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control mb-2 mr-sm-2\" placeholder=\"Enter Password\" id=\"userPwd\" name=\"userPwd\"> <br>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Modal footer -->\r\n");
      out.write("                    <div class=\"modal-footer\" align=\"center\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-danger\" onclick=\"return deletePrompt();\">탈퇴하기</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                \r\n");
      out.write("                <script>\r\n");
      out.write("                	function deletePrompt() {\r\n");
      out.write("						const value = prompt('탈퇴를 원하신다면 \"탈퇴합니다\"를 정확히 입력해주세요.')	\r\n");
      out.write("						return value === '탈퇴합니다' ? true : false;\r\n");
      out.write("					}\r\n");
      out.write("                \r\n");
      out.write("                </script>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
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
