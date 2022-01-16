
import javax.swing.*;
import java.awt.event.*;
import java.io.*;


class TestAction{
	public static void main(String[] arg){
		JFrame f=new JFrame("Weight Conversion Program");//creating instance of JFrame

        JLabel l1=new JLabel("     Kilograms   ");
        l1.setBounds(105,5, 100,30);
	JButton b1=new JButton("Convert ");  
    b1.setBounds(215,30, 85,25);
	JTextField t1 =new JTextField();	
	t1.setBounds(80,30, 130,30);
	
        JLabel l2=new JLabel("    Pounds   ");
        l2.setBounds(105,55, 100,30);
	JButton b2=new JButton("Convert ");  
    b2.setBounds(215,80, 85,25);
	JTextField t2 =new JTextField();	
	t2.setBounds(80,80, 130,30);


        JLabel l3=new JLabel("     Grams   ");
        l3.setBounds(105,105, 100,30);
	JButton b3=new JButton("Convert ");  
    b3.setBounds(215,130, 85,25);
	JTextField t3 =new JTextField();	
	t3.setBounds(80,130, 130,30);
	
        JLabel l4=new JLabel("    Ounces   ");
        l4.setBounds(105,155, 100,30);
	JButton b4=new JButton("Convert ");  
    b4.setBounds(215,180, 85,25);
	JTextField t4 =new JTextField();	
	t4.setBounds(80,180, 130,30);

 JLabel l5=new JLabel("    Tons   ");
        l5.setBounds(105,205, 100,30);
	JButton b5=new JButton("Convert ");  
    b5.setBounds(215,230, 85,25);
	JTextField t5 =new JTextField();	
	t5.setBounds(80,230, 130,30);

JButton b6=new JButton("Clear ");  
    b6.setBounds(80,280, 85,25);



	
	b2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s1=t1.getText()+"\n"; 
if(s1.length()>1){
  
byte b2[]=s1.getBytes();//converting string into byte array    
				fout.write(b2);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double a =Double.parseDouble(t1.getText());
                         double pound =a* 2.2046;
                         t2.setText(""+pound);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});
	

 b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s3=t3.getText()+"\n"; 
if(s3
.length()>1){
  
byte b1[]=s3.getBytes();//converting string into byte array    
				fout.write(b1);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double b =Double.parseDouble(t3.getText());
                         double kg = b/1000;
                         t1.setText(""+kg);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});

b3.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s4=t1.getText()+"\n"; 
if(s4.length()>1){
  
byte b3[]=s4.getBytes();//converting string into byte array    
				fout.write(b3);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double a =Double.parseDouble(t1.getText());
                         double gram =a* 1000;
                         t3.setText(""+gram);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});
	

 b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s2=t2.getText()+"\n"; 
if(s2
.length()>1){
  
byte b1[]=s2.getBytes();//converting string into byte array    
				fout.write(b1);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double b =Double.parseDouble(t2.getText());
                         double kg = b/2.2046;
                         t1.setText(""+kg);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});
	
 b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s5=t4.getText()+"\n"; 
if(s5
.length()>1){
  
byte b1[]=s5.getBytes();//converting string into byte array    
				fout.write(b1);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double b =Double.parseDouble(t4.getText());
                         double kg = b*35.274;
                         t1.setText(""+kg);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});

b4.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s6=t1.getText()+"\n"; 
if(s6.length()>1){
  
byte b4[]=s6.getBytes();//converting string into byte array    
				fout.write(b4);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double a =Double.parseDouble(t1.getText());
                         double ounce =a* 35.274;
                         t4.setText(""+ounce);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});

 b3.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s7=t4.getText()+"\n"; 
if(s7
.length()>1){
  
byte b3[]=s7.getBytes();//converting string into byte array    
				fout.write(b3);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double b =Double.parseDouble(t4.getText());
                         double gramm = b* 0.03527;
                         t3.setText(""+gramm);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});

