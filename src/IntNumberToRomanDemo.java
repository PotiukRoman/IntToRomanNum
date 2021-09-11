class MyUtils {
    public static String romanYear="";
    public static String mark1000="M";
    public static String mark500="D";
    public static String mark100="C";
    public static String mark50="L";
    public static String mark10="X";
    public static String mark5="V";
    public static String mark1="I";

    public static String getUnits(int number){
        if(number==0){
            //
        }
        else if(number>0 & number<=3){
            for (int k=0;k<number;k++){
                romanYear=romanYear+mark1;
            }
        }
        else if(number==4){
            romanYear=romanYear+mark1+mark5;
        }
        else if(number>=5 && number<9){
            if (number==5){
                romanYear=romanYear+mark5;
            }
            else {
                romanYear=romanYear+mark5;
                for (int k=0;k<number-5;k++){
                    romanYear=romanYear+mark1;
                }
            }
        }
        else{
            romanYear=romanYear+mark1+mark10;
        }
        return romanYear;
    }

    public static String getDozens(int number){
        if(number==0){
            //
        }
        else if(number>0 & number<=3){
            for (int k=0;k<number;k++){
                romanYear=romanYear+mark10;
            }
        }
        else if(number==4){
            romanYear=romanYear+mark10+mark50;
        }
        else if(number>=5 && number<9){
            if (number==5){
                romanYear=romanYear+mark50;
            }
            else {
                romanYear=romanYear+mark50;
                for (int k=0;k<number-5;k++){
                    romanYear=romanYear+mark10;
                }
            }
        }
        else{
            romanYear=romanYear+mark10+mark100;
        }

        return romanYear;
    }



    public static String getHundreds(int number){
        if(number==0){
            //
        }
        else if(number>0 & number<=3){
            for (int k=0;k<number;k++){
                romanYear=romanYear+mark100;
            }
        }
        else if(number==4){
            romanYear=romanYear+mark100+mark500;
        }
        else if(number>=5 && number<9){
            if (number==5){
                romanYear=romanYear+mark500;
            }
            else {
                romanYear=romanYear+mark500;
                for (int k=0;k<number-5;k++){
                    romanYear=romanYear+mark100;
                }
            }
        }
        else{
            romanYear=romanYear+mark100+mark1000;
        }

        return romanYear;
    }


    public static String getThousands(int number){
        for (int k=0;k<number;k++){
            romanYear=romanYear+mark1000;
        }
        return romanYear;
    }


    public static String intToRoman(int number) {
        if(number <= 0 || number > 3999)
            throw new IllegalArgumentException(Integer.toString(number));
        else{
            int numof1000=number/1000;
            MyUtils.getThousands(numof1000);

            int numof100 = (number-(numof1000*1000))/100;
            MyUtils.getHundreds(numof100);

            int numof10=(number-(numof1000*1000)-(numof100*100))/10;
            MyUtils.getDozens(numof10);

            int numof1= (number-(numof1000*1000)-(numof100*100)-(numof10*10));
            MyUtils.getUnits(numof1);
        }

        return romanYear;
    }
}

public class IntNumberToRomanDemo {
    public static void main(String[ ] args) {
        int year=999;
        System.out.println(MyUtils.intToRoman(year));
    }
}
