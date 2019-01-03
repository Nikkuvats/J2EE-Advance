<h2>Using JavaBeans in JSP</h2>
 
<jsp:useBean id="test" class="com.Bean" />
  
<p>Got message....</p>

<jsp:setProperty name="test" 
                    property="message" 
                    value="Hello JSP..." />

<jsp:getProperty name="test" property="message" />
 