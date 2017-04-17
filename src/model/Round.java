package model;

/**
 * Created by Tuấn on 4/11/2017.
 */
public class Round {

    private Point tam;
    private float banKinh;
//    phương thức kiểm tra nằm trong hay ngoài đường tròn
//    Point p = new Point();
    public float kiemTra(Point diem){
        if (diem.khoangCachDiemVoiDiem(this.tam) > this.banKinh){
            return 1;
        }
        if (diem.khoangCachDiemVoiDiem(this.tam) < this.banKinh){
            return -1;
        }
        if (diem.khoangCachDiemVoiDiem(this.tam) == this.banKinh){
            return 0;
        }
        return 0;
    }

    public Round() {
        tam = new Point();
        banKinh = (float) (Math.random() * 100);
    }


    public Round(Point tam, float banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }


    public Point getTam() {
        return tam;
    }

    public void setTam(Point tam) {
        this.tam = tam;
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public String toString() {
        return "Tâm = " + this.tam +
                "\tBán Kính = " + this.banKinh;
    }
}
