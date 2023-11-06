// public class overloading {
//     void display(int a,int b){
//         System.out.println("1st Method");
//     }
//     void display(String b){
//         System.out.println("2nd Method");
//     }
// }
// class polymorphism{
//     public static void main(String args[]){
//        overloading ol=new overloading();
//         ol.display(20,30);
//     }
// }

// class polymorphism{
//     public static void main(String args[]){
//         System.out.println("String main");
//     }
//     public static void main(int a){
//         polymorphism p1=new polymorphism();
//         p1.main("hello java");
//         p1.main(20);
//     }
// }






// import java.util.Scanner;
// class matrix {
//     int a[][]=new int[3][3];
//     int b[][]=new int[3][3];
//     int c[][]=new int[3][3]; 
//     Scanner sc=new Scanner(System.in);
//     void getData(){
//         int i,j;
//         for(i=0;i<3;i++){
//             for(j=0;j<3;j++){
//                 System.out.println("enter the no: ");
//             a[i][j]=sc.nextInt();
//             }

//         }
//                 for(i=0;i<3;i++){
//             for(j=0;j<3;j++){
//                 System.out.println("enter the no: ");
//             b[i][j]=sc.nextInt();
//             }

//         }}
//         void add(){
//             int i,j;
//             System.out.println("sum of two matrix is : ");
//                 for(i=0;i<3;i++){
//             for(j=0;j<3;j++){
                
//                 c[i][j]=a[i][j]+b[i][j];
//             }
//         }
//     }   
//   void showData(){
//     int i,j;
//     for(i=0;i<3;i++){
//             for(j=0;j<3;j++){
// System.out.print(c[i][j] +" ");
//             }  System.out.println();}
          
//   }

//  public static void main(String[] args) {
//             matrix aa=new matrix();
//             aa.getData();
//             aa.add();
//               aa.showData();
//         }
//     }
  
      



