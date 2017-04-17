package test;

import model.Point;
import model.Round;

import java.util.ArrayList;

/**
 * Created by Tuấn on 4/11/2017.
 */
public class MainClass {
    static Point p = new Point();
    public static void main(String[] args) {
//      Dùng vòng lặp để in ra tọa dộ điểm ngẫu nhiên của điểm và tâm
        for (int i = 0;i <= 2;i++){
            for (int j = 0;j <= 10;j++){
//              in tọa độ ngẫu nhiên của điểm
                Point point = new Point();
                System.out.println(point);
//              in tọa độ ngẫu nhiên của tâm
                Round round = new Round();
                System.out.println(round);
//              Kiểm tra điều kiện
                if (round.kiemTra(p) == 1){
                    System.out.println("Điểm nằm ngoài đường tròn");
                }else if (round.kiemTra(p) == -1){
                    System.out.println("Điểm nằm trong đường tròn");
                }else if (round.kiemTra(p) == 0){
                    System.out.println("Điểm nằm trên đường tròn");
                }

            }

        }

    }

}
