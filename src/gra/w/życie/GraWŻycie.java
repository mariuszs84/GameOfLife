
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
    static int iloscSasiadow(int tab[][],int rx,int ry,int x,int y){
        int k = 0;
        
        if (x>0&&y>0&&tab[y-1][x-1]==1)
            k++;
        if (y>0&&tab[y-1][x]==1)
            k++;
        if (y>0&& x+1 < rx &&tab[y-1][x+1]==1)
            k++;
        if (x>0 && tab[y][x-1]==1)
            k++;
        if (x+1 < rx && tab[y][x+1]==1)
            k++;
        if (y+1 < ry && x > 0 && tab[y+1][x-1]==1)
            k++;
        if (y+1 < ry && tab[y+1][x]==1)
            k++;
        if (y+1 < ry && x+1 < rx && tab[y+1][x+1]==1)
            k++;
        return k;
    }
    public static void main(String[] args) {
        int x=5;
        int y=5;
        int tab[][]=new int[y][x];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                tab[i][j]=0;
            }
        }
        tab[1][1]=1;
        tab[2][3]=1;
        tab[4][1]=1;
        wyswietl(tab,x,y);
        int k = iloscSasiadow(tab, x,y,2,2);

        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                System.out.println(iloscSasiadow(tab,x,y,j,i));
            }
        }

        
    }
}
