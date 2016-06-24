<%@include file="header.jsp" %>
<div class="col-md-6 col-md-offset-3">
    <div class="panel panel-default">
        <div class="panel-heading">Medical Checkup Booking</div>
        <div class="panel-body">
            <form method="post" action="bookconsultation" class="form-horizontal">
                <div class="form-group">
                    <label for="supack" class="control-label col-md-3">Subscription pack:</label>
                    <div class="col-md-6">
                        <select name="subpack" id="subpack" class="form-control">
                            <option value="select">Select Pack</option>
                            <c:forEach items="${subpackList}" var="list">
                                <option value="${list.id}">${list.pack}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label for="location" class="control-label col-md-3">Your Location:</label>
                    <div class="col-md-6">
                        <select name="location" id="route" class="form-control">
                            <option value="select">Select Location</option>
                            <c:forEach items="${locationList}" var="list">
                                <option value="${list.id}">${list.location}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label for="visitdate" class="control-label col-md-3">Visitation Date:</label>
                    <div class="col-md-6">
                        <select name="visitdate" id="visitdate" class="form-control">
                            <option value="select">Select Date</option>
                            <c:forEach items="${visitDateList}" var="list">
                                <option value="${list.id}">${list.vdate}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label for="visittime" class="control-label col-md-3">Visitation Time:</label>
                    <div class="col-md-6">
                        <select name="visittime" id="visittime" class="form-control">
                            <option value="select">Select Time</option>
                            <c:forEach items="${visitTimeList}" var="list">
                                <option value="${list.id}">${list.vtime}</option>
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
