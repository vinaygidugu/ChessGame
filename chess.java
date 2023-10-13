import java.util.*;
class A
{
	static Scanner hi = new Scanner(System.in);
	
	/*B - black; W - white; P - pawn; H - horse; S - sena; E - Elephant; K - King; M - Mantri;*/

		String arr[][] = {{"   ","   ","   ","   ","   ","   ","   ","   ","   ","   "},
					{"   ","BE1","BH1","BS1","BM1","BK ","BS2","BH2","BE2"," 1 "},
					{"   ","BP1","BP2","BP3","BP4","BP5","BP6","BP7","BP8"," 2 "},
					{"   ","---","---","---","---","---","---","---","---"," 3 "},
					{"   ","---","---","---","---","---","---","---","---"," 4 "},
					{"   ","---","---","---","---","---","---","---","---"," 5 "},
					{"   ","---","---","---","---","---","---","---","---"," 6 "},
					{"   ","WP1","WP2","WP3","WP4","WP5","WP6","WP7","WP8"," 7 "},
					{"   ","WE1","WH1","WS1","WM1","WK ","WS2","WH2","WE2"," 8 "},
					{"   "," 1 "," 2 "," 3 "," 4 "," 5 "," 6 "," 7 "," 8 ","   "}};

		String zrr[][] = {{"   ","   ","   ","   ","   ","   ","   ","   ","   ","   "},
					{"   ","BE1","BH1","BS1","BM1","BK ","BS2","BH2","BE2"," 1 "},
					{"   ","BP1","BP2","BP3","BP4","BP5","BP6","BP7","BP8"," 2 "},
					{"   ","---","---","---","---","---","---","---","---"," 3 "},
					{"   ","---","---","---","---","---","---","---","---"," 4 "},
					{"   ","---","---","---","---","---","---","---","---"," 5 "},
					{"   ","---","---","---","---","---","---","---","---"," 6 "},
					{"   ","WP1","WP2","WP3","WP4","WP5","WP6","WP7","WP8"," 7 "},
					{"   ","WE1","WH1","WS1","WM1","WK ","WS2","WH2","WE2"," 8 "},
					{"   "," 1 "," 2 "," 3 "," 4 "," 5 "," 6 "," 7 "," 8 ","   "}};
		
		String yrr[][] = {{"   ","   ","   ","   ","   ","   ","   ","   ","   ","   "},
					{"   ","BE1","BH1","BS1","BM1","BK ","BS2","BH2","BE2"," 1 "},
					{"   ","BP1","BP2","BP3","BP4","BP5","BP6","BP7","BP8"," 2 "},
					{"   ","---","---","---","---","---","---","---","---"," 3 "},
					{"   ","---","---","---","---","---","---","---","---"," 4 "},
					{"   ","---","---","---","---","---","---","---","---"," 5 "},
					{"   ","---","---","---","---","---","---","---","---"," 6 "},
					{"   ","WP1","WP2","WP3","WP4","WP5","WP6","WP7","WP8"," 7 "},
					{"   ","WE1","WH1","WS1","WM1","WK ","WS2","WH2","WE2"," 8 "},
					{"   "," 1 "," 2 "," 3 "," 4 "," 5 "," 6 "," 7 "," 8 ","   "}};

		static int queenw = 1;
		static int queenb = 1;
		static int bishopw = 2;
		static int bishopb = 2;
		static int rookw = 2;
		static int rookb = 2;
		static int knightw = 2;
		static int knightb = 2;

		static int casWK=0;
		static int casWE1=0;
		static int casWE2=0;
		static int casBK=0;
		static int casBE1=0;
		static int casBE2=0;
 
