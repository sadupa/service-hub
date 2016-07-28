<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<div class="modal fade accept-bid-modal" tabindex="-1" role="dialog" aria-labelledby="acceptBidModalLabel"
     aria-hidden="true">
  <div class="modal-dialog cc-modal-sm">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span
                class="sr-only">Close</span></button>
        <h4 class="modal-title" id="acceptBidModalLabel">Accept Bid</h4>
      </div>
      <div class="modal-body">
        <c:set var="adminUser" value="false"/>
        <form id="createCampaignForm" name="createCampaignForm" method="POST"
              action="<c:url value='/bid/accept'/>">

          <input type="text" hidden="hidden" id="bid-id-accept" name="bidId">
          <input type="text" hidden="hidden" id="request-id-accept" name="requestId">
          <p>Are you sure do you want to accept this bid?</p>

          <button type="submit" hidden="hidden" id="accept-submit-button"/>
        </form>
      </div>
      <script type="text/javascript">

      </script>

      <div class="modal-footer">
        <button type="button" class="btn btn-default" onclick="document.getElementById('accept-submit-button').click();" >
          Yes
        </button>
        <button type="button" class="btn btn-default" data-dismiss="modal">
          Cancel
        </button>
      </div>
    </div>
  </div>
</div>
