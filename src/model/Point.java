package model;

/**
 * Created by Tuấn on 4/11/2017.
 */
public class Point {
    private float x;
    private float y;
    private float z;

    public float khoangCachDiemVoiDiem(Point diem){

        float dentaX = diem.getX() - this.x;
        float dentaY = diem.getY() - this.y;
        float dentaZ = diem.getZ() - this.z;

        float d = (float) Math.sqrt((dentaX * dentaX) +
                                    (dentaY * dentaY) +
                                    (dentaZ * dentaZ));

        return d;
    }

    public Point() {

        x = (float) (Math.random() * 100);
        y = (float) (Math.random() * 100);
        z = (float) (Math.random() * 100);
    }

    public Point(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "X = " + this.x + "\tY = " + this.y + "\tZ = " + this.z;
    }
}
