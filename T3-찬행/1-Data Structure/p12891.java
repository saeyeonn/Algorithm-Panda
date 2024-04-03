import java.util.Scanner;
public class p12891 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int length= scanner.nextInt();
        int plength=scanner.nextInt();
        String code=scanner.next();
        int anum= scanner.nextInt();
        int cnum= scanner.nextInt();
        int gnum= scanner.nextInt();
        int tnum= scanner.nextInt();
        int answer=0;
        char[] co=code.toCharArray();
        int[][] array=new int[co.length+1][4];
        array[0][0]=0;
        array[0][1]=0;
        array[0][2]=0;
        array[0][3]=0;
        for(int i=1;i<co.length+1;i++){
            if(co[i-1]=='A'){
                array[i][0]=array[i-1][0]+1;
                array[i][1]=array[i-1][1];
                array[i][2]=array[i-1][2];
                array[i][3]=array[i-1][3];
            }
            else if(co[i-1]=='C'){
                array[i][0]=array[i-1][0];
                array[i][1]=array[i-1][1]+1;
                array[i][2]=array[i-1][2];
                array[i][3]=array[i-1][3];
            }
            else if(co[i-1]=='G'){
                array[i][0]=array[i-1][0];
                array[i][1]=array[i-1][1];
                array[i][2]=array[i-1][2]+1;
                array[i][3]=array[i-1][3];
            }
            else if(co[i-1]=='T'){
                array[i][0]=array[i-1][0];
                array[i][1]=array[i-1][1];
                array[i][2]=array[i-1][2];
                array[i][3]=array[i-1][3]+1;
            }
        }
        for(int i=1;i<=length-plength+1;i++){
            if((array[i+plength-1][0]-array[i-1][0])>=anum
            &&(array[i+plength-1][1]-array[i-1][1])>=cnum
            &&(array[i+plength-1][2]-array[i-1][2])>=gnum
            &&(array[i+plength-1][3]-array[i-1][3])>=tnum){
                answer++;
            }

        }
        System.out.println(answer);
    }
}