b4.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s8=t3.getText()+"\n"; 
if(s8.length()>1){
  
byte b4[]=s8.getBytes();//converting string into byte array    
				fout.write(b4);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double a =Double.parseDouble(t3.getText());
                         double ounce = a/0.03527;
                         t4.setText(""+ounce);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});

 b2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s9=t4.getText()+"\n"; 
if(s9
.length()>1){
  
byte b2[]=s9.getBytes();//converting string into byte array    
				fout.write(b2);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double b =Double.parseDouble(t4.getText());
                         double pound = 16*b;
                         t2.setText(""+pound);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});

b4.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s10=t2.getText()+"\n"; 
if(s10.length()>1){
  
byte b4[]=s10.getBytes();//converting string into byte array    
				fout.write(b4);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double a =Double.parseDouble(t2.getText());
                         double ounce = a/16;
                         t4.setText(""+ounce);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});

 b5.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s13=t1.getText()+"\n"; 
if(s13
.length()>1){
  
byte b5[]=s13.getBytes();//converting string into byte array    
				fout.write(b5);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double b =Double.parseDouble(t1.getText());
                         double tons = b/907.18474;
                         t5.setText(""+tons);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});

b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s14=t5.getText()+"\n"; 
if(s14.length()>1){
  
byte b1[]=s14.getBytes();//converting string into byte array    
				fout.write(b1);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double a =Double.parseDouble(t5.getText());
                         double gramm= 907.18474*a;
                         t1.setText(""+gramm);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});


 b5.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s15=t2.getText()+"\n"; 
if(s15
.length()>1){
  
byte b5[]=s15.getBytes();//converting string into byte array    
				fout.write(b5);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double b =Double.parseDouble(t2.getText());
                         double tons = b/2204.62;
                         t5.setText(""+tons);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});

b2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s16=t5.getText()+"\n"; 
if(s16.length()>1){
  
byte b2[]=s16.getBytes();//converting string into byte array    
				fout.write(b2);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double a =Double.parseDouble(t5.getText());
                         double gramm= a*2204.62;
                         t2.setText(""+gramm);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});
 b5.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s17=t3.getText()+"\n"; 
if(s17
.length()>1){
  
byte b5[]=s17.getBytes();//converting string into byte array    
				fout.write(b5);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double b =Double.parseDouble(t3.getText());
                         double tons = b/907184.74 ;

                         t5.setText(""+tons);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});

b3.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s18=t5.getText()+"\n"; 
if(s18.length()>1){
  
byte b3[]=s18.getBytes();//converting string into byte array    
				fout.write(b3);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double a =Double.parseDouble(t5.getText());
                         double gramm= a*907184.74;
                         t3.setText(""+gramm);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});

 b5.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s19=t4.getText()+"\n"; 
if(s19
.length()>1){
  
byte b5[]=s19.getBytes();//converting string into byte array    
				fout.write(b5);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double b =Double.parseDouble(t4.getText());
                         double tons = b/32000;

                         t5.setText(""+tons);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});

b4.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			try{   
FileOutputStream fout=new FileOutputStream("Inputs.txt",true); 
        String s20=t5.getText()+"\n"; 
if(s20.length()>1){
  
byte b4[]=s20.getBytes();//converting string into byte array    
				fout.write(b4);    
				fout.close();    
				System.out.println("Done!!");   
            
                         double a =Double.parseDouble(t5.getText());
                         double ounce= a*32000;
                         t4.setText(""+ounce);
            
            }

}catch(Exception ex){
				System.out.println(ex);
			} 
	
		}
});

b6.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			t1.setText("");	
			t2.setText("");
			t3.setText("");	
                        t4.setText("");	
                        t5.setText("");				
		}
	});
	
	f.add(b1);
	f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
	f.add(t1);
	f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
      
    f.setSize(600,400);//400 width and 500 height  
    f.setLayout(null);//using no layout managers 
	
    f.setVisible(true);//making the frame visible
	}
}
