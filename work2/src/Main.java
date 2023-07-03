import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("＜北海道在住の学生のid,氏名＞");

        List<Student> studentlist = List.of(new Student(0001,"やまだ","北海道"),
                                            new Student(0002,"さとう","滋賀県"),
                                            new Student(0003,"かとう","北海道"));
        for(Student student : studentlist){
            if(student.getAddress().equals("北海道")){
                System.out.println("学生のid:" + student.getId());
                System.out.println("学生の名前:" + student.getName());
            }
        }
    }
}