public class Main {
    public static void main(String[] args) {
        byte a = 1;
        System.out.println("Значение переменной " + "a" + " с типом " + "byte" + " равно " + a);
        short b = 2;
        System.out.println("Значение переменной " + "b" + " с типом " + "short" + " равно " + b);
        int c = 3;
        System.out.println("Значение переменной " + "c" + " с типом " + "int" + " равно " + c);
        long d = 4;
        System.out.println("Значение переменной " + "d" + " с типом " + "long" + " равно " + d);
        float g = 10.6f;
        System.out.println("Значение переменной " + "g" + " с типом " + "float" + " равно " + g);
        double h = 20.5;
        System.out.println("Значение переменной " + "h" + " с типом " + "double" + " равно " + h);

        byte po = 67;
        System.out.println("Значение переменной " + "po" + " с типом " + "byte" + " равно " + po);
        short pa = -159;
        System.out.println("Значение переменной " + "pa" + " с типом " + "short" + " равно " + pa);
        int ph = 569;
        System.out.println("Значение переменной " + "ph" + " с типом " + "int" + " равно " + ph);
        long pl = 987678965549L;
        System.out.println("Значение переменной " + "pl" + " с типом " + "long" + " равно " + pl);
        float pf = 27.12f;
        System.out.println("Значение переменной " + "pf" + " с типом " + "float" + " равно " + pf);
        double pd = 2.786;
        System.out.println("Значение переменной " + "pd" + " с типом " + "double" + " равно " + pd);

        int lp = 23;
        int as = 27;
        int ea = 30;
        int countPaper = 480;
        int totalStu = lp + as + ea;
        int everyStu = countPaper / totalStu;
        System.out.println("На каждого ученика рассчитано " + everyStu + " листов бумаги");

        int profWork = 16;
        int ti = 2;
        int tiFirst = 20;
        int qw1 = (profWork * tiFirst) / ti;
        System.out.println("За " + tiFirst + " машина произвела " + qw1 + " штук бутылок");
        int tiSecond = 24;
        int hoFi = 60;
        int hoSe = tiSecond * hoFi;
        int qw2 = (profWork * hoSe) / ti;
        System.out.println("За " +tiSecond + " машина произвела " + qw2 + " штук бутылок");
        int tiThird = tiSecond * 3;
        int hoTh = tiThird * hoFi;
        int qw3 = (profWork * hoTh) / ti;
        System.out.println("За " + tiThird + " машина произвела " + qw3 + " штук бутылок");
        int tiFourth = tiThird * 10;
        int hoFourth = tiFourth * hoFi;
        int qw4 = (profWork * hoFourth) / ti;
        System.out.println("За " + tiFourth + " машина произвела " + qw4 + " штук бутылок");
        int totalPaint = 120;
        int whPaintFst = 2;
        int blPaintFst = 4;
        int tPaint1Cl = whPaintFst + blPaintFst;
        int clRoom = totalPaint / tPaint1Cl;
        int whPaintSc = clRoom * whPaintFst;
        int blPaintSc = clRoom * blPaintFst;
        System.out.println("В школе, где " + clRoom + " классов, нужно " + whPaintSc + " банок белой краски и " + blPaintSc + " банок коричневой краски ");
        int ban = 5;
        int banWh = 80;
        int milk = 200;
        int milkGr = 105;
        int milkMl = 100;
        int iceCream = 2;
        int iceCreamWh = 100;
        int egg = 4;
        int eggWh = 70;
        int breakfast = (ban * banWh) + (milk * milkGr / milkMl) + (iceCream * iceCreamWh) + (egg * eggWh);
        float killoInGr = 1000.0F;
        float answer = breakfast / killoInGr;
        System.out.println(answer + " кг");
        float sportWh = 7.0f;
        float lossWh1 = 0.250f;
        float lossWh2 = 0.500f;
        float firstPlan = sportWh / lossWh1;
        float secondPlan = sportWh / lossWh2;
        float onAverageDays = (secondPlan + firstPlan) / 2;

        System.out.println("Если сбрасывать по 250гр то понадобится дней " + firstPlan + " если сбрасывать по 500гр " + secondPlan + " потребуется в серднем дней " + onAverageDays);
    }
}