package ex5;

public class App1 {
    public static void main(String[] args) {
        Student sv1 = new Student();
        sv1.id = 1;
        sv1.name = "Hanh";
        sv1.lyThuyet = 7.2f;
        sv1.thucHanh = 7.6f;
        sv1.output();
        sv1.average();
        Student sv2 = new Student();
        sv2.id = 2;
        sv2.name = "Minh";
        sv2.lyThuyet = 7.4f;
        sv2.thucHanh = 7.2f;
        sv2.output();
        sv2.average();
        Student sv3 = new Student();
        sv3.id = 3;
        sv3.name = "Duc";
        sv3.lyThuyet = 7.8f;
        sv3.thucHanh = 7.6f;
        sv3.output();
        sv3.average();
        Student sv4 = new Student(4, "Tran", 8.1f, 8.4f);
        sv4.output();
        sv4.average();

    }
}
