<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>	<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">	  <a class="sidebar-brand d-flex align-items-center justify-content-center" href="#">	    <div class="sidebar-brand-text mx-3">Admin</div>	  </a>		  <!-- Divider -->	  <hr class="sidebar-divider my-0">		  <!-- Nav Item - Dashboard -->	  <!-- Divider -->	  <hr class="sidebar-divider">		  <!-- Heading -->	  <div class="sidebar-heading">	    Table	  </div>		<li class="nav-item">
<a class="nav-link" href="${pageContext.request.contextPath}/author/show">author</a>
</li>
<li class="nav-item">
<a class="nav-link" href="${pageContext.request.contextPath}/bookinfo/show">bookinfo</a>
</li>
<li class="nav-item">
<a class="nav-link" href="${pageContext.request.contextPath}/cart/show">cart</a>
</li>
<li class="nav-item">
<a class="nav-link" href="${pageContext.request.contextPath}/user/show">user</a>
</li>
		  <!-- Divider -->	  <hr class="sidebar-divider d-none d-md-block">				</ul>