//
//
//import utils.jdbcUtils;
//
//import java.sql.*;
//
////管理员登录后才能使用的功能
//public class practice
//{
//    //管理员查看自己信息
//    public static String queryAD(int No)
//    {
//
//        Connection conn= null;
//        Statement st= null;
//        ResultSet rs= null;
//
//
//        String result = "";
//
//        try {
//            conn = jdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT `administrator_id`,`administrator_name`,`administrator_password`" +
//                    "FROM `administrator` " +
//                    "WHERE `administrator_id`="+No;
//
//            rs = st.executeQuery(sql);
//
//            result += String.format("%-17s","administrator_id");
//            result += String.format("%-15s","administrator_name");
//            result += String.format("%-15s","administrator_password");
//            result += "\n";
//
//            while (rs.next())
//            {
//
//                result += String.format("%-17s",rs.getInt("administrator_id"));
//                result += String.format("%-15s",rs.getString("administrator_name"));
//                result += String.format("%-15s",rs.getString("administrator_password"));
//                result += "\n";
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            jdbcUtils.release(conn,st,rs);
//        }
//        return result;
//    }
//    //通过ID查询用户
//    public static String queryCus_Id(int No)
//    {
//
//        Connection conn= null;
//        Statement st= null;
//        ResultSet rs= null;
//
//
//        String result = "";
//
//        try {
//            conn = jdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT `user_id`,`user_name`,`user_password`,`family_id`" +
//                    "FROM `user`" +
//                    "WHERE `user_id`="+No+ " AND `existed`=1";
//
//            rs = st.executeQuery(sql);
//
//            result += String.format("%-12s","user_id");
//            result += String.format("%-15s","user_name");
//            result += String.format("%-16s","user_password");
//            result += String.format("%-8s","family_id");
//            result += "\n";
//
//            while (rs.next())
//            {
//
//                result += String.format("%-12s",rs.getInt("user_id"));
//                result += String.format("%-15s",rs.getString("user_name"));
//                result += String.format("%-16s",rs.getString("user_password"));
//                result += String.format("%-8s",rs.getString("family_id"));
//                result += "\n";
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            jdbcUtils.release(conn,st,rs);
//        }
//        return result;
//    }
//    //通过名字查询用户
//    public static String queryCus_Name(String fName,String lName)
//    {
//
//        Connection conn= null;
//        Statement st= null;
//        ResultSet rs= null;
//
//
//        String result = "";
//
//        try {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT `CustomerNo`,`fName`,`lName`,`sex`,`DOB`,`address`,`telNo`,`balance`" +
//                    "FROM `customer`" +
//                    "WHERE `fName` LIKE '%"+fName+"%' AND " + "`lName` LIKE '%"+lName+"%'"+" AND `exist`=1";
//
//            rs = st.executeQuery(sql);
//
//
//            result += String.format("%-12s","CustomerNo");
//            result += String.format("%-15s","fName");
//            result += String.format("%-16s","lName");
//            result += String.format("%-8s","sex");
//            result += String.format("%-12s","DOB");
//            result += String.format("%-22s","address");
//            result += String.format("%-13s","telNo");
//            result += String.format("%-10s","balance");
//            result += "\n";
//
//            while (rs.next()){
//
//                result += String.format("%-12s",rs.getInt("CustomerNo"));
//                result += String.format("%-15s",rs.getString("fName"));
//                result += String.format("%-16s",rs.getString("lName"));
//                result += String.format("%-8s",rs.getString("sex"));
//                result += String.format("%-12s",rs.getString("DOB"));
//                result += String.format("%-22s",rs.getString("address"));
//                result += String.format("%-13s",rs.getString("telNo"));
//                result += String.format("%-10s",rs.getFloat("balance"));
//                result += "\n";
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            JdbcUtils.release(conn,st,rs);
//        }
//        return result;
//    }
//    //通过ID查询商家
//    public static String queryVen_Id(int No)
//    {
//
//        Connection conn= null;
//        Statement st= null;
//        ResultSet rs= null;
//
//
//
//        String result = "";
//
//        try {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT `VendorNo`,`name`,`address`,`telNo`,`credit`,`numOfOrders`,`turnover`" +
//                    "FROM `vendor`" +
//                    "WHERE `VendorNo`="+No+" AND `exist`=1";
//
//            rs = st.executeQuery(sql);
//
//
//            result += String.format("%-10s","VendorNo");
//            result += String.format("%-22s","name");
//            result += String.format("%-22s","address");
//            result += String.format("%-13s","telNo");
//            result += String.format("%-13s","numOfOrders");
//            result += String.format("%-8s","credit");
//            result += String.format("%-10s","turnover");
//            result += "\n";
//
//            while (rs.next()){
//
//                result += String.format("%-10s",rs.getInt("VendorNo"));
//                result += String.format("%-22s",rs.getString("name"));
//                result += String.format("%-22s",rs.getString("address"));
//                result += String.format("%-13s",rs.getString("telNo"));
//                result += String.format("%-13s",rs.getInt("numOfOrders"));
//                result += String.format("%-8s",rs.getInt("credit"));
//                result += String.format("%-10s",rs.getFloat("turnover"));
//                result += "\n";
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            JdbcUtils.release(conn,st,rs);
//        }
//        return result;
//    }
//    //通过商家名查询商家
//    public static String queryVen_Name(String Name)
//    {
//
//        Connection conn= null;
//        Statement st= null;
//        ResultSet rs= null;
//
//
//        String result = "";
//
//        try {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT `VendorNo`,`name`,`address`,`telNo`,`credit`,`numOfOrders`,`turnover`" +
//                    "FROM `vendor`" +
//                    "WHERE `name` LIKE '%"+Name+"%'"+" AND `exist`=1";
//
//            rs = st.executeQuery(sql);
//
//
//            result += String.format("%-10s","VendorNo");
//            result += String.format("%-22s","name");
//            result += String.format("%-22s","address");
//            result += String.format("%-13s","telNo");
//            result += String.format("%-13s","numOfOrders");
//            result += String.format("%-8s","credit");
//            result += String.format("%-10s","turnover");
//            result += "\n";
//
//            while (rs.next()){
//
//                result += String.format("%-10s",rs.getInt("VendorNo"));
//                result += String.format("%-22s",rs.getString("name"));
//                result += String.format("%-22s",rs.getString("address"));
//                result += String.format("%-13s",rs.getString("telNo"));
//                result += String.format("%-13s",rs.getInt("numOfOrders"));
//                result += String.format("%-8s",rs.getInt("credit"));
//                result += String.format("%-10s",rs.getFloat("turnover"));
//                result += "\n";
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            JdbcUtils.release(conn,st,rs);
//        }
//        return result;
//    }
//    //搜索订单
//    public static String queryOrder(int No)
//    {
//
//        Connection conn= null;
//        Statement st= null;
//        ResultSet rs= null;
//
//
//        String result = "";
//
//        try {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT `CUSTOMER_CustomerNo`,s.time,`S_OrderNo`,`status`,`PRODUCT_ProductNo`,p.name,s.num,s.price,o.price " +
//                    "FROM `order_form` AS o " +
//                    "INNER JOIN `sub_order_form` AS s " +
//                    "INNER JOIN `product` AS p " +
//                    "WHERE `OrderNo`=`ORDER_FORM_OrderNo` AND `PRODUCT_ProductNo`=`ProductNo` AND `OrderNo`="+No;
//
//            rs = st.executeQuery(sql);
//
//
//            result += String.format("%-12s","CustomerNo");
//            result += String.format("%-22s","Time");
//            result += String.format("%-12s","SubOrderNo");
//            result += String.format("%-12s","status");
//            result += String.format("%-12s","ProductNo");
//            result += String.format("%-35s","ProductName");
//            result += String.format("%-12s","ProductNum");
//            result += String.format("%-15s","SubOrderPrice");
//            result += String.format("%-12s","OrderPrice");
//            result += "\n";
//
//
//            while (rs.next()){
//
//                result += String.format("%-12s",rs.getInt("CUSTOMER_CustomerNo"));
//                result += String.format("%-22s",rs.getString("s.time"));
//                result += String.format("%-12s",rs.getInt("S_OrderNo"));
//                result += String.format("%-12s",rs.getString("status"));
//                result += String.format("%-12s",rs.getInt("PRODUCT_ProductNo"));
//                result += String.format("%-35s",rs.getString("p.name"));
//                result += String.format("%-12s",rs.getInt("s.num"));
//                result += String.format("%-15s",rs.getFloat("s.price"));
//                result += String.format("%-12s",rs.getFloat("o.price"));
//                result += "\n";
//
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            JdbcUtils.release(conn,st,rs);
//        }
//        return result;
//    }
//    //搜索某个时间段内订单的单收和总金额  ====All orders and turnovers in a period====
//    public static String queryOrderPrice_Time(String time1,String time2)
//    {
//
//        Connection conn= null;
//        Statement st= null;
//        ResultSet rs= null;
//
//        String result = "";
//
//        try {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT " +
//                    "CASE WHEN `OrderNo` IS NOT NULL THEN `OrderNo` ELSE CONCAT('Sum=',COUNT(`OrderNo`)) END `OrderNo`,SUM(`price`) AS price " +
//                    "FROM " +
//                    "(SELECT `OrderNo`,`price` " +
//                    "FROM `order_form` " +
//                    "WHERE `time` BETWEEN '"+time1+"' AND '"+time2+"') AS a " +
//                    "GROUP BY `OrderNo` WITH ROLLUP";
//
//            rs = st.executeQuery(sql);
//
//
//            result += String.format("%-12s","OrderNo");
//            result += String.format("%10s","price");
//            result += "\n";
//
//
//            while (rs.next()){
//
//                result += String.format("%-12s",rs.getString("OrderNo"));
//                result += String.format("%10s",String.format("%.2f",rs.getFloat("price")));
//                result += "\n";
//
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            JdbcUtils.release(conn,st,rs);
//        }
//        return result;
//    }
//    //搜索某个小类订单的单收和总金额  ====Orders and turnover of a category====
//    public static String queryS_OrderPrice_C_n(int No)
//    {
//
//        Connection conn= null;
//        Statement st= null;
//        ResultSet rs= null;
//
//        String result = "";
//
//        try {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT " +
//                    "CASE WHEN `S_OrderNo` IS NOT NULL THEN `S_OrderNo` ELSE CONCAT('Sum=',COUNT(`S_OrderNo`)) END `S_OrderNo`,SUM(`price`)AS price " +
//                    "FROM " +
//                    "(SELECT `S_OrderNo`,s.price " +
//                    "FROM `sub_order_form` AS s " +
//                    "INNER JOIN `product` " +
//                    "WHERE `ProductNo`=`PRODUCT_ProductNo` AND `CATEGORY_NARROW_N_CatNo`="+No+")AS a " +
//                    "GROUP BY `S_OrderNo` WITH ROLLUP";
//
//            rs = st.executeQuery(sql);
//
//
//            result += String.format("%-12s","S_OrderNo");
//            result += String.format("%10s","price");
//            result += "\n";
//
//
//            while (rs.next()){
//
//                result += String.format("%-12s",rs.getString("S_OrderNo"));
//                result += String.format("%10s",String.format("%.2f",rs.getFloat("price")));
//                result += "\n";
//
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            JdbcUtils.release(conn,st,rs);
//        }
//        return result;
//    }
//    //查询某段时间内热销前十的产品  ====Top 10 products in a period====
//    public static String queryHotSale_Product_Time(String time1,String time2){
//
//        Connection conn= null;
//        Statement st= null;
//        ResultSet rs= null;
//
//        String result = "";
//
//        try {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT `ProductNo`,`name`,`num` " +
//                    "FROM `product` " +
//                    "INNER JOIN `sub_order_form` " +
//                    "WHERE `PRODUCT_ProductNo`=`ProductNo` AND (`time` BETWEEN '"+time1+"' AND '"+time2+"') " +
//                    "AND `exist`=1 "+
//                    "ORDER BY `num` DESC";
//
//            rs = st.executeQuery(sql);
//
//
//            result += String.format("%-12s","ProductNo");
//            result += String.format("%-35s","name");
//            result += String.format("%-5s","num");
//            result += "\n";
//
//
//            for (int i=0;rs.next()&&i<10;i++){
//
//                result += String.format("%-12s",rs.getInt("ProductNo"));
//                result += String.format("%-35s",rs.getString("name"));
//                result += String.format("%-5s",rs.getInt("num"));
//                result += "\n";
//
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            JdbcUtils.release(conn,st,rs);
//        }
//        return result;
//    }
//    //查询某段时间内商家的订单数和总金额   ====Orders and turnover in a period====
//    public static String queryS_Order_Price_Ven_Time(String time1,String time2){
//
//        Connection conn= null;
//        Statement st= null;
//        ResultSet rs= null;
//
//        String result = "";
//
//        try {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT `VendorNo`,COUNT(`S_OrderNo`),SUM(p.price) " +
//                    "FROM `sub_order_form` " +
//                    "INNER JOIN `vendor` " +
//                    "INNER JOIN `product` AS p " +
//                    "WHERE `PRODUCT_ProductNo`=`ProductNo` AND `VENDOR_VendorNo`=`VendorNo` " +
//                    "AND vendor.exist=1 "+
//                    "AND `time` BETWEEN '"+time1+"' AND '"+time2+"' " +
//                    "GROUP BY `VendorNo` " +
//                    "ORDER BY `VendorNo`";
//
//            rs = st.executeQuery(sql);
//
//
//            result += String.format("%-12s","VendorNo");
//            result += String.format("%-12s","OrderNum");
//            result += String.format("%10s","turnover");
//            result += "\n";
//
//
//            while(rs.next()){
//
//                result += String.format("%-12s",rs.getInt("VendorNo"));
//                result += String.format("%-12s",rs.getInt("COUNT(`S_OrderNo`)"));
//                result += String.format("%10s",String.format("%.2f",rs.getFloat("SUM(p.price)")));
//                result += "\n";
//
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            JdbcUtils.release(conn,st,rs);
//        }
//        return result;
//    }
//    //查询某段时间内销量前十的商家   ====Top 10 merchants in a period====
//    public static String querySales_Ven_Time(String time1,String time2) {
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        String result = "";
//
//        try {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT `VendorNo`,v.name,COUNT(`S_OrderNo`) " +
//                    "FROM `sub_order_form` " +
//                    "INNER JOIN `vendor`AS v " +
//                    "INNER JOIN `product` AS p " +
//                    "WHERE `PRODUCT_ProductNo`=`ProductNo` AND `VENDOR_VendorNo`=`VendorNo` " +
//                    "AND v.exist=1 "+
//                    "AND (sub_order_form.time BETWEEN '"+time1+"' AND '"+time2+"')" +
//                    "GROUP BY `VendorNo` " +
//                    "ORDER BY  COUNT(`S_OrderNo`) DESC";
//
//            rs = st.executeQuery(sql);
//
//
//            result += String.format("%-12s","VendorNo");
//            result += String.format("%-22s","VenName");
//            result += String.format("%-13s","Sales Volume");
//            result += "\n";
//
//            for (int i=0;rs.next()&&i<10;i++) {
//
//                result += String.format("%-12s",rs.getInt("VendorNo"));
//                result += String.format("%-22s",rs.getString("v.name"));
//                result += String.format("%-13s",rs.getInt("COUNT(`S_OrderNo`)"));
//                result += "\n";
//
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//    //查询一段时间成功下单金额前十名的用户   ====Top 10 customers in a period====
//    public static String querySuccess_Ordered_Cus(String time1,String time2){
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        String result = "";
//
//        try {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT `CustomerNo`,`fName`,`lName`,SUM(`sub_order_form`.`price`)" +
//                    "FROM `sub_order_form` " +
//                    "INNER JOIN `customer` " +
//                    "INNER JOIN `order_form` " +
//                    "WHERE `CUSTOMER_CustomerNo`=`CustomerNo`  " +
//                    "AND `OrderNo`=`ORDER_FORM_OrderNo` " +
//                    "AND `exist`=1 "+
//                    "AND (sub_order_form.time BETWEEN '"+time1+"' AND '"+time2+"')" +
//                    "AND NOT `status`='Cancelled' " +
//                    "GROUP BY `CustomerNo` " +
//                    "ORDER BY SUM(`sub_order_form`.`price`) DESC";
//
//            rs = st.executeQuery(sql);
//
//
//            result += String.format("%-12s","CustomerNo");
//            result += String.format("%-15s","fName");
//            result += String.format("%-15s","lName");
//            result += String.format("%10s","priceSum");
//            result += "\n";
//
//
//            for (int i = 0; rs.next() && i < 10; i++) {
//
//                result += String.format("%-12s",rs.getInt("CustomerNo"));
//                result += String.format("%-15s",rs.getString("fName"));
//                result += String.format("%-15s",rs.getString("lName"));
//                result += String.format("%10s",String.format("%.2f",rs.getFloat("SUM(`sub_order_form`.`price`)")));
//                result += "\n";
//
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//    //每个月的订单数量和金额统计（用两个柱状图显示）
//    public static int[] tocharts(String date){
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        int [] arr = new int[25];
//
//        arr[0] = Integer.valueOf(date);
//
//        date += "-01-01";
//
//        try {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT COUNT(`S_OrderNo`),SUM(`price`) FROM `sub_order_form` WHERE  `time` BETWEEN '"+date+"' AND DATE_ADD('"+date+"',INTERVAL 1 MONTH) " +
//                    "UNION ALL " +
//                    "SELECT COUNT(`S_OrderNo`),SUM(`price`) FROM `sub_order_form` WHERE  `time` BETWEEN DATE_ADD('"+date+"',INTERVAL 1 MONTH) AND DATE_ADD('"+date+"',INTERVAL 2 MONTH) " +
//                    "UNION ALL " +
//                    "SELECT COUNT(`S_OrderNo`),SUM(`price`) FROM `sub_order_form` WHERE  `time` BETWEEN DATE_ADD('"+date+"',INTERVAL 2 MONTH) AND DATE_ADD('"+date+"',INTERVAL 3 MONTH) " +
//                    "UNION ALL " +
//                    "SELECT COUNT(`S_OrderNo`),SUM(`price`) FROM `sub_order_form` WHERE  `time` BETWEEN DATE_ADD('"+date+"',INTERVAL 3 MONTH) AND DATE_ADD('"+date+"',INTERVAL 4 MONTH) " +
//                    "UNION ALL " +
//                    "SELECT COUNT(`S_OrderNo`),SUM(`price`) FROM `sub_order_form` WHERE  `time` BETWEEN DATE_ADD('"+date+"',INTERVAL 4 MONTH) AND DATE_ADD('"+date+"',INTERVAL 5 MONTH) " +
//                    "UNION ALL " +
//                    "SELECT COUNT(`S_OrderNo`),SUM(`price`) FROM `sub_order_form` WHERE  `time` BETWEEN DATE_ADD('"+date+"',INTERVAL 5 MONTH) AND DATE_ADD('"+date+"',INTERVAL 6 MONTH) " +
//                    "UNION ALL " +
//                    "SELECT COUNT(`S_OrderNo`),SUM(`price`) FROM `sub_order_form` WHERE  `time` BETWEEN DATE_ADD('"+date+"',INTERVAL 6 MONTH) AND DATE_ADD('"+date+"',INTERVAL 7 MONTH) " +
//                    "UNION ALL " +
//                    "SELECT COUNT(`S_OrderNo`),SUM(`price`) FROM `sub_order_form` WHERE  `time` BETWEEN DATE_ADD('"+date+"',INTERVAL 7 MONTH) AND DATE_ADD('"+date+"',INTERVAL 8 MONTH) " +
//                    "UNION ALL " +
//                    "SELECT COUNT(`S_OrderNo`),SUM(`price`) FROM `sub_order_form` WHERE  `time` BETWEEN DATE_ADD('"+date+"',INTERVAL 8 MONTH) AND DATE_ADD('"+date+"',INTERVAL 9 MONTH) " +
//                    "UNION ALL " +
//                    "SELECT COUNT(`S_OrderNo`),SUM(`price`) FROM `sub_order_form` WHERE  `time` BETWEEN DATE_ADD('"+date+"',INTERVAL 9 MONTH) AND DATE_ADD('"+date+"',INTERVAL 10 MONTH) " +
//                    "UNION ALL " +
//                    "SELECT COUNT(`S_OrderNo`),SUM(`price`) FROM `sub_order_form` WHERE  `time` BETWEEN DATE_ADD('"+date+"',INTERVAL 10 MONTH) AND DATE_ADD('"+date+"',INTERVAL 11 MONTH) " +
//                    "UNION ALL " +
//                    "SELECT COUNT(`S_OrderNo`),SUM(`price`) FROM `sub_order_form` WHERE  `time` BETWEEN DATE_ADD('"+date+"',INTERVAL 11 MONTH) AND DATE_ADD('"+date+"',INTERVAL 12 MONTH) ";
//
//            rs = st.executeQuery(sql);
//
//
//
//            for (int i = 1;rs.next();i++) {
//
//                arr[i] = rs.getInt("COUNT(`S_OrderNo`)");
//                arr[i+12] = (int)rs.getFloat("SUM(`price`)");
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return arr;
//    }
//    //查询全部customer信息
//    public static String queryAllcus(){
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        String result = "";
//
//        try {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT `CustomerNo`,`fName`,`lName`,`sex`,`DOB`,`address`,`telNo`,`balance`" +
//                    "FROM `customer` "+
//                    "WHERE `exist`=1 ";
//
//            rs = st.executeQuery(sql);
//
//
//            result += String.format("%-12s","CustomerNo");
//            result += String.format("%-15s","fName");
//            result += String.format("%-16s","lName");
//            result += String.format("%-8s","sex");
//            result += String.format("%-12s","DOB");
//            result += String.format("%-22s","address");
//            result += String.format("%-13s","telNo");
//            result += String.format("%10s","balance");
//            result += "\n";
//
//
//            while (rs.next()) {
//
//                result += String.format("%-12s",rs.getInt("CustomerNo"));
//                result += String.format("%-15s",rs.getString("fName"));
//                result += String.format("%-16s",rs.getString("lName"));
//                result += String.format("%-8s",rs.getString("sex"));
//                result += String.format("%-12s",rs.getString("DOB"));
//                result += String.format("%-22s",rs.getString("address"));
//                result += String.format("%-13s",rs.getString("telNo"));
//                result += String.format("%10s",String.format("%.2f",rs.getFloat("balance")));
//                result += "\n";
//
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//    //查询全部merchant信息
//    public static String queryAllven(){
//
//        Connection conn= null;
//        Statement st= null;
//        ResultSet rs= null;
//
//
//
//        String result = "";
//
//        try {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT `VendorNo`,`name`,`address`,`telNo`,`credit`,`numOfOrders`,`turnover`\n" +
//                    "FROM `vendor` "+
//                    "WHERE `exist`=1 ";
//
//            rs = st.executeQuery(sql);
//
//
//            result += String.format("%-10s","VendorNo");
//            result += String.format("%-22s","name");
//            result += String.format("%-22s","address");
//            result += String.format("%-13s","telNo");
//            result += String.format("%-13s","numOfOrders");
//            result += String.format("%-8s","credit");
//            result += String.format("%10s","turnover");
//            result += "\n";
//
//            while (rs.next()){
//
//                result += String.format("%-10s",rs.getInt("VendorNo"));
//                result += String.format("%-22s",rs.getString("name"));
//                result += String.format("%-22s",rs.getString("address"));
//                result += String.format("%-13s",rs.getString("telNo"));
//                result += String.format("%-13s",rs.getInt("numOfOrders"));
//                result += String.format("%-8s",rs.getInt("credit"));
//                result += String.format("%10s",String.format("%.2f",rs.getFloat("turnover")));
//                result += "\n";
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            JdbcUtils.release(conn,st,rs);
//        }
//        return result;
//
//    }
//    //查询全部order信息
//    public static String queryAllS_order(){
//
//        Connection conn= null;
//        Statement st= null;
//        ResultSet rs= null;
//
//
//        String result = "";
//
//        try {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT `CUSTOMER_CustomerNo`,s.time,`S_OrderNo`,`status`,`PRODUCT_ProductNo`,p.name,s.num,s.price,o.price,`ORDER_FORM_OrderNo` " +
//                    "FROM `order_form` AS o " +
//                    "INNER JOIN `sub_order_form` AS s " +
//                    "INNER JOIN `product` AS p " +
//                    "WHERE `OrderNo`=`ORDER_FORM_OrderNo` AND `PRODUCT_ProductNo`=`ProductNo`" +
//                    "ORDER BY S_OrderNo";
//
//            rs = st.executeQuery(sql);
//
//
//            result += String.format("%-12s","SubOrderNo");
//            result += String.format("%-9s","OrderNo");
//            result += String.format("%-12s","CustomerNo");
//            result += String.format("%-22s","Time");
//            result += String.format("%-12s","status");
//            result += String.format("%-12s","ProductNo");
//            result += String.format("%-35s","ProductName");
//            result += String.format("%-12s","ProductNum");
//            result += String.format("%-15s","SubOrderPrice");
//            result += String.format("%12s","OrderPrice");
//            result += "\n";
//
//
//            while (rs.next()){
//
//                result += String.format("%-12s",rs.getInt("S_OrderNo"));
//                result += String.format("%-9s",rs.getInt("ORDER_FORM_OrderNo"));
//                result += String.format("%-12s",rs.getInt("CUSTOMER_CustomerNo"));
//                result += String.format("%-22s",rs.getString("s.time"));
//                result += String.format("%-12s",rs.getString("status"));
//                result += String.format("%-12s",rs.getInt("PRODUCT_ProductNo"));
//                result += String.format("%-35s",rs.getString("p.name"));
//                result += String.format("%-12s",rs.getInt("s.num"));
//                result += String.format("%-15s",rs.getFloat("s.price"));
//                result += String.format("%12s",String.format("%.2f",rs.getFloat("o.price")));
//                result += "\n";
//
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            JdbcUtils.release(conn,st,rs);
//        }
//        return result;
//    }
//    //直方图   ====Top 10 products in a period====
//    public static int[] chart_QueryHotSale_Product_Time(String time1,String time2){
//        Connection conn= null;
//        Statement st= null;
//        ResultSet rs= null;
//
//        int[] arr = new int[20];
//
//        try {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT `ProductNo`,`name`,`num` " +
//                    "FROM `product` " +
//                    "INNER JOIN `sub_order_form` " +
//                    "WHERE `PRODUCT_ProductNo`=`ProductNo` AND (`time` BETWEEN '"+time1+"' AND '"+time2+"') " +
//                    "AND `exist`=1 "+
//                    "ORDER BY `num` DESC";
//
//            rs = st.executeQuery(sql);
//
//
//            for (int i=0;rs.next()&&i<10;i++){
//
//                arr[i] = rs.getInt("ProductNo");
//                arr[i+10] = rs.getInt("num");
//
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            JdbcUtils.release(conn,st,rs);
//        }
//        return arr;
//    }
//    //直方图   ====Top 10 customers in a period====
//    public static double[] chart_QuerySuccess_Ordered_Cus(String time1,String time2){
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        double[] arr = new double[20];
//
//        try {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT `CustomerNo`,`fName`,`lName`,SUM(`sub_order_form`.`price`)" +
//                    "FROM `sub_order_form` " +
//                    "INNER JOIN `customer` " +
//                    "INNER JOIN `order_form` " +
//                    "WHERE `CUSTOMER_CustomerNo`=`CustomerNo`  " +
//                    "AND `OrderNo`=`ORDER_FORM_OrderNo` " +
//                    "AND `exist`=1 "+
//                    "AND (sub_order_form.time BETWEEN '"+time1+"' AND '"+time2+"')" +
//                    "AND NOT `status`='Cancelled' " +
//                    "GROUP BY `CustomerNo` " +
//                    "ORDER BY SUM(`sub_order_form`.`price`) DESC";
//
//            rs = st.executeQuery(sql);
//
//
//
//            for (int i = 0; rs.next() && i < 10; i++) {
//
//                arr[i] += rs.getInt("CustomerNo");
//                arr[i+10] += rs.getFloat("SUM(`sub_order_form`.`price`)");
//
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return arr;
//    }
//    //直方图   ====Top 10 merchants in a period====
//    public static int[] chart_QuerySales_Ven_Time(String time1,String time2){
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        int[] arr = new int[20];
//
//        try {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "SELECT `VendorNo`,v.name,COUNT(`S_OrderNo`) " +
//                    "FROM `sub_order_form` " +
//                    "INNER JOIN `vendor`AS v " +
//                    "INNER JOIN `product` AS p " +
//                    "WHERE `PRODUCT_ProductNo`=`ProductNo` AND `VENDOR_VendorNo`=`VendorNo` " +
//                    "AND v.exist=1 "+
//                    "AND (sub_order_form.time BETWEEN '"+time1+"' AND '"+time2+"')" +
//                    "GROUP BY `VendorNo` " +
//                    "ORDER BY  COUNT(`S_OrderNo`) DESC";
//
//            rs = st.executeQuery(sql);
//
//
//
//            for (int i=0;rs.next()&&i<10;i++) {
//
//                arr[i] += rs.getInt("VendorNo");
//                arr[i+10] += rs.getInt("COUNT(`S_OrderNo`)");
//
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return arr;
//    }
//}
