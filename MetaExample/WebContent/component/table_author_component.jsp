
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1 class="h3 mb-2 text-gray-800">author Table</h1>
<div class="d-sm-flex align-items-center justify-content-between mb-4">
  <h1 class="h3 mb-0 text-gray-800"></h1>
  <a href='create' class='d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm'><i class='text-white-50'></i> Add New Data</a>
</div>
 <div class="card shadow mb-4">
   <div class="card-header py-3">
     <h6 class="m-0 font-weight-bold text-primary">Table</h6>
     
   </div>
   <div class="card-body">
     <div class="table-responsive">
       <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
         <thead>
<th>Id</th>
<th>Authorname</th>
<th>Update</th>
<th>Delete</th>
         </thead>
         <tbody>
<c:forEach items="${result }" var="result" varStatus="vss">
<tr>
<td>${vss.count}</td><td>${result.authorname }</td>
<td><a href='edit/${result.id}' class='d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm'><i class='text-white-50'></i> Update</a></td>
<td><a href='delete/${result.id}' class='d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm'><i class='text-white-50'></i> Delete</a></td>
</tr>
</c:forEach>
         </tbody>
       </table>
     </div>
   </div>
 </div>