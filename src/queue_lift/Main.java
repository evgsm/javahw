package queue_lift;

import java.util.*;

public class Main {
    public static void main(String [] arg) {

        Scanner scan = new Scanner(System.in);
        int floorNum = 0;

        var liftList = new PriorityQueueNoRepeat<Integer>();

        while(true) {
            System.out.println("Введите этаж (всего 25 этажей):");
            floorNum = scan.nextInt();
            if (floorNum == 0)
                break;
            else if (floorNum > 25) {
                System.out.println("Ошибка: некорректный номер этажа.");
                continue;
            }

            liftList.offer(floorNum);

        }

        while(liftList.size()>0) {
            System.out.println(liftList.poll().toString());
        }

    }
}
