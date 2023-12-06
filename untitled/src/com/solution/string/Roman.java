package com.solution.string;

public class Roman {
    public String intToRoman(int num) {
        int[] Rint={1000,500,100,50,10,5,1};
        String[] Sroman={"M","D","C","L","X","V","I"};
        StringBuilder roman=new StringBuilder();
       // String roman="";
            for (int j=0;j<Rint.length;j++){
                while (num>=Rint[j]) {
                    if((num<1000 && num>=900)) {
                        roman.append("C");
                        roman.append("M");
                        num=num%100;
                    }else if(num<500 && num>=400){
                        roman.append("C");
                        roman.append("D");
                        num=num%100;
                    }else if((num<100 && num>=90) ){
                        roman.append("X");
                        roman.append("C");
                        num=num%10;
                    }else if(num<50 && num>=40){
                        roman.append("X");
                        roman.append("L");
                        num=num%10;
                    }else if((num==4)){
                        roman.append("I");
                        roman.append("V");
                        num=num-4;
                    }else if((num==9)){
                        roman.append("I");
                        roman.append("X");
                        num=num-9;
                    }else{
                        num = num - Rint[j];
                        roman.append(Sroman[j]);
                    }
                }

            }

        return roman.toString();
    }

    public static void main(String args[])
    {
        Roman ro=new Roman();
        String rio=ro.intToRoman(40);
        System.out.println("rio:::::::"+rio);
    }
}
