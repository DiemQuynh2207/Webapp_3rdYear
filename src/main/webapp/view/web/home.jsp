<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>UX/UI</title>
    <link rel="stylesheet"
        href="https://fonts.googleapis.com/css2?family=Material+Symbols+Sharp:opsz,wght,FILL,GRAD@48,400,0,0" />
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <div class="container">
        <!-- aside section start -->
        <aside>

            <div class="top">

                <div class="logo">
                    <h2>C<span class="danger">BABAR</span></h2>
                </div>
                <div class="close" id="close_btn">
                    <span class="material-symbols-sharp">close</span>
                </div>
            </div>
            <!-- end top -->

            

        </aside>
        <!-- aside section end -->

        <!-- main section start -->
        <main>
            <h1>Dashboard</h1>
            <div class="date">
                <input type="date">
            </div>


            <div class="insights">

                <!--start selling-->
                <div class="sales">
                    <span class="material-symbols-sharp">trending_up</span>
                    <div class="middle">
                        <div class="left">
                            <h3>Total Sales</h3>
                            <h1>$25,023</h1>
                        </div>
                        <div class="progress">
                            <svg>
                                <circle r="30" cy="40" cx="40"></circle>
                            </svg>
                            <div class="number">80%</div>
                        </div>
                    </div>
                    <small>Last 24 Hours</small>
                </div>
                <!--end selling-->

                <!--start expenses-->
                <div class="expenses">
                    <span class="material-symbols-sharp">local_mall</span>
                    <div class="middle">
                        <div class="left">
                            <h3>Expenses</h3>
                            <h1>$25,023</h1>
                        </div>
                        <div class="progress">
                            <svg>
                                <circle r="30" cy="40" cx="40"></circle>
                            </svg>
                            <div class="number">80%</div>
                        </div>
                    </div>
                    <small>Last 24 Hours</small>
                </div>
                <!--end expenses-->

                <!--start expenses-->
                <div class="income">
                    <span class="material-symbols-sharp">stacked_line_chart</span>
                    <div class="middle">
                        <div class="left">
                            <h3>Incomes</h3>
                            <h1>$25,023</h1>
                        </div>
                        <div class="progress">
                            <svg>
                                <circle r="30" cy="40" cx="40"></circle>
                            </svg>
                            <div class="number">80%</div>
                        </div>
                    </div>
                    <small>Last 24 Hours</small>
                </div>
                <!--end expenses-->
            </div>
            <!-- end insights-->
            <!-- start recent oredr -->
            <div class="recent_order">
                <h1>Recent Orders</h1>
                <table>
                    <thread>
                        <tr>
                            <th>Product Name</th>
                            <th>Product Number</th>
                            <th>Payments</th>
                            <th>Status</th>
                        </tr>
                    </thread>
                    <tbody>

                        <tr>
                            <td>Mini USB</td>
                            <td>456</td>
                            <td>Due</td>
                            <td class="warning">Pending</td>
                            <td class="primary">Details</td>
                        </tr>

                        <tr>
                            <td>Mini USB</td>
                            <td>456</td>
                            <td>Due</td>
                            <td class="warning">Pending</td>
                            <td class="primary">Details</td>
                        </tr>

                        <tr>
                            <td>Mini USB</td>
                            <td>456</td>
                            <td>Due</td>
                            <td class="warning">Pending</td>
                            <td class="primary">Details</td>
                        </tr>

                        <tr>
                            <td>Mini USB</td>
                            <td>456</td>
                            <td>Due</td>
                            <td class="warning">Pending</td>
                            <td class="primary">Details</td>
                        </tr>


                    </tbody>
                </table>
            </div>

        </main>
        <!-- main section end -->

        <!-- right section start -->
        <div class="right">
            <div class="top">

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
                        <img src="images/profile-1.jpg" alt="" ></div>
                    </div>
                </div>

            </div>
            <!--end top-->
            <!-- start recent updates-->
            <div class="recent_updates">
                <h2>Recent Update</h2>
                <div class="updates">
                    <div class="update">
                        <div class="profile-photo">
                            <img src="images/profile-2.jpg" alt="">
                        </div>
                        <div class="message">
                        <p><b>Barbar</b> Recived his order</p>
                        </div>
                    </div>
                    <div class="update">
                        <div class="profile-photo">
                            <img src="images/profile-2.jpg" alt="">
                        </div>
                        <div class="message">
                        <p><b>Barbar</b> Recived his order</p>
                        </div>
                    </div>
                    <div class="update">
                        <div class="profile-photo">
                            <img src="images/profile-2.jpg" alt="">
                        </div>
                        <div class="message">
                        <p><b>Barbar</b> Recived his order</p>
                        </div>
                    </div>
                </div>
            </div>
            <!-- end recent update -->
            <!-- start sale analytic-->
            <div class="sales_analytics">
                <h2>Sales Analytics</h2>
                <div class="item onlion">
                    <div class="icon">
                        <span class="material-symbols-sharp">shopping_cart</span>
                    </div>
                    <div class="right_text">
                        <div class="info">
                            <h3>onlion orders</h3>
                            <small class="text-muted">Last seen 2 hours</small>
                        </div>
                        <h5 class="danger">-17%</h5>
                        <h3>3849</h3>
                    </div>
                </div>

                <div class="item onlion">
                    <div class="icon">
                        <span class="material-symbols-sharp">shopping_cart</span>
                    </div>
                    <div class="right_text">
                        <div class="info">
                            <h3>onlion orders</h3>
                            <small class="text-muted">Last seen 2 hours</small>
                        </div>
                        <h5 class="danger">-17%</h5>
                        <h3>3849</h3>
                    </div>
                </div>

                <div class="item onlion">
                    <div class="icon">
                        <span class="material-symbols-sharp">shopping_cart</span>
                    </div>
                    <div class="right_text">
                        <div class="info">
                            <h3>onlion orders</h3>
                            <small class="text-muted">Last seen 2 hours</small>
                        </div>
                        <h5 class="danger">-17%</h5>
                        <h3>3849</h3>
                    </div>
                </div>
            </div>
            <!-- end sale analytic-->
            <div class="item add_products">
                <div>
                    <span class="material-symbols-sharp">add</span>
                </div>
            </div>
        </div>
        
    </div>
    




    <script src="script.js"></script>
</body>

</html>