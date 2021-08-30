//package designbuild.administrator;
//
//import utils.MD5Util;
//import utils.jdbcUtils;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Random;
//
//
////管理员登录后才能使用的功能，方法成功返回1，失败返回0
//public class Updates
//{
//    //修改管理员自己的密码
//    public static int updateADPsw(int No, String psw)
//    {
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//
//        int result = 0;
//
//
//        try
//        {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "UPDATE `administrator` SET `password`= MD5('" + psw + "')" +
//                    "WHERE `AdministratorNo`=" + No;
//
//            int i = st.executeUpdate(sql);
//            if (i > 0)
//            {
//                result = 1;
//            }
//
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        } finally
//        {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//
//    //修改管理员自己的电话号码
//    public static int updateADTel(int No, String telNo)
//    {
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        int result = 0;
//
//        try
//        {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "UPDATE `administrator` SET `telNo`= '" + telNo + "' WHERE `AdministratorNo`=" + No;
//
//            int i = st.executeUpdate(sql);
//            if (i > 0)
//            {
//                result = 1;
//            }
//
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        } finally
//        {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//
//    //重置用户密码
//    public static String resetuserpassword(int No)
//    {
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        String result = null;
//
//        //生成6位随机数作为密码
//        Random random = new Random();
//        String psw = "";
//        for (int i = 0; i < 6; i++)
//        {
//            psw += random.nextInt(10);
//        }
//
//
//        try
//        {
//            conn = jdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "UPDATE user SET user_password = '" + MD5Util.string2MD5(psw) + "'" +
//                    "WHERE user_id =" + No;
//
//            int i = st.executeUpdate(sql);
//            if (i > 0)
//            {
//                result = psw;
//            }
//
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        } finally
//        {
//            jdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//
//    //修改用户住址
//    public static int updateCusAdd(int No, String Add)
//    {
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        int result = 0;
//
//        try
//        {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "UPDATE `customer` SET `address`= '" + Add + "' WHERE `CustomerNo`=" + No;
//
//            int i = st.executeUpdate(sql);
//            if (i > 0)
//            {
//                result = 1;
//            }
//
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        } finally
//        {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//
//    //修改用户电话
//    public static int updateCusTel(int No,String username,String password,int familyid)
//    {
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        int result = 0;
//
//        try
//        {
//            conn = jdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "UPDATE `user` SET `user_name`= '" + username + "','user_password'='"+password+"','family_id'='"+familyid+"' WHERE `user_id`=" + No;
//
//            int i = st.executeUpdate(sql);
//            if (i > 0)
//            {
//                result = 1;
//            }
//
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        } finally
//        {
//            jdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//
//    //修改订单
//    public static int updateS_Order(int No, String newStatus)
//    {
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        int result = 0;
//
//        try
//        {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "UPDATE `sub_order_form` SET `status`= '" + newStatus + "' WHERE `S_OrderNo`=" + No;
//
//            int i = st.executeUpdate(sql);
//            if (i > 0)
//            {
//                result = 1;
//            }
//
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        } finally
//        {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//
//    //添加用户
//    public static int insertuser(int userid, String username, String userpassword, int familyid)
//    {
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        int result = 0;
//
//        try
//        {
//            conn = jdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "INSERT INTO `user` (`user_id`,`user_name`,`user_password`,`family_id`,`existed`)\n" +
//                    "VALUES ('" + userid + "','" + username + "','" + MD5Util.string2MD5(userpassword) + "','" + familyid + "',1)";
//
//            int i = st.executeUpdate(sql);
//            if (i > 0)
//            {
//                result = 1;
//            }
//
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        } finally
//        {
//            jdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//
//    //删除用户
//    public static int deleteCus(int No)
//    {
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        int result = 0;
//
//        try
//        {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "UPDATE `customer`\n" +
//                    "SET `exist`=0\n" +
//                    "WHERE `CustomerNo`=" + No;
//
//            int i = st.executeUpdate(sql);
//            if (i > 0)
//            {
//                result = 1;
//            }
//
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        } finally
//        {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//
//    //添加商家
//    public static int insertVen(String psw, String Name, String Add, String tel)
//    {
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        int result = 0;
//
//        try
//        {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "INSERT INTO `vendor`(`password`,`name`,`address`,`telNo`,`numOfOrders`,`turnover`)" +
//                    "VALUES (MD5('" + psw + "'),'" + Name + "','" + Add + "','" + tel + "',0,0)";
//
//            int i = st.executeUpdate(sql);
//            if (i > 0)
//            {
//                result = 1;
//            }
//
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        } finally
//        {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//
//    //删除商家
//    public static int deleteVen(int No)
//    {
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        int result = 0;
//
//        try
//        {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "UPDATE `vendor`\n" +
//                    "SET `exist`=0\n" +
//                    "WHERE `VendorNo`=" + No;
//
//            int i = st.executeUpdate(sql);
//            if (i > 0)
//            {
//                result = 1;
//            }
//
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        } finally
//        {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//
//    //重置商家密码
//    public static String resetVenPsw(int No)
//    {
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        String result = null;
//
//        //生成8位随机数作为密码
//        Random random = new Random();
//        String psw = "";
//        for (int i = 0; i < 8; i++)
//        {
//            psw += random.nextInt(10);
//        }
//
//
//        try
//        {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "UPDATE `vendor` SET `password`= MD5('" + psw + "')" +
//                    "WHERE `VendorNo`=" + No;
//
//            int i = st.executeUpdate(sql);
//            if (i > 0)
//            {
//                result = psw;
//            }
//
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        } finally
//        {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//
//    //修改商家名字
//    public static int updateVenName(int No, String Name)
//    {
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        int result = 0;
//
//        try
//        {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "UPDATE `vendor` SET `name`= '" + Name + "'" +
//                    "WHERE `VendorNo`=" + No;
//
//            int i = st.executeUpdate(sql);
//            if (i > 0)
//            {
//                result = 1;
//            }
//
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        } finally
//        {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//
//    //修改商家电话
//    public static int updateVenTel(int No, String tel)
//    {
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        int result = 0;
//
//        try
//        {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "UPDATE `vendor` SET `telNo`= '" + tel + "'" +
//                    "WHERE `VendorNo`=" + No;
//
//            int i = st.executeUpdate(sql);
//            if (i > 0)
//            {
//                result = 1;
//            }
//
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        } finally
//        {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//
//    //修改商家地址
//    public static int updateVenAdd(int No, String Add)
//    {
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        int result = 0;
//
//        try
//        {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "UPDATE `vendor` SET `address`= '" + Add + "'" +
//                    "WHERE `VendorNo`=" + No;
//
//            int i = st.executeUpdate(sql);
//            if (i > 0)
//            {
//                result = 1;
//            }
//
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        } finally
//        {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//
//    //修改商家信誉度
//    public static int updateVenCredit(int No, int credit)
//    {
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        int result = 0;
//
//        try
//        {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "UPDATE `vendor` SET `credit`= " + credit + " WHERE `VendorNo`=" + No;
//
//            int i = st.executeUpdate(sql);
//            if (i > 0)
//            {
//                result = 1;
//            }
//
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        } finally
//        {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//
//    //修改订单状态
//    public static int updateS_OrderStatus(int No, String status)
//    {
//
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        int result = 0;
//
//        try
//        {
//            conn = JdbcUtils.getConnection();//获取数据库连接
//            st = conn.createStatement();//获得SQL执行对象
//            String sql = "UPDATE `sub_order_form` SET `status`= " + status + " WHERE `S_OrderNo`=" + No;
//
//            int i = st.executeUpdate(sql);
//            if (i > 0)
//            {
//                result = 1;
//            }
//
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        } finally
//        {
//            JdbcUtils.release(conn, st, rs);
//        }
//        return result;
//    }
//}
