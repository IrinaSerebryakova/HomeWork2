public class Main {
    public static void main(String[] args) {

        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 2
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        //Задача 6
        var weightOfFighter1 = 78.2;
        var weightOfFighter2 = 82.7;
        var totalWeight = weightOfFighter1 + weightOfFighter2;
        System.out.println(totalWeight);
        var difference = 0.0;
        if(weightOfFighter1 > weightOfFighter2) {
            difference = weightOfFighter1 - weightOfFighter2;
        }else{
            difference = weightOfFighter2 - weightOfFighter1;
        }
        System.out.println(difference);

        //Задача 7
        var weightOfFighter3 = 78.2;
        var weightOfFighter4 = 82.7;
                var remainder = 0.0;
        if(weightOfFighter3 > weightOfFighter4) {
            remainder = weightOfFighter3 % weightOfFighter4;
        }else{
            remainder = weightOfFighter4 % weightOfFighter3;
        }
        System.out.println(remainder);

        //Задача 8
        var employees = 0;
        var hours = 640;
        var hoursOfOneEmployee = 8;
        employees = hours / hoursOfOneEmployee;
        System.out.println("Всего работников в компании — " + employees + " человек");
        employees += 94;
        hours = employees * hoursOfOneEmployee;
        System.out.println("Если в компании работает " + employees + " человек, то всего "+ hours + " часов работы может быть поделено между сотрудниками");
    }
}