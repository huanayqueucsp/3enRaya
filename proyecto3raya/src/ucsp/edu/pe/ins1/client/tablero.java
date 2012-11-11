package ucsp.edu.pe.ins1.client;

import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

/***********CREACION DE JUEGO*******************/
public class tablero 
{ 
	
	 final Button btn1 =new Button("1");
	 final Button btn2 =new Button("2");
	 final Button btn3 =new Button("3");
	 final Button btn4 =new Button("4");
	 final Button btn5 =new Button("5");
	 final Button btn6 =new Button("6");
	 final Button btn7 =new Button("7");
	 final Button btn8 =new Button("8");
	 final Button btn9 =new Button("9");
	 final String Valid1;
	 final String Valid3;
	 int cantidad;
	 String[][] ptable;
	 String Ganador;

	 public void jugar()
	 {
		 int contador=0;
		
		/* for(int i=0; i<ptable.length; i++)
		 {
			 for(int j=0; j<ptable[i].length; j++)
			 System.out.print(ptable[i][j]+" ");
			 System.out.println();
		 }*/
		
		 for(int j=0;j<3;j++)
		 {
			 contador=0;
			 for(int i =0;i<3;i++)
			 {
				 if(ptable[j][i]==Valid1)
				 contador++;
			 }
			 if(contador==3)
			 {
				 //ganador X
				 Window.alert("GANADOR JUGADOR 'X' ");
				 Ganador="GANADOR JUGADOR 'X' ";
			 }
		 }
		 
		 for(int j=0;j<3 ;j++)
		 {
			 contador=0;
			 for(int i =0;i<3;i++)
			 {
				 if(ptable[i][j]==Valid3)
				 contador++;
			 }
			 if(contador==3)
			 {
				 //ganador Y
				 Window.alert("GANADOR JUGADOR 'O' ");
				 Ganador="GANADOR JUGADOR 'O' ";
			 }
		 }
		 contador=0;
		 
		 for(int j=0;j<3;j++)
		 {
			 if(ptable[j][j]==Valid1)
			 contador++;
			 
			 if(contador==3)
			 {
				 //ganador x
				 contador=-1;
				 Window.alert("GANADOR JUGADOR 'X' ");
				 Ganador="GANADOR JUGADOR 'X' ";
			 }
		 }
		 contador=0;
		 for(int j=0;j<3;j++)
		 {
			 if(ptable[j][j]==Valid3)
			 contador++;
			 if(contador==3)
			 {
				 //ganador Y
				 contador=-1;
				 Window.alert("GANADOR JUGADOR 'O' ");
				 Ganador="GANADOR JUGADOR 'O' ";
			 }
		 }
		 contador=0;
		if(ptable[0][2]==Valid1 & ptable[1][1]==Valid1 & ptable[2][0]==Valid1)
    	{
			 //ganador x
			Window.alert("GANADOR JUGADOR 'X' ");
			 Ganador="GANADOR JUGADOR 'X' ";
		}
		contador=0;
		if(ptable[0][2]==Valid3 & ptable[1][1]==Valid3 & ptable[2][0]==Valid3)
    	{
			 //ganador y
			Window.alert("GANADOR JUGADOR 'O' ");
			 Ganador="GANADOR JUGADOR 'O' ";
		}
		 
		 

	 }
	 public void ejecutar()
	 {
	  
		 /**Button1 */
		 btn1.addKeyPressHandler (new KeyPressHandler() 
		 {
			 @Override
			 public void onKeyPress (KeyPressEvent event) 
			 {
			     if (Valid1.contains(String.valueOf(event.getCharCode()))) 
			     {
			    	   RootPanel.get("Cell #1").clear();
			    	   RootPanel.get("Cell #1").add(new HTML (" X "));
			    	   ptable[0][0]=Valid1;
			    	   jugar();
			      }
			      else
			      {
		    	       if (Valid3.contains(String.valueOf(event.getCharCode())) ) 
					   {
				    		  RootPanel.get("Cell #1").clear();
			        		  RootPanel.get("Cell #1").add(new HTML (" O "));
			        		  ptable[0][0]=Valid3;
			        		  jugar();
					   }
		    	       else
		    	       {
		  				 Window.alert("Ficha Incorrecta");
		  			    }
			        }
			 }
		 });
		 /**Button2 */
		 btn2.addKeyPressHandler (new KeyPressHandler() 
		 {
			 @Override
			 public void onKeyPress (KeyPressEvent event) 
			 {
			
			     if (Valid1.contains(String.valueOf(event.getCharCode()))) 
			     {
			    	   RootPanel.get("Cell #2").clear();
		    		   RootPanel.get("Cell #2").add(new HTML (" X "));
		    		   ptable[0][1]=Valid1;
		    		   jugar();
		         }
			     else
			     {
			    	 if (Valid3.contains(String.valueOf(event.getCharCode()))) 
					 {
			    		  RootPanel.get("Cell #2").clear();
		        		  RootPanel.get("Cell #2").add(new HTML (" O "));
		        		  ptable[0][1]=Valid3;
		        		  jugar();
				      }
				     else
		  	         {
						 Window.alert("Ficha Incorrecta");
					 }
			     }

			 }
		 });
		 /**Button3 */
		 btn3.addKeyPressHandler (new KeyPressHandler() 
		 {
			 @Override
			 public void onKeyPress (KeyPressEvent event) 
			 {
			
			     if (Valid1.contains(String.valueOf(event.getCharCode()))) 
			     {
			    	   RootPanel.get("Cell #3").clear();
		    		   RootPanel.get("Cell #3").add(new HTML (" X "));
		    		   ptable[0][2]=Valid1;
		    		   jugar();
		         }
			     else
			     {
			    	 if (Valid3.contains(String.valueOf(event.getCharCode()))) 
					 {
			    		  RootPanel.get("Cell #3").clear();
		        		  RootPanel.get("Cell #3").add(new HTML (" O "));
		        		  ptable[0][2]=Valid3;
		        		  jugar();
				      }
			    	  else
		    	      {
		  				 Window.alert("Ficha Incorrecta");
		  			  }
			     }
			 }
		 });
		 /**Button4*/
		 btn4.addKeyPressHandler (new KeyPressHandler() 
		 {
			 @Override
			 public void onKeyPress (KeyPressEvent event) 
			 {
			
			     if (Valid1.contains(String.valueOf(event.getCharCode()))) 
			     {
			    	   RootPanel.get("Cell #4").clear();
		    		   RootPanel.get("Cell #4").add(new HTML (" X "));
		    		   ptable[1][0]=Valid1;
		    		   jugar();
		         }
			     else
			     {
			    	 if (Valid3.contains(String.valueOf(event.getCharCode()))) 
					 {
			    		  RootPanel.get("Cell #4").clear();
		        		  RootPanel.get("Cell #4").add(new HTML (" O "));
		        		  ptable[1][0]=Valid3;
		        		  jugar();
				      }
				   	  else
		    	      {
		  				 Window.alert("Ficha Incorrecta");
		  			  }
			     }
			 }
		 }); 
		 /**Button5*/	 
		 btn5.addKeyPressHandler (new KeyPressHandler() 
		 {
			 @Override
			 public void onKeyPress (KeyPressEvent event) 
			 {
			
			     if (Valid1.contains(String.valueOf(event.getCharCode())) ) 
			     {
			    	   RootPanel.get("Cell #5").clear();
		    		   RootPanel.get("Cell #5").add(new HTML (" X"));
		    		   ptable[1][1]=Valid1;
		    		   jugar();
		         }
			     else
			     {
			    	 if (Valid3.contains(String.valueOf(event.getCharCode()))) 
					 {
			    		  RootPanel.get("Cell #5").clear();
		        		  RootPanel.get("Cell #5").add(new HTML (" O"));
		        		  ptable[1][1]=Valid3;
		        		  jugar();
				      }
			    	  else
		    	      {
		  				 Window.alert("Ficha Incorrecta");
		  			  }
			     }
			 }
		 });
		 /**Button6 */
		 btn6.addKeyPressHandler (new KeyPressHandler() 
		 {
			 @Override
			 public void onKeyPress (KeyPressEvent event) 
			 {
			
			     if (Valid1.contains(String.valueOf(event.getCharCode()))) 
			     {
			    	   RootPanel.get("Cell #6").clear();
		    		   RootPanel.get("Cell #6").add(new HTML (" X"));
		    		   ptable[1][2]=Valid1;
		    		   jugar();
		         }
			     else
			     {
			    	 if (Valid3.contains(String.valueOf(event.getCharCode()))) 
					 {
			    		  RootPanel.get("Cell #6").clear();
		        		  RootPanel.get("Cell #6").add(new HTML (" O"));
		        		  ptable[1][2]=Valid3;
		        		  jugar();
				      }
			    	  else
		    	      {
		  				 Window.alert("Ficha Incorrecta");
		  			  }
			     }
			 }
		 });	 
		 /**Button7*/
		 btn7.addKeyPressHandler (new KeyPressHandler() 
		 {
			 @Override
			 public void onKeyPress (KeyPressEvent event) 
			 {
			
			     if (Valid1.contains(String.valueOf(event.getCharCode()))) 
			     {
			    	   RootPanel.get("Cell #7").clear();
		    		   RootPanel.get("Cell #7").add(new HTML (" X "));
		    		   ptable[2][0]=Valid1;
		    		   jugar();
		         }
			     else
			     {
			    	 if (Valid3.contains(String.valueOf(event.getCharCode())) ) 
					 {
			    		  RootPanel.get("Cell #7").clear();
		        		  RootPanel.get("Cell #7").add(new HTML (" O "));
		        		  ptable[2][0]=Valid3;
		        		  jugar();
				     }
				   	  else
		    	      {
		  				 Window.alert("Ficha Incorrecta");
		  			  }
			     }
			 }
		 });	 
		 /**Button8 */
		 btn8.addKeyPressHandler (new KeyPressHandler() 
		 {
			 @Override
			 public void onKeyPress (KeyPressEvent event) 
			 {
			
			     if (Valid1.contains(String.valueOf(event.getCharCode()))) 
			     {
			    	   RootPanel.get("Cell #8").clear();
		    		   RootPanel.get("Cell #8").add(new HTML (" X "));
		    		   ptable[2][1]=Valid1;
		    		   jugar();
		         }
			     else
			     {
			    	 if (Valid3.contains(String.valueOf(event.getCharCode())) ) 
					 {
			    		  RootPanel.get("Cell #8").clear();
		        		  RootPanel.get("Cell #8").add(new HTML (" O "));
		        		  ptable[2][1]=Valid3;
		        		  jugar();
				     }
			   	     else
			   	     {
	 				    Window.alert("Ficha Incorrecta");
	 			     }
			     }
			 }
		 });	 
		 /**Button9 */ 
		 btn9.addKeyPressHandler (new KeyPressHandler() 
		 {
			 @Override
			 public void onKeyPress (KeyPressEvent event) 
			 {
			
			     if (Valid1.contains(String.valueOf(event.getCharCode()))) 
			     {
			    	   RootPanel.get("Cell #9").clear();
		    		   RootPanel.get("Cell #9").add(new HTML (" X "));
		    		   ptable[2][2]=Valid1;
		    		   jugar();
		         }
			     else
			     {
			    	 if (Valid3.contains(String.valueOf(event.getCharCode()))) 
					 {
			    		  RootPanel.get("Cell #9").clear();
		        		  RootPanel.get("Cell #9").add(new HTML (" O "));
		        		  ptable[2][2]=Valid3;
		        		  jugar();
				      }
			   	     else
			   	     {
	 			    	 Window.alert("Ficha Incorrecta");
	 			     }
			     }
			 }
		 });	 
		}
	 
	 public void Presentado_tablero()
    {
   		   ejecutar();
	       RootPanel.get("Cell #1").add(btn1);
		   RootPanel.get("Cell #2").add(btn2);
		   RootPanel.get("Cell #3").add(btn3);
		   RootPanel.get("Cell #4").add(btn4);
		   RootPanel.get("Cell #5").add(btn5);
		   RootPanel.get("Cell #6").add(btn6);
		   RootPanel.get("Cell #7").add(btn7);
		   RootPanel.get("Cell #8").add(btn8);
		   RootPanel.get("Cell #9").add(btn9);
	} 
	 public tablero() 
	{
		 Valid1 = "x";
		 Valid3 = "o";
		 cantidad = 9;
		 Ganador="NULL";
		 ptable = new String[3][3];
	
		 for(int i=0;i<3;i++)
		 {
			for(int j=0;j<3;j++)
			{
			ptable[i][j]="-";
    		}
		 }	
		 
	}
}