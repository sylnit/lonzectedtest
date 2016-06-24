/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package payment;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ConfirmServlet", urlPatterns = {"/confirm"})
public class ConfirmServlet extends HttpServlet {

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
        
        String cardno = "123456";
        Integer pin = 1423;
        String expiry = "07-2016";
        
        String inputCardNo = request.getParameter("cardnumber");
        String month = request.getParameter("month");
        String year = request.getParameter("year");
        String inputExpiry = month+"-"+year;
        String payment_type = request.getParameter("payment_type");
        String user_id = request.getParameter("user_id");
        String amount = request.getParameter("amount");
        String transactionId = request.getParameter("transaction_id");
        Integer inputPin = Integer.parseInt(request.getParameter("pin"));
        String error = "";
        RequestDispatcher dispatcher;
        if((inputCardNo.equals(cardno))&& (inputPin.equals(pin)) &&(expiry.equals(inputExpiry))){
            //correct details 
            PaymentDAO pdao = new PaymentDAO();
            if(pdao.savePayment(new String[]{payment_type,amount,"successful",transactionId,user_id})){
                dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/payment-success.jsp");
                dispatcher.forward(request, response);
            }else{
                error = "There was error when saving your payment information. Please contact the administrator.";
            }
        }else{
            error = "Card details provide do not match details on our server.";
        }
        request.setAttribute("error", error);
        dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/payment-failure.jsp");
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
