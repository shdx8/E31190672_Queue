package queue;
/* @author shdx*/
import java.util.Scanner;
public class main {
    static void menu(){//membuat method menu pilihan
        System.out.println("pilih operasi queue");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Exit");
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);//instance scan
        int pil=0;//inisialisasi variable pil untuk memilih menu
        System.out.print("masukkan nilai maksimal queue : ");//menginput nilai max dalam queue
        int m=scan.nextInt();//ambil data dari inputan
        queue qq=new queue(m);//instance qq
        do{//looping do while
            menu();//memanggil method menu
            pil=scan.nextInt();//input pilihan
            switch(pil){//opeerasi switch
                case 1://case 1
                    //input data queue
                    System.out.print("masukkan nilai data : ");
                    int dataIn=scan.nextInt();//disimpan pada variable dataIn
                    qq.enqueue(dataIn);//memanggil methdod qq 
                    break;
                case 2://case 2
                    //keluarkan data dari queue
                    int dataout=qq.dequeue();//memanggil method dequeue
                    if(dataout!=0){//mengecek dataout!=0 maka tampilkan
                        System.out.print("data yang terambil : "+dataout);//data yg akan dikeluarkan
                    }
                    break;
                case 3://case 3
                    //menampilkan data dari queue
                    qq.print();//memanggil method print
                    break;
            }
        }while(pil!=4);//while pil!=4 maka exit
    }
}