		void chessboard()
		{
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<10;j++)
				{
					System.out.print(arr[i][j]+"  ");
				}
				System.out.print("\n\n");
			}
			System.out.print("\n");
		}
		static String note ="";

		void m1()
		{
			String t = hi.next();
			if(t.equalsIgnoreCase("BLACK"))
			{
				note = t;
			}
			else if(t.equalsIgnoreCase("WHITE"))
			{
				note = t;
			}
			else
			{
				System.out.println("Please Enter Black / White only!");
				m1();
			}
		}
		
		String brr[] = {"WP1","WP2","WP3","WP4","WP5","WP6","WP7","WP8"};
		String crr[] = {"BP1","BP2","BP3","BP4","BP5","BP6","BP7","BP8"};

		String drr[] = {" "," "," "," "," "," "," "," "};
		String err[] = {" "," "," "," "," "," "," "," "};

		String pawnO(int a,int b)
		{
			String g ="";

			if((a==7)&&(arr[a-2][b].equals("---") || arr[a-1][b].equals("---") || arr[a-1][b-1].startsWith("B") || arr[a-1][b-1].startsWith("b") || arr[a-1][b+1].startsWith("B") || arr[a-1][b+1].startsWith("b")))
			{
				if(arr[a-2][b].equals("---"))
				{
					System.out.print(" "+(a-2)+b);
						g=g+(a-2)+b;
				}
				if(arr[a-1][b].equals("---"))
				{
					System.out.print(" || "+(a-1)+b);
						g=g+" "+(a-1)+b;
				}
				if((arr[a-1][b-1].startsWith("B") || arr[a-1][b-1].startsWith("b"))&&(!arr[a-1][b-1].equalsIgnoreCase("BK ")))
				{
					System.out.print(" || "+(a-1)+(b-1));
						g=g+" "+(a-1)+(b-1);
				}
				if((arr[a-1][b+1].startsWith("B") || arr[a-1][b+1].startsWith("b"))&&(!arr[a-1][b+1].equalsIgnoreCase("BK ")))
				{
					System.out.print(" || "+(a-1)+(b+1));
						g=g+" "+(a-1)+(b+1);
				}
			}
			else if(arr[a-1][b].equals("---") || arr[a-1][b-1].startsWith("B") || arr[a-1][b-1].startsWith("b") || arr[a-1][b+1].startsWith("B") || arr[a-1][b+1].startsWith("b"))
			{
				if(arr[a-1][b].equals("---"))
				{
					System.out.print(" "+(a-1)+b);
						g=g+(a-1)+b;
				}
				if((arr[a-1][b-1].startsWith("B") || arr[a-1][b-1].startsWith("b"))&&(!arr[a-1][b-1].equalsIgnoreCase("BK ")))
				{
					System.out.print(" || "+(a-1)+(b-1));
						g=g+" "+(a-1)+(b-1);
				}
				if((arr[a-1][b+1].startsWith("B") || arr[a-1][b+1].startsWith("b"))&&(!arr[a-1][b+1].equalsIgnoreCase("BK ")))
				{
					System.out.print(" || "+(a-1)+(b+1));
						g=g+" "+(a-1)+(b+1);
				}
			}
			return g;
		}
		void choicepr(String a,int d,int e)
		{
			System.out.println("Select your options queen || bishop || rook || knight");
			String pr = hi.next();
			if(pr.equalsIgnoreCase("QUEEN"))
			{
				if(a.charAt(0)-48 == 1)
				{
					queenw++;
					arr[d][e] = arr[d][e].replace(arr[d][e],("WM"+queenw));
				}
				else if(a.charAt(0)-48 == 8)
				{
					queenb++;
					arr[d][e] = arr[d][e].replace(arr[d][e],("BM"+queenb));
				}
			}
			else if(pr.equalsIgnoreCase("BISHOP"))
			{
				if(a.charAt(0)-48 == 1)
				{
					bishopw++;
					arr[d][e] = arr[d][e].replace(arr[d][e],("WS"+bishopw));
				}
				else if(a.charAt(0)-48 == 8)
				{
					bishopb++;
					arr[d][e] = arr[d][e].replace(arr[d][e],("BS"+bishopb));
				}
			}
			else if(pr.equalsIgnoreCase("ROOK"))
			{
				if(a.charAt(0)-48 == 1)
				{
					rookw++;
					arr[d][e] = arr[d][e].replace(arr[d][e],("WE"+rookw));
				}
				else if(a.charAt(0)-48 == 8)
				{
					rookb++;
					arr[d][e] = arr[d][e].replace(arr[d][e],("BE"+rookb));
				}
			}
			else if(pr.equalsIgnoreCase("KNIGHT"))
			{
				if(a.charAt(0)-48 == 1)
				{
					knightw++;
					arr[d][e] = arr[d][e].replace(arr[d][e],("WH"+knightw));
				}
				else if(a.charAt(0)-48 == 8)
				{
					knightb++;
					arr[d][e] = arr[d][e].replace(arr[d][e],("BH"+knightb));
				}
			}
			else
			{
				choicepr(a,d,e);
			}
		}
		void choiceP(String a,int b,int c,String d)
		{
			int sad = 0;
			String pq = hi.next();
			String hiarr[] = a.split(" ");
			for(int k=0;k<hiarr.length;k++)
			{
				if(pq.equals(hiarr[k]))
				{
					if(((pq.charAt(0)-48)==1||(pq.charAt(0)-48)==8)&&(d.contains("p")||d.contains("P")))
					{
						choicepr(pq,b,c);
					}
					if((d.equalsIgnoreCase("WE2"))&&(pq.contains("c")))
					{
						arr[8][6] = arr[8][6].replace(arr[8][6],arr[8][8]);
						arr[8][7] = arr[8][7].replace(arr[8][7],arr[8][5]);
						arr[8][8] = arr[8][8].replace(arr[8][8],"---");
						arr[8][5] = arr[8][5].replace(arr[8][5],"---");
					}
					else if((d.equalsIgnoreCase("WE1"))&&(pq.contains("c")))
					{
						arr[8][4] = arr[8][4].replace(arr[8][4],arr[8][1]);
						arr[8][3] = arr[8][3].replace(arr[8][3],arr[8][5]);
						arr[8][1] = arr[8][1].replace(arr[8][1],"---");
						arr[8][5] = arr[8][5].replace(arr[8][5],"---");
					}
					else if((d.equalsIgnoreCase("BE2"))&&(pq.contains("c")))
					{
						arr[1][6] = arr[1][6].replace(arr[1][6],arr[1][8]);
						arr[1][7] = arr[1][7].replace(arr[1][7],arr[1][5]);
						arr[1][8] = arr[1][8].replace(arr[1][8],"---");
						arr[1][5] = arr[1][5].replace(arr[1][5],"---");
					}
					else if((d.equalsIgnoreCase("BE1"))&&(pq.contains("c")))
					{
						arr[1][4] = arr[1][4].replace(arr[1][4],arr[1][1]);
						arr[1][3] = arr[1][3].replace(arr[1][3],arr[1][5]);
						arr[1][1] = arr[1][1].replace(arr[1][1],"---");
						arr[1][5] = arr[1][5].replace(arr[1][5],"---");
					}
					else
					{
						arr[(pq.charAt(0)-48)][(pq.charAt(1)-48)] = arr[(pq.charAt(0)-48)][(pq.charAt(1)-48)].replace(arr[(pq.charAt(0)-48)][(pq.charAt(1)-48)],arr[b][c]);
						arr[b][c] = arr[b][c].replace(arr[b][c],"---");
					}
					sad++;
				}
			}
			if(sad==0)
			{
				System.out.println("Please enter valid choice!");
				choiceP(a,b,c,d);
			}
		}
		int pawnF(String a)
		{
			int pet =0;
			int rec =0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(a.equalsIgnoreCase(arr[i][j]))
					{
						System.out.print("Your'e options are : ");
						String hip = pawnO(i,j);
						if(hip.isEmpty())
						{
							pet=1;
							System.out.print("cannot move!");
						}
						else
						{
							System.out.println("\n state your choice ");
							choiceP(hip,i,j,a);
						}
						i=arr.length;
						j=arr.length;
					}
					else
					{
						rec++;
					}
				}
			}
			if(rec==100)
			{
				pet = 1;
			}
			return pet;
		}
		
		String senaO(int a,int b)
		{
			String g ="";
			
			
				if((arr[a-1][b+1].startsWith("b")||arr[a-1][b+1].startsWith("B"))&&!arr[a-1][b+1].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a-1)+(b+1));
					g = g+" "+(a-1)+(b+1);
				}
				if(arr[a-1][b+1].equals("---"))	
				{
					int c = a;
					int d = b;
					while(arr[c-1][d+1].equals("---"))
					{
						System.out.print(" || "+(c-1)+(d+1));
						g = g+" "+(c-1)+(d+1);
						c=c-1;
						d=d+1;
					}
					if(arr[c-1][d+1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c-1][d+1].startsWith("b")||arr[c-1][d+1].startsWith("B"))
					{
						System.out.print(" || "+(c-1)+(d+1));
						g = g+" "+(c-1)+(d+1);
					}
				}
				if((arr[a-1][b-1].startsWith("b")||arr[a-1][b-1].startsWith("B"))&&!arr[a-1][b-1].equalsIgnoreCase("BK "))
				{
					System.out.print(" || "+(a-1)+(b-1));
					g = g+" "+(a-1)+(b-1);
				}
				if(arr[a-1][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c-1][d-1].equals("---"))
					{
						System.out.print(" || "+(c-1)+(d-1));
						g = g+" "+(c-1)+(d-1);
						c=c-1;
						d=d-1;
					}
					if(arr[c-1][d-1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c-1][d-1].startsWith("b")||arr[c-1][d-1].startsWith("B"))
					{
						System.out.print(" || "+(c-1)+(d-1));
						g = g+" "+(c-1)+(d-1);
					}
				}
				if((arr[a+1][b+1].startsWith("b")||arr[a+1][b+1].startsWith("B"))&&!arr[a+1][b+1].equalsIgnoreCase("BK "))
				{
					System.out.print(" || "+(a+1)+(b+1));
					g = g+" "+(a+1)+(b+1);
				}
				if(arr[a+1][b+1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d+1].equals("---"))
					{
						System.out.print(" || "+(c+1)+(d+1));
						g = g+" "+(c+1)+(d+1);
						c=c+1;
						d=d+1;
					}
					if(arr[c+1][d+1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c+1][d+1].startsWith("b")||arr[c+1][d+1].startsWith("B"))
					{
						System.out.print(" || "+(c+1)+(d+1));
						g = g+" "+(c+1)+(d+1);
					}
				}
				if((arr[a+1][b-1].startsWith("b")||arr[a+1][b-1].startsWith("B"))&&!arr[a+1][b-1].equalsIgnoreCase("BK "))
				{
					System.out.print(" || "+(a+1)+(b-1));
					g = g+" "+(a+1)+(b-1);
				}
				if(arr[a+1][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d-1].equals("---"))
					{
						System.out.print(" || "+(c+1)+(d-1));
						g = g+" "+(c+1)+(d-1);
						c=c+1;
						d=d-1;
					}
					if(arr[c+1][d-1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c+1][d-1].startsWith("b")||arr[c+1][d-1].startsWith("B"))
					{
						System.out.print(" || "+(c+1)+(d-1));
						g = g+" "+(c+1)+(d-1);
					}
				}	
			
			return g;
		}
		
		int senaF(String a)
		{
			int vas = 0;
			int rec=0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(a.equalsIgnoreCase(arr[i][j]))
					{
						System.out.print("Your'e options are : ");
						String hip = senaO(i,j);
						if(hip.isEmpty())
						{
							vas=1;
							System.out.print("cannot move!");
						}
						else
						{
							System.out.println("\n state your choice ");
							choiceP(hip,i,j,a);
						}
						i=arr.length;
						j=arr.length;
					}
					else
					{
						rec++;
					}
				}
			}
			if(rec==100)
			{
				vas = 1;
			}
			return vas;
		}

		String elephO(int a,int b)
		{
			String g ="";
			
			
				if((arr[a-1][b].startsWith("b")||arr[a-1][b].startsWith("B"))&&!arr[a-1][b].equalsIgnoreCase("BK "))
				{
					System.out.print(" || "+(a-1)+(b));
					g = g+" "+(a-1)+(b);
				}
				if(arr[a-1][b].equals("---"))	
				{
					int c = a;
					int d = b;
					while(arr[c-1][d].equals("---"))
					{
						System.out.print(" || "+(c-1)+(d));
						g = g+" "+(c-1)+(d);
						c=c-1;
						d=d;
					}
					if(arr[c-1][d].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c-1][d].startsWith("b")||arr[c-1][d].startsWith("B"))
					{
						System.out.print(" || "+(c-1)+(d));
						g = g+" "+(c-1)+(d);
					}
				}
				if((arr[a+1][b].startsWith("b")||arr[a+1][b].startsWith("B"))&&!arr[a+1][b].equalsIgnoreCase("BK "))
				{
					System.out.print(" || "+(a+1)+(b));
					g = g+" "+(a+1)+(b);
				}
				if(arr[a+1][b].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d].equals("---"))
					{
						System.out.print(" || "+(c+1)+(d));
						g = g+" "+(c+1)+(d);
						c=c+1;
						d=d;
					}
					if(arr[c+1][d].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c+1][d].startsWith("b")||arr[c+1][d].startsWith("B"))
					{
						System.out.print(" || "+(c+1)+(d));
						g = g+" "+(c+1)+(d);
					}
				}
				if((arr[a][b+1].startsWith("b")||arr[a][b+1].startsWith("B"))&&!arr[a][b+1].equalsIgnoreCase("BK "))
				{
					System.out.print(" || "+(a)+(b+1));
					g = g+" "+(a)+(b+1);
				}
				if(arr[a][b+1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c][d+1].equals("---"))
					{
						System.out.print(" || "+(c)+(d+1));
						g = g+" "+(c)+(d+1);
						c=c;
						d=d+1;
					}
					if(arr[c][d+1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[a][b].equalsIgnoreCase("WE1")&&(arr[c][d+1].equalsIgnoreCase("WK "))&&(casWK==0&&casWE1==0))
					{
						System.out.print(" || "+(c)+(d+1)+"(enter c for castling)");
						g = g+" "+(c)+(d+1)+"c";
					}
					else if(arr[c][d+1].startsWith("b")||arr[c][d+1].startsWith("B"))
					{
						System.out.print(" || "+(c)+(d+1));
						g = g+" "+(c)+(d+1);
					}
				}
				if((arr[a][b-1].startsWith("b")||arr[a][b-1].startsWith("B"))&&!arr[a][b-1].equalsIgnoreCase("BK "))
				{
					System.out.print(" || "+(a)+(b-1));
					g = g+" "+(a)+(b-1);
				}
				if(arr[a][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c][d-1].equals("---"))
					{
						System.out.print(" || "+(c)+(d-1));
						g = g+" "+(c)+(d-1);
						c=c;
						d=d-1;
					}
					if(arr[c][d-1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[a][b].equalsIgnoreCase("WE2")&&(arr[c][d-1].equalsIgnoreCase("WK "))&&(casWK==0&&casWE2==0))
					{
						System.out.print(" || "+(c)+(d-1)+"(enter c for castling)");
						g = g+" "+(c)+(d-1)+"c";
					}
					else if(arr[c][d-1].startsWith("b")||arr[c][d-1].startsWith("B"))
					{
						System.out.print(" || "+(c)+(d-1));
						g = g+" "+(c)+(d-1);
					}
				}	
			
			return g;
		}

		int elephF(String a)
		{
			int vas = 0;
			int rec = 0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(a.equalsIgnoreCase(arr[i][j]))
					{
						System.out.print("Your'e options are : ");
						String hip = elephO(i,j);
						if(hip.isEmpty())
						{
							vas=1;
							System.out.print("cannot move!");
						}
						else
						{
							System.out.println("\n state your choice ");
							choiceP(hip,i,j,a);
						}
						i=arr.length;
						j=arr.length;
					}
					else
					{
						rec++;
					}
				}
			}
			if(rec==100)
			{
				vas = 1;
			}
			return vas;
		}
		
		String mantriO(int a,int b)
		{
			String g ="";
			
				if((arr[a-1][b+1].startsWith("b")||arr[a-1][b+1].startsWith("B"))&&!arr[a-1][b+1].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a-1)+(b+1));
					g = g+" "+(a-1)+(b+1);
				}
				if(arr[a-1][b+1].equals("---"))	
				{
					int c = a;
					int d = b;
					while(arr[c-1][d+1].equals("---"))
					{
						System.out.print(" || "+(c-1)+(d+1));
						g = g+" "+(c-1)+(d+1);
						c=c-1;
						d=d+1;
					}
					if(arr[c-1][d+1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c-1][d+1].startsWith("b")||arr[c-1][d+1].startsWith("B"))
					{
						System.out.print(" || "+(c-1)+(d+1));
						g = g+" "+(c-1)+(d+1);
					}
				}
				if((arr[a-1][b-1].startsWith("b")||arr[a-1][b-1].startsWith("B"))&&!arr[a-1][b-1].equalsIgnoreCase("BK "))
				{
					System.out.print(" || "+(a-1)+(b-1));
					g = g+" "+(a-1)+(b-1);
				}
				if(arr[a-1][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c-1][d-1].equals("---"))
					{
						System.out.print(" || "+(c-1)+(d-1));
						g = g+" "+(c-1)+(d-1);
						c=c-1;
						d=d-1;
					}
					if(arr[c-1][d-1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c-1][d-1].startsWith("b")||arr[c-1][d-1].startsWith("B"))
					{
						System.out.print(" || "+(c-1)+(d-1));
						g = g+" "+(c-1)+(d-1);
					}
				}
				if((arr[a+1][b+1].startsWith("b")||arr[a+1][b+1].startsWith("B"))&&!arr[a+1][b+1].equalsIgnoreCase("BK "))
				{
					System.out.print(" || "+(a+1)+(b+1));
					g = g+" "+(a+1)+(b+1);
				}
				if(arr[a+1][b+1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d+1].equals("---"))
					{
						System.out.print(" || "+(c+1)+(d+1));
						g = g+" "+(c+1)+(d+1);
						c=c+1;
						d=d+1;
					}
					if(arr[c+1][d+1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c+1][d+1].startsWith("b")||arr[c+1][d+1].startsWith("B"))
					{
						System.out.print(" || "+(c+1)+(d+1));
						g = g+" "+(c+1)+(d+1);
					}
				}
				if((arr[a+1][b-1].startsWith("b")||arr[a+1][b-1].startsWith("B"))&&!arr[a+1][b-1].equalsIgnoreCase("BK "))
				{
					System.out.print(" || "+(a+1)+(b-1));
					g = g+" "+(a+1)+(b-1);
				}
				if(arr[a+1][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d-1].equals("---"))
					{
						System.out.print(" || "+(c+1)+(d-1));
						g = g+" "+(c+1)+(d-1);
						c=c+1;
						d=d-1;
					}
					if(arr[c+1][d-1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c+1][d-1].startsWith("b")||arr[c+1][d-1].startsWith("B"))
					{
						System.out.print(" || "+(c+1)+(d-1));
						g = g+" "+(c+1)+(d-1);
					}
				}

				if((arr[a-1][b].startsWith("b")||arr[a-1][b].startsWith("B"))&&!arr[a-1][b].equalsIgnoreCase("BK "))
				{
					System.out.print(" || "+(a-1)+(b));
					g = g+" "+(a-1)+(b);
				}
				if(arr[a-1][b].equals("---"))	
				{
					int c = a;
					int d = b;
					while(arr[c-1][d].equals("---"))
					{
						System.out.print(" || "+(c-1)+(d));
						g = g+" "+(c-1)+(d);
						c=c-1;
						d=d;
					}
					if(arr[c-1][d].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c-1][d].startsWith("b")||arr[c-1][d].startsWith("B"))
					{
						System.out.print(" || "+(c-1)+(d));
						g = g+" "+(c-1)+(d);
					}
				}
				if((arr[a+1][b].startsWith("b")||arr[a+1][b].startsWith("B"))&&!arr[a+1][b].equalsIgnoreCase("BK "))
				{
					System.out.print(" || "+(a+1)+(b));
					g = g+" "+(a+1)+(b);
				}
				if(arr[a+1][b].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d].equals("---"))
					{
						System.out.print(" || "+(c+1)+(d));
						g = g+" "+(c+1)+(d);
						c=c+1;
						d=d;
					}
					if(arr[c+1][d].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c+1][d].startsWith("b")||arr[c+1][d].startsWith("b"))
					{
						System.out.print(" || "+(c+1)+(d));
						g = g+" "+(c+1)+(d);
					}
				}
				if((arr[a][b+1].startsWith("b")||arr[a][b+1].startsWith("b"))&&!arr[a][b+1].equalsIgnoreCase("BK "))
				{
					System.out.print(" || "+(a)+(b+1));
					g = g+" "+(a)+(b+1);
				}
				if(arr[a][b+1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c][d+1].equals("---"))
					{
						System.out.print(" || "+(c)+(d+1));
						g = g+" "+(c)+(d+1);
						c=c;
						d=d+1;
					}
					if(arr[c][d+1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c][d+1].startsWith("b")||arr[c][d+1].startsWith("B"))
					{
						System.out.print(" || "+(c)+(d+1));
						g = g+" "+(c)+(d+1);
					}
				}
				if((arr[a][b-1].startsWith("b")||arr[a][b-1].startsWith("B"))&&!arr[a][b-1].equalsIgnoreCase("BK "))
				{
					System.out.print(" || "+(a)+(b-1));
					g = g+" "+(a)+(b-1);
				}
				if(arr[a][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c][d-1].equals("---"))
					{
						System.out.print(" || "+(c)+(d-1));
						g = g+" "+(c)+(d-1);
						c=c;
						d=d-1;
					}
					if(arr[c][d-1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c][d-1].startsWith("b")||arr[c][d-1].startsWith("B"))
					{
						System.out.print(" || "+(c)+(d-1));
						g = g+" "+(c)+(d-1);
					}
				}	
			return g;
		}

		int mantriF(String a)
		{
			int vas = 0;
			int rec=0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(a.equalsIgnoreCase(arr[i][j]))
					{
						System.out.print("Your'e options are : ");
						String hip = mantriO(i,j);
						if(hip.isEmpty())
						{
							vas=1;
							System.out.print("cannot move!");
						}
						else
						{
							System.out.println("\n state your choice ");
							choiceP(hip,i,j,a);
						}
						i=arr.length;
						j=arr.length;
					}
					else
					{
						rec++;
					}
				}
			}
			if(rec==100)
			{
				vas = 1;
			}
			return vas;
		}

		String horseO(int a,int b)
		{
			String g ="";

			if((a>2)&&(arr[a-2][b+1].startsWith("b")||arr[a-2][b+1].startsWith("B"))&&!arr[a-2][b+1].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a-2)+(b+1));
					g = g+" "+(a-2)+(b+1);
				}
			if((a>2)&&arr[a-2][b+1].equals("---"))
				{
					System.out.print(" || "+(a-2)+(b+1));
					g = g+" "+(a-2)+(b+1);
				}
			if((a>2)&&(arr[a-2][b-1].startsWith("b")||arr[a-2][b-1].startsWith("B"))&&!arr[a-2][b-1].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a-2)+(b-1));
					g = g+" "+(a-2)+(b-1);
				}
			if((a>2)&&arr[a-2][b-1].equals("---"))
				{
					System.out.print(" || "+(a-2)+(b-1));
					g = g+" "+(a-2)+(b-1);
				}
			if((b<7)&&(arr[a-1][b+2].startsWith("b")||arr[a-1][b+2].startsWith("B"))&&!arr[a-1][b+2].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a-1)+(b+2));
					g = g+" "+(a-1)+(b+2);
				}
			if((b<7)&&arr[a-1][b+2].equals("---"))
				{
					System.out.print(" || "+(a-1)+(b+2));
					g = g+" "+(a-1)+(b+2);
				}
			if((b>2)&&(arr[a-1][b-2].startsWith("b")||arr[a-1][b-2].startsWith("B"))&&!arr[a-1][b-2].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a-1)+(b-2));
					g = g+" "+(a-1)+(b-2);
				}
			if((b>2)&&arr[a-1][b-2].equals("---"))
				{
					System.out.print(" || "+(a-1)+(b-2));
					g = g+" "+(a-1)+(b-2);
				}
			if((b<7)&&(arr[a+1][b+2].startsWith("b")||arr[a+1][b+2].startsWith("B"))&&!arr[a+1][b+2].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a+1)+(b+2));
					g = g+" "+(a+1)+(b+2);
				}
			if((b<7)&&arr[a+1][b+2].equals("---"))
				{
					System.out.print(" || "+(a+1)+(b+2));
					g = g+" "+(a+1)+(b+2);
				}
			if((b>2)&&(arr[a+1][b-2].startsWith("b")||arr[a+1][b-2].startsWith("B"))&&!arr[a+1][b-2].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a+1)+(b-2));
					g = g+" "+(a+1)+(b-2);
				}
			if((b>2)&&arr[a+1][b-2].equals("---"))
				{
					System.out.print(" || "+(a+1)+(b-2));
					g = g+" "+(a+1)+(b-2);
				}
			if((a<7)&&(arr[a+2][b+1].startsWith("b")||arr[a+2][b+1].startsWith("B"))&&!arr[a+2][b+1].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a+2)+(b+1));
					g = g+" "+(a+2)+(b+1);
				}
			if((a<7)&&arr[a+2][b+1].equals("---"))
				{
					System.out.print(" || "+(a+2)+(b+1));
					g = g+" "+(a+2)+(b+1);
				}
			if((a<7)&&(arr[a+2][b-1].startsWith("b")||arr[a+2][b-1].startsWith("B"))&&!arr[a+2][b-1].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a+2)+(b-1));
					g = g+" "+(a+2)+(b-1);
				}
			if((a<7)&&arr[a+2][b-1].equals("---"))
				{
					System.out.print(" || "+(a+2)+(b-1));
					g = g+" "+(a+2)+(b-1);
				}

			return g;
		}
		int horseF(String a)
		{
			int vas = 0;
			int rec=0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(a.equalsIgnoreCase(arr[i][j]))
					{
						System.out.print("Your'e options are : ");
						String hip = horseO(i,j);
						if(hip.isEmpty())
						{
							vas=1;
							System.out.print("cannot move!");
						}
						else
						{
							System.out.println("\n state your choice ");
							choiceP(hip,i,j,a);
						}
						i=arr.length;
						j=arr.length;
					}
					else
					{
						rec++;
					}
				}
			}
			if(rec==100)
			{
				vas = 1;
			}
			return vas;
		}

		String kingO(int a,int b)
		{
			String g ="";
			if((arr[a-1][b+1].startsWith("b")||arr[a-1][b+1].startsWith("B"))&&!arr[a-1][b+1].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a-1)+(b+1));
					g = g+" "+(a-1)+(b+1);
				}
			if(arr[a-1][b+1].equals("---"))
				{
					System.out.print(" || "+(a-1)+(b+1));
					g = g+" "+(a-1)+(b+1);
				}
			if((arr[a-1][b-1].startsWith("b")||arr[a-1][b-1].startsWith("B"))&&!arr[a-1][b-1].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a-1)+(b-1));
					g = g+" "+(a-1)+(b-1);
				}
			if(arr[a-1][b-1].equals("---"))
				{
					System.out.print(" || "+(a-1)+(b-1));
					g = g+" "+(a-1)+(b-1);
				}
			if((arr[a-1][b].startsWith("b")||arr[a-1][b].startsWith("B"))&&!arr[a-1][b].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a-1)+(b));
					g = g+" "+(a-1)+(b);
				}
			if(arr[a-1][b].equals("---"))
				{
					System.out.print(" || "+(a-1)+(b));
					g = g+" "+(a-1)+(b);
				}
			if((arr[a][b-1].startsWith("b")||arr[a][b-1].startsWith("B"))&&!arr[a][b-1].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a)+(b-1));
					g = g+" "+(a)+(b-1);
				}
			if(arr[a][b-1].equals("---"))
				{
					System.out.print(" || "+(a)+(b-1));
					g = g+" "+(a)+(b-1);
				}
			if((arr[a][b+1].startsWith("b")||arr[a][b+1].startsWith("B"))&&!arr[a][b+1].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a)+(b+1));
					g = g+" "+(a)+(b+1);
				}
			if(arr[a][b+1].equals("---"))
				{
					System.out.print(" || "+(a)+(b+1));
					g = g+" "+(a)+(b+1);
				}
			if((arr[a+1][b-1].startsWith("b")||arr[a+1][b-1].startsWith("B"))&&!arr[a+1][b-1].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a+1)+(b-1));
					g = g+" "+(a+1)+(b-1);
				}
			if(arr[a+1][b-1].equals("---"))
				{
					System.out.print(" || "+(a+1)+(b-1));
					g = g+" "+(a+1)+(b-1);
				}
			if((arr[a+1][b].startsWith("b")||arr[a+1][b].startsWith("B"))&&!arr[a+1][b].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a+1)+(b));
					g = g+" "+(a+1)+(b);
				}
			if(arr[a+1][b].equals("---"))
				{
					System.out.print(" || "+(a+1)+(b));
					g = g+" "+(a+1)+(b);
				}
			if((arr[a+1][b+1].startsWith("b")||arr[a+1][b+1].startsWith("B"))&&!arr[a+1][b+1].equalsIgnoreCase("BK "))
				{	
					System.out.print(" || "+(a+1)+(b+1));
					g = g+" "+(a+1)+(b+1);
				}
			if(arr[a+1][b+1].equals("---"))
				{
					System.out.print(" || "+(a+1)+(b+1));
					g = g+" "+(a+1)+(b+1);
				}
			return g;
		}

		int kingF(String a)
		{
			int vas = 0;
			int rec = 0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					if((a+" ").equalsIgnoreCase(arr[i][j]))
					{
						System.out.print("Your'e options are : ");
						String hip = kingO(i,j);
						if(hip.isEmpty())
						{
							vas=1;
							System.out.print("cannot move!");
						}
						else
						{
							System.out.println("\n state your choice ");
							choiceP(hip,i,j,(a+" "));
						}
						i=arr.length;
						j=arr.length;
					}
					else
					{
						rec++;
					}
				}
			}
			if(rec==100)
			{
				vas = 1;
			}
			return vas;
		}		

		void whiteF()
		{
			String wf = hi.next();
			int v=0;
			int sara = 0;

			for(int i=0;i<brr.length;i++)
			{
				if(wf.equalsIgnoreCase(brr[i]))
				{
					drr[i]=drr[i].replace(drr[i],brr[i]);
					brr[i] = brr[i].replace(brr[i],"");
					v++;
				}
			}
			if(wf.contains("wh")||wf.contains("wH")||wf.contains("Wh")||wf.contains("WH"))
			{
				int res = horseF(wf);
				if(res==1)
				{
					System.out.println("Re - enter your piece");
					whiteF();
				}
			}
			else if(wf.contains("we")||wf.contains("wE")||wf.contains("We")||wf.contains("WE"))
			{
				int res = elephF(wf);
				if(res==1)
				{
					System.out.println("Re - enter your piece");
					whiteF();
				}
				else
				{	
					if(wf.equalsIgnoreCase("WE1"))
					{
						casWE1++;
					}
					else if(wf.equalsIgnoreCase("WE2"))
					{
						casWE2++;
					}
				}
			}
			else if(wf.contains("ws")||wf.contains("wS")||wf.contains("Ws")||wf.contains("WS"))
			{
				int res = senaF(wf);
				if(res==1)
				{
					System.out.println("Re - enter your piece");
					whiteF();
				}
			}
			else if(wf.contains("wm")||wf.contains("wM")||wf.contains("Wm")||wf.contains("WM"))
			{
				int res = mantriF(wf);
				if(res==1)
				{
					System.out.println("Re - enter your piece");
					whiteF();
				}
			}
			else if(wf.equalsIgnoreCase("WK"))
			{
				int res = kingF(wf);
				if(res==1)
				{
					System.out.println("Re - enter your piece");
					whiteF();
				}
				else
				{
					casWK++;
				}
			}
			else if(v==0)
			{
				for(int j=0;j<drr.length;j++)
				{
					if(wf.equalsIgnoreCase(drr[j]))
					{
						int top = pawnF(wf);
						if(top == 1)
						{
							System.out.println("Re - enter your piece");
							whiteF();
						}
						sara++;
						break;
					}
				}
				if(sara == 0)
				{
					System.out.println("You Entered piece cannot move Right now\nPlease enter valid piece try again");
					whiteF();
				}
			}
			
			else
			{

				int it=0;
				while(it<9)
				{
					if(wf.equalsIgnoreCase(arr[7][it]))
					{
						int sat = pawnF(wf);
						if(sat == 1)
						{
							System.out.println("Re - enter your piece");
							whiteF();
						}
						break;
					}
					it++;
				}
			}
		}

		String pawnbO(int a,int b)
		{
			String g ="";
			
			if((a==2)&&(arr[a+2][b].equals("---") || arr[a+1][b].equals("---") || arr[a+1][b-1].startsWith("W") || arr[a+1][b-1].startsWith("w") || arr[a+1][b+1].startsWith("W") || arr[a+1][b+1].startsWith("w")))
			{
				if(arr[a+2][b].equals("---"))
				{
					System.out.print(" "+(a+2)+b);
						g=g+(a+2)+b;
				}
				if(arr[a+1][b].equals("---"))
				{
					System.out.print(" || "+(a+1)+b);
						g=g+" "+(a+1)+b;
				}
				if((arr[a+1][b-1].startsWith("W") || arr[a+1][b-1].startsWith("w"))&&(!arr[a+1][b-1].equalsIgnoreCase("BK ")))
				{
					System.out.print(" || "+(a+1)+(b-1));
						g=g+" "+(a+1)+(b-1);
				}
				if((arr[a+1][b+1].startsWith("W") || arr[a+1][b+1].startsWith("w"))&&(!arr[a+1][b+1].equalsIgnoreCase("BK ")))
				{
					System.out.print(" || "+(a+1)+(b+1));
						g=g+" "+(a+1)+(b+1);
				}
			}
			else if(arr[a+1][b].equals("---") || arr[a+1][b-1].startsWith("W") || arr[a+1][b-1].startsWith("w") || arr[a+1][b+1].startsWith("W") || arr[a+1][b+1].startsWith("w"))
			{
				if(arr[a+1][b].equals("---"))
				{
					System.out.print(" "+(a+1)+b);
						g=g+(a+1)+b;
				}
				if((arr[a+1][b-1].startsWith("W") || arr[a+1][b-1].startsWith("w"))&&(!arr[a+1][b-1].equalsIgnoreCase("WK ")))
				{
					System.out.print(" || "+(a+1)+(b-1));
						g=g+" "+(a+1)+(b-1);
				}
				if((arr[a+1][b+1].startsWith("W") || arr[a+1][b+1].startsWith("w"))&&(!arr[a+1][b+1].equalsIgnoreCase("WK ")))
				{
					System.out.print(" || "+(a+1)+(b+1));
						g=g+" "+(a+1)+(b+1);
				}
			}
			return g;
		}

		int pawnbF(String a)
		{
			int pet=0;
			int rec=0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(a.equalsIgnoreCase(arr[i][j]))
					{
						System.out.print("Your'e options are : ");
						String hip = pawnbO(i,j);
						if(hip.isEmpty())
						{
							pet = 1;
							System.out.println("cannot move!");
						}
						else
						{
							System.out.println("\n state your choice ");
						}
						if(!hip.isEmpty())
						{
							choiceP(hip,i,j,a);
						}
						i=arr.length;
						j=arr.length;
					}
					else
					{
						rec++;
					}
				}
			}
			if(rec==100)
			{
				pet = 1;
			}
			return pet;
		}

		String senabO(int a,int b)
		{
			String g ="";
			
			
				if((arr[a-1][b+1].startsWith("w")||arr[a-1][b+1].startsWith("W"))&&!arr[a-1][b+1].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a-1)+(b+1));
					g = g+" "+(a-1)+(b+1);
				}
				if(arr[a-1][b+1].equals("---"))	
				{
					int c = a;
					int d = b;
					while(arr[c-1][d+1].equals("---"))
					{
						System.out.print(" || "+(c-1)+(d+1));
						g = g+" "+(c-1)+(d+1);
						c=c-1;
						d=d+1;
					}
					if(arr[c-1][d+1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c-1][d+1].startsWith("w")||arr[c-1][d+1].startsWith("W"))
					{
						System.out.print(" || "+(c-1)+(d+1));
						g = g+" "+(c-1)+(d+1);
					}
				}
				if((arr[a-1][b-1].startsWith("w")||arr[a-1][b-1].startsWith("W"))&&!arr[a-1][b-1].equalsIgnoreCase("WK "))
				{
					System.out.print(" || "+(a-1)+(b-1));
					g = g+" "+(a-1)+(b-1);
				}
				if(arr[a-1][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c-1][d-1].equals("---"))
					{
						System.out.print(" || "+(c-1)+(d-1));
						g = g+" "+(c-1)+(d-1);
						c=c-1;
						d=d-1;
					}
					if(arr[c-1][d-1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c-1][d-1].startsWith("w")||arr[c-1][d-1].startsWith("W"))
					{
						System.out.print(" || "+(c-1)+(d-1));
						g = g+" "+(c-1)+(d-1);
					}
				}
				if((arr[a+1][b+1].startsWith("w")||arr[a+1][b+1].startsWith("W"))&&!arr[a+1][b+1].equalsIgnoreCase("WK "))
				{
					System.out.print(" || "+(a+1)+(b+1));
					g = g+" "+(a+1)+(b+1);
				}
				if(arr[a+1][b+1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d+1].equals("---"))
					{
						System.out.print(" || "+(c+1)+(d+1));
						g = g+" "+(c+1)+(d+1);
						c=c+1;
						d=d+1;
					}
					if(arr[c+1][d+1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c+1][d+1].startsWith("w")||arr[c+1][d+1].startsWith("W"))
					{
						System.out.print(" || "+(c+1)+(d+1));
						g = g+" "+(c+1)+(d+1);
					}
				}
				if((arr[a+1][b-1].startsWith("w")||arr[a+1][b-1].startsWith("W"))&&!arr[a+1][b-1].equalsIgnoreCase("WK "))
				{
					System.out.print(" || "+(a+1)+(b-1));
					g = g+" "+(a+1)+(b-1);
				}
				if(arr[a+1][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d-1].equals("---"))
					{
						System.out.print(" || "+(c+1)+(d-1));
						g = g+" "+(c+1)+(d-1);
						c=c+1;
						d=d-1;
					}
					if(arr[c+1][d-1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c+1][d-1].startsWith("w")||arr[c+1][d-1].startsWith("W"))
					{
						System.out.print(" || "+(c+1)+(d-1));
						g = g+" "+(c+1)+(d-1);
					}
				}	
			
			return g;
		}
		
		int senabF(String a)
		{
			int vas = 0;
			int rec=0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(a.equalsIgnoreCase(arr[i][j]))
					{
						System.out.print("Your'e options are : ");
						String hip = senabO(i,j);
						if(hip.isEmpty())
						{
							vas=1;
							System.out.print("cannot move!");
						}
						else
						{
							System.out.println("\n state your choice ");
							choiceP(hip,i,j,a);
						}
						i=arr.length;
						j=arr.length;
					}
					else
					{
						rec++;
					}
				}
			}
			if(rec==100)
			{
				vas = 1;
			}
			return vas;
		}
		
		String elephbO(int a,int b)
		{
			String g ="";
			
				if((arr[a-1][b].startsWith("w")||arr[a-1][b].startsWith("W"))&&!arr[a-1][b].equalsIgnoreCase("WK "))
				{
					System.out.print(" || "+(a-1)+(b));
					g = g+" "+(a-1)+(b);
				}
				if(arr[a-1][b].equals("---"))	
				{
					int c = a;
					int d = b;
					while(arr[c-1][d].equals("---"))
					{
						System.out.print(" || "+(c-1)+(d));
						g = g+" "+(c-1)+(d);
						c=c-1;
						d=d;
					}
					if(arr[c-1][d].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c-1][d].startsWith("w")||arr[c-1][d].startsWith("W"))
					{
						System.out.print(" || "+(c-1)+(d));
						g = g+" "+(c-1)+(d);
					}
				}
				if((arr[a+1][b].startsWith("w")||arr[a+1][b].startsWith("W"))&&!arr[a+1][b].equalsIgnoreCase("WK "))
				{
					System.out.print(" || "+(a+1)+(b));
					g = g+" "+(a+1)+(b);
				}
				if(arr[a+1][b].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d].equals("---"))
					{
						System.out.print(" || "+(c+1)+(d));
						g = g+" "+(c+1)+(d);
						c=c+1;
						d=d;
					}
					if(arr[c+1][d].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c+1][d].startsWith("w")||arr[c+1][d].startsWith("W"))
					{
						System.out.print(" || "+(c+1)+(d));
						g = g+" "+(c+1)+(d);
					}
				}
				if((arr[a][b+1].startsWith("w")||arr[a][b+1].startsWith("W"))&&!arr[a][b+1].equalsIgnoreCase("WK "))
				{
					System.out.print(" || "+(a)+(b+1));
					g = g+" "+(a)+(b+1);
				}
				if(arr[a][b+1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c][d+1].equals("---"))
					{
						System.out.print(" || "+(c)+(d+1));
						g = g+" "+(c)+(d+1);
						c=c;
						d=d+1;
					}
					if(arr[c][d+1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[a][b].equalsIgnoreCase("BE1")&&(arr[c][d+1].equalsIgnoreCase("BK "))&&(casBK==0&&casBE1==0))
					{
						System.out.print(" || "+(c)+(d+1)+"(enter c for castling)");
						g = g+" "+(c)+(d+1)+"c";
					}
					else if(arr[c][d+1].startsWith("w")||arr[c][d+1].startsWith("W"))
					{
						System.out.print(" || "+(c)+(d+1));
						g = g+" "+(c)+(d+1);
					}
				}
				if((arr[a][b-1].startsWith("w")||arr[a][b-1].startsWith("W"))&&!arr[a][b-1].equalsIgnoreCase("WK "))
				{
					System.out.print(" || "+(a)+(b-1));
					g = g+" "+(a)+(b-1);
				}
				if(arr[a][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c][d-1].equals("---"))
					{
						System.out.print(" || "+(c)+(d-1));
						g = g+" "+(c)+(d-1);
						c=c;
						d=d-1;
					}
					if(arr[c][d-1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[a][b].equalsIgnoreCase("BE2")&&(arr[c][d-1].equalsIgnoreCase("BK "))&&(casBK==0&&casBE2==0))
					{
						System.out.print(" || "+(c)+(d-1)+"(enter c for castling)");
						g = g+" "+(c)+(d-1)+"c";
					}
					else if(arr[c][d-1].startsWith("w")||arr[c][d-1].startsWith("W"))
					{
						System.out.print(" || "+(c)+(d-1));
						g = g+" "+(c)+(d-1);
					}
				}
			return g;
		}

		int elephbF(String a)
		{
			int vas = 0;
			int rec = 0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(a.equalsIgnoreCase(arr[i][j]))
					{
						System.out.print("Your'e options are : ");
						String hip = elephbO(i,j);
						if(hip.isEmpty())
						{
							vas=1;
							System.out.print("cannot move!");
						}
						else
						{
							System.out.println("\n state your choice ");
							choiceP(hip,i,j,a);
						}
						i=arr.length;
						j=arr.length;
					}
					else
					{
						rec++;
					}
				}
			}
			if(rec==100)
			{
				vas = 1;
			}
			return vas;
		}
		String mantribO(int a,int b)
		{
			String g ="";
			
				if((arr[a-1][b+1].startsWith("w")||arr[a-1][b+1].startsWith("W"))&&!arr[a-1][b+1].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a-1)+(b+1));
					g = g+" "+(a-1)+(b+1);
				}
				if(arr[a-1][b+1].equals("---"))	
				{
					int c = a;
					int d = b;
					while(arr[c-1][d+1].equals("---"))
					{
						System.out.print(" || "+(c-1)+(d+1));
						g = g+" "+(c-1)+(d+1);
						c=c-1;
						d=d+1;
					}
					if(arr[c-1][d+1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c-1][d+1].startsWith("w")||arr[c-1][d+1].startsWith("W"))
					{
						System.out.print(" || "+(c-1)+(d+1));
						g = g+" "+(c-1)+(d+1);
					}
				}
				if((arr[a-1][b-1].startsWith("w")||arr[a-1][b-1].startsWith("W"))&&!arr[a-1][b-1].equalsIgnoreCase("WK "))
				{
					System.out.print(" || "+(a-1)+(b-1));
					g = g+" "+(a-1)+(b-1);
				}
				if(arr[a-1][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c-1][d-1].equals("---"))
					{
						System.out.print(" || "+(c-1)+(d-1));
						g = g+" "+(c-1)+(d-1);
						c=c-1;
						d=d-1;
					}
					if(arr[c-1][d-1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c-1][d-1].startsWith("w")||arr[c-1][d-1].startsWith("W"))
					{
						System.out.print(" || "+(c-1)+(d-1));
						g = g+" "+(c-1)+(d-1);
					}
				}
				if((arr[a+1][b+1].startsWith("w")||arr[a+1][b+1].startsWith("W"))&&!arr[a+1][b+1].equalsIgnoreCase("WK "))
				{
					System.out.print(" || "+(a+1)+(b+1));
					g = g+" "+(a+1)+(b+1);
				}
				if(arr[a+1][b+1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d+1].equals("---"))
					{
						System.out.print(" || "+(c+1)+(d+1));
						g = g+" "+(c+1)+(d+1);
						c=c+1;
						d=d+1;
					}
					if(arr[c+1][d+1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c+1][d+1].startsWith("w")||arr[c+1][d+1].startsWith("W"))
					{
						System.out.print(" || "+(c+1)+(d+1));
						g = g+" "+(c+1)+(d+1);
					}
				}
				if((arr[a+1][b-1].startsWith("w")||arr[a+1][b-1].startsWith("W"))&&!arr[a+1][b-1].equalsIgnoreCase("WK "))
				{
					System.out.print(" || "+(a+1)+(b-1));
					g = g+" "+(a+1)+(b-1);
				}
				if(arr[a+1][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d-1].equals("---"))
					{
						System.out.print(" || "+(c+1)+(d-1));
						g = g+" "+(c+1)+(d-1);
						c=c+1;
						d=d-1;
					}
					if(arr[c+1][d-1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c+1][d-1].startsWith("w")||arr[c+1][d-1].startsWith("W"))
					{
						System.out.print(" || "+(c+1)+(d-1));
						g = g+" "+(c+1)+(d-1);
					}
				}

				if((arr[a-1][b].startsWith("w")||arr[a-1][b].startsWith("W"))&&!arr[a-1][b].equalsIgnoreCase("WK "))
				{
					System.out.print(" || "+(a-1)+(b));
					g = g+" "+(a-1)+(b);
				}
				if(arr[a-1][b].equals("---"))	
				{
					int c = a;
					int d = b;
					while(arr[c-1][d].equals("---"))
					{
						System.out.print(" || "+(c-1)+(d));
						g = g+" "+(c-1)+(d);
						c=c-1;
						d=d;
					}
					if(arr[c-1][d].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c-1][d].startsWith("w")||arr[c-1][d].startsWith("W"))
					{
						System.out.print(" || "+(c-1)+(d));
						g = g+" "+(c-1)+(d);
					}
				}
				if((arr[a+1][b].startsWith("w")||arr[a+1][b].startsWith("W"))&&!arr[a+1][b].equalsIgnoreCase("WK "))
				{
					System.out.print(" || "+(a+1)+(b));
					g = g+" "+(a+1)+(b);
				}
				if(arr[a+1][b].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d].equals("---"))
					{
						System.out.print(" || "+(c+1)+(d));
						g = g+" "+(c+1)+(d);
						c=c+1;
						d=d;
					}
					if(arr[c+1][d].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c+1][d].startsWith("w")||arr[c+1][d].startsWith("W"))
					{
						System.out.print(" || "+(c+1)+(d));
						g = g+" "+(c+1)+(d);
					}
				}
				if((arr[a][b+1].startsWith("w")||arr[a][b+1].startsWith("W"))&&!arr[a][b+1].equalsIgnoreCase("WK "))
				{
					System.out.print(" || "+(a)+(b+1));
					g = g+" "+(a)+(b+1);
				}
				if(arr[a][b+1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c][d+1].equals("---"))
					{
						System.out.print(" || "+(c)+(d+1));
						g = g+" "+(c)+(d+1);
						c=c;
						d=d+1;
					}
					if(arr[c][d+1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c][d+1].startsWith("w")||arr[c][d+1].startsWith("W"))
					{
						System.out.print(" || "+(c)+(d+1));
						g = g+" "+(c)+(d+1);
					}
				}
				if((arr[a][b-1].startsWith("w")||arr[a][b-1].startsWith("W"))&&!arr[a][b-1].equalsIgnoreCase("WK "))
				{
					System.out.print(" || "+(a)+(b-1));
					g = g+" "+(a)+(b-1);
				}
				if(arr[a][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c][d-1].equals("---"))
					{
						System.out.print(" || "+(c)+(d-1));
						g = g+" "+(c)+(d-1);
						c=c;
						d=d-1;
					}
					if(arr[c][d-1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c][d-1].startsWith("w")||arr[c][d-1].startsWith("W"))
					{
						System.out.print(" || "+(c)+(d-1));
						g = g+" "+(c)+(d-1);
					}
				}
			return g;
		}

		int mantribF(String a)
		{
			int vas = 0;
			int rec=0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(a.equalsIgnoreCase(arr[i][j]))
					{
						System.out.print("Your'e options are : ");
						String hip = mantribO(i,j);
						if(hip.isEmpty())
						{
							vas=1;
							System.out.print("cannot move!");
						}
						else
						{
							System.out.println("\n state your choice ");
							choiceP(hip,i,j,a);
						}
						i=arr.length;
						j=arr.length;
					}
					else
					{
						rec++;
					}
				}
			}
			if(rec==100)
			{
				vas = 1;
			}
			return vas;
		}

		String horsebO(int a,int b)
		{
			String g ="";
			if((a>2)&&(arr[a-2][b+1].startsWith("w")||arr[a-2][b+1].startsWith("W"))&&!arr[a-2][b+1].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a-2)+(b+1));
					g = g+" "+(a-2)+(b+1);
				}
			if((a>2)&&arr[a-2][b+1].equals("---"))
				{
					System.out.print(" || "+(a-2)+(b+1));
					g = g+" "+(a-2)+(b+1);
				}
			if((a>2)&&(arr[a-2][b-1].startsWith("w")||arr[a-2][b-1].startsWith("W"))&&!arr[a-2][b-1].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a-2)+(b-1));
					g = g+" "+(a-2)+(b-1);
				}
			if((a>2)&&arr[a-2][b-1].equals("---"))
				{
					System.out.print(" || "+(a-2)+(b-1));
					g = g+" "+(a-2)+(b-1);
				}
			if((b<7)&&(arr[a-1][b+2].startsWith("w")||arr[a-1][b+2].startsWith("W"))&&!arr[a-1][b+2].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a-1)+(b+2));
					g = g+" "+(a-1)+(b+2);
				}
			if((b<7)&&arr[a-1][b+2].equals("---"))
				{
					System.out.print(" || "+(a-1)+(b+2));
					g = g+" "+(a-1)+(b+2);
				}
			if((b>2)&&(arr[a-1][b-2].startsWith("w")||arr[a-1][b-2].startsWith("W"))&&!arr[a-1][b-2].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a-1)+(b-2));
					g = g+" "+(a-1)+(b-2);
				}
			if((b>2)&&arr[a-1][b-2].equals("---"))
				{
					System.out.print(" || "+(a-1)+(b-2));
					g = g+" "+(a-1)+(b-2);
				}
			if((b<7)&&(arr[a+1][b+2].startsWith("w")||arr[a+1][b+2].startsWith("W"))&&!arr[a+1][b+2].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a+1)+(b+2));
					g = g+" "+(a+1)+(b+2);
				}
			if((b<7)&&arr[a+1][b+2].equals("---"))
				{
					System.out.print(" || "+(a+1)+(b+2));
					g = g+" "+(a+1)+(b+2);
				}
			if((b>2)&&(arr[a+1][b-2].startsWith("w")||arr[a+1][b-2].startsWith("W"))&&!arr[a+1][b-2].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a+1)+(b-2));
					g = g+" "+(a+1)+(b-2);
				}
			if((b>2)&&arr[a+1][b-2].equals("---"))
				{
					System.out.print(" || "+(a+1)+(b-2));
					g = g+" "+(a+1)+(b-2);
				}
			if((a<7)&&(arr[a+2][b+1].startsWith("w")||arr[a+2][b+1].startsWith("W"))&&!arr[a+2][b+1].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a+2)+(b+1));
					g = g+" "+(a+2)+(b+1);
				}
			if((a<7)&&arr[a+2][b+1].equals("---"))
				{
					System.out.print(" || "+(a+2)+(b+1));
					g = g+" "+(a+2)+(b+1);
				}
			if((a<7)&&(arr[a+2][b-1].startsWith("w")||arr[a+2][b-1].startsWith("W"))&&!arr[a+2][b-1].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a+2)+(b-1));
					g = g+" "+(a+2)+(b-1);
				}
			if((a<7)&&arr[a+2][b-1].equals("---"))
				{
					System.out.print(" || "+(a+2)+(b-1));
					g = g+" "+(a+2)+(b-1);
				}

			return g;
		}
		int horsebF(String a)
		{
			int vas = 0;
			int rec = 0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(a.equalsIgnoreCase(arr[i][j]))
					{
						System.out.print("Your'e options are : ");
						String hip = horsebO(i,j);
						if(hip.isEmpty())
						{
							vas=1;
							System.out.print("cannot move!");
						}
						else
						{
							System.out.println("\n state your choice ");
							choiceP(hip,i,j,a);
						}
						i=arr.length;
						j=arr.length;
					}
					else
					{
						rec++;
					}
				}
			}
			if(rec==100)
			{
				vas = 1;
			}
			return vas;
		}

		String kingbO(int a,int b)
		{
			String g ="";
			if((arr[a-1][b+1].startsWith("w")||arr[a-1][b+1].startsWith("W"))&&!arr[a-1][b+1].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a-1)+(b+1));
					g = g+" "+(a-1)+(b+1);
				}
			if(arr[a-1][b+1].equals("---"))
				{
					System.out.print(" || "+(a-1)+(b+1));
					g = g+" "+(a-1)+(b+1);
				}
			if((arr[a-1][b-1].startsWith("w")||arr[a-1][b-1].startsWith("W"))&&!arr[a-1][b-1].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a-1)+(b-1));
					g = g+" "+(a-1)+(b-1);
				}
			if(arr[a-1][b-1].equals("---"))
				{
					System.out.print(" || "+(a-1)+(b-1));
					g = g+" "+(a-1)+(b-1);
				}
			if((arr[a-1][b].startsWith("w")||arr[a-1][b].startsWith("W"))&&!arr[a-1][b].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a-1)+(b));
					g = g+" "+(a-1)+(b);
				}
			if(arr[a-1][b].equals("---"))
				{
					System.out.print(" || "+(a-1)+(b));
					g = g+" "+(a-1)+(b);
				}
			if((arr[a][b-1].startsWith("w")||arr[a][b-1].startsWith("W"))&&!arr[a][b-1].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a)+(b-1));
					g = g+" "+(a)+(b-1);
				}
			if(arr[a][b-1].equals("---"))
				{
					System.out.print(" || "+(a)+(b-1));
					g = g+" "+(a)+(b-1);
				}
			if((arr[a][b+1].startsWith("w")||arr[a][b+1].startsWith("W"))&&!arr[a][b+1].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a)+(b+1));
					g = g+" "+(a)+(b+1);
				}
			if(arr[a][b+1].equals("---"))
				{
					System.out.print(" || "+(a)+(b+1));
					g = g+" "+(a)+(b+1);
				}
			if((arr[a+1][b-1].startsWith("w")||arr[a+1][b-1].startsWith("W"))&&!arr[a+1][b-1].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a+1)+(b-1));
					g = g+" "+(a+1)+(b-1);
				}
			if(arr[a+1][b-1].equals("---"))
				{
					System.out.print(" || "+(a+1)+(b-1));
					g = g+" "+(a+1)+(b-1);
				}
			if((arr[a+1][b].startsWith("w")||arr[a+1][b].startsWith("W"))&&!arr[a+1][b].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a+1)+(b));
					g = g+" "+(a+1)+(b);
				}
			if(arr[a+1][b].equals("---"))
				{
					System.out.print(" || "+(a+1)+(b));
					g = g+" "+(a+1)+(b);
				}
			if((arr[a+1][b+1].startsWith("w")||arr[a+1][b+1].startsWith("W"))&&!arr[a+1][b+1].equalsIgnoreCase("WK "))
				{	
					System.out.print(" || "+(a+1)+(b+1));
					g = g+" "+(a+1)+(b+1);
				}
			if(arr[a+1][b+1].equals("---"))
				{
					System.out.print(" || "+(a+1)+(b+1));
					g = g+" "+(a+1)+(b+1);
				}
			return g;
		}

		int kingbF(String a)
		{
			int vas = 0;
			int rec = 0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					if((a+" ").equalsIgnoreCase(arr[i][j]))
					{
						System.out.print("Your'e options are : ");
						String hip = kingbO(i,j);
						if(hip.isEmpty())
						{
							vas=1;
							System.out.print("cannot move!");
						}
						else
						{
							System.out.println("\n state your choice ");
							choiceP(hip,i,j,(a+" "));
						}
						i=arr.length;
						j=arr.length;
					}
					else
					{
						rec++;
					}
				}
			}
			if(rec==100)
			{
				vas = 1;
			}
			return vas;
		}

		void blackF()
		{
			String wf = hi.next();
			int v=0;
			int sara = 0;

			for(int i=0;i<crr.length;i++)
			{
				if(wf.equalsIgnoreCase(crr[i]))
				{
					err[i]=err[i].replace(err[i],crr[i]);
					crr[i] = crr[i].replace(crr[i],"");
					v++;
				}
			}
			if(wf.contains("bh")||wf.contains("bH")||wf.contains("Bh")||wf.contains("BH"))
			{
				int res = horsebF(wf);
				if(res==1)
				{
					System.out.println("Re - enter your piece");
					blackF();
				}
			}
			else if(wf.contains("be")||wf.contains("bE")||wf.contains("Be")||wf.contains("BE"))
			{
				int res = elephbF(wf);
				if(res==1)
				{
					System.out.println("Re - enter your piece");
					blackF();
				}
				else
				{	
					if(wf.equalsIgnoreCase("BE1"))
					{
						casBE1++;
					}
					else if(wf.equalsIgnoreCase("BE2"))
					{
						casBE2++;
					}
				}
			}
			else if(wf.contains("bs")||wf.contains("bS")||wf.contains("Bs")||wf.contains("BS"))
			{
				int res = senabF(wf);
				if(res==1)
				{
					System.out.println("Re - enter your piece");
					blackF();
				}
			}
			else if(wf.contains("bm")||wf.contains("bM")||wf.contains("Bm")||wf.contains("BM"))
			{
				int res = mantribF(wf);
				if(res==1)
				{
					System.out.println("Re - enter your piece");
					blackF();
				}
			}
			else if(wf.equalsIgnoreCase("BK"))
			{
				int res = kingbF(wf);
				if(res==1)
				{
					System.out.println("Re - enter your piece");
					blackF();
				}
				else
				{	
					casBK++;
				}
			}
			else if(v==0)
			{
				for(int j=0;j<err.length;j++)
				{
					if(wf.equalsIgnoreCase(err[j]))
					{
						int top = pawnbF(wf);
						if(top == 1)
						{
							System.out.println("Re-enter your Piece");
							blackF();
						}
						sara++;
						break;
					}
				}
				if(sara == 0)
				{
					System.out.println("You Entered piece cannot move Right now\nPlease enter valid piece try again");
					blackF();
				}
			}
			else
			{
			
				int it=0;
				while(it<9)
				{
					if(wf.equalsIgnoreCase(arr[2][it]))
					{
						int sat = pawnbF(wf);
						if(sat == 1)
						{
							System.out.println("Re - enter your piece");
							blackF();
						}
						break;
					}
					it++;
				}
				
			}
		}
		
		void wpos(String a,String b,String c,int d)
		{
			System.out.println("Please specify your position");
			String posN = hi.next();
			if(posN.equals(a))
			{
				arr[a.charAt(0)-48][a.charAt(1)-48] = arr[a.charAt(0)-48][a.charAt(1)-48].replace(arr[a.charAt(0)-48][a.charAt(1)-48],c);
				arr[d][a.charAt(1)-48] = arr[d][a.charAt(1)-48].replace(arr[d][a.charAt(1)-48],"---");
				System.out.print("\n");
			}
			else if(posN.equals(b))
			{
				arr[b.charAt(0)-48][b.charAt(1)-48] = arr[b.charAt(0)-48][b.charAt(1)-48].replace(arr[b.charAt(0)-48][b.charAt(1)-48],c);
				arr[d][b.charAt(1)-48] = arr[d][b.charAt(1)-48].replace(arr[d][b.charAt(1)-48],"---");
				System.out.print("\n");
			}
			else
			{
				wpos(a,b,c,d);
			}
		} 
		/*check*/

