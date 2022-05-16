package ru.skypro;
public class Main {
    public static void main(String[] args) {
        //Task 1
        var q = 1234567890;
        byte x = 127;
        short y = 32727;
        int z = 33000;
        long c = 550000L;
        float f = 44.46f;
        double k = 65.67;
        boolean b = true;
        char m = 83;

        //Task 2
        double FirstBoxer = 78.2;
        double SecondBoxer = 82.7;
        System.out.println("Общий вес бойцов равен " + (FirstBoxer + SecondBoxer) + " кг.");
        System.out.println("Разница в весе между бойцами равна  " + (SecondBoxer - FirstBoxer) + " кг. \n");

        //Task 3
        int bananas = 5*80 , milk = 105*2, ice_cream = 2*100, eggs = 4*70;
        int result = bananas+milk+ice_cream+eggs;
        System.out.println("Общий вес завтрака в граммах: " + result + " грамм.");
        System.out.println("Общий вес завтрака в килограммах: " + ((float)result/1000) + " кг. \n");

        //Task 4
        int loseWeight = 7*1000; //грамм
        int minloss = 250 , maxloss = 500; // грамм
        System.out.println ((loseWeight / minloss) + " дней потребуется, чтобы сбросить 7 кг веса, по 250 гр в день.");
        System.out.println ((loseWeight / maxloss) + " дней потребуется, чтобы сбросить 7 кг веса, по 500 гр в день.");
        System.out.println ("В среднем, потребуется " + ((loseWeight / minloss + loseWeight / maxloss) / 2 ) + " день, чтобы сбросить 7 кг веса. \n");

        //Task 5
        int Masha = 67_760, Denis = 83_690, Christine = 76_230; //зп рублей в месяц
        float MashasUp = Masha + (Masha*0.1f), DenisUp = Denis + (Denis*0.1f), ChristineUp = Christine + (Christine*0.1f); // Up 10%
        System.out.println("Маша теперь получает "+ ((int)MashasUp) + " рублей. Годовой доход вырос на " + ((int)MashasUp * 12 - Masha * 12 ) + " рублей");
        System.out.println("Денис теперь получает "+ ((int)DenisUp) + " рублей. Годовой доход вырос на " + ((int)DenisUp * 12 - Denis * 12 ) + " рублей");
        System.out.println("Кристина теперь получает "+ ((int)ChristineUp) + " рублей. Годовой доход вырос на " + ((int)ChristineUp * 12 - Christine * 12 ) + " рублей");
    }
}