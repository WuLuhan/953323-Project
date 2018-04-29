package com.bfmz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bfmz.entity.Qiye;
import com.bfmz.utils.BaseDao1;

public class QiyeDao {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	/**
	 * 登录验证
	 * @return
	 */
	public boolean Elogin(String studentNum,String pass) {
		
		try {
			con=BaseDao1.getCon();
			ps= con.prepareStatement("select password from enterprise where eNo=?");
			ps.setString(1, studentNum);
			rs= ps.executeQuery();
			//取出查询到的密码进行对比
			while(rs.next()) {
				if(pass.equals(rs.getString("password"))) {
					return true;
				}
			}
			return false;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//关闭数据库资源
			BaseDao1.close(con, ps, rs);
		}
		return false;
		
		
	}
	
	/**
	 * 获取所有学生信息
	 * @return
	 */
	public List<Qiye> getQiye(){
		List<Qiye> list=new ArrayList<Qiye>();
		try {
			con=BaseDao1.getCon();
			ps= con.prepareStatement("select * from enterprise ");
			rs= ps.executeQuery();
			//遍历，把拿到的数据库信息存到List<enterprise> 中
			while(rs.next()) {
					Qiye qy=new Qiye();
					qy.seteId(rs.getInt(2));
					qy.seteNo(rs.getString(1));
					qy.seteinfo(rs.getString(3));
					qy.seteName(rs.getString(4));
					qy.setPassword(rs.getString(5));
					System.out.println(qy);
					list.add(qy);
				}
			
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				BaseDao1.close(con, ps, rs);
			}
		return list;
	}
	
	/**
	 * 保存学生信息
	 * @param stu
	 */
	public void save(Qiye qy) {
		try {
			con=BaseDao1.getCon();
			ps= con.prepareStatement("insert into enterprise(eno,password,ename,einfo) values(?,?,?,?) ");
			ps.setString(1, qy.geteNo());
			ps.setString(2, qy.getPassword());
			ps.setString(3, qy.geteName());
			ps.setString(4, qy.geteinfo());
			ps.execute();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao1.close(con, ps, rs);
		}
	
	}
	
	/**
	 * 根据id 删除学生信息
	 */
	public void deleteOne(int id) {
		try {
			con=BaseDao1.getCon();
			ps= con.prepareStatement("delete from enterprise where eId=? ");
			ps.setInt(1, id);
			
			ps.execute();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao1.close(con, ps, rs);
		}
	}
	
	//根据学生姓名获取学生信息，可以模糊查询，比如可以查询姓相同的信息
	public List<Qiye> findQiyeByName(String name) {
		List<Qiye> list=new ArrayList<Qiye>();
		try {
			con=BaseDao1.getCon();
			ps= con.prepareStatement("select * from enterprise where eName like ?");
			ps.setString(1,"%"+name+"%");
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Qiye s=new Qiye();
				s.seteId(rs.getInt(1));
				s.seteNo(rs.getString(2));
				s.setPassword(rs.getString(3));
				s.seteName(rs.getString(4));
				s.seteinfo(rs.getString(5));
				System.out.println(s);
				list.add(s);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao1.close(con, ps, rs);
		}
		return list;
	}
	
	//根据学生ID获取学生信息
	public Qiye getQiyeInfoById(int eId) {
		Qiye s=new Qiye();
		try {
			con=BaseDao1.getCon();
			ps= con.prepareStatement("select * from student where id=?");
			ps.setInt(1,eId);
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				s.seteId(rs.getInt(1));
				s.seteNo(rs.getString(2));
				s.setPassword(rs.getString(3));
				s.seteName(rs.getString(4));
				s.seteinfo(rs.getString(5));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao1.close(con, ps, rs);
		}
		return s;
	}
	
	//根据id修改学生信息
	public void updateQiyeInfo(Qiye qy) {
		try {
			con=BaseDao1.getCon();
			ps= con.prepareStatement("update student set studentNo=?,passWord=?,studentName=?,sex=? where id=?");
			ps.setString(1, qy.geteNo());
			ps.setString(2, qy.getPassword());
			ps.setString(3, qy.geteName());
			ps.setString(4, qy.geteinfo());
			ps.setInt(5,qy.geteId());
			ps.execute();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao1.close(con, ps, rs);
		}
		
	}
	
}
