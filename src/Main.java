import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Вводите строки, чтобы проверить является ли она палиндромом ");
        System.out.println("Для завершения введите q");
        while (true){
            Deq d = new Deq();
            String s = in.nextLine();
            if (s.equals("q")) break;
            char[] a = s.toCharArray();
            boolean flag = false;
            for (int i = 0; i < a.length; i++) {
                d.push(a[i]);
            }
            while (d.size() >= 2) {
                char front_item = d.pop();
                char back_item = d.popBack();
                if (front_item == back_item)
                    flag = true;
            }
            System.out.println(flag);
        }

    }
}