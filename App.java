import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class App extends JFrame{
String s="",k="",f="",zz="",result="";
int z=0,o=0;
   
    String sqq(String u){
        Double f;
        f=Double.valueOf(u)*Double.valueOf(u);
        zz=String.valueOf(f);
        z=0;
        return zz;
    }
    String addd(String u,String x){
        Double f;
        f=Double.valueOf(u)+Double.valueOf(x);
        zz=String.valueOf(f);
        z=0;
        return zz;
    }
    String minuss(String u,String x){
        Double f;
        f=Double.valueOf(x)-Double.valueOf(u);
        zz=String.valueOf(f);
        return zz;
    }
    String mulll(String u,String x){
        Double f;
        f=Double.valueOf(u)*Double.valueOf(x);
        zz=String.valueOf(f);
        return zz;
    }
     String ddd(String x,String u){
        Double f;
        f=Double.valueOf(u)/Double.valueOf(x);
        zz=String.valueOf(f);
        return zz;
    }
    String root(String x){
        int f;
        double ll;
        double number = Double.valueOf(x);
        ll= Math.sqrt(number);
        zz=String.valueOf(ll);
        return zz;
    }
    String pow(String x){
        int f;
        double ll;
        double number = Double.valueOf(x);
        ll= 1/number;
        zz=String.valueOf(ll);
        return zz;
    }
    App()
    {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(290,420);
        JTextField text = new JTextField();
        JRadioButton on = new JRadioButton("on");
        JRadioButton of = new JRadioButton("off");
        JButton sq = new JButton("<html>&radic;</html>");
        JButton min = new JButton("-");
        JButton c = new JButton("C");
        JButton del = new JButton("DEL");
        JButton div = new JButton("/");
        JButton a7 = new JButton("7");
        JButton a0 = new JButton("0");
        JButton a4 = new JButton("4");
        JButton a1 = new JButton("1");
        JButton a8 = new JButton("8");
        JButton a5 = new JButton("5");
        JButton a2 = new JButton("2");
        JButton a9 = new JButton("9");
        JButton a6 = new JButton("6");
        JButton mul = new JButton("x");
        JButton ad = new JButton("+");
        JButton a3 = new JButton("3");
        JButton dout = new JButton(".");
        JButton equal = new JButton("=");
        JButton x = new JButton("<html>X<sup>2</sup></html>");
        JButton one = new JButton("1/x");
        on.setSelected(true);
        text.setBounds(7,30,260,35);
        on.setBounds(7,70,60,20);
        of.setBounds(7,90,60,20);
        sq.setBounds(7,130,57,40);
        a7.setBounds(7,180,57,40);
        a4.setBounds(7,230,57,40);
        a1.setBounds(7,280,57,40);
        a0.setBounds(7,330,120,40);
        a8.setBounds(70,180,57,40);
        a5.setBounds(70,230,57,40);
        a2.setBounds(70,280,57,40);
        a9.setBounds(140,180,57,40);
        a6.setBounds(140,230,57,40);
        a3.setBounds(140,280,57,40);
        dout.setBounds(140,330,57,40);
        equal.setBounds(210,280,57,90);
        c.setBounds(70,70,57,40);
        del.setBounds(140,70,57,40);
        div.setBounds(210,70,57,40);
        min.setBounds(210,130,57,40);
        mul.setBounds(210,180,57,40);
        ad.setBounds(210,230,57,40);
        x.setBounds(70,130,57,40);
        one.setBounds(140,130,57,40);
        frame.add(x);
        frame.add(min);
        frame.add(one);
        frame.add(c);
        frame.add(mul);
        frame.add(ad);
        frame.add(del);
        frame.add(div);
        frame.add(equal);
        frame.add(a8);
        frame.add(a5);
        frame.add(a2);
        frame.add(a9);
        frame.add(a6);
        frame.add(a3);
        frame.add(dout);
        frame.add(a1);
        frame.add(on);
        frame.add(of);
        frame.add(a7);
        frame.add(a4);
        frame.add(sq);
        frame.add(a0);
        frame.add(text);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.BLACK);
        c.setBackground(Color.RED);
        del.setBackground(Color.RED);
        div.setBackground(Color.YELLOW);
        min.setBackground(Color.YELLOW);
        mul.setBackground(Color.YELLOW);
        ad.setBackground(Color.YELLOW);
        equal.setBackground(Color.YELLOW);
        on.setBackground(Color.black);
        of.setBackground(Color.black);
        c.setForeground(Color.WHITE);  
        del.setForeground(Color.WHITE);
        of.setForeground(Color.WHITE);
         on.setForeground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

      a0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a)
            {
                s=s+"0";
                text.setText(s);
            }
        });

     a1.addActionListener(new ActionListener() {
        public void  actionPerformed(ActionEvent a)
        {
            s=s+"1";
            text.setText(s);
        }
     });
     a2.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent a)
        {
            s=s+"2";
            text.setText(s);
        }
     });
     a3.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent a)
        {
            s=s+"3";
            text.setText(s);
        }
     });
     a4.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent a)
        {
            s=s+"4";
            text.setText(s);
        }
     });
     a5.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent a)
        {
            s=s+"5";
            text.setText(s);
        }
     });
     a6.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent a)
        {
            s=s+"6";
            text.setText(s);
        }
     });
     a7.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent a)
        {
            s=s+"7";
            text.setText(s);
        }
     });
     a8.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent a)
        {
            s=s+"8";
            text.setText(s);
        }
     });
     a9.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent a)
        {
            s=s+"9";
            text.setText(s);
        }
     });
     dout.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent a)
        {
            s=s+".";
            text.setText(s);
        }
     });
     x.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a) {
            zz = sqq(s);
            s=zz;
            k="";
            text.setText(s);
        }
    });
    sq.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a) {

             k = s; 
             s="";
             z=6;
             text.setText(s);
        }
    });
    one.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a) {

             k = s; 
             s="";
             z=7;
             text.setText(s);
        }
    });
     div.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a) {

             k = s; 
             s="";
             z=1;
             text.setText(s);
        }
    });
    mul.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a) {

             k = s; 
             s="";
             z=2;
             text.setText(s);
        }
    });
    ad.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a) {

             k = s; 
             s="";
             z=3;
             text.setText(s);
        }
    });
       min.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a) {

             k = s; 
             s="";
             z=4;
             text.setText(s);
        }
    });

     on.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a) {

            on.setSelected(true);
             of.setSelected(false);
            text.setVisible(true);
            s="";
            k="";
            z=0;
            text.setText(s);
        }
    });
     of.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a) {

            of.setSelected(true);
             on.setSelected(false);
            text.setVisible(false);
            s="";
            k="";
            z=0;
            text.setText(s);
        }
    });
    equal.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a) {
         switch(z)
         {
            case 1:
                  zz=ddd(s,k);
                  s=zz;
                  k="";
                  text.setText(zz);
             break;
            case 2:
                    zz=mulll(s,k);
                     s=zz;
                     k="";
                     text.setText(zz);
             break;
            case 3:
                      zz=addd(s,k);
                      s=zz;
                      k="";
                      text.setText(zz);
             break;
            case 4: 
                       zz=minuss(s,k);
                       s=zz;
                       k="";
                       text.setText(zz);
             break;
             case 6: 
                zz = root(k);
                s=zz;
                k="";
             text.setText(zz);
               break;
               case 7: 
                zz = pow(k);
                s=zz;
                k="";
             text.setText(zz);
               break;


         }

        }
    });
    c.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a) {
           s="";
           k="";
           z=0;
          text.setText(s);
        }
    });
    del.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a) {
          if(k=="")
          {
            s="";
          }
        else{
          k="";
        }
         
           text.setText(s);
        }
    });
   
     
    }
    public static void main(String args[]) {
        new App();
    }
}
