
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="/template/header.jsp">
	<jsp:param name="title" value="Table Province" />
</jsp:include>
<body id="page-top">
  <div id="wrapper">
	<jsp:include page="/template/sidebar.jsp"/>
    <div id="content-wrapper" class="d-flex flex-column">
      <div id="content">
		<jsp:include page="/template/navbar.jsp"/>
        <div class="container-fluid">
	        <div class="row">
	            <div class="col-lg-6">
	               <div class="p-5">
			        <form class="user" method="POST" action="${pageContext.request.contextPath}/user/update">
			          <input type='hidden' name='userId' value='${result.userId}'/></br><div class='form-group'>
Username</br>
<input name='username' value='${result.username}' class='form-control' placeholder='Username' required/></div><div class='form-group'>
Password</br>
<input name='password' value='${result.password}' class='form-control' placeholder='Password' required/></div><div class='form-group'>
Role Id</br>
<select name='roleId' class='form-control' required> <c:forEach items='${role }' var='role' varStatus='vss'><option value=${role.roleId } ${result.roleId.roleId == role.roleId ? 'selected' : ''}>${role.roleId }</option></c:forEach></select></div>
			          <input type="submit" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm" value="Add New Data">
			         </form>
		     	</div>
             </div>
           </div>
        </div>
      </div>
    </div>
  </div>
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>
</body>
<jsp:include page="/template/js_file.jsp"/>
</html>