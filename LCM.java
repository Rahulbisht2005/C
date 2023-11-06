// import java.util.Scanner;
// class Library{
//     private String title;
//     private String author;
//     Scanner sc=new Scanner(System.in);
//     // public oops(String title,String author){
//     //     this.title=title;
//     //     this.author=author;
//     // }
//     public void getdata(){
//         System.out.println("enter the book title:");
//         String title=sc.nextLine();
//         System.out.println("enter the auther name");
//         String auther=sc.nextLine();
//     }
//     public void putdata(){
//         System.out.println("title name is:"+title+"author name is:"+author);
//     }

    
    
//       public static void main(String[] args) {
//         Library obj[]=new Library[5];
//         int i;
//         for(i=0;i<5;i++){
//             obj[i]=new Library();
//             obj[i].getdata();
//         }
//         for(i=0;i<5;i++){
//             obj[i].putdata();
//         }

//     }
// }




import java.util.Scanner;
// public class LCM{
//     public static void main(String[] args) {
//         int n1,n2,LCM=1;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number");
//         n1=sc.nextInt();
//         System.out.println("enter the number");
//         n2=sc.nextInt();
//         LCM=1;
//         while(true){
//             if(LCM%n1==0 &&  LCM%n2==0){
//                System.out.println("LCM of"+n1+"&"+n2+"is"+LCM);
//                break;
//             }
//             LCM++;
//         }


//     }
// }

// 

class convhexadecimal{
    public static void main(String[] args) {
     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
     String hex="";
     int n1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        n1=sc.nextInt();
        while(n1>0){
            int rem=n1%16;
            hex=hexchars[rem]+hex;
            n1/=16;

            }
            System.out.println(hex);


        }
    }
