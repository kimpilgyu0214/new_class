/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-06-24 00:24:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>boardForm</title>\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        .content {\r\n");
      out.write("            background-color:rgb(247, 245, 245); \r\n");
      out.write("            width:80%;\r\n");
      out.write("            margin:auto;\r\n");
      out.write("        }\r\n");
      out.write("        .innerOuter {\r\n");
      out.write("            border:1px solid lightgray;\r\n");
      out.write("            width:80%;\r\n");
      out.write("            margin:auto;\r\n");
      out.write("            padding:5% 10%;\r\n");
      out.write("            background-color:white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #enrollForm>table {width:100%;}\r\n");
      out.write("        #enrollForm>table * {margin:5px;}\r\n");
      out.write("        #img-area{\r\n");
      out.write("            width : 100%;\r\n");
      out.write("            margin : auto;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        #img-area > img{\r\n");
      out.write("            width : 80%;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("        \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/menubar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("        <br><br>\r\n");
      out.write("        <div class=\"innerOuter\">\r\n");
      out.write("            <h2>게시글 작성하기</h2>\r\n");
      out.write("            <br>\r\n");
      out.write("			\r\n");
      out.write("			<!-- application/x-www-form-urlencoded -->\r\n");
      out.write("			\r\n");
      out.write("            <form id=\"enrollForm\" method=\"post\" action=\"insert.do\" enctype=\"multipart/form-data\">\r\n");
      out.write("                <table algin=\"center\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th><label for=\"title\">제목</label></th>\r\n");
      out.write("                        <td><input type=\"text\" id=\"title\" class=\"form-control\" name=\"boardTitle\" required></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th><label for=\"writer\">작성자</label></th>\r\n");
      out.write("                        <td><input type=\"text\" id=\"writer\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginUser.userId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"boardWriter\" readonly></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th><label for=\"upfile\">첨부파일</label></th>\r\n");
      out.write("                        <td><input type=\"file\" id=\"upfile\" class=\"form-control-file border\" name=\"upfile\" onchange=\"loadImg(this);\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th><label for=\"content\">내용</label></th>\r\n");
      out.write("                        <td><textarea id=\"content\" class=\"form-control\" rows=\"10\" style=\"resize:none;\" name=\"boardContent\" required></textarea></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th colspan=\"2\">\r\n");
      out.write("                            <div id=\"img-area\">\r\n");
      out.write("                                <img src=\"https://t1.kakaocdn.net/friends/www/talk/kakaofriends_talk_2018.png\" alt=\"카카오친구들\" id=\"kakao\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("                <br>\r\n");
      out.write("                <script>\r\n");
      out.write("                	function loadImg(inputFile){\r\n");
      out.write("                		\r\n");
      out.write("                		//inputFile : 현재 change가 일어난 <input type=\"file\">요소 객체 \r\n");
      out.write("                		//\r\n");
      out.write("                		//console.log(inputFile.files);\r\n");
      out.write("                		//files 속성: 업로드된 파일의 정보가 들어있음\r\n");
      out.write("                		//inputFile.files.length : 1 == 파일이 첨부, 0 선택취소\r\n");
      out.write("                		// 파일 첨부시 inputFile.files[0]에 선택된 파일의 정보가 있음.\r\n");
      out.write("                		\r\n");
      out.write("                		if(inputFile.files.length){\r\n");
      out.write("                			\r\n");
      out.write("                			const reader = new FileReader();\r\n");
      out.write("                			\r\n");
      out.write("                			reader.readAsDataURL(inputFile.files[0]);\r\n");
      out.write("                			// 고유한 긴 url이 만들어짐\r\n");
      out.write("                			// url을 src속성의 값으로 부여할것\r\n");
      out.write("                			\r\n");
      out.write("                			// 파일 읽기가 완료되면 실행할 핸들러 정의\r\n");
      out.write("                			reader.onload = e => {\r\n");
      out.write("                				\r\n");
      out.write("                				//console.log(e.target);\r\n");
      out.write("                				document.getElementById('kakao').src = e.target.result;\r\n");
      out.write("                			};\r\n");
      out.write("                		}\r\n");
      out.write("                		\r\n");
      out.write("                	}\r\n");
      out.write("                \r\n");
      out.write("                </script>\r\n");
      out.write("\r\n");
      out.write("                <div align=\"center\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">등록하기</button>\r\n");
      out.write("                    <button type=\"reset\" class=\"btn btn-danger\">취소하기</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br><br>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("    \r\n");
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
