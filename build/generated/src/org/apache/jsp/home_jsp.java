package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/component/NavbarHome.jsp");
    _jspx_dependants.add("/component/FooterHome.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("        <title>Shop Homepage - Start Bootstrap Template</title>\r\n");
      out.write("        <!-- Favicon-->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\r\n");
      out.write("        <!-- Bootstrap icons-->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Navigation-->\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("    <div class=\"container px-4 px-lg-5 d-flex justify-content-center\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"#!\">Foodie</a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4\">\r\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"index.html\">Blog List</a></li>\r\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"#!\">Menu</a></li>\r\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"#!\">About</a></li>\r\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"#!\">Contact</a></li>\r\n");
      out.write("                <!-- <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">Shop</a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#!\">All Products</a></li>\r\n");
      out.write("                        <li><hr class=\"dropdown-divider\" /></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#!\">Popular Items</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#!\">New Arrivals</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li> -->\r\n");
      out.write("            </ul>\r\n");
      out.write("            <form class=\"d-flex\">\r\n");
      out.write("                <button class=\"btn btn-outline-dark\" type=\"submit\">\r\n");
      out.write("                    <i class=\"bi-cart-fill me-1\"></i>\r\n");
      out.write("                    Cart\r\n");
      out.write("                    <span class=\"badge bg-dark text-white ms-1 rounded-pill\">0</span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("        <!-- Header-->\r\n");
      out.write("        <header class=\"bg-dark py-5\">\r\n");
      out.write("            <div class=\"container px-4 px-lg-5 my-5\">\r\n");
      out.write("                <div class=\"text-center text-white\">\r\n");
      out.write("                    <h1 class=\"display-4 fw-bolder\">Shop in style</h1>\r\n");
      out.write("                    <p class=\"lead fw-normal text-white-50 mb-0\">With this shop hompeage template</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- Section-->\r\n");
      out.write("        <section class=\"py-5\">\r\n");
      out.write("            <div class=\"container px-4 px-lg-5 mt-5\">\r\n");
      out.write("                <div class=\"row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center\">\r\n");
      out.write("                    <div class=\"col mb-5\">\r\n");
      out.write("                        <div class=\"card h-100\">\r\n");
      out.write("                            <!-- Sale badge-->\r\n");
      out.write("                            <div class=\"badge bg-dark text-white position-absolute\" style=\"top: 0.5rem; right: 0.5rem\">Sale</div>\r\n");
      out.write("                            <!-- Product image-->\r\n");
      out.write("                            <img class=\"card-img-top\" src=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("                            <!-- Product details-->\r\n");
      out.write("                            <div class=\"card-body p-4\">\r\n");
      out.write("                                <div class=\"text-center\">\r\n");
      out.write("                                    <!-- Product name-->\r\n");
      out.write("                                    <h5 class=\"fw-bolder\">Special Item</h5>\r\n");
      out.write("                                    <!-- Product reviews-->\r\n");
      out.write("                                    <div class=\"d-flex justify-content-center small text-warning mb-2\">\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- Product price-->\r\n");
      out.write("                                    <span class=\"text-muted text-decoration-line-through\">$20.00</span>\r\n");
      out.write("                                    $18.00\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Product actions-->\r\n");
      out.write("                            <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("                                <div class=\"text-center\"><a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col mb-5\">\r\n");
      out.write("                        <div class=\"card h-100\">\r\n");
      out.write("                            <!-- Sale badge-->\r\n");
      out.write("                            <div class=\"badge bg-dark text-white position-absolute\" style=\"top: 0.5rem; right: 0.5rem\">Sale</div>\r\n");
      out.write("                            <!-- Product image-->\r\n");
      out.write("                            <img class=\"card-img-top\" src=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("                            <!-- Product details-->\r\n");
      out.write("                            <div class=\"card-body p-4\">\r\n");
      out.write("                                <div class=\"text-center\">\r\n");
      out.write("                                    <!-- Product name-->\r\n");
      out.write("                                    <h5 class=\"fw-bolder\">Special Item</h5>\r\n");
      out.write("                                    <!-- Product reviews-->\r\n");
      out.write("                                    <div class=\"d-flex justify-content-center small text-warning mb-2\">\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- Product price-->\r\n");
      out.write("                                    <span class=\"text-muted text-decoration-line-through\">$20.00</span>\r\n");
      out.write("                                    $18.00\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Product actions-->\r\n");
      out.write("                            <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("                                <div class=\"text-center\"><a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col mb-5\">\r\n");
      out.write("                        <div class=\"card h-100\">\r\n");
      out.write("                            <!-- Sale badge-->\r\n");
      out.write("                            <div class=\"badge bg-dark text-white position-absolute\" style=\"top: 0.5rem; right: 0.5rem\">Sale</div>\r\n");
      out.write("                            <!-- Product image-->\r\n");
      out.write("                            <img class=\"card-img-top\" src=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("                            <!-- Product details-->\r\n");
      out.write("                            <div class=\"card-body p-4\">\r\n");
      out.write("                                <div class=\"text-center\">\r\n");
      out.write("                                    <!-- Product name-->\r\n");
      out.write("                                    <h5 class=\"fw-bolder\">Special Item</h5>\r\n");
      out.write("                                    <!-- Product reviews-->\r\n");
      out.write("                                    <div class=\"d-flex justify-content-center small text-warning mb-2\">\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- Product price-->\r\n");
      out.write("                                    <span class=\"text-muted text-decoration-line-through\">$20.00</span>\r\n");
      out.write("                                    $18.00\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Product actions-->\r\n");
      out.write("                            <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("                                <div class=\"text-center\"><a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col mb-5\">\r\n");
      out.write("                        <div class=\"card h-100\">\r\n");
      out.write("                            <!-- Sale badge-->\r\n");
      out.write("                            <div class=\"badge bg-dark text-white position-absolute\" style=\"top: 0.5rem; right: 0.5rem\">Sale</div>\r\n");
      out.write("                            <!-- Product image-->\r\n");
      out.write("                            <img class=\"card-img-top\" src=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("                            <!-- Product details-->\r\n");
      out.write("                            <div class=\"card-body p-4\">\r\n");
      out.write("                                <div class=\"text-center\">\r\n");
      out.write("                                    <!-- Product name-->\r\n");
      out.write("                                    <h5 class=\"fw-bolder\">Special Item</h5>\r\n");
      out.write("                                    <!-- Product reviews-->\r\n");
      out.write("                                    <div class=\"d-flex justify-content-center small text-warning mb-2\">\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                        <div class=\"bi-star-fill\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- Product price-->\r\n");
      out.write("                                    <span class=\"text-muted text-decoration-line-through\">$20.00</span>\r\n");
      out.write("                                    $18.00\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Product actions-->\r\n");
      out.write("                            <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("                                <div class=\"text-center\"><a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Footer-->\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Footer-->\r\n");
      out.write("<footer class=\"py-5 bg-dark\">\r\n");
      out.write("    <div class=\"container\"><p class=\"m-0 text-center text-white\">Copyright &copy; Your Website 2022</p></div>\r\n");
      out.write("</footer>\r\n");
      out.write("<!-- Bootstrap core JS-->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<!-- Core theme JS-->\r\n");
      out.write("<script src=\"js/scripts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
