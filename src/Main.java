import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random r = new Random();

        ArrayList<Integer> even = new ArrayList<>();   // чётные
        ArrayList<Integer> odd = new ArrayList<>();    // нечётные

        //заполнение списка из массива
        for (int i = 0; i <50 ; i++) {
            arrayList.add(r.nextInt(0,100));
                if (arrayList.get(i) % 2 == 0)    //если x - чётное
                    even.add(arrayList.get(i));   // добавляем x в коллекцию четных чисел
                else {
                    odd.add(arrayList.get(i));


            }
                }

        System.out.println(even);
        System.out.println(odd);
        }


    }