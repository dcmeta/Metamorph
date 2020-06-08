
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
			        <form class="user" method="POST" action="${pageContext.request.contextPath}/bookinfo/update">
			          <input type='hidden' name='bookid' value='${result.bookid}'/></br><div class='form-group'>
Bookname</br>
<input name='bookname' value='${result.bookname}' class='form-control' placeholder='Bookname' required/></div><div class='form-group'>
Bookauthor</br>
<input name='bookauthor' value='${result.bookauthor}' class='form-control' placeholder='Bookauthor' required/></div><div class='form-group'>
Bookpubdate</br>
<input type='date' name='bookpubdate' value='${result.bookpubdate}' class='form-control dateFormater' required/></div><div class='form-group'>
Bookstock</br>
<input name='bookstock' value='${result.bookstock}' class='form-control' placeholder='Bookstock' required/></div><div class='form-group'>
Bookprice</br>
<input name='bookprice' value='${result.bookprice}' class='form-control' placeholder='Bookprice' required/></div><div class='form-group'>
Bookurl</br>
<input name='bookurl' value='${result.bookurl}' class='form-control' placeholder='Bookurl' required/></div>
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