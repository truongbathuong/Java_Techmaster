package ex5;

public class Student {
    public int id;
    public String name;
    public float lyThuyet;
    public float thucHanh;

    public Student() {
    }

    public Student(int id, String name, float lyThuyet, float thucHanh) {
        this.id = id;
        this.name = name;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
    }

    public void output() {
        System.out.println("Ma sinh vien: " + id);
        System.out.println("Ten sinh vien: " + name);
        System.out.println("Diem ly thuyet: " + lyThuyet);
        System.out.println("Diem thuc hanh: " + thucHanh);
    }

    public void average() {
        System.out.println("Diem trung binh: " + (lyThuyet + thucHanh) / 2);
    }
}
