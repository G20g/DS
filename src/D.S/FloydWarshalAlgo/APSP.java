package D.S.FloydWarshalAlgo;
import java.util.*;
import java.lang.*;
import java.io.*;


public class APSP {
    final static int INF = 99999, n = 4;

    void floydWarshall(int graph[][])
    {
        int D[][] = new int[n][n];
        int i, j, k;
        
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++)
                D[i][j] = graph[i][j];
        for (k = 0; k < n; k++)
        {
            for (i = 0; i < n; i++)
            {
                for (j = 0; j < n; j++)
                {
                    if (D[i][k] + D[k][j] < D[i][j])
                        D[i][j] = D[i][k] + D[k][j];
                }
            }
        }
        
        printSolution(D);
    }

    void printSolution(int D[][])
    {
        System.out.println("The following matrix shows the shortest "+
                "Dances between every pair of vertices");
        for (int i=0; i<n; ++i)
        {
            for (int j=0; j<n; ++j)
            {
                if (D[i][j]==INF)
                    System.out.print("INF ");
                else
                    System.out.print(D[i][j]+"   ");
            }
            System.out.println();
        }
    }

   
    public static void main (String[] args)
    {
        int graph[][] = { {0,   5,  INF, 10},
                {INF, 0,   3, INF},
                {INF, INF, 0,   1},
                {INF, INF, INF, 0}
        };
        APSP a = new APSP();

        
        a.floydWarshall(graph);
    }
}
