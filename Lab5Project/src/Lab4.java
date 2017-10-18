import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Lab4 extends JApplet
{

  Color purple = new Color(186, 85, 211);
  

  public void schnell()
  {
	  System.out.println("schnell");
    JPanel top = new JPanel(new FlowLayout());
    JLabel schnellL = new JLabel("Schnell Tickets", 0);
    schnellL.setForeground(Color.WHITE);
    schnellL.setFont(new Font("SansSerif", 1, 25));
    top.add(schnellL);
    top.setBackground(purple);
    add(top, "North");
  }
  
  public void components()
  {
	
	System.out.println("components");
    JPanel center = new JPanel(new BorderLayout());
    center.setBackground(Color.gray);
    

    JPanel centertop = new JPanel(new GridLayout(3, 2, 2, 2));
    centertop.setOpaque(true);
    JLabel l1 = new JLabel("Departing from:", 0);
    JLabel l2 = new JLabel("Destination", 0);
    JComboBox cbb = new JComboBox();
    JComboBox cbb1 = new JComboBox();
    JRadioButton rb1 = new JRadioButton("Round Trip", true);
    JRadioButton rb2 = new JRadioButton("One Way", false);
    ButtonGroup group = new ButtonGroup();
    group.add(rb1);
    group.add(rb2);
    


    centertop.add(l1);
    centertop.add(l2);
    centertop.add(cbb);
    cbb.addItem("Set Destination                     ");
    cbb.addItem("Dallas");
    cbb.addItem("Wash DC");
    cbb.addItem("Seattle");
    cbb.addItem("Oklahoma City");
    cbb.addActionListener((ActionListener) this);
    centertop.add(cbb1);
    cbb1.addItem("Set Destination");
    cbb1.addItem("Dallas");
    cbb1.addItem("Wash DC");
    cbb1.addItem("Seattle");
    cbb1.addItem("Oklahoma City");
    
    centertop.add(rb1);
    centertop.add(rb2);
    Font font = new Font("serif", 10, 20);
    JPanel centermid = new JPanel(new GridLayout(5, 2, 2, 2));
    
    JLabel date = new JLabel("Departure Date", 0);
    date.setFont(font);
    centermid.add(date);
    JLabel date1 = new JLabel("Return Date", 0);
    date1.setFont(font);
    centermid.add(date1);
    
    JPanel selectdate = new JPanel(new GridLayout(1, 3, 2, 2));
    
    JTextArea month = new JTextArea("Month", 1, 3);
    
    JTextArea day = new JTextArea("Day", 1, 2);
    JTextArea year = new JTextArea("Year", 1, 3);
    
    selectdate.add(month);
    selectdate.add(day);
    selectdate.add(year);
    
    JPanel selectdate1 = new JPanel(new GridLayout(1, 3, 2, 2));
    
    JTextArea month1 = new JTextArea("Month", 1, 3);
    JTextArea day1 = new JTextArea("Day", 1, 2);
    JTextArea year1 = new JTextArea("Year", 1, 3);
    
    selectdate1.add(month1);
    selectdate1.add(day1);
    selectdate1.add(year1);
    centermid.add(selectdate);
    centermid.add(selectdate1);
    


    JComboBox box = new JComboBox();
    JComboBox box1 = new JComboBox();
    
    centermid.add(box);
    box.addItem("Morning");
    box.addItem("Evening");
    box.setPrototypeDisplayValue("XXXXXXxxXXX");
    

    centermid.add(box1);
    box1.addItem("Morning");
    box1.addItem("Evening");
   
    
   JLabel nPassenger = new JLabel("Number of Passengers");
    
    centermid.add(nPassenger);
    
    JTextArea passengers = new JTextArea("1", 1, 2);
    
    centermid.add(passengers);
    
    JTextArea name = new JTextArea("First Name", 1, 19);
    name.setBorder(BorderFactory.createCompoundBorder(
      name.getBorder(), 
      BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    JTextArea nameL = new JTextArea("Last Name", 1, 19);
    nameL.setBorder(BorderFactory.createCompoundBorder(
      nameL.getBorder(), 
      BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    
    centermid.add(name);
    centermid.add(nameL);
    
    JPanel centerbot = new JPanel(new FlowLayout(1, 20, 10));
    centerbot.setBackground(new Color(255, 255, 0));
    
    JButton submit = new JButton("Submit");
    submit.addActionListener((ActionListener) this);
    Font submitF = new Font("SansSerif", 10, 15);
    add(submit);
    submit.setFont(submitF);
    submit.setForeground(Color.green);
    JButton cancel = new JButton("Cancel");
    Font cancelF = new Font("SansSerif", 10, 15);
    add(cancel);
    cancel.setFont(cancelF);
    cancel.setForeground(Color.RED);
    JButton reset = new JButton("Reset");
    Font resetF = new Font("SansSerif", 10, 15);
    add(reset);
    reset.setFont(resetF);
    reset.setForeground(Color.blue);
    

    JCheckBox sounds = new JCheckBox("Music");
    JCheckBox music = new JCheckBox("Sounds");
    

    centerbot.add(music);
    centerbot.add(sounds);
    centerbot.add(submit);
    centerbot.add(cancel);
    centerbot.add(reset);
    









    center.add(centertop, "North");
    center.add(centermid, "Center");
    center.add(centerbot, "South");
    

    add(center, "Center");
  }
  


  public void image()
  {
	  System.out.println("image");
    JPanel aPplet = new JPanel(new FlowLayout());
    Image pic = getImage(getCodeBase(), "images/AnimatedAirplane.gif");
    
    ImageIcon ic = new ImageIcon(pic);
    JLabel picL = new JLabel(ic);
    
//    JTextArea specialI = new JTextArea("Special Instructions", 10, 20);
//    Font specialIF = new Font("TimesNewRoman", 5, 15);
//    specialI.setFont(specialIF);
//    specialI.setForeground(Color.BLUE);
    

    Font picF = new Font("serif", 10, 20);
    
    aPplet.add(picL);
    //aPplet.add(specialI);
    aPplet.setBackground(purple);
    aPplet.setPreferredSize(getMinimumSize());
    
    add(aPplet, "South");
  }
  


  public void createFrame()
  {
	
    System.out.println(" At Method create Frame");
    JFrame popUpFrame = new JFrame("Pop UP Frame");
    popUpFrame.setBackground(Color.cyan);
    popUpFrame.setSize(100, 100);
    popUpFrame.setBounds(150, 150, 200, 200);
    JPanel pDisplay = new JPanel(new BorderLayout());
    Font font = new Font("Verdana", 1, 12);
    
    JLabel flightdeets = new JLabel("Flight Details");
    flightdeets.setBackground(purple);
    flightdeets.setOpaque(true);
    flightdeets.setFont(font);
    
    JTextArea flightinfo = new JTextArea("This is where the details for \nyour flight will appear");
    flightinfo.setLineWrap(true);
    

    ((JComponent)popUpFrame.getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    

    pDisplay.add(flightdeets, "North");
    pDisplay.add(flightinfo, "Center");
    popUpFrame.add(pDisplay);
    popUpFrame.setVisible(true);
  
  }
  public void border() {
	  System.out.println("border");
    JPanel leftside = new JPanel();
    leftside.setPreferredSize(new Dimension(25, 250));
    JPanel rightside = new JPanel();
    rightside.setPreferredSize(new Dimension(25, 250));
    leftside.setBackground(purple);
    rightside.setBackground(purple);
    add(leftside, "West");
    add(rightside, "East");
  }
  

  public void init()
  {
	  System.out.println("init");
    setLayout(new BorderLayout());
    setSize(800, 800);
    
    schnell();
    components();
    image();
    border();
   this.setSize(getPreferredSize());
  }
}