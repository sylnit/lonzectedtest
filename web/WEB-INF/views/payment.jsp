<%@include file="header.jsp" %>
<div class="col-md-6 col-md-offset-3">
    <div class="panel panel-default">
        <div class="panel-heading">Simulated Payment Gateway</div>
        <div class="panel-body">
            <form method="post" action="confirm" class="form-horizontal">
                <div class="form-group">
                    <label for="amount" class="control-label col-md-3">Amount:</label>
                    <div class="col-md-5">
                        <input type="text" id="amount" class="form-control" name="amount" readonly="true" value="${amount}">
                    </div>
                </div>
                <div class="form-group">
                    <label for="card-number" class="control-label col-md-3">Card Number:</label>
                    <div class="col-md-6">
                        <input type="text" id="card-number" class="form-control" name="cardnumber">
                    </div>
                </div>
                <div class="form-group">
                    <label for="card-expiry" class="control-label col-md-3">Expiry Date:</label>
                    <div class="col-md-3">
                        <select name="month" class="form-control">
                            <option value="01">January</option>
                            <option value="02">February</option>
                            <option value="03">March</option>
                            <option value="04">April</option>
                            <option value="05">May</option>
                            <option value="06">June</option>
                            <option value="07">July</option>
                            <option value="08">August</option>
                            <option value="09">September</option>
                            <option value="10">October</option>
                            <option value="11">November</option>
                            <option value="12">December</option>
                        </select>
                    </div>
                    <div class="col-md-3">
                        <select name="year" class="form-control">
                            <option value="2016">2016</option>
                            <option value="2017">2017</option>
                            <option value="2018">2018</option>
                            <option value="2019">2019</option>
                            <option value="2020">2020</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label for="pin" class="control-label col-md-3">Pin:</label>
                    <div class="col-md-5">
                        <input type="password" id="pin" class="form-control" name="pin">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-5 col-md-offset-3">
                        <button type="submit" name="submit" class="btn btn-primary">Pay</button>
                    </div>
                </div>
                <input type="hidden" name="payment_type" value="${payment_type}">
                <input type="hidden" name="user_id" value="${user_id}">
                <input type="hidden" name="transaction_id" value="${transaction_id}">
            </form>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>