/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2015-08-26 17:06:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sessionTest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcore_005fforEach_0026_005fvar_005fstep_005fend_005fbegin;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcore_005fforEach_0026_005fvar_005fstep_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fcore_005fforEach_0026_005fvar_005fstep_005fend_005fbegin.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("sessionTest\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");
      if (_jspx_meth_core_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_core_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_core_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  core:set
    org.apache.taglibs.standard.tag.el.core.SetTag _jspx_th_core_005fset_005f0 = (org.apache.taglibs.standard.tag.el.core.SetTag) _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.el.core.SetTag.class);
    _jspx_th_core_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_core_005fset_005f0.setParent(null);
    // /WEB-INF/views/sessionTest.jsp(8,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f0.setVar("spaces");
    // /WEB-INF/views/sessionTest.jsp(8,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fset_005f0.setValue(" hj  ");
    int _jspx_eval_core_005fset_005f0 = _jspx_th_core_005fset_005f0.doStartTag();
    if (_jspx_th_core_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_core_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcore_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_core_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_core_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  core:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_core_005fforEach_005f0 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _005fjspx_005ftagPool_005fcore_005fforEach_0026_005fvar_005fstep_005fend_005fbegin.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    _jspx_th_core_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_core_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/sessionTest.jsp(9,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fforEach_005f0.setVar("i");
    // /WEB-INF/views/sessionTest.jsp(9,2) name = begin type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fforEach_005f0.setBegin("1");
    // /WEB-INF/views/sessionTest.jsp(9,2) name = end type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fforEach_005f0.setEnd("10");
    // /WEB-INF/views/sessionTest.jsp(9,2) name = step type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_core_005fforEach_005f0.setStep("1");
    int[] _jspx_push_body_count_core_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_core_005fforEach_005f0 = _jspx_th_core_005fforEach_005f0.doStartTag();
      if (_jspx_eval_core_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spaces}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_core_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_core_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_core_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_core_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_core_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fcore_005fforEach_0026_005fvar_005fstep_005fend_005fbegin.reuse(_jspx_th_core_005fforEach_005f0);
    }
    return false;
  }
}