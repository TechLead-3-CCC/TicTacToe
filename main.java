import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class main extends JFrame implements ActionListener  {
	public static void main(String[] args){
		main app = new main();
		app.setVisible(true);
	}
	ImageIcon x = new ImageIcon("x.png");
	ImageIcon o = new ImageIcon("o.png");
	ImageIcon gris = new ImageIcon("gris.png");

	int b1x = 0;
	int b2x = 0;
	int b3x = 0;
	int b4x = 0;
	int b5x = 0;
	int b6x = 0;
	int b7x = 0;
	int b8x = 0;
	int b9x = 0;
	
	int jeu1 = 1;
	int jeu2 = 1;
	int jeu3 = 1;
	int jeu4 = 1;
	int jeu5 = 1;
	int jeu6 = 1;
	int jeu7 = 1;
	int jeu8 = 1;
	int jeu9 = 1;
	
	

	
	//makes 9buttons for the grid
	JButton b1 = new JButton("",gris);
	JButton b2 = new JButton("",gris);
    JButton b3 = new JButton("",gris);
	JButton b4 = new JButton("",gris);
	JButton b5 = new JButton("",gris);
	JButton b6 = new JButton("",gris);
	JButton b7 = new JButton("",gris);
	JButton b8 = new JButton("",gris);
	JButton b9 = new JButton("",gris);
	
	 int tour = 1;
	 //tour prends la valeur 1 si c'est a X de joueur, 0 si c'est Y
	
	public main(){
	super("Tic Tac Toe");
	setLayout(new FlowLayout());
	this.add(b1);
	this.add(b2);
	this.add(b3);
	this.add(b4);
	this.add(b5);
	this.add(b6);
	this.add(b7);
	this.add(b8);
	this.add(b9);

b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
     b1();
     }
});
b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
     b2();
  }
});
b3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
     b3();
     }
});
b4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
     b4();
     }
});
b5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
     b5();
  }
});
b6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
     b6();
 }
});
b7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
     b7();
 }
});
b8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
     b8();
  }
});
b9.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
     b9();
  }
});

	//Proprietes de la fenetre
	setSize(900,750);
	setVisible(true);
	
	addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);}});
	}
	
	//Verification de l'identite du vainqueur
		public void check(){	
		if(b1x == 1){
			if (b4x == 1) {
				if(b7x == 1){
					 JOptionPane.showMessageDialog(null, "X a gagné!!!!");
					 res();
					}
			}
		}
		if(b1x == 1){
			if (b5x == 1) {
				if(b9x == 1){
					 JOptionPane.showMessageDialog(null, "X a gagné!!!!");
					 res();
					}
			}
		}
		if(b3x == 1){
			if (b5x == 1) {
				if(b7x == 1){
					 JOptionPane.showMessageDialog(null, "X a gagné!!!!");
					 res();
					}
			}
		}
		if(b2x == 1){
			if (b5x == 1) {
				if(b8x == 1){
					JOptionPane.showMessageDialog(null, "X a gagné!!!!");
					res();
				}
			}
		}
		if(b3x == 1){
			if (b6x == 1) {
				if(b9x == 1){
					JOptionPane.showMessageDialog(null, "X a gagné!!!!");
					res();
				}
			}
		}
		if(b1x == 2){
			if (b4x == 2) {
				if(b7x == 2){
					JOptionPane.showMessageDialog(null, "O a gagné!!!!");
					res();
				}
			}
		}
		if(b1x == 2){
			if (b5x == 2) {
				if(b9x == 2){
					 JOptionPane.showMessageDialog(null, "O a gagné!!!!");
					 res();
					}
			}
		}
		if(b3x == 2){
			if (b5x == 2) {
				if(b7x == 2){
					 JOptionPane.showMessageDialog(null, "O a gagné!!!!");
					 res();
					}
			}
		}
		if(b2x == 2){
			if (b5x == 2) {
				if(b8x == 2){
					JOptionPane.showMessageDialog(null, "O a gagné!!!!");
				}
			}
		}
		
		if(b3x == 2){
			if (b6x == 2) {
				if(b9x == 2){
					JOptionPane.showMessageDialog(null, "O a gagné!!!!");
					res();
				}
			}
		}
		if(b1x == 2){
			if (b2x == 2) {
				if(b3x == 2){
					JOptionPane.showMessageDialog(null, "O a gagné!!!!");
					res();
				}
			}
		}
		if(b4x == 2){
			if (b5x == 2) {
				if(b6x == 2){
					JOptionPane.showMessageDialog(null, "O a gagné!!!!");
					res();
				}
			}
		}
		if(b7x == 2){
			if (b8x == 2) {
				if(b9x == 2){
					JOptionPane.showMessageDialog(null, "O a gagné!!!!");
					res();
				}
			}
		}
		
		
		if(b4x == 1){
			if (b5x == 1) {
				if(b6x == 1){
					JOptionPane.showMessageDialog(null, "X a gagné!!!!");
					res();
				}
			}
		}
		
				if(b1x == 1){
			if (b2x == 1) {
				if(b3x == 1){
					JOptionPane.showMessageDialog(null, "X a gagné!!!!");
					res();
				}
			}
		}
		
						if(b7x == 1){
			if (b8x == 1) {
				if(b9x == 1){
					JOptionPane.showMessageDialog(null, "X a gagné!!!!");
					res();
				}
			}
		}
						
	
	}
	

	public void res(){
		System.exit(0);
	}
	
	public void b1() {
	if(jeu1 == 1){
      jeu1 = 0;
        if(tour == 1){
        	b1.setIcon( x );
        	tour = 0;
          b1x = 1;
        }
       else if (tour == 0){
        	
        		b1.setIcon( o );
                tour = 1;
                b1x = 2;
        }   
        check(); 
    }
    else {
    }
    }   
    	public void b2() {
		 	if(jeu2 == 1){
      jeu2 = 0;
        if(tour == 1){
        	b2.setIcon( x );
           b2x = 1;
        	tour = 0;
        }
       else if (tour == 0) {
    	  	b2.setIcon( o );
              b2x = 2;
                tour = 1;
        }  
        check() ; 
    }
    else {
    }
    }
     	public void b3() {
		 	if(jeu3 == 1){
      jeu3 = 0;
        if(tour == 1){
        	b3.setIcon( x );
        b3x = 1;
        	tour = 0;
        }
       else if (tour == 0){
        		b3.setIcon( o );
                 b3x = 2;
                tour = 1;
        }
         check() ;     
    }
    else {
    }
    }
     	public void b4() {
		 	if(jeu4 == 1){
      jeu4 = 0;
        if(tour == 1){
        	b4.setIcon( x );
        b4x = 1;
        	tour = 0;
        }
       else if (tour == 0){
        		b4.setIcon( o );
                 b4x = 2;
                tour = 1;
        } 
         check() ;    
    }
    else {
    }
     	}
    public void b5() {
		 	if(jeu5 == 1){
      jeu5 = 0;
        if(tour == 1){
        b5.setIcon( x );
        b5x = 1;
        tour = 0;
        }
       else if (tour == 0){
        		b5.setIcon( o );
                b5x = 2;
                tour = 1;
        }  
         check() ;   
    }
    else {
    }
    }
    void b6() {
	if(jeu6 == 1){
      jeu6 = 0;
        if(tour == 1){
        	b6.setIcon( x );
           b6x = 1;
        	tour = 0;
        }
       else if (tour == 0){
        		b6.setIcon( o );
                b6x = 2;
                tour = 1;
        }    
         check() ; 
    }
    else {}
    }
    public void b7() {
		 	if(jeu7 == 1){
      jeu7 = 0;
        if(tour == 1){
        	b7.setIcon( x );
        b7x = 1;
        	tour = 0;
        }
       else if (tour == 0){	
        		b7.setIcon( o );
                 b7x = 2;
                tour = 1;
        }  
         check() ;   
    }
    else {
    }
    }
 public void b8() {
	if(jeu8 == 1){
      jeu8 = 0;   
        if(tour == 1){	
        	b8.setIcon( x );
        b8x = 1;
        	tour = 0;
        }
       else if (tour == 0){
        		b8.setIcon( o );
                 b8x = 2;
                tour = 1;
        }    
         check() ; 
    }
    else {	
    }
    }
  public void b9() {
	if(jeu9 == 1){
      jeu9 = 0; 
        if(tour == 1){
        	b9.setIcon( x );
        b9x = 1;
        	tour = 0;
        }
       else if (tour == 0){
        		b9.setIcon( o );
                b9x = 2;
                tour = 1;
        }   
         check() ;  
    }
    else {	
    }  
    }
 public void actionPerformed(ActionEvent e) {

    }
	
}