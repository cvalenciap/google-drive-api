package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>GOOGLE DRIVE API</title>\n");
      out.write("        <link href=\"lightbox.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"google-drive.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Este será el envoltorio transparente utilizado como una pantalla en negro gradiente de luz para mostrar la pantalla está en curso -->\n");
      out.write("        <div id=\"transparent-wrapper\"></div>\n");
      out.write("\n");
      out.write("        <!-- Este panel emergente se puede utilizar para mostrar el texto del documento -->\n");
      out.write("        <div id=\"login-box\" class=\"hide\">\n");
      out.write("            <p>Please login on your google account.</p>\n");
      out.write("            <button id=\"btnLogin\" onclick=\"handleAuthClick(event)\" class=\"button\">Login</button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"drive-box\" class=\"hide\">\n");
      out.write("            <!--  Esta será la navegación de Google Drive -->\n");
      out.write("            <div id=\"drive-breadcrumb\">\n");
      out.write("                <span class='breadcrumb-arrow'></span> <a data-id='root' data-level='0'>Home</a>\n");
      out.write("                <span id=\"span-navigation\"></span>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Este panel emergente se puede utilizar como panel de información del usuario-->\n");
      out.write("            <div id=\"drive-info\" class=\"hide\">\n");
      out.write("                <div class=\"user-item\">Welcome <span id=\"span-name\"></span></div>\n");
      out.write("                <div class=\"user-item\">Total Quota: <span id=\"span-totalQuota\"></span></div>\n");
      out.write("                <div class=\"user-item\">Used Quota: <span id=\"span-usedQuota\"></span></div>\n");
      out.write("                <div class=\"user-item\">Share Mode: <span id=\"span-sharemode\">OFF</span></div>\n");
      out.write("                <div class=\"user-item\"><a id=\"link-logout\" class=\"logout-link\">Logout</a></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Una lista de menús disponibles para el usuario utilice-->\n");
      out.write("            <div id=\"drive-menu\">\n");
      out.write("                <div id=\"button-reload\" title=\"Refresh\"></div>\n");
      out.write("                <div id=\"button-upload\" title=\"Upload to Google Drive\" class=\"button-opt\"></div>\n");
      out.write("                <div id=\"button-addfolder\" title=\"Add Folder\" class=\"button-opt\"></div>\n");
      out.write("                <div id=\"button-share\" title=\"Show shared files only\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"drive-content\"></div>\n");
      out.write("            <div id=\"error-message\" class=\"flash hidden\"></div>\n");
      out.write("            <div id=\"status-message\" class=\"flash hidden\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Este control de carga se utiliza para subir archivos a Google Drive-->\n");
      out.write("        <input type=\"file\" id=\"fUpload\" class=\"hide\"/>\n");
      out.write("\n");
      out.write("        <!-- Este panel emergente se puede utilizar para crear la carpeta-->\n");
      out.write("        <div class=\"float-box\" id=\"float-box\">\n");
      out.write("            <div class=\"folder-form\">\n");
      out.write("                <div class=\"close-x\"><img id=\"imgClose\" class=\"imgClose\" src=\"images/button_close.png\" alt=\"close\" /></div>\n");
      out.write("                <h3 class=\"clear\">Add New Folder</h3>\n");
      out.write("                <div><input type=\"text\" id=\"txtFolder\" class=\"text-input\" /></div>\n");
      out.write("                <button id=\"btnAddFolder\" value=\"Save\" class=\"button\">Add</button>\n");
      out.write("                <button id=\"btnClose\" value=\"Close\" class=\"button btnClose\">Close</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Este panel emergente se puede utilizar para mostrar la información del documento / archivo -->\n");
      out.write("        <div id=\"float-box-info\" class=\"float-box\">\n");
      out.write("            <div class=\"info-form\">\n");
      out.write("                <div class=\"close-x\"><img id=\"imgCloseInfo\" class=\"imgClose\" src=\"images/button_close.png\" alt=\"close\" /></div>\n");
      out.write("                <h3 class=\"clear\">File information</h3>\n");
      out.write("                <table cellpadding=\"0\" cellspacing=\"0\" class=\"tbl-info\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"label\">Created Date</td>\n");
      out.write("                        <td><span id=\"spanCreatedDate\"></span></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"label\">Modified Date</td>\n");
      out.write("                        <td><span id=\"spanModifiedDate\"></span></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"label\">Owner</td>\n");
      out.write("                        <td><span id=\"spanOwner\"></span></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"label\">Title</td>\n");
      out.write("                        <td><span id=\"spanTitle\"></span></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"label\">Size</td>\n");
      out.write("                        <td><span id=\"spanSize\"></span></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"label\">Extension</td>\n");
      out.write("                        <td><span id=\"spanExtension\"></span></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <button id=\"btnCloseInfo\" value=\"Close\" class=\"button btnClose\">Close</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Este panel emergente se puede utilizar para mostrar el texto del documento-->\n");
      out.write("        <div id=\"float-box-text\" class=\"float-box\">\n");
      out.write("            <div class=\"info-form\">\n");
      out.write("                <div class=\"close-x\"><img id=\"imgCloseText\" class=\"imgClose\" src=\"images/button_close.png\" alt=\"close\" /></div>\n");
      out.write("                <h3 class=\"clear\">Text Content</h3>\n");
      out.write("                <div id=\"text-content\"></div>\n");
      out.write("                <button id=\"btnCloseText\" value=\"Close\" class=\"button btnClose\">Close</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Este marco flotante se utiliza para el cierre de sesión-->\n");
      out.write("        <iframe id=\"frameLogout\" class=\"hide\"></iframe>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"date.js\" type=\"text/javascript\"></script>\n");
      out.write("<!--        <script src=\"lightbox.min.js\" type=\"text/javascript\"></script>-->\n");
      out.write("        <script src=\"google-drive.js\"></script>\n");
      out.write("        <script src=\"https://apis.google.com/js/client.js?onload=checkAuth\"></script>\n");
      out.write("<!--        <script src=\"upload.js\"></script>-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
