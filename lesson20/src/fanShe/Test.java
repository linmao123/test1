package fanShe;

import java.lang.reflect.Constructor;
import java.util.Date;



public class Test {

	public static void main(String[] args) {
		
			try {
				Class c1 = Class.forName("fanShe.Student");
				Constructor c=c1.getDeclaredConstructor(
						new Class[]{Integer.TYPE,String.class,String.class,Date.class});
				
						//getDeclaredConstructor(
						//Integer.TYPE,String.class,String.class,Date.class);
//				Object o=c.newInstance(new Integer(2),"张三","男",new Date(1993-1900,5,3));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
				
			
//			String classname=c1.getName();
//			String classname1=c1.getSimpleName();
//			System.out.println(classname);
//			System.out.println(classname1);
//			
//			int md=c1.getModifiers();
//			System.out.println();
			
//			Class c2=Student.class;
//			Class c3=Integer.TYPE;
//			
//			Student stu=new Student();
//			Class c4=stu.getClass();
		

	}

}
