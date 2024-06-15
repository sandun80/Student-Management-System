import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;


class frame extends JFrame implements ActionListener {
    JPanel midpnl, sidepnl,cardpanel;
    JPanel adpan,uppan,repan,viewpan;
    JPanel cadpan,cuppan,crepan,cviewpan;
    JButton adsubmit,updabtn,rembtn,viewbtn;
    JButton stad, stup, stre, stview;
    JButton Cad,Cup,Cre,Cview;
    JLabel stlbl,courselbl;
    JTextField fd1,fd2,fd3,fd4,fd5,fd6,fd7,fd8,fd9;
    JTextField cfd1,cfd2,cfd3,cupfd1,cupfd,cupfd2,cupfd3,crefd;
    JTextArea carea,cviewarea,cuparea;
    JButton cadbtn,cupbtn,crebtn,cviewbtn,crebut;
    JLabel clbl1,clbl2,clbl3,clbl4,cuplbl1,cuplbl,cuplbl2,cuplbl3,cuplbl4,crelbl;
    JTextField refd,viewfd;
    JLabel relbl,viewlbl;
    JTextArea viewarea;
    JTextField ufd1,ufd2,ufd3,ufd4,ufd5,ufd6,ufd7,ufd8,ufd9;
    JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9;
    JLabel ulbl1,ulbl2,ulbl3,ulbl4,ulbl5,ulbl6,ulbl7,ulbl8,ulbl9;
    CardLayout card;



