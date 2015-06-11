package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>FDAs MAUDE database</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"styles/main.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"styles/modal.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"styles/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"styles/jquery.dataTables.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/jquery.js\"></script>\r\n");
      out.write("<script src=\"js/jquery-ui.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/main.js\"></script>\r\n");
      out.write("<script src=\"js/dataTable.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"\" id=\"searchForm\">\r\n");
      out.write("\t<div id=\"main_body\">\r\n");
      out.write("\t\t<div id=\"the_header\" class=\"header_text\">\r\n");
      out.write("\t\t\t<span class=\"header_text\"><h1>FDA's MAUDE Database</h1></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"outer\" id=\"reportOuter\">\r\n");
      out.write("\t\t\t<div class=\"inner\" id=\"reportInner\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"subHeader\" id=\"reportHdr\">REPORT</div>\r\n");
      out.write("\t\t\t<div class=\"report\" id=\"reportDiv\" style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Report Number</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input class=\"column_text\" type=\"text\" id=\"reportNumber\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Date Report Received by FDA</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input class=\"column_date\" type=\"text\" id=\"dateRcvdFrm\" readonly=\"readonly\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;to <input class=\"column_date\" type=\"text\" id=\"dateRcvdto\" readonly=\"readonly\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Report Source Code</td>\r\n");
      out.write("\t\t\t\t\t\t<td><select class=\"column_dropDown\" id=\"reportSrcCode\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Event Type</td>\r\n");
      out.write("\t\t\t\t\t\t<td><select class=\"column_dropDown\" id=\"eventType\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Event Location</td>\r\n");
      out.write("\t\t\t\t\t\t<td><select class=\"column_dropDown\" id=\"eventLocation\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Reporter Occupation Code</td> \r\n");
      out.write("\t\t\t\t\t\t<td><select class=\"column_dropDown\" id=\"reporterOcpnCode\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Remedial Action</td>\r\n");
      out.write("\t\t\t\t\t\t<td><select class=\"column_dropDown\" id=\"remedialAction\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>All of these words </br>(Separated by commas):\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" class=\"column_text\" id=\"allWords\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>None of these words </br>(Separated by commas):\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" class=\"column_text\" id=\"noneWords\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- DEVICE-->\r\n");
      out.write("\t<div class=\"outer\" id=\"deviceOuter\">\r\n");
      out.write("\t\t<div class=\"inner\" id=\"deviceInner\">\r\n");
      out.write("\t\t\t<div class=\"subHeader\" id=\"deviceHdr\">DEVICE</div>\r\n");
      out.write("\t\t\t<div class=\"report\" id=\"deviceDiv\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Product Problem</td>\r\n");
      out.write("\t\t\t\t\t\t<td><select class=\"column_dropDown\" id=\"devProductProblem\"><option value='-1'>Select One </option></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Brand Name</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" class=\"column_text\" id=\"devBrandName\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Generic Name</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" class=\"column_text\" id=\"devGenericName\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Manufacturer</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" class=\"column_text\" id=\"devManufacturer\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Model Number</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" class=\"column_text\" id=\"devModelNumber\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Lot Number</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" class=\"column_text\" id=\"devLotNumber\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Device Operator</td>\r\n");
      out.write("\t\t\t\t\t\t<td><select class=\"column_dropDown\" id=\"devOperator\"><option value='-1'>Select One </option></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Product Code</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" class=\"column_text\" id=\"devProdCode\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Device Age</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" class=\"column_text\" id=\"devAge\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!--PATIENT -->\r\n");
      out.write("\t<div class=\"outer\" id=\"patOuter\">\r\n");
      out.write("\t\t<div class=\"inner\" id=\"patInner\">\r\n");
      out.write("\t\t\t<div class=\"subHeader\" id=\"patientHdr\">PATIENT</div>\r\n");
      out.write("\t\t\t<div class=\"report\" id=\"patientDiv\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Treatment</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" class=\"column_text\" id=\"patTreatment\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Outcome</td>\r\n");
      out.write("\t\t\t\t\t\t<td><select class=\"column_dropDown\" id=\"patOutcome\"><option value='-1'>Select One </option></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"100px\"></td>\r\n");
      out.write("\t\t\t\t<td width=\"100px\"><button type=\"button\" value=\"Submit\" class=\"btn\" id=\"submit\">Submit</button></td>\r\n");
      out.write("\t\t\t\t<td width=\"100px\"><button type=\"reset\" value=\"Reset\" class=\"btn\" id=\"reset\">Reset</button></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Modal Div for showing results -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"openModal\" class=\"modalDialog\">\r\n");
      out.write("\t\t<a id=\"closeModalUp\" title=\"Close\" class=\"closeUp\">X</a>\r\n");
      out.write("\t    <div id=\"reportModal\">\r\n");
      out.write("\t    \t\t </br>   \t\t\r\n");
      out.write("\t    \t\t<table id=\"results\" class=\"display\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("\t\t    \t</table>\r\n");
      out.write("\t    \t\t\r\n");
      out.write("\t\t\t<a id=\"closeModal\" title=\"Close\" class=\"close\">X</a>\r\n");
      out.write("\t        \t\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    \t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
