public class BanderaSeychelles{
    public static void main (String[] args){

        /*
            1 : 
            2 : Azul
            3 : Blanco
            4 : Amarillo
            5 : Verde
            6 : Morado
            7 : Cyan
            8 : Negro

        */
        int[][] matriz;
        matriz = new int[19][27];

        for(int i=0;i<matriz.length;i++)
        {
            if(i< 7)
            {
                for(int j=0;j<8;j++)//Azul 1
               {
                    matriz[i][j]=2;
                    
                   
                    System.out.print(ConsoleColors.BLUE+ConsoleColors.BLUE_BACKGROUND+matriz[i][j]+ ConsoleColors.RESET);
                    System.out.print(ConsoleColors.BLUE_BACKGROUND + " "+ ConsoleColors.RESET);
                } 
               

            }

            if(i>=0 && i<7)//Amarillo 3
            {
                for(int j = 8; j<10; j++)
                {
                    matriz[i][j]=4;
                    System.out.print(ConsoleColors.YELLOW+ConsoleColors.YELLOW_BACKGROUND+matriz[i][j]+ConsoleColors.RESET);
                    System.out.print(ConsoleColors.YELLOW_BACKGROUND+" "+ ConsoleColors.RESET);
                }
                
            }

            if(i<7)//Rojo 3
            {
                for(int j=10;j<12;j++)
                {
                    matriz[i][j]=1;
                    System.out.print(ConsoleColors.RED+ConsoleColors.RED_BACKGROUND+matriz[i][j]+ConsoleColors.RESET);
                    System.out.print(ConsoleColors.RED_BACKGROUND+" "+ ConsoleColors.RESET);
                }  
                             
            }

            if(i<7)//Amarillo 5
            {
                for(int j = 12; j<14; j++)
                {
                    matriz[i][j]=4;
                    System.out.print(ConsoleColors.YELLOW+ConsoleColors.YELLOW_BACKGROUND+matriz[i][j]+ConsoleColors.RESET);
                    System.out.print(ConsoleColors.YELLOW_BACKGROUND+" "+ ConsoleColors.RESET);
                }
                
            }

            if(i< 7)//Azul 3
            {
                for(int j=14;j<matriz[0].length;j++)//Azul 3
               {
                    matriz[i][j]=2;
                    System.out.print(ConsoleColors.BLUE+ConsoleColors.BLUE_BACKGROUND+matriz[i][j]+ConsoleColors.RESET);
                    System.out.print(ConsoleColors.BLUE_BACKGROUND+" "+ ConsoleColors.RESET);
               }
               
               System.out.println(); 
            }
            
            if(i>=7 && i<9)//Amarillo 1
            {
                for(int j=0;j<10;j++)
                {
                     matriz[i][j]=4;
                     System.out.print(ConsoleColors.YELLOW+ConsoleColors.YELLOW_BACKGROUND+matriz[i][j]+ConsoleColors.RESET);
                     System.out.print(ConsoleColors.YELLOW_BACKGROUND+" "+ ConsoleColors.RESET);
                } 
                
            }

            //Espacio 1 para el rojo
            if(i>6 && i<9)
            {
                for(int j = 10; j<12;j++)
                {
                    matriz[i][j]=1;
                    System.out.print(ConsoleColors.RED+ConsoleColors.RED_BACKGROUND+matriz[i][j]+ConsoleColors.RESET);
                    System.out.print(ConsoleColors.RED_BACKGROUND+" "+ ConsoleColors.RESET);
                }
            }

            if(i>6 && i<9)//Amarillo 7
            {
                for(int j=12;j<matriz[0].length;j++)
                {
                     matriz[i][j]=4;
                     System.out.print(ConsoleColors.YELLOW+ConsoleColors.YELLOW_BACKGROUND+matriz[i][j]+ConsoleColors.RESET);
                     System.out.print(ConsoleColors.YELLOW_BACKGROUND+" "+ ConsoleColors.RESET);
                }  
                System.out.println();
            }
            

            if(i>8 && i<12)//Rojo 1
            {
                for(int j=0;j<matriz[0].length;j++)
               {
                    matriz[i][j]=1;
                    System.out.print(ConsoleColors.RED+ConsoleColors.RED_BACKGROUND+matriz[i][j]+ConsoleColors.RESET);
                    System.out.print(ConsoleColors.RED_BACKGROUND+" "+ ConsoleColors.RESET);
               } 
               System.out.println();
            }

            /*if(i>8 && i<12)//Rojo 2
            {
                for(int j = 8; j<10; j++)
                {
                    matriz[i][j]=1;
                    System.out.print(matriz[i][j]);
                }
                System.out.println();
            }
            */

            //Espacio 2 para el rojo

            /*if(i>8 && i<12)//Rojo 4
            {
                for(int j = 12; j<14; j++)
                {
                    matriz[i][j]=1;
                    System.out.print(matriz[i][j]);
                }
                System.out.println();
            }
           

            if(i>=9 && i<12)//Rojo 5
            {
                for(int j=14;j<matriz[0].length;j++)
                {
                     matriz[i][j]=1;
                     System.out.print(matriz[i][j]);
                } 
                System.out.println();
            }
             */



            if(i>11 && i<14)//Amarillo 2
            {
                for(int j=0;j<10;j++)
                {
                     matriz[i][j]=4;
                     System.out.print(ConsoleColors.YELLOW+ConsoleColors.YELLOW_BACKGROUND+matriz[i][j]+ConsoleColors.RESET);
                     System.out.print(ConsoleColors.YELLOW_BACKGROUND+" "+ ConsoleColors.RESET);
                }
                    
            }

           

            //Espacio 3 para el rojo }
            if(i>11 && i<14)
            {
                for(int j = 10; j<12 ; j++)
                {
                    matriz[i][j]=1;
                    System.out.print(ConsoleColors.RED+ConsoleColors.RED_BACKGROUND+matriz[i][j]+ConsoleColors.RESET);
                    System.out.print(ConsoleColors.RED_BACKGROUND+" "+ ConsoleColors.RESET);
                }
            }
            
            if(i>11 && i<14)//Amarillo 8
            {
                for(int j=12;j<matriz[0].length;j++)
                {
                    matriz[i][j]=4;
                    System.out.print(ConsoleColors.YELLOW+ConsoleColors.YELLOW_BACKGROUND+matriz[i][j]+ConsoleColors.RESET);
                    System.out.print(ConsoleColors.YELLOW_BACKGROUND+" "+ ConsoleColors.RESET);
                }
                    
                System.out.println();
            }

            

            if(i>13 && i<matriz.length)//Azul 2
            {
                for(int j=0;j<8;j++)
               {
                    matriz[i][j]=2;
                    System.out.print(ConsoleColors.BLUE+ConsoleColors.BLUE_BACKGROUND+matriz[i][j]+ConsoleColors.RESET);
                    System.out.print(ConsoleColors.BLUE_BACKGROUND+" "+ ConsoleColors.RESET);
               }
               
            }



            
            
           
            if(i>13 && i<matriz.length)//Amarillo 4
            {
                for(int j = 8; j<10; j++)
                {
                    matriz[i][j]=4;
                    System.out.print(ConsoleColors.YELLOW+ConsoleColors.YELLOW_BACKGROUND+matriz[i][j]+ConsoleColors.RESET);
                    System.out.print(ConsoleColors.YELLOW_BACKGROUND+" "+ ConsoleColors.RESET);
                }
                
            }
            

            //Espacio 4 para el rojo
            
            
            if(i>13 && i<matriz.length)
             {
                 for(int j = 10; j<12; j++)
                 {
                     matriz[i][j]=1;
                     System.out.print(ConsoleColors.RED+ConsoleColors.RED_BACKGROUND+matriz[i][j]+ConsoleColors.RESET);
                     System.out.print(ConsoleColors.RED_BACKGROUND+" "+ ConsoleColors.RESET);
                 }
                 
             }

            if(i>13 && i<matriz.length)//Amarillo 6
             {
                 for(int j = 12; j<14; j++)
                 {
                     matriz[i][j]=4;
                     System.out.print(ConsoleColors.YELLOW+ConsoleColors.YELLOW_BACKGROUND+matriz[i][j]+ConsoleColors.RESET);
                     System.out.print(ConsoleColors.YELLOW_BACKGROUND+" "+ ConsoleColors.RESET);
                 }
                 
             }
           

            

            


            if(i>=14 && i<matriz.length)//Azul 4
            {
                for(int j=14;j<matriz[0].length;j++)//Azul 4
               {
                    matriz[i][j]=2;
            
                    System.out.print(ConsoleColors.BLUE+ConsoleColors.BLUE_BACKGROUND+matriz[i][j]+ConsoleColors.RESET);
                    System.out.print(ConsoleColors.BLUE_BACKGROUND+" "+ ConsoleColors.RESET);

               } 
               // System.out.println();
               
               System.out.println();
            }

            
            
                
                
                
            
            
            
            












        }

        
        
            
            
        
    }

}