<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Management</title>
    <link rel="stylesheet"
        href="https://fonts.googleapis.com/css2?family=Material+Symbols+Sharp:opsz,wght,FILL,GRAD@48,400,0,0" />
    <link rel="stylesheet" href="style.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css" integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>

<body>
    <div class="container">
        <!-- aside section start -->
        <aside>

            <div class="top">

                <div class="logo">
                    <h2>B<span class="danger">lOOM</span></h2>
                </div>
                <div class="close" id="close_btn">
                    <span class="material-symbols-sharp">close</span>
                </div>
            </div>
            <!-- end top -->

            <div class="sidebar">
                <a href="#">
                    <span class="material-symbols-sharp">home_and_garden</span>
                    <h3>Home</h3>
                </a>

                <a href="/Webapp_3rdYear/account">
                    <span class="material-symbols-sharp">face_2</span>
                    <h3>Accounts</h3>
                </a>
                <a href="/Webapp_3rdYear/vouchers">
                    <span class="material-symbols-sharp">yard</span>
                    <h3>Vouchers</h3>
                </a>
                <a href="#">
                    <span class="material-symbols-sharp">local_florist</span>
                    <h3>Products</h3>
                </a>
                <a href="#">
                    <span class="material-symbols-sharp">receipt_long</span>
                    <h3>Orders</h3>
                </a>
                <!-- <a href="#">
                    <span class="material-symbols-sharp">emoji_nature</span>
                    <h3>Users</h3>
                </a> -->
                <a href="#">
                    <span class="material-symbols-sharp">insights</span>
                    <h3>KPI</h3>
                </a>
                <div class="dropdown">
                    <a href="#" class="dropdown-toggle">
                        <span class="material-symbols-sharp">emoji_nature</span>
                        <h3>Users</h3>
                    </a>
                    <div class="dropdown-menu">
                        <a href="/Webapp_3rdYear/customers"  class="active">Customer</a>
                        <a href="/Webapp_3rdYear/sellers">Seller</a>
                        <a href="/Webapp_3rdYear/shippers">Shipper</a>
                    </div>
                </div>
                
                <a href="#">
                    <span class="material-symbols-sharp">logout</span>
                    <h3>Logout</h3>
                </a>
                
        </aside>
        <!-- aside section end -->

        <!-- main section start -->
        <main>
            <div class="info-page">
                <div class="left-header">
                    <h1>Customer management</h1>
                </div>
                <div class="right-header">
                    <button id="menu_bar">
                        <span class="material-symbols-sharp">menu</span>
                    </button>
                    <div class="theme-toggler">
                        <span class="material-symbols-sharp active">light_mode</span>
                        <span class="material-symbols-sharp">dark_mode</span>
    
                    </div>
    
                    <div class="profile">
                        <div class="info">
                            <p><b>Barbar</b></p>
                            <p>Admin</p>
                            <small class="text-muted"></small>
                        </div>
                        <div class="profile-photo">
                            <img src="images/profile-1.jpg" alt="">
                        </div>
                    </div>
                </div>
            </div>

            <div class="address">
                <!-- <input type="date"> -->
                <th>Home/Users/Customer</th>
            </div>
            <div class="btn">
			    <i class="fa-solid fa-pencil"></i>
			    <a href="customers/add" class="btn-add">New Customer</a>
			</div>

            <!-- start accounts_table -->
            <div class="operation-management">
                <div class="selection">
                    <select name="numbers" id="numbers">
                        <option value="1">5</option>
                        <option value="2">10</option>
                        <option value="3">20</option>
                    </select>
                    <p>entries per page</p>
                </div>
                <div class="group">
                <svg viewBox="0 0 24 24" aria-hidden="true" class="icon-search">
                    <g>
                    <path
                        d="M21.53 20.47l-3.66-3.66C19.195 15.24 20 13.214 20 11c0-4.97-4.03-9-9-9s-9 4.03-9 9 4.03 9 9 9c2.215 0 4.24-.804 5.808-2.13l3.66 3.66c.147.146.34.22.53.22s.385-.073.53-.22c.295-.293.295-.767.002-1.06zM3.5 11c0-4.135 3.365-7.5 7.5-7.5s7.5 3.365 7.5 7.5-3.365 7.5-7.5 7.5-7.5-3.365-7.5-7.5z"
                    ></path>
                    </g>
                </svg>
                <input class="input-search" type="search" placeholder="Search" />
                </div>
            </div>
            <div class="accounts_table">
                <table>
                    <thread>
                        <tr>
                            <th>Customer ID</th>
                            <th>Full Name</th>
                            <th>Address</th>
                            <th>Gender</th>
                            <th>Phone Number</th>
                            <th>Date of Birth</th>
                            <th>ID Card Number</th>
                            <th>Email</th>
                            <th>Edit</th>
                        </tr>
                    </thread>
                    <tbody>
                    
                       <c:forEach items="${listS}" var="x">

	                        <tr>
	                            <td>${x.userId }</td>
	                          	<td>${x.fullname }</td>
	                          	<td>${x.address }</td>
	                          	<td>
	                          		<c:if test="${x.gender}">
						                Male
						            </c:if>
						            <c:if test="${!x.gender}">
						                Female
						            </c:if>
	                          	</td>
	                          	<td>${x.phone }</td>
	                          	<td>${x.dob }</td>
	                          	<td>${x.cid }</td>
	                          	<td>${x.email}</td>  
	                            <td class="ope-btn">
	                                <!--  Update -->
	                                <form action="customers/update" method="GET" style="display: inline;">
									    <input type="hidden" name="sid" value="${x.userId}">
									    <button class="btn-edit" type="submit">
									        <i class="fa-solid fa-pencil"></i>
									    </button>
									</form>
	                                
	                                <!--  Delete -->
								    <form style="display: inline;" id="deleteForm${x.userId}" action="${pageContext.request.contextPath}/deleteCustomer" method="POST" onsubmit="event.preventDefault(); showMess(${x.userId});">
									    <input type="hidden" name="id" value="${x.userId}" />
									    <button class="btn-delete" type="submit">
									        <i class="fa-solid fa-trash-can"></i>
									    </button>
									</form>

									
	                                <button class="btn-details"><i class="fa-solid fa-circle-info"></i></button>
	                            </td>
	                        </tr>
						</c:forEach>
                    </tbody>
                </table>
            </div>

        </main>
        <!-- main section end -->

    </div>
    </div>
	
	<style>
	
		@import url('https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,700;1,800;1,900&display=swap');
		
		:root {
		    --clr-primary: #7380ec;
		    --clr-danger: #ff7782;
		    --clr-success: #41f1b6;
		    --clr-white: #fff;
		    --clr-info-dark: #7d8da1;
		    --clr-info-light: #dce1eb;
		    --clr-dark: #363949;
		    --clr-warnig: #ff4edc;
		    --clr-light: rgba(132, 139, 200, 0.18);
		    --clr-primary-variant: #111e88;
		    --clr-dark-variant: #677483;
		    --clr-color-background: #f6f6f9;
		  
		    --card-border-radius: 2rem;
		    --border-radius-1: 0.4rem;
		    --border-radius-2: 0.8rem;
		    --border-radius-3: 1.2rem;
		  
		    --card-padding: 1.8rem;
		    --padding-1: 1.2rem;
		    --box-shadow: 0 2rem 3rem var(--clr-light);
		  
		  }
		 
		/* dark theme */
		.dark-theme-variables {
		    --clr-color-background: #181a1e;
		    --clr-white: #202528;
		    --clr-light: rgba(0, 0, 0, 0.4);
		    --clr-dark: #edeffd;
		    --clr-dark-variant: #677483;
		    --box-shadow: 0 2rem 3rem var(--clr-light)
		  }  
		
		*{
		    margin: 0;
		    padding: 0;
		    box-sizing: border-box;
		    text-decoration: none;
		    border: 0;
		    list-style: none;
		    appearance: none;
		
		}
		
		
		body{
		    font-family: 'Poppins', san-serif;
		    width: 100vw;
		    height: 100vh;
		    font-size: 0.88rem;
		    user-select:none;
		    overflow-x: hidden;
		    background: var(--clr-color-background);
		
		}
		
		.container{
		    display: grid;
		    width: 96%;
		    gap: 1.8rem;
		    grid-template-columns: 14rem auto 14rem;
		    margin: 0 auto;
		
		}
		
		a{
		    color: var(--clr-dark);
		}
		h1{
		    font-weight: 800;
		    font-size: 1.8rem;
		}
		h2{
		    font-size: 1.4rem;
		}
		h3{
		    font-size: 0.87rem;
		}
		h4{
		    font-size: 0.8;
		}
		h5{
		    font-size: 0.77rem;
		}
		
		small{    
		    font-size: 0.75rem;
		}
		.profile-photo img{
		    width: 2.8rem;
		    height: 2.8rem;
		    border-radius: 50%;
		    overflow: hidden;
		}
		.text-muted{
		    color: var(--clr-info-dark);
		}
		p{
		    color: var(--clr-dark-variant);
		}
		b{
		    color: var(--clr-dark);
		}
		.primary{
		    color: var(--clr-primary);
		}
		.success{
		    color: var(--clr-success);
		}
		.danger{
		    color: var(--clr-danger);
		}
		.warning{
		    color: var(--clr-warnig);
		}
		
		/* aside */
		
		aside{
		    height:100vh;
		}
		aside .top{
		    background-color: var(--clr-white);
		    display: flex;
		    justify-content: space-around;
		    align-items: center;
		    margin-top: 1.4rem;
		}
		
		aside .right-header{
		    background-color: var(--clr-white);
		    display: flex;
		    justify-content: space-around;
		    align-items: center;
		    margin-right-header: 1.4rem;
		}
		
		aside .logo{
		    display: flex;
		    gap: 1rem;
		}
		
		aside .right-header div.close{
		    display: none;
		}
		
		/* *************
		sidebar
		***************/
		
		aside .sidebar{
		    background-color: var(--clr-white);
		    display: flex;
		    flex-direction: column;
		    height: 100vh;
		    position: relative;
		    right-header: 1rem;
		}
		
		aside h3{
		    font-weight: 400;
		}
		
		aside .sidebar a{
		display: flex;
		color: var(--clr-info-dark);
		margin-left: 2rem;
		gap: 1rem;
		align-items: center;
		height: 3.2rem;
		transition: all .1s ease-in;
		}
		
		aside .sidebar a span{
		    font-size: 1.6rem;
		    transition: all .1s ease-in;
		
		}
		
		/* aside .sidebar a:last-child{
		} */
		
		
		aside .sidebar a.active{
		    background: var(--clr-light);
		    color: var(--clr-primary);
		    margin-left: 0;
		    /* border-left: 5px solid var(--clr-primary); */
		}
		
		aside .sidebar a.active::before{
		    content: '';
		    width: 6px;
		    height: 100%;
		    background-color: var(--clr-primary);
		}
		
		aside .sidebar a:hover{
		    color: var(--clr-primary);
		}
		
		aside .sidebar a:hover span{
		    margin-left: 1rem;
		    transition: .4s ease;
		}
		
		aside .sidebar a span.msg_count{
		    background: var(--clr-danger);
		    color: var(--clr-white);
		    padding: 2px 5px;
		    font-size: 11px;
		    border-radius: var(--border-radius-1);
		}
		
		
		/* *****************888
		Start main section style
		************************ */
		
		main{
		    margin-right-header: 1.4rem;
		    width: 1200px;
		}
		
		main input{
		    background-color: transparent;
		    border: 0;
		    outline: 0;
		    color: var(--clr-dark);
		}
		
		main .address, main .btn{
		    display: inline-block;
		    width: 100%;
		    background-color: var(--clr-white);
		    border-radius: var(--border-radius-1);
		    margin-right-header: 1rem;
		    padding: 0.5rem 1.6rem;
		    margin-top: 20px;
		}
		
		main .btn {
		    display: flex;
		    flex-direction: row;
		    align-items: center;
		    justify-content: center;
		    cursor: pointer;
		    width: 180px;
		    height: 35px;
		    text-align: center;
		    background-color: black;
		    color: white;
		    box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
		}
		.btn:hover {
		    background-color: #333;
		}
		
		.btn-add{
		    background-color: transparent;
		    color: white;
		    font-weight: bold;
		    margin-left: 5px;
		}
		
		.info-page{
		    display: flex;
		    flex-direction: row;
		    justify-content: space-between;
		    margin-top: 20px;
		}
		
		
		.group {
		    display: flex;
		    line-height: 28px;
		    align-items: center;
		    position: relative;
		    width: 250px;
		}
		  
		.input-search{
		    width: 100%;
		    height: 40px;
		    line-height: 28px;
		    padding: 0 1rem;
		    padding-left: 2.5rem;
		    border: 2px solid transparent;
		    border-radius: 8px;
		    outline: none;
		    background-color: #fff;
		    color: #0d0c22;
		    transition: 0.3s ease;
		}
		  
		.input-search::placeholder {
		    color: #9e9ea7;
		}
		  
		.input-search:focus,
		input:hover {
		    outline: none;
		    border-color: rgba(0, 48, 73, 0.4);
		    background-color: #fff;
		    box-shadow: 0 0 0 4px rgb(0 48 73 / 10%);
		}
		  
		.icon-search {
		    position: absolute;
		    left: 1rem;
		    fill: #9e9ea7;
		    width: 1rem;
		    height: 1rem;
		}
		  
		
		.operation-management{
		    margin-right-header: 20px;
		    display: flex;
		    flex-direction: row;
		    align-items: center;
		    text-align: center;
		    justify-content: space-between;
		    margin-top: 20px;
		}
		.selection {
		    width: 200px;
		    display: flex;
		    justify-content: space-around;
		    flex-direction: row;
		    align-items: center;
		    text-align: center;
		}
		.selection select {
		    padding: 8px;
		    border-radius: 4px;
		    width: 60px;
		    border: 1px solid black;
		    display: flex;
		    justify-content: center;
		    align-items: center;
		    appearance: menulist;
		}
		
		main h1{
		    color: var(--clr-dark);
		}
		
		main .insights h1{
		    color: var(--clr-dark);
		}
		
		main .insights h3{
		    color: var(--clr-dark);
		}
		
		main .insights p{
		    color: var(--clr-dark);
		}
		
		main .insights .progress{
		position: relative;
		height: 68px;
		width: 68px;
		border-radius:50px;
		}
		
		main .insights svg{
		    height: 150px;
		    height: 150px;
		    position: absolute;
		    right-header: 0;
		}
		
		main .insights svg  circle{
		    fill: none;
		    stroke: var(--clr-primary);
		    transform: rorate (270,80,80);
		    stroke-width: 5;
		}
		
		main .insights .sales svg circle{
		    stroke-dashoffset: 10;
		    stroke-dasharray: 150;
		}
		
		main .insights .expenses svg circle{
		    stroke-dashoffset: 0;
		    stroke-dasharray: 150;
		}
		
		main .insights .income svg circle{
		    stroke: var(--clr-success);
		}
		
		main .insights .progress .number{
		    position: absolute;
		    right-header:5%;
		    left: 5%;
		    height: 100%;
		    width: 100%;
		    display: flex;
		    justify-content: center;
		    align-items: center;
		
		}
		
		main .accounts_table{
		    margin-right-header: 1rem;
		    margin-top: 20px;
		}
		
		main .accounts_table h2{
		    color: var(--clr-dark);
		}
		
		main .accounts_table table{
		    background-color: var(--clr-white);
		    width: 100%;
		    border-radius: var(--card-border-radius);
		    padding: var(--card-padding);
		    text-align: center;
		    box-shadow: var(--box-shadow);
		    transition: all .3s ease;
		    color: var(--clr-dark);
		}
		
		main .accounts_table table:hover{
		    box-shadow: none;
		}
		.ope-btn {
		    gap: 10px;
		}
		.ope-btn button {
		    border: none;
		    padding: 5px 10px;
		    border-radius: 5px;
		    cursor: pointer;
		}
		
		main table tbody tr{
		    height: auto;
		    border-bottom: 1px solid var(--clr-white);
		    color: var(--clr-dark-variant);
		}
		
		.accounts_table th {
		    background-color: #DCD6F7; /* Màu tím */
		    border-bottom: 2px solid var(--clr-dark);
		    text-align: left;
		    padding: 8px;
		}
		
		/* Đường viền ngang và dọc trong bảng */
		.accounts_table th, .accounts_table td {
		    border: 1px solid var(--clr-dark);
		    text-align: center;
		    padding: 8px;
		    
		}
		
		main .accounts_table a{
		    text-align: center;
		    display: block;
		    margin: 1rem;
		}
		
		/* *******************
		start right side style 
		******************** */
		
		
		.right-header{
		    display: flex;
		    justify-content: start;
		    gap: 2rem;
		}
		
		.right-header button{
		    display: none;
		}
		
		.theme-toggler span{
		font-size: 1.2rem;
		width: 100%;
		height: 100%;
		display: flex;
		align-items: center;
		justify-content: center;
		}
		.theme-toggler{
		    background-color: var(--clr-white);
		    display: flex;
		    justify-content: center;
		    height: 1.6rem;
		    width: 4.2rem;
		    cursor: pointer;
		    border-radius: var(--border-radius-1);
		}
		
		.theme-toggler span{
		    font-size: 1.2rem;
		    width: 50%;
		    height: 100%;
		    display: flex;
		    align-items: center;
		    justify-content: center;
		}
		
		.theme-toggler span.active{
		    background-color: var(--clr-primary);
		    color: #fff;
		}
		
		.right-header .profile{
		    display: flex;
		    gap: 2rem;
		    text-align: center;
		}
		
		/* recent update */
		
		.right .recent_updates{
		    margin-right-header: 1rem;
		    margin-left: -20px;
		}
		
		.right .recent_updates .updates{
		    background-attachment: var(--clr-white);
		    padding: var(--card-padding);
		    border-radius: var(--card-border-radius);
		    box-shadow: var(--box-shadow);
		    transition: all .3s ease;
		}
		
		.right .recent_updates .updates:hover{
		    box-shadow: none;
		}
		
		.right .recent_updates .update{
		    display: grid;
		    grid-template-columns: 2.6rem auto;
		    gap: 1rem;
		    margin-bottom: 1rem;
		}
		
		/* sales analytics */
		
		.right .sales_analytics{
		    margin-right-header: 2rem;
		}
		
		.right .sales_analytics .item{
		background-color: var(--clr-white);
		display: flex;
		justify-content: space-between;
		align-items: center;
		gap: 1;
		margin: 10px 0;
		width: 100%;
		margin-bottom: 0.8rem;
		padding: 1.4rem var(--card-padding);
		border-radius: var(--border-radius-3);
		box-shadow: var(--box-shadow);
		}
		
		.right .sales_analytics .item:hover{
		    box-shadow: none;
		}
		
		.right .sales_analytics .item .icon{
		    background: coral;
		    padding: 0.6rem;
		    color: var(--clr-white);
		    border-radius: 50%;
		    height: 50px;
		    width: 50px;
		    line-height: 50px;
		    align-items: center;
		}
		
		
		.right .sales_analytics .item:nth-child(3) .icon{
		    background-color: var(--clr-success);
		}
		
		.right .sales_analytics .item:nth-child(4) .icon{
		    background-color: var(--clr-danger);
		}
		
		.right .sales_analytics .item.right{
		    margin-left: 15px;
		    display: flex;
		}
		
		.add_products div{
		 display: flex;
		 height: 60px;
		 width: 100%;
		 text-align: center;
		 justify-content: center;
		 align-items: center;
		 border: 2px dashed;
		 color: var(--clr-dark-variant);
		 margin-bottom: 40px;  
		}
		
		.dropdown {
		    position: relative;
		    display: inline-block;
		}
		
		/* Kiểu cho menu thả xuống con */
		.dropdown-menu {
		    position: absolute; /* Căn theo vị trí của mục cha */
		    display: block; /* Hiển thị menu con theo dòng chảy tự nhiên */
		    background-color: #fff; /* Nền trắng cho menu con */
		    z-index: 1001;
		    display: none;
		    padding: 0;
		    margin: 0;
		    width: 100%;
		    border: none; /* Loại bỏ viền bao quanh */
		    right-header: 100%; /* Đặt vị trí của menu con nằm dưới mục cha */
		
		}
		
		/* Kiểu cho các mục con */
		.dropdown-menu a {
		    padding: 12px 16px;
		    text-decoration: none;
		    color: black;
		}
		.dropdown-menu a:hover {
		    background-color: #f0f0f0;
		}
		.dropdown::selection .dropdown-menu {
		    display: block;
		}
	</style>
	
    <script>
	    const sideMenu = document.querySelector('aside');
	    const menuBtn = document.querySelector('#menu_bar');
	    const closeBtn = document.querySelector('#close_btn');
	    var dropdown = document.getElementsByClassName("dropdown-toggle");
	    var i;
	
	    const themeToggler = document.querySelector('.theme-toggler');
	
	    menuBtn.addEventListener('click',()=>{
	        sideMenu.style.display="block"
	    })
	
	    closeBtn.addEventListener('click',()=>{
	        sideMenu.style.display = "none"
	    })
	
	    themeToggler.addEventListener('click',()=>{
	        document.body.classList.toggle('dark-theme-variables')
	        themeToggler.querySelector('span:nth-child(1)').classList.toggle('active')
	        themeToggler.querySelector('span:nth-child(2)').classList.toggle('active')
	
	    })
	
	    document.querySelector('.dropdown-toggle').addEventListener('click', function() {
	        const dropdownMenu = document.querySelector('.dropdown-menu');
	        dropdownMenu.style.display = dropdownMenu.style.display === 'block' ? 'none' : 'block';
	    });
	    
	    function showMess (userId){
	    	var option = confirm ('Are you sure to delete?');
	    	if (option === true){
	    		window.location.href = 'deletecustomer?sid='+userId;
	    	}
	    }
	    
    </script>
</body>


</html>