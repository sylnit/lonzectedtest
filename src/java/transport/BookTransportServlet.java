/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transport;

import Utilities.TransactionDAO;
import Utilities.TransportBooking;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SAM
 */
@WebServlet(name = "BookTransportServlet", urlPatterns = {"/booktransport"})
public class BookTransportServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String next_of_kin = request.getParameter("nkin");
        String next_of_kin_phone = request.getParameter("nphone");
        String destination_id = request.getParameter("route");
        String departureDate = request.getParameter("ddate");
        String departureTime = request.getParameter("dtime");
        TransportDAO tdao = new TransportDAO();
        Integer insertedId = tdao.bookTransport(new String[]{name,phone,next_of_kin,next_of_kin_phone,destination_id,departureDate,departureTime});
        if(insertedId>0){
            TransportBooking tbooking = tdao.getBooking(insertedId);
            request.setAttribute("booking", tbooking);
        }
        request.setAttribute("payment_type", "transport booking");
        String transactionId = TransactionDAO.getTransactionId("checkup booking", insertedId);
        request.setAttribute("transaction_id", transactionId);
        RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/transport-summary.jsp");
        dispatcher.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
