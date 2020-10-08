package com.company;

import java.util.ArrayList;

public class clase
{
    //Mis dos listas. :D
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();

    //Primer método que imprime los numeros Primos (Por eso lo de pariente hehehe)
    public void Pariente(int n)
    {
        for(int j = 0; j < n; j ++)
        {
            int cont = 0;
            for (int k=1; k <= j;k ++)
            {
                if (j%k == 0)
                {
                    cont++;
                }
            }

            if(cont == 2)
            {
                list2.add(j);
            }
        }

        System.out.println("Numeros Primos: ");
        for(int f = 0; f < list2.size(); f ++)
        {

            System.out.print(list2.get(f) + ", ");
        }
    }

    //Segundo método que imprime los n numeros Secuenciales.
    public void  Fibonacci(int n)
    {
        int aux = 1;

        for(int j = 0; j < n; j ++)
        {
            aux += j;
            list.add(aux);
        }

        System.out.println("\n \nNumeros Secuenciales: ");
        for(int s = 0; s < list.size(); s ++)
        {
            System.out.print(list.get(s)+ ", ");
        }
    }
}
