//Packages
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

//Calculator Code in Swing

public class Calculator implements ActionListener {

    float result;
    boolean IsOpClick = false;
    boolean plus=false;
    boolean minus=false;
    boolean multi=false;
    boolean divide=false;
    String oldnum = "";
    String newnum = "";
    //Declaration for actions..
    JFrame frame;
    JLabel displaylabel;
    JLabel displayLabelQ;
    JButton sevenBTN;
    JButton eightBTN;
    JButton NineBTN;
    JButton FourBTN;
    JButton FiveBTN;
    JButton ThreeBTN;
    JButton SixBTN;
    JButton OneBTN;
    JButton TwoBTN;
    JButton ZeroBTN;
    JButton TwoZeroBTN;
    JButton EqualBTN;
    JButton PlusBTN;
    JButton MinisBTN;
    JButton DividBTN;
    JButton IntwoBTN;
    JButton DotBTN;
    JButton ClearBTN;
    JButton AllClearBTN;
    JButton ExitBTN;

    //PSVM-Main
    public static void main(String[] args) {
        new Calculator();
    }

    public Calculator() {
        // Frame
        frame = new JFrame("Calculator ..(❁´◡`❁)");
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setLocation(300, 150);

        // Display
        displaylabel = new JLabel();
        displaylabel.setBounds(35, 20, 440, 80);
        displaylabel.setBackground(Color.gray);
        displaylabel.setOpaque(true);
        displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displaylabel.setForeground(Color.WHITE);
        displaylabel.setFont(new Font("Arial", Font.PLAIN, 40));
        frame.add(displaylabel);

        displayLabelQ = new JLabel("Calc..");
        displayLabelQ.setBounds(495, 20, 75, 80);
        displayLabelQ.setBackground(Color.gray);
        displayLabelQ.setOpaque(true);
        displayLabelQ.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabelQ.setForeground(Color.WHITE);
        displayLabelQ.setFont(new Font("Arial", Font.PLAIN, 25));
        frame.add(displayLabelQ);

        //Buttons
        //First Set
        sevenBTN = new JButton("7");
        sevenBTN.setBounds(35, 130, 75, 75);
        sevenBTN.setFont(new Font("Arial", Font.PLAIN, 40));
        sevenBTN.addActionListener(this);
        frame.add(sevenBTN);

        eightBTN = new JButton("8");
        eightBTN.setBounds(120, 130, 75, 75);
        eightBTN.setFont(new Font("Arial", Font.PLAIN, 40));
        eightBTN.addActionListener(this);
        frame.add(eightBTN);

        NineBTN = new JButton("9");
        NineBTN.setBounds(205, 130, 75, 75);
        NineBTN.setFont(new Font("Arial", Font.PLAIN, 40));
        NineBTN.addActionListener(this);
        frame.add(NineBTN);
        //second Set
        FourBTN = new JButton("4");
        FourBTN.setBounds(35, 210, 75, 75);
        FourBTN.setFont(new Font("Arial", Font.PLAIN, 40));
        FourBTN.addActionListener(this);
        frame.add( FourBTN );

        FiveBTN = new JButton("5");
        FiveBTN.setBounds(120, 210, 75, 75);
        FiveBTN.setFont(new Font("Arial", Font.PLAIN, 40));
        FiveBTN.addActionListener(this);
        frame.add(FiveBTN);

        SixBTN = new JButton("6");
        SixBTN.setBounds(205, 210, 75, 75);
        SixBTN.setFont(new Font("Arial", Font.PLAIN, 40));
	    SixBTN.addActionListener(this);
	    frame.add(SixBTN);
    //Third Set
    OneBTN=new JButton("1");
	OneBTN.setBounds(35,290,75,75);
	OneBTN.setFont(new Font("Arial", Font.PLAIN, 40));
	OneBTN.addActionListener(this);
	frame.add(OneBTN);
	
	TwoBTN=new JButton("2");
    TwoBTN.setBounds(120,290,75,75);
    TwoBTN.setFont(new Font("Arial", Font.PLAIN, 40));
    TwoBTN.addActionListener(this);
	frame.add(TwoBTN);
	
	ThreeBTN=new JButton("3");
	ThreeBTN.setBounds(205,290,75,75);
	ThreeBTN.setFont(new Font("Arial", Font.PLAIN, 40));
	ThreeBTN.addActionListener(this);
	frame.add(ThreeBTN);
    //Fourth
	ZeroBTN=new JButton("0");
	ZeroBTN.setBounds(35,375,75,75);
	ZeroBTN.setFont(new Font("Arial", Font.PLAIN, 40));
	ZeroBTN.addActionListener(this);
	frame.add(ZeroBTN);
	
    TwoZeroBTN=new JButton("00");
    TwoZeroBTN.setBounds(120,375,75,75);
    TwoZeroBTN.setFont(new Font("Arial", Font.PLAIN, 30));
    TwoZeroBTN.addActionListener(this);
	frame.add(TwoZeroBTN);
    //Tools
	EqualBTN=new JButton("=");
	EqualBTN.setBounds(205,375,75,75);
	EqualBTN.setFont(new Font("MS PGothic", Font.PLAIN, 40));
	EqualBTN.addActionListener(this);
	frame.add(EqualBTN);
	
    PlusBTN=new JButton("+");
	PlusBTN.setBounds(300,300,75,150);
	PlusBTN.setFont(new Font("MS PGothic", Font.PLAIN, 40));
	PlusBTN.addActionListener(this);
	frame.add(PlusBTN);
	
    MinisBTN=new JButton("-");
	MinisBTN.setBounds(300,130,75,150);
	MinisBTN.setFont(new Font("MS PGothic", Font.PLAIN, 40));
	MinisBTN.addActionListener(this);
	frame.add(MinisBTN);
	
	DotBTN=new JButton(".");
	DotBTN.setBounds(395,375,80,75);
	DotBTN.setFont(new Font("MS PGothic", Font.PLAIN, 40));
	DotBTN.addActionListener(this);
	frame.add(DotBTN);
	
	IntwoBTN=new JButton("x");
	IntwoBTN.setBounds(395,255,80,110);
	IntwoBTN.setFont(new Font("MS PGothic", Font.PLAIN, 40));
	IntwoBTN.addActionListener(this);
	frame.add(IntwoBTN);
	
	DividBTN=new JButton("/");
	DividBTN.setBounds(395,130,80,110);
	DividBTN.setFont(new Font("MS PGothic", Font.PLAIN, 40));
	DividBTN.addActionListener(this);
	frame.add(DividBTN);
	
	ClearBTN=new JButton("Clear");
	ClearBTN.setBounds(495, 130, 80, 110);
	ClearBTN.setFont(new Font("MS PGothic", Font.PLAIN, 22));
	ClearBTN.addActionListener(this);
	frame.add(ClearBTN);
	
	AllClearBTN=new JButton("A/C");
	AllClearBTN.setBounds(495, 250, 80, 110);
	AllClearBTN.setFont(new Font("MS PGothic", Font.PLAIN, 22));
	AllClearBTN.addActionListener(this);
	frame.add(AllClearBTN);
	
	ExitBTN=new JButton("Exit");
	ExitBTN.setBounds(495, 370, 80, 80);
	ExitBTN.setFont(new Font("MS PGothic", Font.PLAIN, 22));
	ExitBTN.addActionListener(this);
	frame.add(ExitBTN);
    
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()== sevenBTN){
		if(IsOpClick==true) {
			displaylabel.setText("7");
			IsOpClick=false;
		}else {
		displaylabel.setText(displaylabel.getText()+"7");
	}
	}else if(e.getSource()== eightBTN) {
		if(IsOpClick==true) {
			displaylabel.setText("8");
			IsOpClick=false;
		}else {
		displaylabel.setText(displaylabel.getText()+"8");
	}
	}else if(e.getSource()== NineBTN) {
		if(IsOpClick==true) {
			displaylabel.setText("9");
			IsOpClick=false;
		}else {
		displaylabel.setText(displaylabel.getText()+"9");
		}
	}else if(e.getSource()== FourBTN) {
		if(IsOpClick==true) {
			displaylabel.setText("4");
			IsOpClick=false;
		}else {
		displaylabel.setText(displaylabel.getText()+"4");
		}
	}else if(e.getSource()== FiveBTN) {
		if(IsOpClick==true) {
			displaylabel.setText("5");
			IsOpClick=false;
		}else {
		displaylabel.setText(displaylabel.getText()+"5");
		}
	}else if(e.getSource()== SixBTN) {
		if(IsOpClick==true) {
			displaylabel.setText("6");
			IsOpClick=false;
		}else {
		displaylabel.setText(displaylabel.getText()+"6");
	}
	}else if(e.getSource()== OneBTN) {
		if(IsOpClick==true) {
			displaylabel.setText("1");
			IsOpClick=false;
		}else {
		displaylabel.setText(displaylabel.getText()+"1");
		}
	}else if(e.getSource()== TwoBTN) {
		if(IsOpClick==true) {
			displaylabel.setText("2");
			IsOpClick=false;
		}else {
		displaylabel.setText(displaylabel.getText()+"2");
		}
	}else if(e.getSource()== ThreeBTN) {
		if(IsOpClick==true) {
			displaylabel.setText("3");
			IsOpClick=false;
		}else {
		displaylabel.setText(displaylabel.getText()+"3");
		}
	}else if(e.getSource()== ZeroBTN) {
		if(IsOpClick==true) {
			displaylabel.setText("0");
			IsOpClick=false;
		}else {
		displaylabel.setText(displaylabel.getText()+"0");
		}
	}else if(e.getSource()== TwoZeroBTN) {
		if(IsOpClick==true) {
			displaylabel.setText("00");
			IsOpClick=false;
		}else {
		displaylabel.setText(displaylabel.getText()+"00");
		}
	}else if(e.getSource()== DotBTN) {
		displaylabel.setText(displaylabel.getText()+".");
		}else if(e.getSource()== EqualBTN) {
			newnum=displaylabel.getText();
			
			float oldvalue=Float.parseFloat(oldnum);
			float newvalue=Float.parseFloat(newnum);
			
			if(plus==true) {
				result=newvalue+oldvalue;
				plus=false;
			}else if(minus==true) {
				result=newvalue-oldvalue;
				minus=false;
			}else if(divide==true) {
				result=newvalue/oldvalue;
				divide=false;
			}else if(multi==true){
				result=newvalue*oldvalue;
				multi=false;
			}
			displaylabel.setText("Result: "+result);
			IsOpClick=false;
			result=0;
	}else if(e.getSource()== PlusBTN) {
		
		IsOpClick=true;
		oldnum=displaylabel.getText();
        plus=true;
	}else if(e.getSource()== MinisBTN) {
		IsOpClick=true;
		oldnum=displaylabel.getText();
		minus=true;
	}else if(e.getSource()== DividBTN) {
		IsOpClick=true;
		oldnum=displaylabel.getText();
		divide=true;
	}else if(e.getSource()== IntwoBTN) {
		IsOpClick=true;
		oldnum=displaylabel.getText();
		multi=true;
	}else if(e.getSource()== ClearBTN) {
		displaylabel.setText("");
		result=0;
	}else if(e.getSource()== AllClearBTN) {
		displaylabel.setText("");
		result=0;
	}else if(e.getSource()== ExitBTN) {

	}
}
}
