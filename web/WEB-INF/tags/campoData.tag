<%-- 
    Document   : newtag_file
    Created on : 15/12/2013, 14:49:07
    Author     : eduardo
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@ attribute name="id" required="true" %>

<!-- habilitando datapicke no campo data -->


<input type="text" id="${id}" name="${id}" />
<script type="text/javascript">
    $("#${id}").datepicker({dateFormat: 'dd/mm/yy'});
    
</script>
<h1>teste</h1>