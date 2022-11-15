import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        int mile ,age,type;
        double ageDiscount,typeDiscount;
        double price,distance = 0.10;

        System.out.print("Lutfen gidilecek mesafeyi giriniz : ");
        mile = input.nextInt();
        System.out.print("Lutfen yasinizi giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk tipinizi giriniz (Tek yon ise - 1  \nGelis gidis ise - 2  yaziniz) :");
        type = input.nextInt();

        price = mile * distance;



        if ((mile >= 0 ) && (age >= 0) && (type == 1 || type == 2)){
            if (age <=12){
                ageDiscount = price*0.50;
                price -=ageDiscount;
                if (type==2){
                    price*=2;
                    typeDiscount= price*0.20;
                    price-=typeDiscount;
                    System.out.println("Toplam Tutar :"+ price + " TL'dir. ");

                }
                System.out.println("Toplam Tutar :"+ price + " TL'dir. ");


            } else if ((age>12) && (age<24)) {
                ageDiscount =price*0.10;
                price-=ageDiscount;
                if (type==2){
                    price*=2;
                    typeDiscount= price*0.20;
                    price-=typeDiscount;

                }
                System.out.println(price);

            } else if (age >=65) {
                ageDiscount = price * 0.30;
                price -= ageDiscount;
                if (type==2){
                    price*=2;
                    typeDiscount= price*0.20;
                    price-=typeDiscount;


                }
                System.out.println("Toplam Tutar :"+ price + " TL'dir. ");

               }else {
                if (type==2){
                    price*=2;
                    typeDiscount= price*0.20;
                    price-=typeDiscount;


                }

                System.out.println("Toplam Tutar :"+ price + " TL'dir. ");

                }

            }
         else {
            System.out.print("Hatali giris yaptiniz...");
        }




    }
}