    frame( ) {

        midpnl = new JPanel(new GridBagLayout());
        GridBagConstraints gv = new GridBagConstraints();
        gv.insets = new Insets(0,0,0,0);
        JLabel txtlbl = new JLabel("Choose the service required");
        txtlbl.setFont(new Font("Arial",Font.BOLD,30));
        midpnl.setBackground(Color.GRAY);
        midpnl.add(txtlbl,gv);

        sidepnl = new JPanel();
        sidepnl.setLayout(new BoxLayout(sidepnl, BoxLayout.Y_AXIS));
        sidepnl.setBackground(Color.decode("#007dac"));
        sidepnl.setPreferredSize(new Dimension(300, 100));

        stlbl = new JLabel("<html><div style='text-align: center; line-height: 50px;'>STUDENTS</div></html>");
        stlbl.setForeground(Color.WHITE);
        stlbl.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,20));
        stlbl.setSize(new Dimension(300,50));
        stlbl.setFont(new Font("Arial",Font.BOLD,30));
        stlbl.setHorizontalAlignment(SwingConstants.CENTER);
        stlbl.setHorizontalTextPosition(SwingConstants.CENTER);
        stlbl.setBorder(BorderFactory.createEmptyBorder(30,10,0,10));

        stad = new JButton("ADD STUDENT");
        stad.setMaximumSize(new Dimension(300, 60));
        stad.setBackground(Color.decode("#daa400"));
        stad.setBorder(BorderFactory.createBevelBorder(1));
        stad.setFont(new Font("Franklin Gothic Demi",Font.PLAIN,20));
        stad.addActionListener(this);

        stup = new JButton("UPDATE STUDENT");
        stup.setMaximumSize(new Dimension(300,60));
        stup.setBackground(Color.decode("#daa400"));
        stup.setBorder(BorderFactory.createBevelBorder(1));
        stup.setFont(new Font("Franklin Gothic Demi",Font.PLAIN,20));
        stup.addActionListener(this);

        stre = new JButton("REMOVE STUDENT");
        stre.setMaximumSize(new Dimension(300,60));
        stre.setBackground(Color.decode("#daa400"));
        stre.setBorder(BorderFactory.createBevelBorder(1));
        stre.setFont(new Font("Franklin Gothic Demi",Font.PLAIN,20));
        stre.addActionListener(this);

        stview = new JButton("VIEW STUDENT");
        stview.setMaximumSize(new Dimension(300,60));
        stview.setBackground(Color.decode("#daa400"));
        stview.setBorder(BorderFactory.createBevelBorder(1));
        stview.setFont(new Font("Franklin Gothic Demi",Font.PLAIN,20));
        stview.addActionListener(this);

        sidepnl.add(stlbl);
        JLabel lbl = new JLabel("      ");
        sidepnl.add(lbl);
        Dimension buttonSize = new Dimension(200, 50);
        for (JButton btn : new JButton[]{stad, stup, stre, stview}) {
            btn.setPreferredSize(buttonSize);
            sidepnl.add(btn);
            sidepnl.add(Box.createVerticalStrut(20));
        }

        Cad = new JButton("ADD COURSE");
        Cad.setMaximumSize(new Dimension(300,60));
        Cad.addActionListener(this);
        Cad.setForeground(Color.WHITE);
        Cad.setBackground(Color.decode("#002973"));
        Cad.setBorder(BorderFactory.createBevelBorder(1));
        Cad.setFont(new Font("Franklin Gothic Demi",Font.PLAIN,20));

        Cup = new JButton("UPDATE COURSE");
        Cup.setMaximumSize(new Dimension(300,60));
        Cup.addActionListener(this);
        Cup.setForeground(Color.WHITE);
        Cup.setBackground(Color.decode("#002973"));
        Cup.setBorder(BorderFactory.createBevelBorder(1));
        Cup.setFont(new Font("Franklin Gothic Demi",Font.PLAIN,20));


        Cre = new JButton("REMOVE COURSE");
        Cre.setMaximumSize(new Dimension(300,60));
        Cre.addActionListener(this);
        Cre.setForeground(Color.WHITE);
        Cre.setBackground(Color.decode("#002973"));
        Cre.setBorder(BorderFactory.createBevelBorder(1));
        Cre.setFont(new Font("Franklin Gothic Demi",Font.PLAIN,20));

        Cview = new JButton("VIEW COURSE");
        Cview.setMaximumSize(new Dimension(300,60));
        Cview.addActionListener(this);
        Cview.setForeground(Color.WHITE);
        Cview.setBackground(Color.decode("#002973"));
        Cview.setBorder(BorderFactory.createBevelBorder(1));
        Cview.setFont(new Font("Franklin Gothic Demi",Font.PLAIN,20));

        courselbl = new JLabel("<html><div style='text-align: center; line-height: 50px;'>COURSES</div></html>");
        courselbl.setForeground(Color.WHITE);
        courselbl.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,20));
        courselbl.setSize(new Dimension(300,50));
        courselbl.setFont(new Font("Arial",Font.BOLD,30));
        courselbl.setHorizontalAlignment(SwingConstants.CENTER);
        courselbl.setHorizontalTextPosition(SwingConstants.CENTER);
        courselbl.setBorder(BorderFactory.createEmptyBorder(20,10,0,10));

        card = new CardLayout();
        cardpanel = new JPanel(card);

        adpan = new JPanel(new GridBagLayout());
        adpan.setBackground(Color.decode("#005744"));
        cardpanel.add(adpan,"addpanel");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(0,0,400,50);
        gbc.gridx = 0;
        gbc.gridy = 0;
        lbl1 = new JLabel("Student Name");
        lbl1.setForeground(Color.WHITE);
        lbl1.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        adpan.add(lbl1,gbc);

        fd1 = new JTextField();
        fd1.setPreferredSize(new Dimension(400,30));
        fd1.setFont(new Font("Arial",Font.ITALIC,20));
        gbc.gridx = 1;
        gbc.gridy = 0;
        adpan.add(fd1,gbc);

        lbl2 = new JLabel("Date of Birth");
        lbl2.setForeground(Color.WHITE);
        lbl2.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.insets = new Insets(0,0,300,50);
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        adpan.add(lbl2,gbc1);

        fd2 = new JTextField();
        fd2.setPreferredSize(new Dimension(400,30));
        fd2.setFont(new Font("Arial",Font.ITALIC,20));
        gbc1.gridx = 1;
        gbc1.gridy = 0;
        adpan.add(fd2,gbc1);

        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.insets = new Insets(0,0,200,50);
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        lbl3 = new JLabel("Gender");
        lbl3.setForeground(Color.WHITE);
        lbl3.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        adpan.add(lbl3,gbc2);
        fd3 = new JTextField();
        fd3.setPreferredSize(new Dimension(400,30));
        fd3.setFont(new Font("Arial",Font.ITALIC,20));
        gbc2.gridx = 1;
        gbc2.gridy = 0;
        adpan.add(fd3,gbc2);

        GridBagConstraints gbc3 = new GridBagConstraints();
        gbc3.insets = new Insets(0,0,100,50);
        gbc3.gridx = 0;
        gbc3.gridy = 0;
        lbl4 = new JLabel("Address");
        lbl4.setForeground(Color.WHITE);
        lbl4.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        adpan.add(lbl4,gbc3);
        fd4 = new JTextField();
        fd4.setFont(new Font("Arial",Font.ITALIC,20));
        fd4.setPreferredSize(new Dimension(400,30));
        gbc3.gridx = 1;
        gbc3.gridy = 0;
        adpan.add(fd4,gbc3);

        GridBagConstraints gbc4 = new GridBagConstraints();
        gbc4.insets = new Insets(0,0,0,50);
        lbl5 = new JLabel("Nationality");
        lbl5.setForeground(Color.WHITE);
        lbl5.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbc4.gridx = 0;
        gbc4.gridy = 0;
        adpan.add(lbl5,gbc4);
        fd5 = new JTextField();
        fd5.setFont(new Font("Arial",Font.ITALIC,20));
        fd5.setPreferredSize(new Dimension(400,30));
        gbc4.gridx = 1;
        gbc4.gridy = 0;
        adpan.add(fd5,gbc4);

        GridBagConstraints gbc5 = new GridBagConstraints();
        gbc5.insets = new Insets(100,0,0,50);
        lbl6 = new JLabel("Contact Number");
        lbl6.setForeground(Color.WHITE);
        lbl6.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbc5.gridx = 0;
        gbc5.gridy = 0;
        adpan.add(lbl6,gbc5);
        fd6 = new JTextField();
        fd6.setFont(new Font("Arial",Font.ITALIC,20));
        fd6.setPreferredSize(new Dimension(400,30));
        gbc5.gridx = 1;
        gbc5.gridy = 0;
        adpan.add(fd6,gbc5);

        GridBagConstraints gbc6 = new GridBagConstraints();
        gbc6.insets = new Insets(200,0,0,50);
        lbl7 = new JLabel("Email Address");
        lbl7.setForeground(Color.WHITE);
        lbl7.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbc6.gridx = 0;
        gbc6.gridy = 0;
        adpan.add(lbl7,gbc6);
        fd7 = new JTextField();
        fd7.setFont(new Font("Arial",Font.ITALIC,20));
        fd7.setPreferredSize(new Dimension(400,30));
        gbc6.gridx = 1;
        gbc6.gridy = 0;
        adpan.add(fd7,gbc6);

        GridBagConstraints gbc7 = new GridBagConstraints();
        gbc7.insets = new Insets(300,0,0,50);
        lbl8 = new JLabel("Parent/Guardian Name");
        lbl8.setForeground(Color.WHITE);
        lbl8.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbc7.gridx = 0;
        gbc7.gridy = 0;
        adpan.add(lbl8,gbc7);
        fd8 = new JTextField();
        fd8.setFont(new Font("Arial",Font.ITALIC,20));
        fd8.setPreferredSize(new Dimension(400,30));
        gbc7.gridx = 1;
        gbc7.gridy = 0;
        adpan.add(fd8,gbc7);

        GridBagConstraints gbc8 = new GridBagConstraints();
        gbc8.insets = new Insets(400,0,0,50);
        lbl9 = new JLabel("Parent's Number");
        lbl9.setForeground(Color.WHITE);
        lbl9.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbc8.gridx = 0;
        gbc8.gridy = 0;
        adpan.add(lbl9,gbc8);
        fd9 = new JTextField();
        fd9.setFont(new Font("Arial",Font.ITALIC,20));
        fd9.setPreferredSize(new Dimension(400,30));
        gbc8.gridx = 1;
        gbc8.gridy = 0;
        adpan.add(fd9,gbc8);

        GridBagConstraints gbc9 = new GridBagConstraints();
        gbc9.insets = new Insets(550,0,0,50);
        adsubmit = new JButton("SUBMIT");
        adsubmit.setPreferredSize(new Dimension(300,30));
        adsubmit.addActionListener(this);
        gbc9.gridx = 1;
        gbc9.gridy = 0;
        adpan.add(adsubmit,gbc9);

        uppan = new JPanel(new GridBagLayout());
        uppan.setBackground(Color.decode("#521628"));

        GridBagConstraints gbcx1 = new GridBagConstraints();
        gbcx1.insets = new Insets(0, 0, 30, 50);

        ulbl1 = new JLabel("Student Name");
        ulbl1.setForeground(Color.WHITE);
        ulbl1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
        gbcx1.gridx = 0;
        gbcx1.gridy = 0;
        uppan.add(ulbl1, gbcx1);

        ufd1 = new JTextField();
        ufd1.setText("This field is required");
        ufd1.setFont(new Font("Arial", Font.ITALIC, 20));
        ufd1.setPreferredSize(new Dimension(400, 30));
        gbcx1.gridx = 1;
        gbcx1.gridy = 0;
        uppan.add(ufd1, gbcx1);

        ufd1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (ufd1.getText().equals("This field is required")){
                    ufd1.setText("");
                }
            }
        });

        ulbl2 = new JLabel("Date of Birth");
        ulbl2.setForeground(Color.WHITE);
        ulbl2.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbcx1.gridx = 0;
        gbcx1.gridy = 1;
        uppan.add(ulbl2,gbcx1);

        ufd2 = new JTextField();
        ufd2.setPreferredSize(new Dimension(400,30));
        ufd2.setFont(new Font("Arial",Font.ITALIC,20));
        gbcx1.gridx = 1;
        gbcx1.gridy = 1;
        uppan.add(ufd2,gbcx1);

        ulbl3 = new JLabel("Gender");
        ulbl3.setForeground(Color.WHITE);
        ulbl3.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbcx1.gridx = 0;
        gbcx1.gridy = 2;
        uppan.add(ulbl3,gbcx1);

        ufd3 = new JTextField();
        ufd3.setPreferredSize(new Dimension(400,30));
        ufd3.setFont(new Font("Arial",Font.ITALIC,20));
        gbcx1.gridx = 1;
        gbcx1.gridy = 2;
        uppan.add(ufd3,gbcx1);

        ulbl4 = new JLabel("Address");
        ulbl4.setForeground(Color.WHITE);
        ulbl4.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbcx1.gridx = 0;
        gbcx1.gridy = 3;
        uppan.add(ulbl4,gbcx1);
        ufd4 = new JTextField();
        ufd4.setFont(new Font("Arial",Font.ITALIC,20));
        ufd4.setPreferredSize(new Dimension(400,30));
        gbcx1.gridx = 1;
        gbcx1.gridy = 3;
        uppan.add(ufd4,gbcx1);

        ulbl5 = new JLabel("Nationality");
        ulbl5.setForeground(Color.WHITE);
        ulbl5.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbcx1.gridx = 0;
        gbcx1.gridy = 4;
        uppan.add(ulbl5,gbcx1);
        ufd5 = new JTextField();
        ufd5.setFont(new Font("Arial",Font.ITALIC,20));
        ufd5.setPreferredSize(new Dimension(400,30));
        gbcx1.gridx = 1;
        gbcx1.gridy = 4;
        uppan.add(ufd5,gbcx1);

        ulbl6 = new JLabel("Contact Number");
        ulbl6.setForeground(Color.WHITE);
        ulbl6.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbcx1.gridx = 0;
        gbcx1.gridy = 5;
        uppan.add(ulbl6,gbcx1);
        ufd6 = new JTextField();
        ufd6.setFont(new Font("Arial",Font.ITALIC,20));
        ufd6.setPreferredSize(new Dimension(400,30));
        gbcx1.gridx = 1;
        gbcx1.gridy = 5;
        uppan.add(ufd6,gbcx1);

        ulbl7 = new JLabel("Email Address");
        ulbl7.setForeground(Color.WHITE);
        ulbl7.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbcx1.gridx = 0;
        gbcx1.gridy = 6;
        uppan.add(ulbl7,gbcx1);
        ufd7 = new JTextField();
        ufd7.setFont(new Font("Arial",Font.ITALIC,20));
        ufd7.setPreferredSize(new Dimension(400,30));
        gbcx1.gridx = 1;
        gbcx1.gridy = 6;
        uppan.add(ufd7,gbcx1);

        ulbl8 = new JLabel("Parent/Guardian Name");
        ulbl8.setForeground(Color.WHITE);
        ulbl8.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbcx1.gridx = 0;
        gbcx1.gridy = 7;
        uppan.add(ulbl8,gbcx1);
        ufd8 = new JTextField();
        ufd8.setFont(new Font("Arial",Font.ITALIC,20));
        ufd8.setPreferredSize(new Dimension(400,30));
        gbcx1.gridx = 1;
        gbcx1.gridy = 7;
        uppan.add(ufd8,gbcx1);

        ulbl9 = new JLabel("Parent's Number");
        ulbl9.setForeground(Color.WHITE);
        ulbl9.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbcx1.gridx = 0;
        gbcx1.gridy = 8;
        uppan.add(ulbl9,gbcx1);
        ufd9 = new JTextField();
        ufd9.setFont(new Font("Arial",Font.ITALIC,20));
        ufd9.setPreferredSize(new Dimension(400,30));
        gbcx1.gridx = 1;
        gbcx1.gridy = 8;
        uppan.add(ufd9,gbcx1);

        updabtn = new JButton("UPDATE");
        updabtn.addActionListener(this);
        updabtn.setPreferredSize(new Dimension(300,30));
        gbcx1.gridx = 1;
        gbcx1.gridy = 9;
        uppan.add(updabtn,gbcx1);

        cardpanel.add(uppan, "uppanel");

        repan = new JPanel(new GridBagLayout());
        repan.setBackground(Color.decode("#3f024a"));
        cardpanel.add(repan,"removepan");

        GridBagConstraints gbv = new GridBagConstraints();
        gbv.insets = new Insets(0,0,20,50);
        refd = new JTextField();
        refd.setFont(new Font("Arial",Font.ITALIC,20));
        refd.setPreferredSize(new Dimension(400,30));
        gbv.gridx = 1;
        gbv.gridy = 0;
        repan.add(refd,gbv);

        relbl = new JLabel("Student Name");
        relbl.setForeground(Color.WHITE);
        relbl.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbv.gridx = 0;
        gbv.gridy = 0;
        repan.add(relbl,gbv);

        rembtn = new JButton("REMOVE");
        rembtn.addActionListener(this);
        rembtn.setPreferredSize(new Dimension(300,30));
        gbv.gridx = 1;
        gbv.gridy = 1;
        repan.add(rembtn,gbv);


        viewpan = new JPanel(new GridBagLayout());
        GridBagConstraints gbl = new GridBagConstraints();
        gbl.insets = new Insets(0,0,50,50);
        viewpan.setBackground(Color.decode("#3b0000"));
        cardpanel.add(viewpan,"viewpan");

        viewlbl = new JLabel("Student Full Name");
        viewlbl.setForeground(Color.WHITE);
        viewlbl.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbl.gridx = 0;
        gbl.gridy = 0;
        viewpan.add(viewlbl,gbl);

        viewfd = new JTextField();
        viewfd.setFont(new Font("Arial",Font.ITALIC,20));
        viewfd.setPreferredSize(new Dimension(400,30));
        gbl.gridx = 1;
        gbl.gridy = 0;
        viewpan.add(viewfd,gbl);

        viewarea = new JTextArea();
        viewarea.setPreferredSize(new Dimension(400,400));
        viewarea.setForeground(Color.WHITE);
        viewarea.setFont(new Font("Calibri",Font.PLAIN,20));
        viewarea.setBackground(Color.BLACK);
        viewarea.setEnabled(false);
        gbl.gridx = 1;
        gbl.gridy = 1;
        viewpan.add(viewarea,gbl);

        viewbtn = new JButton("VIEW STUDENT DETAILS");
        viewbtn.addActionListener(this);
        viewbtn.setPreferredSize(new Dimension(300,30));
        gbl.gridx = 1;
        gbl.gridy = 2;
        viewpan.add(viewbtn,gbl);

        cardpanel.add(midpnl,"midpan");
        card.show(cardpanel,"midpan");

        sidepnl.add(courselbl);
        JLabel lbl2 = new JLabel("      ");
        sidepnl.add(lbl2);
        for (JButton but : new JButton[]{Cad,Cup,Cre,Cview}){
            sidepnl.add(but);
            sidepnl.add(Box.createVerticalStrut(20));
        }

        cadpan = new JPanel(new GridBagLayout());
        GridBagConstraints gbd = new GridBagConstraints();
        gbd.insets = new Insets(0,0,40,50);
        cadpan.setBackground(Color.decode("#00706c"));
        cardpanel.add(cadpan,"cadd");

        clbl1 = new JLabel("Course Name");
        clbl1.setForeground(Color.WHITE);
        clbl1.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbd.gridx = 0;
        gbd.gridy = 0;
        cadpan.add(clbl1,gbd);

        cfd1 = new JTextField();
        cfd1.setFont(new Font("Arial",Font.ITALIC,20));
        cfd1.setPreferredSize(new Dimension(400,30));
        gbd.gridx = 1;
        gbd.gridy = 0;
        cadpan.add(cfd1,gbd);

        clbl2 = new JLabel("Course ID");
        clbl2.setForeground(Color.WHITE);
        clbl2.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbd.gridx = 0;
        gbd.gridy = 1;
        cadpan.add(clbl2,gbd);

        cfd2 = new JTextField();
        cfd2.setFont(new Font("Arial",Font.ITALIC,20));
        cfd2.setPreferredSize(new Dimension(400,30));
        gbd.gridx = 1;
        gbd.gridy = 1;
        cadpan.add(cfd2,gbd);

        clbl3 = new JLabel("Duration");
        clbl3.setForeground(Color.WHITE);
        clbl3.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbd.gridx = 0;
        gbd.gridy = 2;
        cadpan.add(clbl3,gbd);

        cfd3 = new JTextField();
        cfd3.setFont(new Font("Arial",Font.ITALIC,20));
        cfd3.setPreferredSize(new Dimension(400,30));
        gbd.gridx = 1;
        gbd.gridy = 2;
        cadpan.add(cfd3,gbd);

        clbl4 = new JLabel("Course Content");
        clbl4.setForeground(Color.WHITE);
        clbl4.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbd.gridx = 0;
        gbd.gridy = 3;
        cadpan.add(clbl4,gbd);

        carea = new JTextArea();
        carea.setPreferredSize(new Dimension(300,300));
        gbd.gridx = 1;
        gbd.gridy = 3;
        cadpan.add(carea,gbd);

        cadbtn = new JButton("SUBMIT");
        cadbtn.setPreferredSize(new Dimension(300,30));
        cadbtn.addActionListener(this);
        gbd.gridx = 1;
        gbd.gridy = 4;
        cadpan.add(cadbtn,gbd);

        cuppan = new JPanel( new GridBagLayout());
        GridBagConstraints gbdx = new GridBagConstraints();
        gbdx.insets = new Insets(0,0,40,50);
        cuppan.setBackground(Color.decode("#a38500"));
        cardpanel.add(cuppan,"cuppan");

        cuplbl = new JLabel("Course Name");
        cuplbl.setForeground(Color.WHITE);
        cuplbl.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbdx.gridx = 0;
        gbdx.gridy = 0;
        cuppan.add(cuplbl,gbdx);

        cupfd = new JTextField();
        cupfd.setFont(new Font("Arial",Font.ITALIC,20));
        cupfd.setText("This field is required");
        cupfd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (cupfd.getText().equals("This field is required")){
                    cupfd.setText("");
                }
            }
        });
        cupfd.setPreferredSize(new Dimension(400,30));
        gbdx.gridx = 1;
        gbdx.gridy = 0;
        cuppan.add(cupfd,gbdx);

        cuplbl2 = new JLabel("Course ID");
        cuplbl2.setForeground(Color.WHITE);
        cuplbl2.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbdx.gridx = 0;
        gbdx.gridy = 1;
        cuppan.add(cuplbl2,gbdx);

        cupfd2 = new JTextField();
        cupfd2.setFont(new Font("Arial",Font.ITALIC,20));
        cupfd2.setPreferredSize(new Dimension(400,30));
        gbdx.gridx = 1;
        gbdx.gridy = 1;
        cuppan.add(cupfd2,gbdx);

        cuplbl3 = new JLabel("Duration");
        cuplbl3.setForeground(Color.WHITE);
        cuplbl3.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbdx.gridx = 0;
        gbdx.gridy = 2;
        cuppan.add(cuplbl3,gbdx);

        cupfd3 = new JTextField();
        cupfd3.setFont(new Font("Arial",Font.ITALIC,20));
        cupfd3.setPreferredSize(new Dimension(400,30));
        gbdx.gridx = 1;
        gbdx.gridy = 2;
        cuppan.add(cupfd3,gbdx);

        cuplbl4 = new JLabel("Course Content");
        cuplbl4.setForeground(Color.WHITE);
        cuplbl4.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbdx.gridx = 0;
        gbdx.gridy = 3;
        cuppan.add(cuplbl4,gbdx);

        cuparea = new JTextArea();
        cuparea.setPreferredSize(new Dimension(300,300));
        gbdx.gridx = 1;
        gbdx.gridy = 3;
        cuppan.add(cuparea,gbdx);

        cupbtn = new JButton("SUBMIT");
        cupbtn.setPreferredSize(new Dimension(300,30));
        cupbtn.addActionListener(this);
        gbdx.gridx = 1;
        gbdx.gridy = 4;
        cuppan.add(cupbtn,gbdx);

        crepan = new JPanel(new GridBagLayout());
        GridBagConstraints gbb = new GridBagConstraints();
        gbb.insets = new Insets(0,0,50,50);
        crepan.setBackground(Color.decode("#000130"));
        cardpanel.add(crepan,"crepan");

        crefd = new JTextField();
        crefd.setFont(new Font("Arial",Font.ITALIC,20));
        crefd.setPreferredSize(new Dimension(400,30));
        gbb.gridx = 1;
        gbb.gridy = 0;
        crepan.add(crefd,gbb);

        crelbl = new JLabel("Course Name");
        crelbl.setForeground(Color.WHITE);
        crelbl.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbb.gridx = 0;
        gbb.gridy = 0;
        crepan.add(crelbl,gbb);

        crebut = new JButton("REMOVE");
        crebut.addActionListener(this);
        crebut.setPreferredSize(new Dimension(300,30));
        gbb.gridx = 1;
        gbb.gridy = 1;
        crepan.add(crebut,gbb);

        cviewpan = new JPanel(new GridBagLayout());
        GridBagConstraints gbdd = new GridBagConstraints();
        gbdd.insets = new Insets(0,0,50,50);
        cviewpan.setBackground(Color.decode("#700031"));
        cardpanel.add(cviewpan,"cviewpan");

        cuplbl1 = new JLabel("Full Course Name");
        cuplbl1.setForeground(Color.WHITE);
        cuplbl1.setFont(new Font("Franklin Gothic Demi Cond",Font.PLAIN,20));
        gbdd.gridx = 0;
        gbdd.gridy = 0;
        cviewpan.add(cuplbl1,gbdd);

        cupfd1 = new JTextField();
        cupfd1.setFont(new Font("Arial",Font.ITALIC,20));
        cupfd1.setPreferredSize(new Dimension(400,30));
        gbdd.gridx = 1;
        gbdd.gridy = 0;
        cviewpan.add(cupfd1,gbdd);

        cviewarea = new JTextArea();
        cviewarea.setPreferredSize(new Dimension(400,400));
        cviewarea.setForeground(Color.BLACK);
        cviewarea.setFont(new Font("Calibri",Font.PLAIN,20));
        cviewarea.setEditable(false);
        gbdd.gridx = 1;
        gbdd.gridy = 5;
        cviewpan.add(cviewarea,gbdd);

        cviewbtn = new JButton("VIEW DETAILS");
        cviewbtn.setPreferredSize(new Dimension(300,30));
        cviewbtn.addActionListener(this);
        gbdd.gridx = 1;
        gbdd.gridy = 6;
        cviewpan.add(cviewbtn,gbdd);

        setLayout(new BorderLayout());
        this.add(sidepnl, BorderLayout.WEST);
        this.add(cardpanel, BorderLayout.CENTER);
    }

    public void upmethod() {
        String url = "jdbc:mysql://localhost:3306/smsdata";
        String user = "root";
        String pass = "";

       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection(url,user,pass);
           boolean updated = false;
           if (!ufd1.getText().isEmpty()){
               String query1 = "SELECT * FROM students WHERE stname= ?";
               PreparedStatement statement = connection.prepareStatement(query1);
               statement.setString(1,ufd1.getText());
               ResultSet resultSet = statement.executeQuery();

               if (resultSet.next()){
                   if (!ufd2.getText().isEmpty()){
                       String query2 = "UPDATE students SET birthday = ? WHERE stname = ?";
                       PreparedStatement statement1 = connection.prepareStatement(query2);
                       statement1.setString(1,ufd2.getText());
                       statement1.setString(2,ufd1.getText());
                       statement1.executeUpdate();
                       ufd2.setText("");
                       updated = true;

                   }
                   if (!ufd3.getText().isEmpty()){
                       String query3 = "UPDATE students SET gender = ? WHERE stname= ?";
                       PreparedStatement statement2 = connection.prepareStatement(query3);
                       statement2.setString(1,ufd3.getText());
                       statement2.setString(2,ufd1.getText());
                       statement2.executeUpdate();
                       ufd3.setText("");
                       updated = true;

                   }
                   if (!ufd4.getText().isEmpty()){
                       String query4 = "UPDATE students SET address =? WHERE stname =?";
                       PreparedStatement statement3 = connection.prepareStatement(query4);
                       statement3.setString(1,ufd4.getText());
                       statement3.setString(2,ufd1.getText());
                       statement3.executeUpdate();
                       ufd4.setText("");
                       updated = true;
                   }
                   if (!ufd5.getText().isEmpty()){
                       String query5 = "UPDATE students SET nation = ? WHERE stname = ?";
                       PreparedStatement statement4 = connection.prepareStatement(query5);
                       statement4.setString(1,ufd5.getText());
                       statement4.setString(2,ufd1.getText());
                       statement4.executeUpdate();
                       ufd5.setText("");
                       updated = true;
                   }
                   if (!ufd6.getText().isEmpty()){
                       String query6 = "UPDATE students SET contact = ? WHERE stname = ?";
                       PreparedStatement statement5 = connection.prepareStatement(query6);
                       statement5.setString(1,ufd6.getText());
                       statement5.setString(2,ufd1.getText());
                       statement5.executeUpdate();
                       ufd6.setText("");
                       updated = true;
                   }
                   if (!ufd7.getText().isEmpty()){
                       String query7 = "UPDATE students SET email = ? WHERE stname = ?";
                       PreparedStatement statement6 = connection.prepareStatement(query7);
                       statement6.setString(1,ufd7.getText());
                       statement6.setString(2,ufd1.getText());
                       statement6.executeUpdate();
                       ufd7.setText("");
                       updated = true;
                   }
                   if (!ufd8.getText().isEmpty()){
                       String query8 = "UPDATE students SET pname = ? WHERE stname = ?";
                       PreparedStatement statement7 = connection.prepareStatement(query8);
                       statement7.setString(1,ufd8.getText());
                       statement7.setString(2,ufd1.getText());
                       statement7.executeUpdate();
                       ufd8.setText("");
                       updated = true;
                   }
                   if (!ufd9.getText().isEmpty()){
                       String query9 = "UPDATE students SET pnumber = ? WHERE stname = ?";
                       PreparedStatement statement8 = connection.prepareStatement(query9);
                       statement8.setString(1,ufd9.getText());
                       statement8.setString(2,ufd1.getText());
                       statement8.executeUpdate();
                       ufd9.setText("");
                       updated = true;
                   }

                   if (updated){
                       JOptionPane.showMessageDialog(this,"Data Updated Successfully");
                       ufd1.setText(" ");
                   }else{
                       JOptionPane.showMessageDialog(this,"Fields are EMPTY");
                   }

               }
               else {
                   JOptionPane.showMessageDialog(this,"Student Not Found");
               }

           }else {
               JOptionPane.showMessageDialog(this,"Student name is required");
           }
       }catch (Exception e){
           System.out.println(e);
       }
    }



    public void remethod(){
        String url = "jdbc:mysql://localhost:3306/smsdata";
        String user = "root";
        String pass = "";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,pass);
            if (!refd.getText().isEmpty()){
                String query = "SELECT * FROM students WHERE stname = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1,refd.getText());
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()){
                    String query2 = "DELETE FROM students WHERE stname = ?";
                    PreparedStatement statement1 = connection.prepareStatement(query2);
                    statement1.setString(1,refd.getText());
                    statement1.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Record Removed Successfully");
                    refd.setText("");
                }
                else {
                    JOptionPane.showMessageDialog(this,"Record Not Found");
                }
            }else{
                JOptionPane.showMessageDialog(this,"Field is empty");
            }


        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void addmethod() {
        for (JTextField fd : new JTextField[]{fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9}) {
            if (fd.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Fields can't be empty");
                return;
            }
        }

        try {
            String name = fd1.getText();
            String dob = fd2.getText();
            String gender = fd3.getText();
            String address = fd4.getText();
            String nation = fd5.getText();
            String contact = fd6.getText();
            String mail = fd7.getText();
            String pnme = fd8.getText();
            String pnum = fd9.getText();

            String query = "INSERT INTO Students (stname, birthday, gender, address, nation, contact, email, pname, pnumber) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            String url = "jdbc:mysql://localhost:3306/smsdata";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, pass);

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, dob);
            statement.setString(3, gender);
            statement.setString(4, address);
            statement.setString(5, nation);
            statement.setString(6, contact);
            statement.setString(7, mail);
            statement.setString(8, pnme);
            statement.setString(9, pnum);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data saved successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to save data.");
            }

            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }

        for (JTextField field : new JTextField[]{fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9}) {
            field.setText("");
        }
    }


    public void viewmethod(String name) {
        if (viewfd.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Field is EMPTY");
            return;
        }

        try {
            String query = "SELECT * FROM Students WHERE stname = ?";
            String query2 = "SELECT stname FROM Students";

            String url = "jdbc:mysql://localhost:3306/smsdata";
            String user = "root";
            String pass = "";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, pass);

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);

            ResultSet resultSet = statement.executeQuery();

            StringBuilder resultText = new StringBuilder();
            while (resultSet.next()) {
                String nme = resultSet.getString("stname");
                String dob = resultSet.getString("birthday");
                String gender = resultSet.getString("gender");
                String address = resultSet.getString("address");
                String nation = resultSet.getString("nation");
                String contact = resultSet.getString("contact");
                String mail = resultSet.getString("email");
                String pname = resultSet.getString("pname");
                String pnum = resultSet.getString("pnumber");

                resultText.append("Student name : ").append(nme).append("\n");
                resultText.append("Date of Birth : ").append(dob).append("\n");
                resultText.append("Gender : ").append(gender).append("\n");
                resultText.append("Address : ").append(address).append("\n");
                resultText.append("Nationality : ").append(nation).append("\n");
                resultText.append("Contact Number : ").append(contact).append("\n");
                resultText.append("Email Address : ").append(mail).append("\n");
                resultText.append("Parent Name : ").append(pname).append("\n");
                resultText.append("Parent C.Number : ").append(pnum).append("\n");
            }

            viewarea.setText(resultText.toString());

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Caddmethod() {
        String cname = cfd1.getText();
        String cid = cfd2.getText();
        String duration = cfd3.getText();
        String content = carea.getText();

        String query1 = "INSERT INTO courses(course_name,course_id,duration,content) VALUES (?,?,?,?)";
        String url = "jdbc:mysql://localhost:3306/smsdata";
        String user = "root";
        String pass = "";

        for (JTextField fd : new JTextField[]{cfd1,cfd2,cfd3}){
            if (fd.getText().isEmpty() || carea.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Fields are EMPTY");
                return;
            }
        }

        try (Connection connection = DriverManager.getConnection(url, user, pass);
             PreparedStatement statement = connection.prepareStatement(query1)) {

            statement.setString(1, cname);
            statement.setString(2, cid);
            statement.setString(3, duration);
            statement.setString(4, content);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data Added Successfully");
                for (JTextField fc : new JTextField[]{cfd1,cfd2,cfd3}){
                    fc.setText("");
                    carea.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add data. No rows affected.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,"Server Error Occurred");
        }
    }

    public void Cviewmethod(){

        String viewname = cupfd1.getText();

        String query2 = "SELECT * FROM courses WHERE course_name = ?";
        String url = "jdbc:mysql://localhost:3306/smsdata";
        String user = "root";
        String pass = "";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,pass);

            PreparedStatement statement = connection.prepareStatement(query2);
            statement.setString(1,viewname);

            ResultSet resultSet = statement.executeQuery();

            StringBuilder retxt = new StringBuilder();
            while (resultSet.next()){
                String name = resultSet.getString("course_name");
                String id = resultSet.getString("course_id");
                String duration = resultSet.getString("duration");
                String cont = resultSet.getString("content");

                retxt.append("Course Name : ").append(name).append("\n");
                retxt.append("Course ID : ").append(id).append("\n");
                retxt.append("Duration : ").append(duration).append("\n" + "\n");
                retxt.append("Course Content : ").append(cont).append("\n");
            }
            cviewarea.setText(retxt.toString());

        }catch (Exception e){
            System.out.println(e);
        }

    }

    public void Cupmethod() {
        String url = "jdbc:mysql://localhost:3306/smsdata";
        String user = "root";
        String pass = "";

        try{
            if (!cupfd.getText().isEmpty()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, user, pass);
                String query = "SELECT * FROM courses WHERE course_name = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, cupfd.getText());
                ResultSet resultSet = statement.executeQuery();
                boolean update = false;

                if (resultSet.next()) {
                    if (!cupfd2.getText().isEmpty()) {
                        String query2 = "UPDATE courses SET course_id = ? WHERE course_name = ?";
                        PreparedStatement statement1 = connection.prepareStatement(query2);
                        statement1.setString(1, cupfd2.getText());
                        statement1.setString(2, cupfd.getText());
                        statement1.executeUpdate();
                        update = true;
                        cupfd2.setText("");
                    }
                    if (!cupfd3.getText().isEmpty()) {
                        String query3 = "UPDATE courses SET duration = ? WHERE course_name = ?";
                        PreparedStatement statement2 = connection.prepareStatement(query3);
                        statement2.setString(1, cupfd3.getText());
                        statement2.setString(2, cupfd.getText());
                        statement2.executeUpdate();
                        update = true;
                        cupfd3.setText("");
                    }
                    if (!cuparea.getText().isEmpty()) {
                        String query4 = "UPDATE courses SET content = ? WHERE course_name = ?";
                        PreparedStatement statement3 = connection.prepareStatement(query4);
                        statement3.setString(1, cuparea.getText());
                        statement3.setString(2, cupfd.getText());
                        statement3.executeUpdate();
                        update = true;
                        cuparea.setText("");
                    }
                    if (update) {
                        JOptionPane.showMessageDialog(this, "Records Updated Successfully");
                        cupfd.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "Nothing to be updated");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Record not found");
                }
                connection.close();
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a course name");
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void Cremethod(){
        String url = "jdbc:mysql://localhost:3306/smsdata";
        String user = "root";
        String pass = "";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, pass);
            if (!crefd.getText().isEmpty()){
                String query = "SELECT * FROM courses WHERE course_name = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1,crefd.getText());
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()){
                    String query2 = "DELETE FROM courses WHERE course_name = ?";
                    PreparedStatement statement1 = connection.prepareStatement(query2);
                    statement1.setString(1,crefd.getText());
                    statement1.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Record Removed Successfully");
                    crefd.setText("");
                }
                else {
                    JOptionPane.showMessageDialog(this,"Record Not Found");
                }
            }
            else {
                JOptionPane.showMessageDialog(this,"Field is empty");
            }


        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == stad){
            card.show(cardpanel,"addpanel");
        }
        if (e.getSource() == stup){
            card.show(cardpanel,"uppanel");
        }
        if (e.getSource() == stre){
            card.show(cardpanel,"removepan");
        }
        if (e.getSource() == stview){
            card.show(cardpanel,"viewpan");
        }
        if (e.getSource() == Cad){
            card.show(cardpanel,"cadd");
        }
        if (e.getSource() == Cup){
            card.show(cardpanel,"cuppan");
        }
        if (e.getSource() == Cre){
            card.show(cardpanel,"crepan");
        }
        if (e.getSource() == Cview){
            card.show(cardpanel,"cviewpan");
        }

        
        if (e.getSource() == adsubmit){
           addmethod();
        }

        if (e.getSource() == updabtn){
            upmethod();
        }

        if (e.getSource() == rembtn){
            remethod();
        }
        if (e.getSource() == viewbtn){
            String name = viewfd.getText();
            viewmethod(name);
        }

        if (e.getSource() == cadbtn){
            Caddmethod();
        }
        if (e.getSource() == cviewbtn){
            Cviewmethod();
        }
        if (e.getSource() == cupbtn){
            Cupmethod();
        }
        if (e.getSource() == crebut){
            Cremethod();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        frame screen = new frame();
        screen.setSize(1000, 700);
        screen.setVisible(true);
        screen.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        screen.setTitle("Student Management System");
        screen.setLocation(200, 80);
    }
}
