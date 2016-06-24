<%@include file="header.jsp" %>
<div class="col-md-6 col-md-offset-3">
    <div class="panel panel-default">
        <div class="panel-heading">Transport Booking Summary</div>
        <div class="panel-body">
            <form method="post" action="payment" class="form-horizontal">
                <div class="col-md-5 col-md-offset-3">
                    <p><b>Name:</b> ${booking.name}</p>
                    <p><b>Phone:</b> ${booking.phone}</p>
                    <p><b>Destination:</b> ${booking.destination}
                    <p><b>Next of Kin:</b> ${booking.nk}</p>
                    <p><b>Next of Kin Phone:</b> ${booking.nkp}</p>
                    <p><b>Amount:</b> ${booking.amount}</p>
                    <input type="hidden" name="payment_type" value="${payment_type}">
                    <input type="hidden" name="amount" value="${booking.amount}">
                    <input type="hidden" name="user_id" value="${booking.id}">
                    <input type="hidden" name="transaction_id" value="${transaction_id}">
                    <button type="submit" class="btn btn-primary">Pay Now</button>
                </div>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>