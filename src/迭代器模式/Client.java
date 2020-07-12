package 迭代器模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/12 19:34
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {

        //计算机学院
        ComputerCollege computerCollege = new ComputerCollege();
        computerCollege.add(new Department("大数据", "大数据专业"));
        computerCollege.add(new Department("ss", "dwwd"));
        computerCollege.getName();

        Iterator iterator = computerCollege.createIterator();
        while(iterator.hasNext()){
            Department next = (Department)iterator.next();
            System.out.println(next.getName()+"::"+next.getDes());
        }

        System.out.println("--------------------------");
        //理学院
        MathCollege mathCollege = new MathCollege();
        mathCollege.add(new Department("朴素数学", "2222"));
        mathCollege.add(new Department("理论数学", "223455"));
        mathCollege.getName();

        Iterator iterator1 = mathCollege.createIterator();

        while(iterator1.hasNext()){
            Department next = (Department)iterator1.next();
            System.out.println(next.getName()+"::"+next.getDes());
        }
    }
}
