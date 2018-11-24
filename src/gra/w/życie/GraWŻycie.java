
package gra.w.życie;

public class GraWŻycie {
    static void wyswietl (int tab[][],int x,int y){
         for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int x=5;
        int y=5;
        int tab[][]=new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                tab[i][j]=0;
            }
        }
        tab[1][1]=1;
        wyswietl(tab,x,y);
    }
}
