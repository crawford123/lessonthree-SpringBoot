package practice;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/8/2018
 * Time: 4:50 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class ZeroTest {
    public static void main(String[] args) {
        try{
            int i = 100 / 0;
            System.out.print(i);
        }catch(Exception e){
            System.out.print(1);
            throw new RuntimeException();
        }finally{
            System.out.print(2);
        }
        System.out.print(3);
    }
}