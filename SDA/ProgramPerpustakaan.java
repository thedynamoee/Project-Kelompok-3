import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

class tree{
    static Scanner in=new Scanner(System.in);
    public void insert(node left, int b){
        if(b<left.value){
            if(left.left!=null) insert(left.left,b);
            else{
                left.left=new node();
                left.left.input(b);
                System.out.println(b+" di kiri  "+left.value);
            }
        }
        else if(b>left.value){
            if(left.right!=null) insert(left.right,b);
            else{
                left.right=new node();
                left.right.input(b);
                System.out.println(b+" di kanan "+left.value);
            }
        }
    }
    public void view(node root){
        System.out.print("Pre Order  : ");
        preOrder(root);
        System.out.println(" ");
    }  
public void preOrder(node left){
        if(left!=null){
            System.out.print(left.value+" ");
            preOrder(left.left);
            preOrder(left.right);
        }
    }
}

public class ProgramPerpustakaan{
    
    node left,right;
    int value;
    public void input(int a){
        value=a;
    }
    public static void main(String[] args) {
        tree tr=new tree();
        node root=new node();
        //int menu=1;
        int r=1;
        int a;
               
        int menu;
        String masukan,masukan1;
        Scanner input =new Scanner(System.in);
        Scanner inputNama = new Scanner(System.in);
        Scanner in=new Scanner(System.in); 
        Scanner baru=new Scanner(System.in);
        Scanner str = new Scanner(System.in); 
        Scanner str1 = new Scanner(System.in); 
        Scanner str2 = new Scanner(System.in);

        LinkedList<String> judul_buku= new LinkedList<>();
        LinkedList<String> judul_baru= new LinkedList<>();
        ArrayList<String> nama_pengunjung = new ArrayList<String>();

        do {
            System.out.println(" ");
            System.out.println("\t==============================");
            System.out.println("\t\t|PILIH MENU|  ");
            System.out.println("\t________________________________");
            System.out.println("\t1. Cek Buku di Rak Atas");
            System.out.println("\t2. Tambahkan Buku di Rak Bawah");
            System.out.println("\t3. Masukan Buku Baru");
            System.out.println("\t4. Masukkan ID Buku");
            System.out.println("\t5. Daftar pengunjung");
            System.out.println("\t6. Keluar");

            System.out.print("\tPilihan Anda : ");
            menu=input.nextInt();

            if(menu==1){
                if(judul_buku.isEmpty()){
                    judul_buku.add("Interaksi Manusia Dan Komputer");
                    judul_buku.add("Infrstruktur Teknologi Informasi");
                    judul_buku.add("Pemrograman Bahasa C++");
                    judul_buku.add("Java");
                    judul_buku.add("Java Script");
                    judul_buku.add("Python");
                    judul_buku.add("Teknologi Informasi");
                }
                System.out.println("\t==============================");
                System.out.println("\n\tjudul buku ="+judul_buku);
                System.out.println("\n\tJumlah Buku Tersedia = "+judul_buku.size());
            
            }else if(menu==2){
                int menu1=0;
                String Baru;
                while(menu1!=3){
                    System.out.println("\t\t\t\t\t  PILIH MENU  ");
                    System.out.println("\t\t\t\t==============================");
                    System.out.println("\t\t\t\t1. Input Buku");
                    System.out.println("\t\t\t\t2. Lihat Data Buku");
                    System.out.println("\t\t\t\t3. Keluar");
                    System.out.println("\t\t\t\t==============================");
                    System.out.print("\t\t\t\t     Pilihan : ");
                    menu1=in.nextInt();
                    if(menu1==1){
                        System.out.print("\t\t\t\t Judul Buku :");
                        Baru=baru.nextLine();
                        judul_buku.push(Baru);
                    }else if(menu1==2) {System.out.println("\t\t\t\t     Buku :"+judul_buku);
                    }else if(menu1==3) {System.out.println("keluar . . .");
                    }else {System.out.println("salah . . .");
                    }System.out.println(" ");
                }    
                    class linked{
                        STACK top;
                        public linked(){
                            top=null;
                        }
                        public void push(STACK a){
                            if(top==null) top=a;
                            else{
                                a.next=top;
                                top=a;
                            }
                        }
                        public void view(){
                            if(top==null) System.out.println("kosong");
                            else{
                                STACK ptr=top;
                                while(ptr!=null){
                                    System.out.println("- - - - -");
                                    ptr.view();
                                    ptr=ptr.next;
                                }
                            }
                        }
                    }           
            } else if (menu==3) {
                int menu2=0;
                String nama1;
                while(menu2 !=3){
                    System.out.println("\n\n");
                    System.out.println("\t\t\t\t\t  PILIH MENU  ");
                    System.out.println("\t\t\t\t==============================");
                    System.out.println("\t\t\t\t1. Input judul buku baru");
                    System.out.println("\t\t\t\t2. Lihat data buku baru");
                    System.out.println("\t\t\t\t3. Keluar");
                    System.out.println("\t\t\t\t==============================");
                    System.out.print("\t\t\t\t     Pilihan : ");
                    menu2=in.nextInt();
                    System.out.println("\n");

                        if(menu2==1){//input data buku
                          System.out.print("\t\t\t\tMasukan Judul Buku Baru      : ");
                          nama1 = inputNama.nextLine();
                          judul_baru.add(nama1);
                        
                        }else if(menu2==2){
                          if(judul_baru.isEmpty()){
                             System.out.println("\t\t\t\tTIDAK ADA DATA BUKU BARU DITEMUKAN!!");
                          }else {          
                             System.out.println("\t\t\t\t==============================");
                             System.out.println("\t\t\t\t         DATA BUKU BARU");
                             System.out.println("\t\t\t\t==============================");
                             int i = 0;
                               do{
                                 System.out.println("\t\t\t\t"+(i+1)+".\t"+judul_baru.get(i));    
                                 i++;
                               }while(i < judul_baru.size());
   
                             System.out.println("\t\t\t\t==============================");
                             System.out.println("\t\t\t\t|| TOTAL PENGARANG    : "+judul_baru.size()+"||"); 
                           }
                               
                        }else {
                            if(menu2==3){
                            System.out.println("keluar . . .");
                            }
                        }
                    }   

               }else if (menu==4){
                System.out.println("\t\t\t\t==============================");
                System.out.println("\t\t\t\t         BINARY TREE");
                System.out.println("\t\t\t\t==============================");
                System.out.println(" ");    
                System.out.println("\t\t\t\t1.Masukkan ID Buku  Pilihan : ");
                System.out.println("\t\t\t\t2.Tampilkan Hasil Pre Order");
                System.out.println("\t\t\t\t3. Exit");
                System.out.print("\t\t\t\t Pilihan :");
                menu=tr.in.nextInt();
                System.out.println("\n");

                if(menu==1){
                    System.out.print("\t\t\t\tID Buku : ");
                    a=tr.in.nextInt();
                    if(r==1){
                        root.input(a);
                        r--;
                    }
                    else tr.insert(root,a);
                }
                else if(menu==2) tr.view(root);
                else if(menu==3) System.out.println("\t\t\t\tTerima Kasih");
                else System.out.println("\t\t\t\tLayanan Tidak Tersedia");
                System.out.println(" ");
                
                  
              }else if(menu==5) {
                int menu3=0;
                while (menu3!=3){
                    System.out.println("");
                    System.out.println("\t\t\t\t==============================");
                    System.out.println("\t\t\t\t1. Masukan Nama Pengunjung");
                    System.out.println("\t\t\t\t2. Daftar Pengunjung");
                    System.out.println("\t\t\t\t3. Keluar ");
                    System.out.println("");
                    System.out.print("\t\t\t\tPilihan Anda    : ");
                    menu3 = str1.nextInt();
                      if(menu3==1){
                        System.out.print("\t\t\t\tmasukan nama pengunjung : ");
                        masukan1=str2.nextLine();
                        nama_pengunjung.add("t"+masukan1);
                        System.out.print("\t\t\t\tNama Pengunjung ="+masukan1);

                    } 
                      else if(menu3==2){
                        System.out.print("\t\t\t\tNama Pengunjung ="+nama_pengunjung);
                    }
                }

              }else {
                System.out.println("\n\t\tTerima Kasih");
              }
    }
    while (menu!=6);
}

}
