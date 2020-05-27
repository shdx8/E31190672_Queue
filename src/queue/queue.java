package queue;
/* @author shdx*/
public class queue {
    int max,size,front,rear;//inisialisasi variable max,size,front,rear bertype data int
    int q[];//inisialisasi variable q
    
    queue(int m){//contructur queue bervariable m
        max=m;//variable max=m
        create();//memanggil method create
    }
    
    void create() {//implementasi method create
        q=new int [max];//inisialisasi array dari q
        size=0;//ukuran pertamanya adalah 0
        front=rear=-1;//data queue menggunakan array jadi jika data baru akan diisi array dapat dimulai dari 0
    }
    
    boolean isEmpty(){//implementasi method isEmpy
        if(size==0){//jika size==0 maka
            return true;//kembalikan nilai boolean true
        }else{//jika berbeda
            return false;//kembalikan nilai boolean false
        }
    }
    
    boolean isFull(){//implementasi methhod isFull
        if(size==max){//jika size==max maka
            return true;//kembalikan nilai boolean true
        }else{//jika berbeda
            return false;//kembalikan nilai boolean false
        }
    }
    
    void enqueue(int data){//method enqueue berparameter int data
        if(isFull()){//mengecek apakah queue sedang full atau tidak, jika sedang full maka tampilkan 
            System.out.println("queue penuh");
        }else{//jika tidak
            if(isEmpty()){//akan dicek lagiapakah queue isEmpty, jika iya maka
                front=rear=0;//front=rear=0
            }else{//jika tidak
                if(rear==max-1){//apakah rear==max-1
                    rear=0;//jika iya rear=0
                }else{//jika tidak 
                    rear++;//rear increment
                }
            }
            q[rear]=data;//memberi nilai pada array dengan index ke-array adalah data
            size++;//size diincrement
        }
    }
    
    int dequeue(){//method dequeue
        int data=0;//inisialisasi data=0
        if(isEmpty()){//mengecek apakah queue sedang kosong atau tidak, jika sedang kosong maka tampilkan
            System.out.println("queue kosong");
        }else{//jika tidak
            data=q[front];//data akan menyimpan array q yang index paling depan
            size--;//size decrement
            if(isEmpty()){//akan dicek lagi apakah queue isEmpty, jika iya maka
                front=rear=-1;//front=rear=-1
            }else{//jika tidak
                if(front==max-1){//apakah front==max-1
                    front=0;//jika iya front=0
                }else{//jika tidak
                    front++;//front inceremnt
                }
            }
        }
        return data;//kembalian nilai data
    }
    
    void print(){//method print
        if (isEmpty()){//mengecek apakah queue sedang kosong atau tidak, jika sedang kosong maka tampilkan
            System.out.println("queue kosong");
        }else{//jika tidak
            int i=front;//inisialisai int i=front
            while(i!=rear){//looping while, jika i!=rear maka tampilkan
                System.out.print(q[i]+"-");//menampilkan dari array q berindex i
                i=(i+1)%max;//nilai i di tambah 1 dan dimodulus max
            }
            System.out.print(q[i]+"-");//menampilkan array q yg berindex i
            System.out.println("jumlah queue : "+size);//menampilkan jumlah queue
        }
    }
}