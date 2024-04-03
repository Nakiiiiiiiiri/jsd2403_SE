package SimpleGame;

import java.util.Scanner;

//S 35,A 30,B 20,C 15,D 10
public class main {
    public static void main(String[] args) {

        Saber saber =new Saber("saber",30,20,30,10,20,20,1);
        Berserker berserker =new Berserker("berserker",30,10,40,10,20,10,1);
        Archer archer =new Archer("archer",20,20,15,20,10,10,1);
        Assassin assassin =new Assassin("assassin",15,10,10,10,10,40,1);
        Caster caster =new Caster("caster",10,30,10,40,10,10,1);
        Lancer lancer =new Lancer("lancer",30,20,20,10,20,30,1);
        Rider rider =new Rider("rider",15,20,20,30,20,30,1);
        System.out.println("saber，berserker,archer,assassin,caster,lancer,rider");
        System.out.println("请输入您要组队的职业,一次输入一个，输入后回车,完成输入over");
        Scanner scan = new Scanner(System.in);
        String sumname = "";
        int sum = 0;

        while (true){
            String heroname = scan.nextLine().trim().toLowerCase();
            boolean input = false;
            switch (heroname){
                case "saber":{
                    sum+=saber.total();
                    sumname = sumname+heroname+" ";
                    input = true;
                    break;
                }
                case "berserker":{
                    sum+=berserker.total();
                    sumname = sumname+heroname+" ";
                    input = true;
                    break;
                }
                case "archer":{
                    sum+=archer.total();
                    sumname = sumname+heroname+" ";
                    input = true;
                    break;
                }
                case "assassin":{
                    sum+=assassin.total();
                    sumname = sumname+heroname+" ";
                    input = true;
                    break;
                }
                case "caster":{
                    sum+=caster.total();
                    sumname = sumname+heroname+" ";
                    input = true;
                    break;
                }
                case "lancer":{
                    sum+=lancer.total();
                    sumname = sumname+heroname+" ";
                    input = true;
                    break;
                }
                case "rider":{
                    sum+=rider.total();
                    sumname = sumname+heroname+" ";
                    input = true;
                    break;
                }
                case "over":{
                    System.out.println("您选择的职业是"+sumname+"，总战力是"+sum);
                    return;
                }

            }
            if(!input){
                System.out.println("输入错误,请输入正确的职业,正确职业有：");
                System.out.println("saber，berserker,archer,assassin,caster,lancer,rider");

            }

        }





    }
}
