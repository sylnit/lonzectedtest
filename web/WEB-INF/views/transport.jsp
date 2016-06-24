<%@include file="header.jsp" %>
<div class="col-md-6 col-md-offset-3">
    <div class="panel panel-default">
        <div class="panel-heading">Transport Booking</div>
        <div class="panel-body">
            <form method="post" action="booktransport" class="form-horizontal">
                <div class="form-group">
                    <label for="name" class="control-label col-md-3">Name:</label>
                    <div class="col-md-6">
                        <input type="text" id="name" name="name" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="phone" class="control-label col-md-3">Phone:</label>
                    <div class="col-md-6">
                        <input type="text" id="phone" name="phone" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="nkin" class="control-label col-md-3">Next Of Kin:</label>
                    <div class="col-md-6">
                        <input type="text" id="nkin" name="nkin" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="nphone" class="control-label col-md-3">Next Of Kin Phone:</label>
                    <div class="col-md-6">
                        <input type="text" id="nphone" name="nphone" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="route" class="control-label col-md-3">Destination:</label>
                    <div class="col-md-6">
                        <select name="route" id="route" class="form-control">
                            <option value="select">Select Destination</option>
                            <c:forEach items="${destinations}" var="desti">
                                <option value="${desti.id}">${desti.destination}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label for="ddate" class="control-label col-md-3">Departure Date:</label>
                    <div class="col-md-6">
                        <input type="text" id="ddate" name="ddate" class="form-control" placeholder="dd-mm-yyyy">
                    </div>
                </div>
                <div class="form-group">
                    <label for="dtime" class="control-label col-md-3">Departure time:</label>
                    <div class="col-md-6">
                        <select name="dtime" id="dtime" class="form-control">
                            <option value="select">Select Time</option>
                            <c:forEach items="${dtimes}" var="timeL">
                                <option value="${timeL.id}">${timeL.time}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label for="amount" class="control-label col-md-3">Amount:</label>
                    <div class="col-md-6">
                        <input type="text" name="amount" readonly="true" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-6 col-md-offset-3">
                        <button type="submit" name="submit" class="btn btn-primary">
                            <i class="fa fa-forward"></i> Proceed
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>