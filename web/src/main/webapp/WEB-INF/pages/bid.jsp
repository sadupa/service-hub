<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<div class="modal fade create-bid-modal" tabindex="-1" role="dialog" aria-labelledby="createBidModalLabel"
     aria-hidden="true">
  <div class="modal-dialog cc-modal-sm">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span
                class="sr-only">Close</span></button>
        <h4 class="modal-title" id="createBidnModalLabel">Place Your Bid</h4>
      </div>
      <div class="modal-body">
        <c:set var="adminUser" value="false"/>
        <form id="createCampaignForm" name="createCampaignForm" method="POST"
              action="<c:url value='/bid/create'/>">

          <input type="text" hidden="hidden" id="request-id-input" name="requestId">

          <div class="form-group">
              <label for="InputAmount">Amount</label>
              <input type="number" class="form-control" id="InputAmount"
                     name="amount" value="0" min="0"  step="0.50">
          </div>
          <div class="form-group">
            <label for="InputDescription">Description </label><label
                  class="pull-right" id="count"></label>
                        <textarea rows="3" class="form-control" id="InputDescription" maxlength="250"
                                  name="description" required="true"></textarea>
          </div>

          <button type="submit" hidden="hidden" id="create-submit-button"/>
        </form>
      </div>
      <script type="text/javascript">

      </script>

      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="document.getElementById('create-submit-button').click();" >
          OK
        </button>
        <button type="button" class="btn btn-default" data-dismiss="modal">
          Cancel
        </button>
      </div>
    </div>
  </div>
</div>