boolean whitecheck()
{
	int ck=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(("wk ").equalsIgnoreCase(arr[i][j]))
			{
				ck = run(i,j);
				i=arr.length;
				j=arr.length;	
			}
		}
	}
	if(ck==1)
	{	
		return true;
	}
	else
	{
		return false;
	}
}

int run(int a,int b)
{
	int check =0;
	if(arr[a-1][b+1].contains("BP")||arr[a-1][b+1].contains("bP")||arr[a-1][b+1].contains("Bp")||arr[a-1][b+1].contains("bp")||arr[a-1][b-1].contains("BP")||arr[a-1][b-1].contains("bP")||arr[a-1][b-1].contains("Bp")||arr[a-1][b-1].contains("bp"))
	{
		return 1;
	}
	if(arr[a-1][b-1].contains("BS")||arr[a-1][b-1].contains("Bs")||arr[a-1][b-1].contains("bS")||arr[a-1][b-1].contains("bs")||arr[a-1][b-1].contains("BM")||arr[a-1][b-1].contains("Bm")||arr[a-1][b-1].contains("bM")||arr[a-1][b-1].contains("bm"))
	{
		return 1;
	}
	if(arr[a-1][b-1].equals("---"))
	{
		int c=a;
		int d=b;
		while(arr[c-1][d-1].equals("---"))
		{
			c = c-1;
			d = d-1;
			if(arr[c-1][d-1].contains("BS")||arr[c-1][d-1].contains("Bs")||arr[c-1][d-1].contains("bS")||arr[c-1][d-1].contains("bs")||arr[c-1][d-1].contains("BM")||arr[c-1][d-1].contains("Bm")||arr[c-1][d-1].contains("bM")||arr[c-1][d-1].contains("bm"))
			{
						return 1;

			}
		}
	}
	if(arr[a-1][b+1].contains("BS")||arr[a-1][b+1].contains("Bs")||arr[a-1][b+1].contains("bS")||arr[a-1][b+1].contains("bs")||arr[a-1][b+1].contains("BM")||arr[a-1][b+1].contains("Bm")||arr[a-1][b+1].contains("bM")||arr[a-1][b+1].contains("bm"))
	{
		return 1;
	}
	if(arr[a-1][b+1].equals("---"))
	{
		int c=a;
		int d=b;
		while(arr[c-1][d+1].equals("---"))
		{
			
			c = c-1;
			d = d+1;
			if(arr[c-1][d+1].contains("BS")||arr[c-1][d+1].contains("Bs")||arr[c-1][d+1].contains("bS")||arr[c-1][d+1].contains("bs")||arr[c-1][d+1].contains("BM")||arr[c-1][d+1].contains("Bm")||arr[c-1][d+1].contains("bM")||arr[c-1][d+1].contains("bm"))
			{
						return 1;

			}
		}
	}
	if(arr[a+1][b-1].contains("BS")||arr[a+1][b-1].contains("Bs")||arr[a+1][b-1].contains("bS")||arr[a+1][b-1].contains("bs")||arr[a+1][b-1].contains("BM")||arr[a+1][b-1].contains("Bm")||arr[a+1][b-1].contains("bM")||arr[a+1][b-1].contains("bm"))
	{
		return 1;
	}
	if(arr[a+1][b-1].equals("---"))
	{
		int c=a;
		int d=b;
		while(arr[c+1][d-1].equals("---"))
		{
			c = c+1;
			d = d-1;

			if(arr[c+1][d-1].contains("BS")||arr[c+1][d-1].contains("Bs")||arr[c+1][d-1].contains("bS")||arr[c+1][d-1].contains("bs")||arr[c+1][d-1].contains("BM")||arr[c+1][d-1].contains("Bm")||arr[c+1][d-1].contains("bM")||arr[c+1][d-1].contains("bm"))
			{
						return 1;

			}
			
		}
	}
	if(arr[a+1][b+1].contains("BS")||arr[a+1][b+1].contains("Bs")||arr[a+1][b+1].contains("bS")||arr[a+1][b+1].contains("bs")||arr[a+1][b+1].contains("BM")||arr[a+1][b+1].contains("Bm")||arr[a+1][b+1].contains("bM")||arr[a+1][b+1].contains("bm"))
	{
		return 1;
	}
	if(arr[a+1][b+1].equals("---"))
	{
		int c=a;
		int d=b;
		while(arr[c+1][d+1].equals("---"))
		{
			
			c = c+1;
			d = d+1;
			if(arr[c+1][d+1].contains("BS")||arr[c+1][d+1].contains("Bs")||arr[c+1][d+1].contains("bS")||arr[c+1][d+1].contains("bs")||arr[c+1][d+1].contains("BM")||arr[c+1][d+1].contains("Bm")||arr[c+1][d+1].contains("bM")||arr[c+1][d+1].contains("bm"))
			{
				return 1;
			}
		}
	}

	if(arr[a-1][b].contains("BE")||arr[a-1][b].contains("Be")||arr[a-1][b].contains("bE")||arr[a-1][b].contains("be")||arr[a-1][b].contains("BM")||arr[a-1][b].contains("Bm")||arr[a-1][b].contains("bM")||arr[a-1][b].contains("bm"))
	{
		return 1;
	}
	if(arr[a-1][b].equals("---"))
	{
		int c=a;
		int d=b;
		while(arr[c-1][d].equals("---"))
		{
			
			c = c-1;
			d = d;
			if(arr[c-1][d].contains("BE")||arr[c-1][d].contains("Be")||arr[c-1][d].contains("bE")||arr[c-1][d].contains("be")||arr[c-1][d].contains("BM")||arr[c-1][d].contains("Bm")||arr[c-1][d].contains("bM")||arr[c-1][d].contains("bm"))
			{
						return 1;
			}
		}
	}
	if(arr[a+1][b].contains("BE")||arr[a+1][b].contains("Be")||arr[a+1][b].contains("bE")||arr[a+1][b].contains("be")||arr[a+1][b].contains("BM")||arr[a+1][b].contains("Bm")||arr[a+1][b].contains("bM")||arr[a+1][b].contains("bm"))
	{
		return 1;
	}
	if(arr[a+1][b].equals("---"))
	{
		int c=a;
		int d=b;
		while(arr[c+1][d].equals("---"))
		{
			
			c = c+1;
			d = d;
			if(arr[c+1][d].contains("BE")||arr[c+1][d].contains("Be")||arr[c+1][d].contains("bE")||arr[c+1][d].contains("be")||arr[c+1][d].contains("BM")||arr[c+1][d].contains("Bm")||arr[c+1][d].contains("bM")||arr[c+1][d].contains("bm"))
			{
						return 1;
			}
		}
	}
	if(arr[a][b+1].contains("BE")||arr[a][b+1].contains("Be")||arr[a][b+1].contains("bE")||arr[a][b+1].contains("be")||arr[a][b+1].contains("BM")||arr[a][b+1].contains("Bm")||arr[a][b+1].contains("bM")||arr[a][b+1].contains("bm"))
	{
		return 1;
	}
	if(arr[a][b+1].equals("---"))
	{
		int c=a;
		int d=b;
		while(arr[c][d+1].equals("---"))
		{
			
			c = c;
			d = d+1;
			if(arr[c][d+1].contains("BE")||arr[c][d+1].contains("Be")||arr[c][d+1].contains("bE")||arr[c][d+1].contains("be")||arr[c][d+1].contains("BM")||arr[c][d+1].contains("Bm")||arr[c][d+1].contains("bM")||arr[c][d+1].contains("bm"))
			{
						return 1;
			}
		}
	}
	if(arr[a][b-1].contains("BE")||arr[a][b-1].contains("Be")||arr[a][b-1].contains("bE")||arr[a][b-1].contains("be")||arr[a][b-1].contains("BM")||arr[a][b-1].contains("Bm")||arr[a][b-1].contains("bM")||arr[a][b-1].contains("bm"))
	{
		return 1;
	}
	if(arr[a][b-1].equals("---"))
	{
		int c=a;
		int d=b;
		while(arr[c][d-1].equals("---"))
		{
			
			c = c;
			d = d-1;
			if(arr[c][d-1].contains("BE")||arr[c][d-1].contains("Be")||arr[c][d-1].contains("bE")||arr[c][d-1].contains("be")||arr[c][d-1].contains("BM")||arr[c][d-1].contains("Bm")||arr[c][d-1].contains("bM")||arr[c][d-1].contains("bm"))
			{
		return 1;

			}
		}
	}
	
	if((b<7)&&(arr[a-1][b+2].contains("BH")||arr[a-1][b+2].contains("Bh")||arr[a-1][b+2].contains("bH")||arr[a-1][b+2].contains("bh")))
	{
		return 1;
	}
	if((b>2)&&(arr[a-1][b-2].contains("BH")||arr[a-1][b-2].contains("Bh")||arr[a-1][b-2].contains("bH")||arr[a-1][b-2].contains("bh")))
	{
		return 1;
	}
	if((a>2)&&(arr[a-2][b+1].contains("BH")||arr[a-2][b+1].contains("Bh")||arr[a-2][b+1].contains("bH")||arr[a-2][b+1].contains("bh")))
	{
		return 1;
	}
	if((a>2)&&(arr[a-2][b-1].contains("BH")||arr[a-2][b-1].contains("Bh")||arr[a-2][b-1].contains("bH")||arr[a-2][b-1].contains("bh")))
	{
		return 1;
	}
	if((b<7)&&(arr[a+1][b+2].contains("BH")||arr[a+1][b+2].contains("Bh")||arr[a+1][b+2].contains("bH")||arr[a+1][b+2].contains("bh")))
	{
		return 1;
	}
	if((b>2)&&(arr[a+1][b-2].contains("BH")||arr[a+1][b-2].contains("Bh")||arr[a+1][b-2].contains("bH")||arr[a+1][b-2].contains("bh")))
	{
		return 1;
	}
	if((a<7)&&(arr[a+2][b+1].contains("BH")||arr[a+2][b+1].contains("Bh")||arr[a+2][b+1].contains("bH")||arr[a+2][b+1].contains("bh")))
	{
		return 1;
	}
	if((a<7)&&(arr[a+2][b-1].contains("BH")||arr[a+2][b-1].contains("Bh")||arr[a+2][b-1].contains("bH")||arr[a+2][b-1].contains("bh")))
	{
		return 1;
	}

	return check;
}


