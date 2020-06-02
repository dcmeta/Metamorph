<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        	
          <jsp:include page='<%= request.getParameter("content") %>'/>
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
