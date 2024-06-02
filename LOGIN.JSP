<%@ page session="false" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<style>

</style>

	<div id="wrap">
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="container"> </div>
		</div>
		<div class="container">
			<div class="col-md-100">
				<div class="jumbotron mx-auto" style="width: 66%; margin: 0;  " >
	 			<h2 align="center">Bill Guru</h2>
				</div>
					<div class="row">
						<div class="col-md-12">
							<div class="cotainer">
								<div class="row justify-content-center">
									<div class="col-md-8">
										<div class="card">
											<div class="card-header text-center">Login</div>
											<div class="card-body">
												<div class="row"><div class="col-md-12">
													<form:form id="login" method="post" modelAttribute="loginFormBean" class="form-horizontal" role="form" >
<!-- 												<form id="login" role="form" class="form-horizontal" action="./app?action=userauth" method="get"> -->

													<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
													<c:if test="${param.error != null}">
														<div class="alert alert-danger">Wrong username and/or password.</div>
													</c:if>
													<c:if test="${param.logout != null}">
														<div class="alert alert-success">You have been logged out from the system.</div>
													</c:if>  
													
													<div class="form-group row">
														<label for="username" class="col-md-4 col-form-label text-md-right">Username</label>
														<div class="col-md-6">
															<form:input path="username" class="form-control casesensitive" placeholder="username" required="required" autofocus="autofocus"/>
														</div>
													</div>
	
													<div class="form-group row">
														<label for="password" class="col-md-4 col-form-label text-md-right">Password</label>
														<div class="col-md-6">
															<form:password class="form-control" path="password" placeholder="password" required="required" />

														</div>
													</div>

	
													<div class="form-group row">
														<div class="col-md-6 offset-md-4">
															<button class="btn btn-success float-right" type="submit">Login</button>
												
													</div>
	
		</div>
													
													 </form:form>
												
												</div></div>
												
											</div>

										</div>
									</div>
								</div>
							</div>
							
							
							
							
							
						
						
						

<!-- 							<div class="panel panel-default"> -->
<!-- 								<div class="panel-heading"> -->
<!-- 									<h3 class="panel-title">Login</h3> -->
<!-- 								</div> -->
<!-- 								<div class="panel-body"> -->
<!-- 									<div id="formsContent"> -->
<!-- 										<form id="login" role="form" class="form-horizontal" action="./app?action=userauth" method="post"> -->
	

<!-- 											<div class="form-group error"> -->
<!-- 												<label for="username" class="col-lg-2 control-label">  -->
<!-- 													Login Name -->
<!-- 												</label> -->
<!-- 												<div class="col-lg-6"> -->
<!-- 													<input id="username" name="username" placeholder="username" class="form-control" type="text" value="" required="true" /> -->
<!-- 												</div> -->
<!-- 											</div>	 -->
<!-- 											<div class="form-group error"> -->
<!-- 												<label for="password" class="col-lg-2 control-label"> -->
<!-- 													Password -->
<!-- 												</label> -->
<!-- 												<div class="col-lg-6"> -->
<!-- 													<input id="password" name="password" placeholder="password" class="form-control" type="password" value="" required="true" /> -->
<!-- 												</div> -->
<!-- 											</div> -->
											
										    
<!-- 											<hr/> -->
<!-- 											<input type="hidden" name="" value=""/> -->
<!-- 											<p><button type="submit" class="btn btn-primary">Submit &raquo;</button></p> -->
<!-- 											<div> -->
<!-- 											</div></form> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 							</div> -->

						</div>
					</div>
			</div>
		</div>
	</div>
	<div id="footer">
		<div class="container">
			<p class="text-muted credit"></p>
		</div>
	</div>
	
	
	
	
	
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel">Password reset</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
                        <div class="text-center">
                          <h3><i class="fa fa-lock fa-4x"></i></h3>
                          <h2 class="text-center">Forgot your password?</h2>
                          <p>You can reset it here.</p>
                            <div class="panel-body">
                              <form class="form">
                                <fieldset>
                                  <div class="form-group">
                                    <div class="input-group">
                                      <span class="input-group-addon"><i class="glyphicon glyphicon-envelope color-blue"></i></span>
                                      <input id="emailInput" placeholder="email address" class="form-control" type="email" >
                                    </div>
                                  </div>
                                  <div class="form-group">
                                    <input id="passwordReset" class="btn btn-lg btn-primary btn-block" value="Send my password." type="button">
                                  </div>
                                </fieldset>
                              </form>
                            </div>
                        </div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
			</div>
		</div>
	</div>
</div>



	
<script>
function showSendPassword() {
	$('#exampleModal').modal('show');
}

$(document).ready(function() {
	$('#passwordReset').click(
		function() {
			$.ajax({
    			url: '<c:url value="/loginService/reset"/>',
    			type: "get", 
    			data: {
    				username: $('#emailInput').val(),
    			},
    			contentType: 'application/json',
    			success: function(response) {
    				$('#emailInput').val("")
    				$('#exampleModal').modal('hide');
    				alert("Email sent.");
    			},
    			error: function(xhr, exception) {
    				$('#emailInput').val("")
    				$('#exampleModal').modal('hide');
    				alert("Error occurred. Please contact support.");
    			}
    		});
		}
 	);
});

</script>
