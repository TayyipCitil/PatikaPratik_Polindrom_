import java.util.Scanner;

class Polindrom {
    static boolean isPolindrom(int num) {
        int basNum = 0, tempNum;
        boolean isPolindrom = true;
        tempNum = num;
        //basamak sayısını bulduk
        while (tempNum != 0) {
            tempNum = tempNum / 10;
            basNum++;
        }
        tempNum = num;
        //basamakları dizinin elemanlarına atadık
        int[] basamaklar = new int[basNum];
        for (int i = 0; i < basNum; i++) {
            basamaklar[i] = (tempNum / (int) (Math.pow(10, i))) % 10;
        }
        for (int i = 0; i < basamaklar.length; i++) {
            if (basamaklar[i] != basamaklar[basamaklar.length - 1 - i]) {
                isPolindrom = false;
                break;
            }
        }
        return isPolindrom;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        int num = input.nextInt();

        if (isPolindrom(num)) {
            System.out.println(num + " polindrom sayıdır");
        } else {
            System.out.println(num + " polindrom sayı değildir");
        }
    }
}
