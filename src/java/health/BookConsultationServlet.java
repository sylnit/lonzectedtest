/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package health;

import Utilities.MedicalBooking;
import Utilities.TransactionDAO;
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
@WebServlet(name = "BookConsultationServlet", urlPatterns = {"/bookconsultation"})
public class BookConsultationServlet extends HttpServlet {

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
        
        String subpack = request.getParameter("subpack");
        String location = request.getParameter("location");
        String visitdate = request.getParameter("visitdate");
        String visittime = request.getParameter("visittime");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        HealthDAO mdao = new HealthDAO();
        Integer insertedId = mdao.bookCheckup(new String[]{subpack,location,visitdate,visittime,name,phone});
        if(insertedId>0){
            MedicalBooking mbooking = mdao.getBooking(insertedId);
            request.setAttribute("booking", mbooking);
        }
        request.setAttribute("payment_type", "checkup booking");
        String transactionId = TransactionDAO.getTransactionId("checkup booking", insertedId);
        request.setAttribute("transaction_id", transactionId);
        RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/health-summary.jsp");
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
