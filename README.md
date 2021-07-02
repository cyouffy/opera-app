<h1 align="center">Opera service</h1>

<h2>Description</h2>
This project was created for online 
booking of tickets for opera performances.
Users can view the session schedule, stage 
selection and ticket reservations.
Administrators can manage sessions, opera performances, etc.

<h2>Credentials</h2>
<table width="100%" cellspacing="0" cellpadding="5">
   <tr> 
        <td valign="top" align="center"><b>&nbsp;</b></td>
        <td valign="top" align="center"><b>Guest</b></td>
        <td valign="top" align="center"><b>Registered user</b></td>
        <td valign="top" align="center"><b>Admin</b></td>
   </tr>
    <tr> 
        <td valign="top" align="center"><b>Registration</b></td>
        <td valign="top" align="center"><b>+</b></td>
        <td valign="top" align="center"><b>-</b></td>
        <td valign="top" align="center"><b>+</b></td>
   </tr>
    <tr> 
        <td valign="top" align="center"><b>View available sessions</b></td>
        <td valign="top" align="center"><b>+</b></td>
        <td valign="top" align="center"><b>+</b></td>
        <td valign="top" align="center"><b>+</b></td>
   </tr>
    <tr> 
        <td valign="top" align="center"><b>Process the order</b></td>
        <td valign="top" align="center"><b>-</b></td>
        <td valign="top" align="center"><b>+</b></td>
        <td valign="top" align="center"><b>+</b></td>
   </tr>
    <tr> 
        <td valign="top" align="center"><b>View orders history</b></td>
        <td valign="top" align="center"><b>-</b></td>
        <td valign="top" align="center"><b>+</b></td>
        <td valign="top" align="center"><b>+</b></td>
   </tr>
    <tr> 
        <td valign="top" align="center"><b>View registered users</b></td>
        <td valign="top" align="center"><b>-</b></td>
        <td valign="top" align="center"><b>-</b></td>
        <td valign="top" align="center"><b>+</b></td>
   </tr>
    <tr> 
        <td valign="top" align="center"><b>Delete users</b></td>
        <td valign="top" align="center"><b>-</b></td>
        <td valign="top" align="center"><b>-</b></td>
        <td valign="top" align="center"><b>+</b></td>
   </tr>
    <tr> 
        <td valign="top" align="center"><b>View all orders</b></td>
        <td valign="top" align="center"><b>-</b></td>
        <td valign="top" align="center"><b>-</b></td>
        <td valign="top" align="center"><b>+</b></td>
   </tr>
  </table>

<h2>Tech Stack</h2>
<ul>
<li>Spring (<i>Core, Web, MVC, Security</i>)</li>
<li>Hibernate</li>
<li>MySql</li>
<li>Tomcat</li>
<li>Maven</li>
<li>Tomcat</li>
</ul>

<h2>Project setup</h2>
<ol>
    <li>Clone this project into your local directory and 
        open the project in an IDE.</li>
    <li>To configure the MySQL DBMS, provide the database URL and password, and username 
        in the project directory. <a href="https://github.com/cyouffy/opera-app/blob/main/src/main/resources/db.properties">resources/db.properties</a>.</li>
    <li>Configure Apache Tomcat.</li>
    <li>Now you can run the project.</li>
    <li>To login you can use default accounts
        <table>
            <tr>
                <td>Admin</td>
                <td><b><i>admin@gmail.com</i></b></td>
                <td><b><i>admin</i></b></td>
            </tr>
            <tr>
                <td>User</td>
                <td><b><i>user@gmail.com</i></b></td>
                <td><b><i>user</i></b></td>
            </tr>
        </table>
    </li>
</ol>