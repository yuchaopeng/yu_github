<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="common/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	function prevQuestion(){
		$("#submitForm").attr("action","<%=request.getContextPath()%>/answer/prev");
		$("#submitForm").submit();
	}
	
	function nextQuestion(){
		$("#submitForm").attr("action","<%=request.getContextPath()%>/answer/next");
		$("#submitForm").submit();
	}
	
</script>
</head>
<body>
<form action="" id="submitForm" method="POST">
<div class="frame_index">
	<div class="frame_index_top">
		<ul>
			<li>模拟做题系统v1.0</li>
		</ul>
	</div>
	
	<div class="frame_index_center">
		<ul>
			<c:choose>
				<c:when test="${empty answerItem }">
					<li>暂时还没有题目哦</li>
				</c:when>
				<c:otherwise>
						<li>${answerItem.questionItem.content }</li>
				</c:otherwise>
			</c:choose>
		</ul>
		<input type="text" name="answerItemId" value="${answerItem.id }"/>
		请填写答案：<input type="text" name="answerResult"/>
		<a href="javascript:prevQuestion()">上一题</a>
		<a href="javascript:nextQuestion()">下一题</a>
		
	</div>
</div>
</form>
</body>
</html>