boolean blackcheck()
{
	int ck=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(("bk ").equalsIgnoreCase(arr[i][j]))
			{
				ck = runb(i,j);
				i=arr.length;
				j=arr.length;	
			}
		}
	}
	if(ck==1)
	{	
		return true;
	}
	else
	{
		return false;
	}
}

int runb(int a,int b)
{
	int check =0;
	if(arr[a+1][b+1].contains("WP")||arr[a+1][b+1].contains("wP")||arr[a+1][b+1].contains("Wp")||arr[a+1][b+1].contains("wp")||arr[a+1][b-1].contains("WP")||arr[a+1][b-1].contains("wP")||arr[a+1][b-1].contains("Wp")||arr[a+1][b-1].contains("wp"))
	{
		return 1;
	}
	if(arr[a-1][b-1].contains("WS")||arr[a-1][b-1].contains("Ws")||arr[a-1][b-1].contains("wS")||arr[a-1][b-1].contains("ws")||arr[a-1][b-1].contains("WM")||arr[a-1][b-1].contains("Wm")||arr[a-1][b-1].contains("wM")||arr[a-1][b-1].contains("wm"))
	{
		return 1;
	}
	if(arr[a-1][b-1].equals("---"))
	{
		int c=a;
		int d=b;
		while(arr[c-1][d-1].equals("---"))
		{
			
			c = c-1;
			d = d-1;
			if(arr[c-1][d-1].contains("WS")||arr[c-1][d-1].contains("Ws")||arr[c-1][d-1].contains("wS")||arr[c-1][d-1].contains("ws")||arr[c-1][d-1].contains("WM")||arr[c-1][d-1].contains("Wm")||arr[c-1][d-1].contains("wM")||arr[c-1][d-1].contains("wm"))
			{
				return 1;
			}
		}
	}
	if(arr[a-1][b+1].contains("WS")||arr[a-1][b+1].contains("Ws")||arr[a-1][b+1].contains("wS")||arr[a-1][b+1].contains("ws")||arr[a-1][b+1].contains("WM")||arr[a-1][b+1].contains("Wm")||arr[a-1][b+1].contains("wM")||arr[a-1][b+1].contains("wm"))
	{
		return 1;
	}
	if(arr[a-1][b+1].equals("---"))
	{
		int c=a;
		int d=b;
		while(arr[c-1][d+1].equals("---"))
		{
			
			c = c-1;
			d = d+1;
			if(arr[c-1][d+1].contains("WS")||arr[c-1][d+1].contains("Ws")||arr[c-1][d+1].contains("wS")||arr[c-1][d+1].contains("ws")||arr[c-1][d+1].contains("WM")||arr[c-1][d+1].contains("Wm")||arr[c-1][d+1].contains("wM")||arr[c-1][d+1].contains("wm"))
			{
					return 1;
			}
		}
	}
	if(arr[a+1][b-1].contains("WS")||arr[a+1][b-1].contains("Ws")||arr[a+1][b-1].contains("wS")||arr[a+1][b-1].contains("ws")||arr[a+1][b-1].contains("WM")||arr[a+1][b-1].contains("Wm")||arr[a+1][b-1].contains("wM")||arr[a+1][b-1].contains("wm"))
	{
		return 1;
	}
	if(arr[a+1][b-1].equals("---"))
	{
		int c=a;
		int d=b;
		while(arr[c+1][d-1].equals("---"))
		{
			
			c = c+1;
			d = d-1;
			if(arr[c+1][d-1].contains("WS")||arr[c+1][d-1].contains("Ws")||arr[c+1][d-1].contains("wS")||arr[c+1][d-1].contains("ws")||arr[c+1][d-1].contains("WM")||arr[c+1][d-1].contains("Wm")||arr[c+1][d-1].contains("wM")||arr[c+1][d-1].contains("wm"))
			{
						return 1;
			}
		}
	}
	if(arr[a+1][b+1].contains("WS")||arr[a+1][b+1].contains("Ws")||arr[a+1][b+1].contains("wS")||arr[a+1][b+1].contains("ws")||arr[a+1][b+1].contains("WM")||arr[a+1][b+1].contains("Wm")||arr[a+1][b+1].contains("wM")||arr[a+1][b+1].contains("wm"))
	{
		return 1;
	}
	if(arr[a+1][b+1].equals("---"))
	{
		int c=a;
		int d=b;
		while(arr[c+1][d+1].equals("---"))
		{
			
			c = c+1;
			d = d+1;
			if(arr[c+1][d+1].contains("WS")||arr[c+1][d+1].contains("Ws")||arr[c+1][d+1].contains("wS")||arr[c+1][d+1].contains("ws")||arr[c+1][d+1].contains("WM")||arr[c+1][d+1].contains("Bm")||arr[c+1][d+1].contains("bM")||arr[c+1][d+1].contains("bm"))
			{
						return 1;
			}
		}
	}

	if(arr[a-1][b].contains("WE")||arr[a-1][b].contains("We")||arr[a-1][b].contains("wE")||arr[a-1][b].contains("we")||arr[a-1][b].contains("WM")||arr[a-1][b].contains("Wm")||arr[a-1][b].contains("wM")||arr[a-1][b].contains("wm"))
	{
		return 1;
	}
	if(arr[a-1][b].equals("---"))
	{
		int c=a;
		int d=b;
		while(arr[c-1][d].equals("---"))
		{
			
			c = c-1;
			d = d;
			if(arr[c-1][d].contains("WE")||arr[c-1][d].contains("We")||arr[c-1][d].contains("wE")||arr[c-1][d].contains("we")||arr[c-1][d].contains("WM")||arr[c-1][d].contains("Wm")||arr[c-1][d].contains("wM")||arr[c-1][d].contains("wm"))
			{
						return 1;
			}
		}
	}
	if(arr[a+1][b].contains("WE")||arr[a+1][b].contains("We")||arr[a+1][b].contains("wE")||arr[a+1][b].contains("we")||arr[a+1][b].contains("WM")||arr[a+1][b].contains("Wm")||arr[a+1][b].contains("wM")||arr[a+1][b].contains("wm"))
	{
		return 1;
	}
	if(arr[a+1][b].equals("---"))
	{
		int c=a;
		int d=b;
		while(arr[c+1][d].equals("---"))
		{
			
			c = c+1;
			d = d;
			if(arr[c+1][d].contains("WE")||arr[c+1][d].contains("We")||arr[c+1][d].contains("wE")||arr[c+1][d].contains("we")||arr[c+1][d].contains("WM")||arr[c+1][d].contains("Wm")||arr[c+1][d].contains("wM")||arr[c+1][d].contains("wm"))
			{
						return 1;

			}
		}
	}
	if(arr[a][b+1].contains("WE")||arr[a][b+1].contains("We")||arr[a][b+1].contains("wE")||arr[a][b+1].contains("we")||arr[a][b+1].contains("WM")||arr[a][b+1].contains("Wm")||arr[a][b+1].contains("wM")||arr[a][b+1].contains("wm"))
	{
		return 1;
	}
	if(arr[a][b+1].equals("---"))
	{
		int c=a;
		int d=b;
		while(arr[c][d+1].equals("---"))
		{
			
			c = c;
			d = d+1;
			if(arr[c][d+1].contains("WE")||arr[c][d+1].contains("We")||arr[c][d+1].contains("wE")||arr[c][d+1].contains("we")||arr[c][d+1].contains("WM")||arr[c][d+1].contains("Wm")||arr[c][d+1].contains("wM")||arr[c][d+1].contains("wm"))
			{
						return 1;

			}
		}
	}
	if(arr[a][b-1].contains("WE")||arr[a][b-1].contains("We")||arr[a][b-1].contains("wE")||arr[a][b-1].contains("we")||arr[a][b-1].contains("WM")||arr[a][b-1].contains("Wm")||arr[a][b-1].contains("wM")||arr[a][b-1].contains("wm"))
	{
		return 1;
	}
	if(arr[a][b-1].equals("---"))
	{
		int c=a;
		int d=b;
		while(arr[c][d-1].equals("---"))
		{
			
			c = c;
			d = d-1;
			if(arr[c][d-1].contains("WE")||arr[c][d-1].contains("We")||arr[c][d-1].contains("wE")||arr[c][d-1].contains("we")||arr[c][d-1].contains("WM")||arr[c][d-1].contains("Wm")||arr[c][d-1].contains("wM")||arr[c][d-1].contains("wm"))
			{
						return 1;

			}
		}
	}
	
	if((b<7)&&(arr[a-1][b+2].contains("WH")||arr[a-1][b+2].contains("Wh")||arr[a-1][b+2].contains("wH")||arr[a-1][b+2].contains("wh")))
	{
		return 1;
	}
	if((b>2)&&(arr[a-1][b-2].contains("WH")||arr[a-1][b-2].contains("Wh")||arr[a-1][b-2].contains("wH")||arr[a-1][b-2].contains("wh")))
	{
		return 1;
	}
	if((a>2)&&(arr[a-2][b+1].contains("WH")||arr[a-2][b+1].contains("Wh")||arr[a-2][b+1].contains("wH")||arr[a-2][b+1].contains("wh")))
	{
		return 1;
	}
	if((a>2)&&(arr[a-2][b-1].contains("WH")||arr[a-2][b-1].contains("Wh")||arr[a-2][b-1].contains("wH")||arr[a-2][b-1].contains("wh")))
	{
		return 1;
	}
	if((b<7)&&(arr[a+1][b+2].contains("WH")||arr[a+1][b+2].contains("Wh")||arr[a+1][b+2].contains("wH")||arr[a+1][b+2].contains("wh")))
	{
		return 1;
	}
	if((b>2)&&(arr[a+1][b-2].contains("WH")||arr[a+1][b-2].contains("Wh")||arr[a+1][b-2].contains("wH")||arr[a+1][b-2].contains("wh")))
	{
		return 1;
	}
	if((a<7)&&(arr[a+2][b+1].contains("WH")||arr[a+2][b+1].contains("Wh")||arr[a+2][b+1].contains("wH")||arr[a+2][b+1].contains("wh")))
	{
		return 1;
	}
	if((a<7)&&(arr[a+2][b-1].contains("WH")||arr[a+2][b-1].contains("Wh")||arr[a+2][b-1].contains("wH")||arr[a+2][b-1].contains("wh")))
	{
		return 1;
	}

	return check;
}
		/*check*/
		void whiteS()
		{
			System.out.print("It's white turn !");
			System.out.println(" Please select your piece to move");
			whiteF();
			
				while(whitecheck())
				{
					System.out.println("You can't move that step due to Check");
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							arr[i][j] = zrr[i][j];
						}
					}
					chessboard();
					System.out.println(" Please select your piece to move");
					whiteF();
				}
				
				for(int i=0;i<10;i++)
				{
					for(int j=0;j<10;j++)
					{
						zrr[i][j] = arr[i][j];
					}
				}
			
			chessboard();
			callingb();		
			if(blackcheck())
			{
				System.out.println("CHECK");
			}	
			blackS();
		}
		void blackS()
		{
			System.out.print("It's black turn !");
			System.out.println(" Please select your piece to move");
			blackF();
			
				while(blackcheck())
				{
					System.out.println("You can't move that step due to Check");
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							arr[i][j] = zrr[i][j];
						}
					}
					System.out.println(" Please select your piece to move");
					blackF();
				}
				
				for(int i=0;i<10;i++)
				{
					for(int j=0;j<10;j++)
					{
						zrr[i][j] = arr[i][j];
					}
				}
			
			chessboard();
			callingw();
			if(whitecheck())
			{
				System.out.println("CHECK");
			}
			whiteS();
		}
		
	public static void main(String [] args)
	{
		A ias = new A();
		System.out.print("\n		Welcome to chess board\n");
		ias.chessboard();
		System.out.print("Player 1 Enter your name :");
		String nameF = hi.nextLine();
		System.out.println("Enter your choice Black / White");
		ias.m1();
		System.out.println(nameF+"'s choice is "+note);

		System.out.print("Player 2 Enter your name :");
		hi.nextLine();
		String nameS = hi.nextLine();
		
		if(note.equalsIgnoreCase("BLACK"))
		{
			System.out.println(nameS+"'s choice is White");
			System.out.println(nameS+" Please select your piece to move");
			ias.whiteS();
		}
		else
		{
			System.out.println(nameS+"'s choice is Black");
			System.out.println(nameF+" Please select your piece to move");
			ias.whiteS();
		}
	
	}
	////
			String senaRO(int a,int b)
		{
			String g ="";
			
				if((arr[a-1][b+1].startsWith("b")||arr[a-1][b+1].startsWith("B"))&&!arr[a-1][b+1].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a-1)+(b+1);
				}
				if(arr[a-1][b+1].equals("---"))	
				{
					int c = a;
					int d = b;
					while(arr[c-1][d+1].equals("---"))
					{
						g = g+" "+(c-1)+(d+1);
						c=c-1;
						d=d+1;
					}
					if(arr[c-1][d+1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c-1][d+1].startsWith("b")||arr[c-1][d+1].startsWith("B"))
					{
						g = g+" "+(c-1)+(d+1);
					}
				}
				if((arr[a-1][b-1].startsWith("b")||arr[a-1][b-1].startsWith("B"))&&!arr[a-1][b-1].equalsIgnoreCase("BK "))
				{
					g = g+" "+(a-1)+(b-1);
				}
				if(arr[a-1][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c-1][d-1].equals("---"))
					{
						g = g+" "+(c-1)+(d-1);
						c=c-1;
						d=d-1;
					}
					if(arr[c-1][d-1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c-1][d-1].startsWith("b")||arr[c-1][d-1].startsWith("B"))
					{
						g = g+" "+(c-1)+(d-1);
					}
				}
				if((arr[a+1][b+1].startsWith("b")||arr[a+1][b+1].startsWith("B"))&&!arr[a+1][b+1].equalsIgnoreCase("BK "))
				{
					g = g+" "+(a+1)+(b+1);
				}
				if(arr[a+1][b+1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d+1].equals("---"))
					{
						g = g+" "+(c+1)+(d+1);
						c=c+1;
						d=d+1;
					}
					if(arr[c+1][d+1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c+1][d+1].startsWith("b")||arr[c+1][d+1].startsWith("B"))
					{
						g = g+" "+(c+1)+(d+1);
					}
				}
				if((arr[a+1][b-1].startsWith("b")||arr[a+1][b-1].startsWith("B"))&&!arr[a+1][b-1].equalsIgnoreCase("BK "))
				{
					g = g+" "+(a+1)+(b-1);
				}
				if(arr[a+1][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d-1].equals("---"))
					{
						g = g+" "+(c+1)+(d-1);
						c=c+1;
						d=d-1;
					}
					if(arr[c+1][d-1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c+1][d-1].startsWith("b")||arr[c+1][d-1].startsWith("B"))
					{
						g = g+" "+(c+1)+(d-1);
					}
				}	
			
			return g;
		}
		
		String elephRO(int a,int b)
		{
			String g ="";
			
				if((arr[a-1][b].startsWith("b")||arr[a-1][b].startsWith("B"))&&!arr[a-1][b].equalsIgnoreCase("BK "))
				{
					g = g+" "+(a-1)+(b);
				}
				if(arr[a-1][b].equals("---"))	
				{
					int c = a;
					int d = b;
					while(arr[c-1][d].equals("---"))
					{
						g = g+" "+(c-1)+(d);
						c=c-1;
						d=d;
					}
					if(arr[c-1][d].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c-1][d].startsWith("b")||arr[c-1][d].startsWith("B"))
					{
						g = g+" "+(c-1)+(d);
					}
				}
				if((arr[a+1][b].startsWith("b")||arr[a+1][b].startsWith("B"))&&!arr[a+1][b].equalsIgnoreCase("BK "))
				{
					g = g+" "+(a+1)+(b);
				}
				if(arr[a+1][b].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d].equals("---"))
					{
						g = g+" "+(c+1)+(d);
						c=c+1;
						d=d;
					}
					if(arr[c+1][d].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c+1][d].startsWith("b")||arr[c+1][d].startsWith("B"))
					{
						g = g+" "+(c+1)+(d);
					}
				}
				if((arr[a][b+1].startsWith("b")||arr[a][b+1].startsWith("B"))&&!arr[a][b+1].equalsIgnoreCase("BK "))
				{
					g = g+" "+(a)+(b+1);
				}
				if(arr[a][b+1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c][d+1].equals("---"))
					{
						g = g+" "+(c)+(d+1);
						c=c;
						d=d+1;
					}
					if(arr[c][d+1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c][d+1].startsWith("b")||arr[c][d+1].startsWith("B"))
					{
						g = g+" "+(c)+(d+1);
					}
				}
				if((arr[a][b-1].startsWith("b")||arr[a][b-1].startsWith("B"))&&!arr[a][b-1].equalsIgnoreCase("BK "))
				{
					g = g+" "+(a)+(b-1);
				}
				if(arr[a][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c][d-1].equals("---"))
					{
						g = g+" "+(c)+(d-1);
						c=c;
						d=d-1;
					}
					if(arr[c][d-1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c][d-1].startsWith("b")||arr[c][d-1].startsWith("B"))
					{
						g = g+" "+(c)+(d-1);
					}
				}	
			
			return g;
		}

		String mantriRO(int a,int b)
		{
			String g ="";
			
				if((arr[a-1][b+1].startsWith("b")||arr[a-1][b+1].startsWith("B"))&&!arr[a-1][b+1].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a-1)+(b+1);
				}
				if(arr[a-1][b+1].equals("---"))	
				{
					int c = a;
					int d = b;
					while(arr[c-1][d+1].equals("---"))
					{
						g = g+" "+(c-1)+(d+1);
						c=c-1;
						d=d+1;
					}
					if(arr[c-1][d+1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c-1][d+1].startsWith("b")||arr[c-1][d+1].startsWith("B"))
					{
						g = g+" "+(c-1)+(d+1);
					}
				}
				if((arr[a-1][b-1].startsWith("b")||arr[a-1][b-1].startsWith("B"))&&!arr[a-1][b-1].equalsIgnoreCase("BK "))
				{
					g = g+" "+(a-1)+(b-1);
				}
				if(arr[a-1][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c-1][d-1].equals("---"))
					{
						g = g+" "+(c-1)+(d-1);
						c=c-1;
						d=d-1;
					}
					if(arr[c-1][d-1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c-1][d-1].startsWith("b")||arr[c-1][d-1].startsWith("B"))
					{
						g = g+" "+(c-1)+(d-1);
					}
				}
				if((arr[a+1][b+1].startsWith("b")||arr[a+1][b+1].startsWith("B"))&&!arr[a+1][b+1].equalsIgnoreCase("BK "))
				{
					g = g+" "+(a+1)+(b+1);
				}
				if(arr[a+1][b+1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d+1].equals("---"))
					{
						g = g+" "+(c+1)+(d+1);
						c=c+1;
						d=d+1;
					}
					if(arr[c+1][d+1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c+1][d+1].startsWith("b")||arr[c+1][d+1].startsWith("B"))
					{
						g = g+" "+(c+1)+(d+1);
					}
				}
				if((arr[a+1][b-1].startsWith("b")||arr[a+1][b-1].startsWith("B"))&&!arr[a+1][b-1].equalsIgnoreCase("BK "))
				{
					g = g+" "+(a+1)+(b-1);
				}
				if(arr[a+1][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d-1].equals("---"))
					{
						g = g+" "+(c+1)+(d-1);
						c=c+1;
						d=d-1;
					}
					if(arr[c+1][d-1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c+1][d-1].startsWith("b")||arr[c+1][d-1].startsWith("B"))
					{
						g = g+" "+(c+1)+(d-1);
					}
				}

				if((arr[a-1][b].startsWith("b")||arr[a-1][b].startsWith("B"))&&!arr[a-1][b].equalsIgnoreCase("BK "))
				{
					g = g+" "+(a-1)+(b);
				}
				if(arr[a-1][b].equals("---"))	
				{
					int c = a;
					int d = b;
					while(arr[c-1][d].equals("---"))
					{
						g = g+" "+(c-1)+(d);
						c=c-1;
						d=d;
					}
					if(arr[c-1][d].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c-1][d].startsWith("b")||arr[c-1][d].startsWith("B"))
					{
						g = g+" "+(c-1)+(d);
					}
				}
				if((arr[a+1][b].startsWith("b")||arr[a+1][b].startsWith("B"))&&!arr[a+1][b].equalsIgnoreCase("BK "))
				{
					g = g+" "+(a+1)+(b);
				}
				if(arr[a+1][b].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d].equals("---"))
					{
						g = g+" "+(c+1)+(d);
						c=c+1;
						d=d;
					}
					if(arr[c+1][d].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c+1][d].startsWith("b")||arr[c+1][d].startsWith("b"))
					{
						g = g+" "+(c+1)+(d);
					}
				}
				if((arr[a][b+1].startsWith("b")||arr[a][b+1].startsWith("b"))&&!arr[a][b+1].equalsIgnoreCase("BK "))
				{
					g = g+" "+(a)+(b+1);
				}
				if(arr[a][b+1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c][d+1].equals("---"))
					{
						g = g+" "+(c)+(d+1);
						c=c;
						d=d+1;
					}
					if(arr[c][d+1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c][d+1].startsWith("b")||arr[c][d+1].startsWith("B"))
					{
						g = g+" "+(c)+(d+1);
					}
				}
				if((arr[a][b-1].startsWith("b")||arr[a][b-1].startsWith("B"))&&!arr[a][b-1].equalsIgnoreCase("BK "))
				{
					System.out.print(" || "+(a)+(b-1));
					g = g+" "+(a)+(b-1);
				}
				if(arr[a][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c][d-1].equals("---"))
					{
						g = g+" "+(c)+(d-1);
						c=c;
						d=d-1;
					}
					if(arr[c][d-1].equalsIgnoreCase("BK "))
					{
						
					}
					else if(arr[c][d-1].startsWith("b")||arr[c][d-1].startsWith("B"))
					{
						g = g+" "+(c)+(d-1);
					}
				}	
			return g;
		}
		
		String horseRO(int a,int b)
		{
			String g ="";

			if((a>2)&&(arr[a-2][b+1].startsWith("b")||arr[a-2][b+1].startsWith("B"))&&!arr[a-2][b+1].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a-2)+(b+1);
				}
			if((a>2)&&arr[a-2][b+1].equals("---"))
				{
					g = g+" "+(a-2)+(b+1);
				}
			if((a>2)&&(arr[a-2][b-1].startsWith("b")||arr[a-2][b-1].startsWith("B"))&&!arr[a-2][b-1].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a-2)+(b-1);
				}
			if((a>2)&&arr[a-2][b-1].equals("---"))
				{
					g = g+" "+(a-2)+(b-1);
				}
			if((b<7)&&(arr[a-1][b+2].startsWith("b")||arr[a-1][b+2].startsWith("B"))&&!arr[a-1][b+2].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a-1)+(b+2);
				}
			if((b<7)&&arr[a-1][b+2].equals("---"))
				{
					g = g+" "+(a-1)+(b+2);
				}
			if((b>2)&&(arr[a-1][b-2].startsWith("b")||arr[a-1][b-2].startsWith("B"))&&!arr[a-1][b-2].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a-1)+(b-2);
				}
			if((b>2)&&arr[a-1][b-2].equals("---"))
				{
					g = g+" "+(a-1)+(b-2);
				}
			if((b<7)&&(arr[a+1][b+2].startsWith("b")||arr[a+1][b+2].startsWith("B"))&&!arr[a+1][b+2].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a+1)+(b+2);
				}
			if((b<7)&&arr[a+1][b+2].equals("---"))
				{
					g = g+" "+(a+1)+(b+2);
				}
			if((b>2)&&(arr[a+1][b-2].startsWith("b")||arr[a+1][b-2].startsWith("B"))&&!arr[a+1][b-2].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a+1)+(b-2);
				}
			if((b>2)&&arr[a+1][b-2].equals("---"))
				{
					g = g+" "+(a+1)+(b-2);
				}
			if((a<7)&&(arr[a+2][b+1].startsWith("b")||arr[a+2][b+1].startsWith("B"))&&!arr[a+2][b+1].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a+2)+(b+1);
				}
			if((a<7)&&arr[a+2][b+1].equals("---"))
				{
					g = g+" "+(a+2)+(b+1);
				}
			if((a<7)&&(arr[a+2][b-1].startsWith("b")||arr[a+2][b-1].startsWith("B"))&&!arr[a+2][b-1].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a+2)+(b-1);
				}
			if((a<7)&&arr[a+2][b-1].equals("---"))
				{
					g = g+" "+(a+2)+(b-1);
				}

			return g;
		}
		String kingRO(int a,int b)
		{
			String g ="";
			if((arr[a-1][b+1].startsWith("b")||arr[a-1][b+1].startsWith("B"))&&!arr[a-1][b+1].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a-1)+(b+1);
				}
			if(arr[a-1][b+1].equals("---"))
				{
					g = g+" "+(a-1)+(b+1);
				}
			if((arr[a-1][b-1].startsWith("b")||arr[a-1][b-1].startsWith("B"))&&!arr[a-1][b-1].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a-1)+(b-1);
				}
			if(arr[a-1][b-1].equals("---"))
				{
					g = g+" "+(a-1)+(b-1);
				}
			if((arr[a-1][b].startsWith("b")||arr[a-1][b].startsWith("B"))&&!arr[a-1][b].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a-1)+(b);
				}
			if(arr[a-1][b].equals("---"))
				{
					g = g+" "+(a-1)+(b);
				}
			if((arr[a][b-1].startsWith("b")||arr[a][b-1].startsWith("B"))&&!arr[a][b-1].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a)+(b-1);
				}
			if(arr[a][b-1].equals("---"))
				{
					g = g+" "+(a)+(b-1);
				}
			if((arr[a][b+1].startsWith("b")||arr[a][b+1].startsWith("B"))&&!arr[a][b+1].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a)+(b+1);
				}
			if(arr[a][b+1].equals("---"))
				{
					g = g+" "+(a)+(b+1);
				}
			if((arr[a+1][b-1].startsWith("b")||arr[a+1][b-1].startsWith("B"))&&!arr[a+1][b-1].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a+1)+(b-1);
				}
			if(arr[a+1][b-1].equals("---"))
				{
					g = g+" "+(a+1)+(b-1);
				}
			if((arr[a+1][b].startsWith("b")||arr[a+1][b].startsWith("B"))&&!arr[a+1][b].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a+1)+(b);
				}
			if(arr[a+1][b].equals("---"))
				{
					g = g+" "+(a+1)+(b);
				}
			if((arr[a+1][b+1].startsWith("b")||arr[a+1][b+1].startsWith("B"))&&!arr[a+1][b+1].equalsIgnoreCase("BK "))
				{	
					g = g+" "+(a+1)+(b+1);
				}
			if(arr[a+1][b+1].equals("---"))
				{
					g = g+" "+(a+1)+(b+1);
				}
			return g;
		}

		String pawnRO(int a,int b)
		{
			String g ="";

			if((a==7)&&(arr[a-2][b].equals("---") || arr[a-1][b].equals("---") || arr[a-1][b-1].startsWith("B") || arr[a-1][b-1].startsWith("b") || arr[a-1][b+1].startsWith("B") || arr[a-1][b+1].startsWith("b")))
			{
				if(arr[a-2][b].equals("---"))
				{
						g=g+(a-2)+b;
				}
				if(arr[a-1][b].equals("---"))
				{
						g=g+" "+(a-1)+b;
				}
				if((arr[a-1][b-1].startsWith("B") || arr[a-1][b-1].startsWith("b"))&&(!arr[a-1][b-1].equalsIgnoreCase("BK ")))
				{
						g=g+" "+(a-1)+(b-1);
				}
				if((arr[a-1][b+1].startsWith("B") || arr[a-1][b+1].startsWith("b"))&&(!arr[a-1][b+1].equalsIgnoreCase("BK ")))
				{
						g=g+" "+(a-1)+(b+1);
				}
			}
			else if(arr[a-1][b].equals("---") || arr[a-1][b-1].startsWith("B") || arr[a-1][b-1].startsWith("b") || arr[a-1][b+1].startsWith("B") || arr[a-1][b+1].startsWith("b"))
			{
				if(arr[a-1][b].equals("---"))
				{
						g=g+(a-1)+b;
				}
				if((arr[a-1][b-1].startsWith("B") || arr[a-1][b-1].startsWith("b"))&&(!arr[a-1][b-1].equalsIgnoreCase("BK ")))
				{
						g=g+" "+(a-1)+(b-1);
				}
				if((arr[a-1][b+1].startsWith("B") || arr[a-1][b+1].startsWith("b"))&&(!arr[a-1][b+1].equalsIgnoreCase("BK ")))
				{
						g=g+" "+(a-1)+(b+1);
				}
			}
			return g;
		}


		String pawnRBO(int a,int b)
		{
			String g ="";
			
			if((a==2)&&(arr[a+2][b].equals("---") || arr[a+1][b].equals("---") || arr[a+1][b-1].startsWith("W") || arr[a+1][b-1].startsWith("w") || arr[a+1][b+1].startsWith("W") || arr[a+1][b+1].startsWith("w")))
			{
				if(arr[a+2][b].equals("---"))
				{
						g=g+(a+2)+b;
				}
				if(arr[a+1][b].equals("---"))
				{
						g=g+" "+(a+1)+b;
				}
				if((arr[a+1][b-1].startsWith("W") || arr[a+1][b-1].startsWith("w"))&&(!arr[a+1][b-1].equalsIgnoreCase("BK ")))
				{
						g=g+" "+(a+1)+(b-1);
				}
				if((arr[a+1][b+1].startsWith("W") || arr[a+1][b+1].startsWith("w"))&&(!arr[a+1][b+1].equalsIgnoreCase("BK ")))
				{
						g=g+" "+(a+1)+(b+1);
				}
			}
			else if(arr[a+1][b].equals("---") || arr[a+1][b-1].startsWith("W") || arr[a+1][b-1].startsWith("w") || arr[a+1][b+1].startsWith("W") || arr[a+1][b+1].startsWith("w"))
			{
				if(arr[a+1][b].equals("---"))
				{
						g=g+(a+1)+b;
				}
				if((arr[a+1][b-1].startsWith("W") || arr[a+1][b-1].startsWith("w"))&&(!arr[a+1][b-1].equalsIgnoreCase("WK ")))
				{
						g=g+" "+(a+1)+(b-1);
				}
				if((arr[a+1][b+1].startsWith("W") || arr[a+1][b+1].startsWith("w"))&&(!arr[a+1][b+1].equalsIgnoreCase("WK ")))
				{
						g=g+" "+(a+1)+(b+1);
				}
			}
			return g;
		}
		String senaRBO(int a,int b)
		{
			String g ="";
			
			
				if((arr[a-1][b+1].startsWith("w")||arr[a-1][b+1].startsWith("W"))&&!arr[a-1][b+1].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a-1)+(b+1);
				}
				if(arr[a-1][b+1].equals("---"))	
				{
					int c = a;
					int d = b;
					while(arr[c-1][d+1].equals("---"))
					{
						g = g+" "+(c-1)+(d+1);
						c=c-1;
						d=d+1;
					}
					if(arr[c-1][d+1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c-1][d+1].startsWith("w")||arr[c-1][d+1].startsWith("W"))
					{
						g = g+" "+(c-1)+(d+1);
					}
				}
				if((arr[a-1][b-1].startsWith("w")||arr[a-1][b-1].startsWith("W"))&&!arr[a-1][b-1].equalsIgnoreCase("WK "))
				{
					g = g+" "+(a-1)+(b-1);
				}
				if(arr[a-1][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c-1][d-1].equals("---"))
					{
						g = g+" "+(c-1)+(d-1);
						c=c-1;
						d=d-1;
					}
					if(arr[c-1][d-1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c-1][d-1].startsWith("w")||arr[c-1][d-1].startsWith("W"))
					{
						g = g+" "+(c-1)+(d-1);
					}
				}
				if((arr[a+1][b+1].startsWith("w")||arr[a+1][b+1].startsWith("W"))&&!arr[a+1][b+1].equalsIgnoreCase("WK "))
				{
					g = g+" "+(a+1)+(b+1);
				}
				if(arr[a+1][b+1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d+1].equals("---"))
					{
						g = g+" "+(c+1)+(d+1);
						c=c+1;
						d=d+1;
					}
					if(arr[c+1][d+1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c+1][d+1].startsWith("w")||arr[c+1][d+1].startsWith("W"))
					{
						g = g+" "+(c+1)+(d+1);
					}
				}
				if((arr[a+1][b-1].startsWith("w")||arr[a+1][b-1].startsWith("W"))&&!arr[a+1][b-1].equalsIgnoreCase("WK "))
				{
					g = g+" "+(a+1)+(b-1);
				}
				if(arr[a+1][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d-1].equals("---"))
					{
						g = g+" "+(c+1)+(d-1);
						c=c+1;
						d=d-1;
					}
					if(arr[c+1][d-1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c+1][d-1].startsWith("w")||arr[c+1][d-1].startsWith("W"))
					{
						g = g+" "+(c+1)+(d-1);
					}
				}	
			
			return g;
		}
		String elephRBO(int a,int b)
		{
			String g ="";
			
				if((arr[a-1][b].startsWith("w")||arr[a-1][b].startsWith("W"))&&!arr[a-1][b].equalsIgnoreCase("WK "))
				{
					g = g+" "+(a-1)+(b);
				}
				if(arr[a-1][b].equals("---"))	
				{
					int c = a;
					int d = b;
					while(arr[c-1][d].equals("---"))
					{
						g = g+" "+(c-1)+(d);
						c=c-1;
						d=d;
					}
					if(arr[c-1][d].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c-1][d].startsWith("w")||arr[c-1][d].startsWith("W"))
					{
						g = g+" "+(c-1)+(d);
					}
				}
				if((arr[a+1][b].startsWith("w")||arr[a+1][b].startsWith("W"))&&!arr[a+1][b].equalsIgnoreCase("WK "))
				{
					g = g+" "+(a+1)+(b);
				}
				if(arr[a+1][b].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d].equals("---"))
					{
						g = g+" "+(c+1)+(d);
						c=c+1;
						d=d;
					}
					if(arr[c+1][d].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c+1][d].startsWith("w")||arr[c+1][d].startsWith("W"))
					{
						g = g+" "+(c+1)+(d);
					}
				}
				if((arr[a][b+1].startsWith("w")||arr[a][b+1].startsWith("W"))&&!arr[a][b+1].equalsIgnoreCase("WK "))
				{
					g = g+" "+(a)+(b+1);
				}
				if(arr[a][b+1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c][d+1].equals("---"))
					{
						g = g+" "+(c)+(d+1);
						c=c;
						d=d+1;
					}
					if(arr[c][d+1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c][d+1].startsWith("w")||arr[c][d+1].startsWith("W"))
					{
						g = g+" "+(c)+(d+1);
					}
				}
				if((arr[a][b-1].startsWith("w")||arr[a][b-1].startsWith("W"))&&!arr[a][b-1].equalsIgnoreCase("WK "))
				{
					g = g+" "+(a)+(b-1);
				}
				if(arr[a][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c][d-1].equals("---"))
					{
						g = g+" "+(c)+(d-1);
						c=c;
						d=d-1;
					}
					if(arr[c][d-1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c][d-1].startsWith("w")||arr[c][d-1].startsWith("W"))
					{
						g = g+" "+(c)+(d-1);
					}
				}
			return g;
		}
		String mantriRBO(int a,int b)
		{
			String g ="";
			
				if((arr[a-1][b+1].startsWith("w")||arr[a-1][b+1].startsWith("W"))&&!arr[a-1][b+1].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a-1)+(b+1);
				}
				if(arr[a-1][b+1].equals("---"))	
				{
					int c = a;
					int d = b;
					while(arr[c-1][d+1].equals("---"))
					{
						g = g+" "+(c-1)+(d+1);
						c=c-1;
						d=d+1;
					}
					if(arr[c-1][d+1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c-1][d+1].startsWith("w")||arr[c-1][d+1].startsWith("W"))
					{
						g = g+" "+(c-1)+(d+1);
					}
				}
				if((arr[a-1][b-1].startsWith("w")||arr[a-1][b-1].startsWith("W"))&&!arr[a-1][b-1].equalsIgnoreCase("WK "))
				{
					g = g+" "+(a-1)+(b-1);
				}
				if(arr[a-1][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c-1][d-1].equals("---"))
					{
						g = g+" "+(c-1)+(d-1);
						c=c-1;
						d=d-1;
					}
					if(arr[c-1][d-1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c-1][d-1].startsWith("w")||arr[c-1][d-1].startsWith("W"))
					{
						g = g+" "+(c-1)+(d-1);
					}
				}
				if((arr[a+1][b+1].startsWith("w")||arr[a+1][b+1].startsWith("W"))&&!arr[a+1][b+1].equalsIgnoreCase("WK "))
				{
					g = g+" "+(a+1)+(b+1);
				}
				if(arr[a+1][b+1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d+1].equals("---"))
					{
						g = g+" "+(c+1)+(d+1);
						c=c+1;
						d=d+1;
					}
					if(arr[c+1][d+1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c+1][d+1].startsWith("w")||arr[c+1][d+1].startsWith("W"))
					{
						g = g+" "+(c+1)+(d+1);
					}
				}
				if((arr[a+1][b-1].startsWith("w")||arr[a+1][b-1].startsWith("W"))&&!arr[a+1][b-1].equalsIgnoreCase("WK "))
				{
					g = g+" "+(a+1)+(b-1);
				}
				if(arr[a+1][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d-1].equals("---"))
					{
						g = g+" "+(c+1)+(d-1);
						c=c+1;
						d=d-1;
					}
					if(arr[c+1][d-1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c+1][d-1].startsWith("w")||arr[c+1][d-1].startsWith("W"))
					{
						g = g+" "+(c+1)+(d-1);
					}
				}

				if((arr[a-1][b].startsWith("w")||arr[a-1][b].startsWith("W"))&&!arr[a-1][b].equalsIgnoreCase("WK "))
				{
					g = g+" "+(a-1)+(b);
				}
				if(arr[a-1][b].equals("---"))	
				{
					int c = a;
					int d = b;
					while(arr[c-1][d].equals("---"))
					{
						g = g+" "+(c-1)+(d);
						c=c-1;
						d=d;
					}
					if(arr[c-1][d].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c-1][d].startsWith("w")||arr[c-1][d].startsWith("W"))
					{
						g = g+" "+(c-1)+(d);
					}
				}
				if((arr[a+1][b].startsWith("w")||arr[a+1][b].startsWith("W"))&&!arr[a+1][b].equalsIgnoreCase("WK "))
				{
					g = g+" "+(a+1)+(b);
				}
				if(arr[a+1][b].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c+1][d].equals("---"))
					{
						g = g+" "+(c+1)+(d);
						c=c+1;
						d=d;
					}
					if(arr[c+1][d].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c+1][d].startsWith("w")||arr[c+1][d].startsWith("W"))
					{
						g = g+" "+(c+1)+(d);
					}
				}
				if((arr[a][b+1].startsWith("w")||arr[a][b+1].startsWith("W"))&&!arr[a][b+1].equalsIgnoreCase("WK "))
				{
					g = g+" "+(a)+(b+1);
				}
				if(arr[a][b+1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c][d+1].equals("---"))
					{
						g = g+" "+(c)+(d+1);
						c=c;
						d=d+1;
					}
					if(arr[c][d+1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c][d+1].startsWith("w")||arr[c][d+1].startsWith("W"))
					{
						g = g+" "+(c)+(d+1);
					}
				}
				if((arr[a][b-1].startsWith("w")||arr[a][b-1].startsWith("W"))&&!arr[a][b-1].equalsIgnoreCase("WK "))
				{
					g = g+" "+(a)+(b-1);
				}
				if(arr[a][b-1].equals("---"))
				{
					int c = a;
					int d = b;
					while(arr[c][d-1].equals("---"))
					{
						g = g+" "+(c)+(d-1);
						c=c;
						d=d-1;
					}
					if(arr[c][d-1].equalsIgnoreCase("WK "))
					{
						
					}
					else if(arr[c][d-1].startsWith("w")||arr[c][d-1].startsWith("W"))
					{
						g = g+" "+(c)+(d-1);
					}
				}
			return g;
		}
		String horseRBO(int a,int b)
		{
			String g ="";
			if((a>2)&&(arr[a-2][b+1].startsWith("w")||arr[a-2][b+1].startsWith("W"))&&!arr[a-2][b+1].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a-2)+(b+1);
				}
			if((a>2)&&arr[a-2][b+1].equals("---"))
				{
					g = g+" "+(a-2)+(b+1);
				}
			if((a>2)&&(arr[a-2][b-1].startsWith("w")||arr[a-2][b-1].startsWith("W"))&&!arr[a-2][b-1].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a-2)+(b-1);
				}
			if((a>2)&&arr[a-2][b-1].equals("---"))
				{
					g = g+" "+(a-2)+(b-1);
				}
			if((b<7)&&(arr[a-1][b+2].startsWith("w")||arr[a-1][b+2].startsWith("W"))&&!arr[a-1][b+2].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a-1)+(b+2);
				}
			if((b<7)&&arr[a-1][b+2].equals("---"))
				{
					g = g+" "+(a-1)+(b+2);
				}
			if((b>2)&&(arr[a-1][b-2].startsWith("w")||arr[a-1][b-2].startsWith("W"))&&!arr[a-1][b-2].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a-1)+(b-2);
				}
			if((b>2)&&arr[a-1][b-2].equals("---"))
				{
					g = g+" "+(a-1)+(b-2);
				}
			if((b<7)&&(arr[a+1][b+2].startsWith("w")||arr[a+1][b+2].startsWith("W"))&&!arr[a+1][b+2].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a+1)+(b+2);
				}
			if((b<7)&&arr[a+1][b+2].equals("---"))
				{
					g = g+" "+(a+1)+(b+2);
				}
			if((b>2)&&(arr[a+1][b-2].startsWith("w")||arr[a+1][b-2].startsWith("W"))&&!arr[a+1][b-2].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a+1)+(b-2);
				}
			if((b>2)&&arr[a+1][b-2].equals("---"))
				{
					g = g+" "+(a+1)+(b-2);
				}
			if((a<7)&&(arr[a+2][b+1].startsWith("w")||arr[a+2][b+1].startsWith("W"))&&!arr[a+2][b+1].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a+2)+(b+1);
				}
			if((a<7)&&arr[a+2][b+1].equals("---"))
				{
					g = g+" "+(a+2)+(b+1);
				}
			if((a<7)&&(arr[a+2][b-1].startsWith("w")||arr[a+2][b-1].startsWith("W"))&&!arr[a+2][b-1].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a+2)+(b-1);
				}
			if((a<7)&&arr[a+2][b-1].equals("---"))
				{
					g = g+" "+(a+2)+(b-1);
				}

			return g;
		}
		String kingRBO(int a,int b)
		{
			String g ="";
			if((arr[a-1][b+1].startsWith("w")||arr[a-1][b+1].startsWith("W"))&&!arr[a-1][b+1].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a-1)+(b+1);
				}
			if(arr[a-1][b+1].equals("---"))
				{
					g = g+" "+(a-1)+(b+1);
				}
			if((arr[a-1][b-1].startsWith("w")||arr[a-1][b-1].startsWith("W"))&&!arr[a-1][b-1].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a-1)+(b-1);
				}
			if(arr[a-1][b-1].equals("---"))
				{
					g = g+" "+(a-1)+(b-1);
				}
			if((arr[a-1][b].startsWith("w")||arr[a-1][b].startsWith("W"))&&!arr[a-1][b].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a-1)+(b);
				}
			if(arr[a-1][b].equals("---"))
				{
					g = g+" "+(a-1)+(b);
				}
			if((arr[a][b-1].startsWith("w")||arr[a][b-1].startsWith("W"))&&!arr[a][b-1].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a)+(b-1);
				}
			if(arr[a][b-1].equals("---"))
				{
					g = g+" "+(a)+(b-1);
				}
			if((arr[a][b+1].startsWith("w")||arr[a][b+1].startsWith("W"))&&!arr[a][b+1].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a)+(b+1);
				}
			if(arr[a][b+1].equals("---"))
				{
					g = g+" "+(a)+(b+1);
				}
			if((arr[a+1][b-1].startsWith("w")||arr[a+1][b-1].startsWith("W"))&&!arr[a+1][b-1].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a+1)+(b-1);
				}
			if(arr[a+1][b-1].equals("---"))
				{
					g = g+" "+(a+1)+(b-1);
				}
			if((arr[a+1][b].startsWith("w")||arr[a+1][b].startsWith("W"))&&!arr[a+1][b].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a+1)+(b);
				}
			if(arr[a+1][b].equals("---"))
				{
					g = g+" "+(a+1)+(b);
				}
			if((arr[a+1][b+1].startsWith("w")||arr[a+1][b+1].startsWith("W"))&&!arr[a+1][b+1].equalsIgnoreCase("WK "))
				{	
					g = g+" "+(a+1)+(b+1);
				}
			if(arr[a+1][b+1].equals("---"))
				{
					g = g+" "+(a+1)+(b+1);
				}
			return g;
		}

		int choiceRW(String a,int b,int c)
		{
			int sad = 0;
			a=a.trim();
			String hiarr[] = a.split(" ");
			for(int k=0;k<hiarr.length;k++)
			{
				String pq = hiarr[k];
					arr[(pq.charAt(0)-48)][(pq.charAt(1)-48)] = arr[(pq.charAt(0)-48)][(pq.charAt(1)-48)].replace(arr[(pq.charAt(0)-48)][(pq.charAt(1)-48)],arr[b][c]);
					arr[b][c] = arr[b][c].replace(arr[b][c],"---");
				if(whitecheck())
				{
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							arr[i][j] = yrr[i][j];
						}
					}
				}
				else
				{
					sad++;
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							arr[i][j] = yrr[i][j];
						}
					}
					break;
				}
			}
			if(sad>0)
			{
				return 2;
			}	
			else
			{
				return 0;
			}
		}

		void callingw()
		{
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<10;j++)
				{
					yrr[i][j] = arr[i][j];
				}
			}

			int gv = 0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(arr[i][j].startsWith("W")||arr[i][j].startsWith("w"))
					{
						if(arr[i][j].contains("P")||arr[i][j].contains("p"))
						{
							String hip1 = pawnRO(i,j);
							if(!hip1.isEmpty())
							{
								gv = choiceRW(hip1,i,j);
							}
							if(gv==2)
							{
								i=arr.length;
								j=arr.length;
								break;
							}
						}
						else if(arr[i][j].contains("S")||arr[i][j].contains("s"))
						{
							String hip2 = senaRO(i,j);
							if(!hip2.isEmpty())
							{
								gv = choiceRW(hip2,i,j);
							}
							if(gv==2)
							{
								i=arr.length;
								j=arr.length;
								break;
							}
						}
						else if(arr[i][j].contains("H")||arr[i][j].contains("h"))
						{
							String hip3 = horseRO(i,j);
							if(!hip3.isEmpty())
							{
								gv = choiceRW(hip3,i,j);
							}
							if(gv==2)
							{
								i=arr.length;
								j=arr.length;
								break;
							}
						}
						else if(arr[i][j].contains("M")||arr[i][j].contains("m"))
						{
							String hip4 = mantriRO(i,j);
							if(!hip4.isEmpty())
							{
								gv = choiceRW(hip4,i,j);
							}
							if(gv==2)
							{
								i=arr.length;
								j=arr.length;
								break;
							}
						}
						else if(arr[i][j].contains("E")||arr[i][j].contains("e"))
						{
							String hip5 = elephRO(i,j);
							if(!hip5.isEmpty())
							{
								gv = choiceRW(hip5,i,j);
							}
							if(gv==2)
							{
								i=arr.length;
								j=arr.length;
								break;
							}
						}
						else if(arr[i][j].contains("K")||arr[i][j].contains("k"))
						{
							String hip6 = kingRO(i,j);
							if(!hip6.isEmpty())
							{
								gv = choiceRW(hip6,i,j);
							}
							if(gv==2)
							{
								i=arr.length;
								j=arr.length;
								break;
							}
						}
					}
				}
			}
			if(gv!=2)
			{
				System.out.print("It's CheckMate Black WON");
				System.exit(0);
			}
		}

		int choiceRB(String a,int b,int c)
		{
			int sad = 0;
			a=a.trim();
			String hiarr[] = a.split(" ");
			for(int k=0;k<hiarr.length;k++)
			{
				
				String pq = hiarr[k];
					arr[(pq.charAt(0)-48)][(pq.charAt(1)-48)] = arr[(pq.charAt(0)-48)][(pq.charAt(1)-48)].replace(arr[(pq.charAt(0)-48)][(pq.charAt(1)-48)],arr[b][c]);
					arr[b][c] = arr[b][c].replace(arr[b][c],"---");
				
				if(blackcheck())
				{
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							arr[i][j] = yrr[i][j];
						}
					}
				}
				else
				{
					sad++;
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							arr[i][j] = yrr[i][j];
						}
					}
					break;
				}
				
			}
			if(sad>0)
			{
				return 2;
			}	
			else
			{
				return 0;
			}
		}
		void callingb()
		{
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<10;j++)
				{
					yrr[i][j] = arr[i][j];
				}
			}

			int gv = 0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(arr[i][j].startsWith("B")||arr[i][j].startsWith("b"))
					{
						if(arr[i][j].contains("P")||arr[i][j].contains("p"))
						{
							String hip1 = pawnRBO(i,j);
							if(!(hip1.isEmpty()))
							{
								gv = choiceRB(hip1,i,j);
							}
							if(gv==2)
							{
								i=arr.length;
								j=arr.length;
								break;
							}
						}
						else if(arr[i][j].contains("S")||arr[i][j].contains("s"))
						{
							String hip2 = senaRBO(i,j);
							if(!hip2.isEmpty())
							{
								gv = choiceRB(hip2,i,j);
							}
							if(gv==2)
							{
								i=arr.length;
								j=arr.length;
								break;
							}
						}
						else if(arr[i][j].contains("H")||arr[i][j].contains("h"))
						{
							String hip3 = horseRBO(i,j);
							if(!hip3.isEmpty())
							{
								gv = choiceRB(hip3,i,j);
							}
							if(gv==2)
							{
								i=arr.length;
								j=arr.length;
								break;
							}
						}
						else if(arr[i][j].contains("M")||arr[i][j].contains("m"))
						{
							String hip4 = mantriRBO(i,j);
							if(!hip4.isEmpty())
							{
								gv = choiceRB(hip4,i,j);
							}
							if(gv==2)
							{
								i=arr.length;
								j=arr.length;
								break;
							}
						}
						else if(arr[i][j].contains("E")||arr[i][j].contains("e"))
						{
							String hip5 = elephRBO(i,j);
							if(!hip5.isEmpty())
							{
								gv = choiceRB(hip5,i,j);
							}
							if(gv==2)
							{
								i=arr.length;
								j=arr.length;
								break;
							}
						}
						else if(arr[i][j].contains("K")||arr[i][j].contains("k"))
						{
							String hip6 = kingRBO(i,j);
							if(!hip6.isEmpty())
							{
								gv = choiceRB(hip6,i,j);
							}
							if(gv==2)
							{
								i=arr.length;
								j=arr.length;
								break;
							}
						}
					}
				}
			}

			if(gv!=2)
			{
				System.out.print("It's CheckMate White WON");
				System.exit(0);
			}
		}

}