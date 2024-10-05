package com.xyz.basicofprograming.day16;
import java.util.Scanner;

public class Alphabet2 {

	public static void main(String[] args) {
		
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the size");
		        int n = sc.nextInt();

		        for (int i = 0; i < n; i++) {
		            // Print 'I'
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || i == n - 1 || j == n / 2) {
		                    System.out.print("# ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("   "); 
		            System.out.print("   "); 
		                for (int j = 0; j < n; j++) {
		                    if (i == 0 || i == n / 2 || j == 0) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'O'
		                for (int j = 0; j < n; j++) {
		                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'U'
		                for (int j = 0; j < n; j++) {
		                    if (j == 0 || j == n - 1 || i == n - 1) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'N'
		                for (int j = 0; j < n; j++) {
		                    if (j == 0 || j == n - 1 || i == j) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'D'
		                for (int j = 0; j < n; j++) {
		                    if (j == 0 || (j == n - 1 && i != 0 && i != n - 1) || (i == 0 || i == n - 1) && j < n - 1) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }
		                System.out.print("	");
		                System.out.print("	");
		                for(int j=0;j<n;j++) {
		    				if((i==j && i<=(n/2)) || (i+j==(n-1))) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			
		    		
  // Spacing between letters

		                // Print 'O'
		                for (int j = 0; j < n; j++) {
		                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'U'
		                for (int j = 0; j < n; j++) {
		                    if (j == 0 || j == n - 1 || i == n - 1) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'R'
		                for (int j = 0; j < n; j++) {
		                    if (j == 0 || (i == 0 || i == n / 2) && j < n - 1 || (j == n - 1 && i < n / 2 && i != 0) || (i - j == n / 2)) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   "); 
		                System.out.print("   "); 
		                // Print 'S'
		                for(int j=0;j<n;j++) {
		    				if((i==0 && j!=0) || 
		    				   (i==n/2 && j!=0 && j!=(n-1)) || 
		    				   (i==(n-1) && j!=(n-1)) ||
		    				   (j==0 && i!=0 && i<(n/2)) || 
		    				   (j==(n-1) && i>(n/2) && i!=(n-1))) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			
		    			System.out.print("	");
  // Spacing between letters

		                // Print 'E'
		                for (int j = 0; j < n; j++) {
		                    if (i == 0 || i == n - 1 || i == n / 2 || j == 0) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                for(int j=0;j<n;j++) {
		    				if((i==0 && j!=0) || 
		    				   (i==n/2 && j!=0 && j!=(n-1)) || 
		    				   (i==(n-1) && j!=(n-1)) ||
		    				   (j==0 && i!=0 && i<(n/2)) || 
		    				   (j==(n-1) && i>(n/2) && i!=(n-1))) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			
		    			System.out.print("	");
 // Spacing between letters

		    			for(int j=0;j<n;j++) {
		    				if((i==0 && j!=0) || 
		    				   (i==n/2 && j!=0 && j!=(n-1)) || 
		    				   (i==(n-1) && j!=(n-1)) ||
		    				   (j==0 && i!=0 && i<(n/2)) || 
		    				   (j==(n-1) && i>(n/2) && i!=(n-1))) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			
		    		
// Spacing between letters

		                // Print 'I'
		                for (int j = 0; j < n; j++) {
		                    if (i == 0 || i == n - 1 || j == n / 2) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'O'
		                for (int j = 0; j < n; j++) {
		                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'N'
		                for (int j = 0; j < n; j++) {
		                    if (j == 0 || j == n - 1 || i == j) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		           
		               // Spacing between letters 
		                
		                for(int j=0;j<n;j++) {
		    				if((i==0 && j!=0) || 
		    				   (i==n/2 && j!=0 && j!=(n-1)) || 
		    				   (i==(n-1) && j!=(n-1)) ||
		    				   (j==0 && i!=0 && i<(n/2)) || 
		    				   (j==(n-1) && i>(n/2) && i!=(n-1))) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			
		    			System.out.print("	");
		    		for (int j = 0; j < n; j++) {
		                    if (i == 0 || j == n / 2) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'O'
		                for (int j = 0; j < n; j++) {
		                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   "); 
		                System.out.print("   "); // Spacing between letters

		                // Print 'B'
		                for(int j=0;j<n;j++) {
		    				if((i==0 && j!=(n-1)) || 
		    						(i==n/2 && j!=(n-1)) || 
		    						(i==(n-1) && j!=(n-1)) ||
		    						(j==0) || 
		    						(j==(n-1) && i!=0 && i!=(n/2) && i!=(n-1))) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}

		    			System.out.print("	");  // Spacing between letters

		                // Print 'E'
		                for (int j = 0; j < n; j++) {
		                    if (i == 0 || i == n - 1 || i == n / 2 || j == 0) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   "); 
		                System.out.print("   "); 
		              //V
		    			for(int j=0;j<n;j++) {
		    				if((j==0 && i<=(n/2)) || 
		    					(j==n-1 && i<=(n/2)) || 
		    					(i-j==(n/2)) || 
		    					(i+j==((n-1)+(n/2)))) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			
		    			// Spacing between letters

		                // Print 'E'
		                for (int j = 0; j < n; j++) {
		                    if (i == 0 || i == n - 1 || i == n / 2 || j == 0) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   "); 
		                // Spacing between letters
		                

		                // Print 'R'
		                for (int j = 0; j < n; j++) {
		                    if (j == 0 || i == 0 || i == n / 2 || (j == n - 1 && i < n / 2) || (i - j == n / 2)) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		            	//Y
		    			for(int j=0;j<n;j++) {
		    				if((i==j && i<=(n/2)) || (i+j==(n-1))) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			
		    			System.out.print("	");

		                System.out.print("   ");  // Spacing between letters

		                // Print 'I'
		                for (int j = 0; j < n; j++) {
		                    if (i == 0 || i == n - 1 || j == n / 2) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'N'
		                for (int j = 0; j < n; j++) {
		                    if (j == 0 || j == n - 1 || i == j) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'F'
		                for (int j = 0; j < n; j++) {
		                    if (i == 0 || i == n / 2 || j == 0) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'O'
		                for (int j = 0; j < n; j++) {
		                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'R'
		                for (int j = 0; j < n; j++) {
		                    if (j == 0 || i == 0 || i == n / 2 || (j == n - 1 && i < n / 2) || (i - j == n / 2)) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'M'
		                for(int j=0;j<n;j++) {
		    				if((j==0) || j==(n-1) || (i==j && i<=n/2) || (i+j==(n-1) && j>=n/2)) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}

		    			System.out.print("	");
 // Spacing between letters

		                // Print 'A'
		    			for(int j=0;j<n;j++) {
		    				if((i==0 && j!=0 && j!=(n-1))|| 
		    						i==(n/2) || 
		    						(j==0 && i!=0)|| 
		    						(j==(n-1) && i!=0)) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}


  // Spacing between letters

		                // Print 'T'
		                for (int j = 0; j < n; j++) {
		                    if (i == 0 || j == n / 2) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		              // Spacing between letters

		                // Print 'I'
		                for (int j = 0; j < n; j++) {
		                    if (i == 0 || i == n - 1 || j == n / 2) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		             // Spacing between letters

		                // Print 'V'
		              //V
		    			for(int j=0;j<n;j++) {
		    				if((j==0 && i<=(n/2)) || 
		    					(j==n-1 && i<=(n/2)) || 
		    					(i-j==(n/2)) || 
		    					(i+j==((n-1)+(n/2)))) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			
		    			 // Spacing between letters

		                // Print 'E'
		                for (int j = 0; j < n; j++) {
		                    if (i == 0 || i == n - 1 || i == n / 2 || j == 0) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }
		                System.out.print("  ");
		                System.out.print("  ");
		                System.out.print("  ");
		                //E
		                for (int j = 0; j < n; j++) {
		                    if (i == 0 || i == n - 1 || i == n / 2 || j == 0) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'N'
		                for (int j = 0; j < n; j++) {
		                    if (j == 0 || j == n - 1 || i == j) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'G'
		                for(int j=0;j<n;j++) {
		    				if((i==0 && j!=0) || (j==0 && i!=(n-1) && i!=0) || 
		    						(i==(n-1) && j<=(n/2) && j!=0) ||
		    						(j==n/2 && i>(n/2)) || 
		    						(i==n/2 && j>(n/2) && j!=(n-1)) ||
		    						(j==(n-1) && i>(n/2))) {

		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}

		    			System.out.print("	");
// Spacing between letters

		                // Print 'A'
		    			for(int j=0;j<n;j++) {
		    				if((i==0 && j!=0 && j!=(n-1))|| 
		    						i==(n/2) || 
		    						(j==0 && i!=0)|| 
		    						(j==(n-1) && i!=0)) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}

		    			System.out.print("	");
// Spacing between letters

		                // Print 'G' (same as above)
		                for(int j=0;j<n;j++) {
		    				if((i==0 && j!=0) || (j==0 && i!=(n-1) && i!=0) || 
		    						(i==(n-1) && j<=(n/2) && j!=0) ||
		    						(j==n/2 && i>(n/2)) || 
		    						(i==n/2 && j>(n/2) && j!=(n-1)) ||
		    						(j==(n-1) && i>(n/2))) {

		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}

		    			System.out.print("	");
  // Spacing between letters

		                // Print 'I'
		                for (int j = 0; j < n; j++) {
		                    if (i == 0 || i == n - 1 || j == n / 2) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'N' (same as above)
		                for (int j = 0; j < n; j++) {
		                    if (j == 0 || j == n - 1 || i == j) {
		                        System.out.print("# ");
		                    } else {
		                        System.out.print("  ");
		                    }
		                }

		                System.out.print("   ");  // Spacing between letters

		                // Print 'G' (same as above)
		                for(int j=0;j<n;j++) {
		    				if((i==0 && j!=0) || (j==0 && i!=(n-1) && i!=0) || 
		    						(i==(n-1) && j<=(n/2) && j!=0) ||
		    						(j==n/2 && i>(n/2)) || 
		    						(i==n/2 && j>(n/2) && j!=(n-1)) ||
		    						(j==(n-1) && i>(n/2))) {

		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}

		    			System.out.print("	");
		    			System.out.print("	");
		    			//A
		    			for(int j=0;j<n;j++) {
		    				if((i==0 && j!=0 && j!=(n-1))|| 
		    						i==(n/2) || 
		    						(j==0 && i!=0)|| 
		    						(j==(n-1) && i!=0)) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}


		    			//N
		    			for(int j=0;j<n;j++) {
		    				if((j==0) || j==(n-1) || (i==j) ) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			
		    			
		    			//D
		    			for(int j=0;j<n;j++) {
		    				if((i==0 && j!=(n-1)) || 
		    						(i==(n-1) && j!=(n-1)) ||
		    						(j==0) || 
		    						(j==(n-1) && i!=0 && i!=(n-1))) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}

		    			System.out.print("	");
		    			System.out.print("	");
		    			//E
		    			for(int j=0;j<n;j++) {
		    				if((i==0) || (i==n/2) || (i==(n-1)) || (j==0)) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}

		    		
		    			//N
		    			for(int j=0;j<n;j++) {
		    				if((j==0) || j==(n-1) || (i==j) ) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			
		    		
		    			//j
		    			for(int j=0;j<n;j++) {
		    				if((i==0) || (j==n/2) || i-j==(n/2)) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}

		    			
		    			//o
		    			for(int j=0;j<n;j++) {
		    				if((j==0 && i!=0 && i!=(n-1)) || 
		    				   (j==(n-1) && i!=0 && i!=(n-1)) || 
		    				   (i==0 && j!=0 && j!=(n-1)) || 
		    				   (i==n-1 && j!=0 && j!=(n-1)) ) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			
		    			
		    			//Y
		    			for(int j=0;j<n;j++) {
		    				if((i==j && i<=(n/2)) || (i+j==(n-1))) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			
		    			
		    			//A
		    			for(int j=0;j<n;j++) {
		    				if((i==0 && j!=0 && j!=(n-1))|| 
		    						i==(n/2) || 
		    						(j==0 && i!=0)|| 
		    						(j==(n-1) && i!=0)) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}

		    		
		    			//B
		    			for(int j=0;j<n;j++) {
		    				if((i==0 && j!=(n-1)) || 
		    						(i==n/2 && j!=(n-1)) || 
		    						(i==(n-1) && j!=(n-1)) ||
		    						(j==0) || 
		    						(j==(n-1) && i!=0 && i!=(n/2) && i!=(n-1))) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}

		    			
		    			//l
		    			for(int j=0;j<n;j++) {
		    				if((j==0) || i==(n-1)) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}

		    			
		    			//E
		    			for(int j=0;j<n;j++) {
		    				if((i==0) || (i==n/2) || (i==(n-1)) || (j==0)) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}

		    			System.out.print("	");
		    			
		    			//T
		    			for(int j=0;j<n;j++) {
		    				if((i==0) || (j==n/2)) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			
		    			
		    			for(int j=0;j<n;j++) {
		    				if((j==0) || (i==n/2) || (j==(n-1))) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}

		    		
		    			for(int j=0;j<n;j++) {
		    				if((i==0 && j!=0 && j!=(n-1))|| 
		    						i==(n/2) || 
		    						(j==0 && i!=0)|| 
		    						(j==(n-1) && i!=0)) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}

		    			
		    			//N
		    			for(int j=0;j<n;j++) {
		    				if((j==0) || j==(n-1) || (i==j) ) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			
		    			
		    			//K
		    			for(int j=0;j<n;j++) {
		    				if((j==0) || (i+j==n/2) || i-j==(n/2)) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			System.out.print("	");
		    			for(int j=0;j<n;j++) {
		    				if((i==j && i<=(n/2)) || (i+j==(n-1))) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			
		    			
		    			for(int j=0;j<n;j++) {
		    				if((j==0 && i!=0 && i!=(n-1)) || 
		    				   (j==(n-1) && i!=0 && i!=(n-1)) || 
		    				   (i==0 && j!=0 && j!=(n-1)) || 
		    				   (i==n-1 && j!=0 && j!=(n-1)) ) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			
		    



		    			for(int j=0;j<n;j++) {
		    				if((j==0 && i!=(n-1)) || 
		    					(j==n-1 && i!=(n-1)) || 
		    					(i==(n-1) && j!=0 && j!=(n-1))) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			
		    			System.out.print("	");
		    			System.out.print("	");
		    			for(int j=0;j<n;j++) {
		    				if((i==0 && j!=0) || 
		    				   (i==n/2 && j!=0 && j!=(n-1)) || 
		    				   (i==(n-1) && j!=(n-1)) ||
		    				   (j==0 && i!=0 && i<(n/2)) || 
		    				   (j==(n-1) && i>(n/2) && i!=(n-1))) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}
		    			System.out.print("  ");
		    			for (int j = 0; j < n; j++) {
			                if (i == 0 || i == n - 1 || j == n / 2) {
			                    System.out.print("# ");
			                } else {
			                    System.out.print("  ");
			                }
			            }
		    			System.out.print("  ");
		    			
		    			for(int j=0;j<n;j++) {
		    				if((j==0) || 
		    				   (j==(n-1) && i<(n/2) && i!=0) || 
		    				   (i==0 && j!=(n-1)) || 
		    				   (i==n/2 && j!=(n-1)) ||
		    				   (i-j==(n/2))) {
		    					System.out.print("# ");
		    				}
		    				else {
		    					System.out.print("  ");
		    				}
		    			}




		            System.out.println();  // Move to the next line for the next row of the pattern
		        }

		      
		    }
	
	}
