<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="common/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="frame_index">
	<div class="frame_index_top">
		<ul>
			<li>模拟做题系统v1.0</li>
		</ul>
	</div>
	
	<div class="frame_index_center">
		<ul>
			<c:choose>
				<c:when test="${empty questionItems }">
					<li>暂时还没有题目哦</li>
				</c:when>
				<c:otherwise>
					<c:forEach items="${questionItems }" var="q" varStatus="i">
						<li>${i.index+1}.${q.content }</li>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</ul>
	</div>
</div>
</body>
</html>