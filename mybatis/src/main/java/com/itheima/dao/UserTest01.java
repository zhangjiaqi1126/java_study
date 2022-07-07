//package com.itheima.dao;
//
//import com.itheima.domain.User;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
//public class UserTest01 {
//    @Test
//    public void selectAll() throws IOException {
//        //1、加载核心配置文件
//        InputStream is = Resources.getResourceAsStream("MyBatis-Config.xml");
//        //2、获取SqlSession工厂对象
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//        //3、通过SqlSession工厂对象获取SqlSession对象
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        //4、执行映射配置文件中的sql语句并执行结果
//        List<User> list = sqlSession.selectList("UserMapper.selectAll");
//        //5、处理结果
//        for (User stu:list){
//            System.out.println(stu);
//        }
//        //6、释放资源
//        sqlSession.close();
//        is.close();
//
//    }
//}
