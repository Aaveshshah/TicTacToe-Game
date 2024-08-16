
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class game implements ActionListener {

    int check, t, i, temp;
    int ss;
    int j = 0;
    int a = 0;
    int count0 = 0;
    int count1 = 0;
    int count2 = 0;
    String s1, s2;
    Font f = new Font("Helvetica", Font.BOLD, 40);
    Font f2 = new Font("Helvetica", Font.BOLD, 20);
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton();
    JButton b4 = new JButton();
    JButton b5 = new JButton();
    JButton b6 = new JButton();
    JButton b7 = new JButton();
    JButton b8 = new JButton();
    JButton b9 = new JButton();
    JButton reset = new JButton();
    JButton exit = new JButton();

    Label l1, l2, l3;
    JFrame frame = new JFrame("Tic-Tac-Toe");

    public void allbtn() {
        l1 = new Label();
        l1.setBackground(Color.black);
        l1.setBounds(300, 0, 300, 100);
        l1.setForeground(Color.white);
        l1.setFont(f2);
        frame.add(l1);

        l2 = new Label();
        l2.setBackground(Color.black);
        l2.setBounds(300, 100, 300, 100);
        l2.setForeground(Color.white);
        l2.setFont(f2);
        l2.setText("SCORE X :");
        frame.add(l2);

        l3 = new Label();
        l3.setBackground(Color.black);
        l3.setBounds(300, 200, 300, 100);
        l3.setForeground(Color.white);
        l3.setFont(f2);
        l3.setText("SCORE 0 :");
        frame.add(l3);

        b1.setSize(100, 100);
        b1.setLocation(0, 0);
        frame.add(b1);
        b1.setBackground(Color.yellow);
        b1.setForeground(Color.black);
        b1.setFont(f);

        b2.setSize(100, 100);
        b2.setLocation(100, 0);
        frame.add(b2);
        b2.setBackground(Color.yellow);
        b2.setForeground(Color.black);
        b2.setFont(f);

        b3.setSize(100, 100);
        b3.setLocation(200, 0);
        frame.add(b3);
        b3.setBackground(Color.yellow);
        b3.setForeground(Color.black);
        b3.setFont(f);

        b4.setSize(100, 100);
        b4.setLocation(0, 100);
        frame.add(b4);
        b4.setBackground(Color.yellow);
        b4.setForeground(Color.black);
        b4.setFont(f);

        b5.setSize(100, 100);
        b5.setLocation(100, 100);
        frame.add(b5);
        b5.setBackground(Color.yellow);
        b5.setForeground(Color.black);
        b5.setFont(f);

        b6.setSize(100, 100);
        b6.setLocation(200, 100);
        frame.add(b6);
        b6.setBackground(Color.yellow);
        b6.setForeground(Color.black);
        b6.setFont(f);

        b7.setSize(100, 100);
        b7.setLocation(0, 200);
        frame.add(b7);
        b7.setBackground(Color.yellow);
        b7.setForeground(Color.black);
        b7.setFont(f);

        b8.setSize(100, 100);
        b8.setLocation(100, 200);
        frame.add(b8);
        b8.setBackground(Color.yellow);
        b8.setForeground(Color.black);
        b8.setFont(f);

        b9.setSize(100, 100);
        b9.setLocation(200, 200);
        frame.add(b9);
        b9.setBackground(Color.yellow);
        b9.setForeground(Color.black);
        b9.setFont(f);

        reset.setSize(300, 100);
        reset.setLocation(0, 300);
        reset.setText("NEW GAME");
        frame.add(reset);
        reset.setBackground(Color.black);
        reset.setForeground(Color.white);
        reset.setFont(f2);

        exit.setSize(300, 100);
        exit.setLocation(300, 300);
        frame.add(exit);
        exit.setBackground(Color.yellow);
        exit.setForeground(Color.black);
        exit.setText("EXIT");
        exit.setFont(f);

        frame.setLayout(null);
        frame.setLocation(450, 100);
        frame.setSize(610, 435);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    public void btnfun() {

        l1.setText("Player X Turn");

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j++;
                if (a == 0) {

                    b1.setText("X");
                    a = 1;
                    l1.setEnabled(false);
                    l1.setText("Player 0 Turn");
                    b1.setEnabled(false);
                    check = possiblity();
                    if (t == 1) {

                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {
                            score();
                            disable();

                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;
                    if (l1.getText() == "Player 0 win") {
                        score();
                        disable();

                    }

                    if (j == 9) {
                        l1.setText("Game Draw");

                    } else
                        ;
                } else {
                    b1.setText("0");
                    a = 0;
                    l1.setEnabled(false);
                    l1.setText("Player X Turn");
                    b1.setEnabled(false);
                    check = possiblity();
                    if (t == 1) {
                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {
                            score();
                            disable();

                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;
                    if (l1.getText() == "Player 0 win") {
                        score();
                        disable();

                    }

                    if (j == 9) {
                        l1.setText("Game Draw");

                    } else
                        ;
                }

            }

        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j++;
                if (a == 0) {

                    b2.setText("X");
                    a = 1;
                    l1.setEnabled(false);
                    l1.setText("Player 0 Turn");
                    b2.setEnabled(false);
                    check = possiblity();
                    if (t == 1) {
                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {
                            score();
                            disable();

                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;
                    if (l1.getText() == "Player 0 win") {
                        score();
                        disable();

                    }

                    if (j == 9) {
                        l1.setText("Game Draw");

                    } else
                        ;

                } else {
                    b2.setText("0");
                    a = 0;
                    l1.setEnabled(false);
                    l1.setText("Player X Turn");
                    b2.setEnabled(false);
                    check = possiblity();
                    if (t == 1) {
                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {
                            score();
                            disable();

                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;
                    if (l1.getText() == "Player 0 win") {
                        score();
                        disable();

                    }
                    if (j == 9) {

                        l1.setText("Game Draw");

                    } else
                        ;
                }

            }

        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j++;
                if (a == 0) {

                    b3.setText("X");
                    a = 1;
                    l1.setEnabled(false);
                    l1.setText("Player 0 Turn");
                    b3.setEnabled(false);
                    check = possiblity();
                    if (t == 1) {
                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {
                            score();
                            disable();

                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;
                    if (l1.getText() == "Player 0 win") {
                        score();
                        disable();

                    }

                    if (j == 9) {
                        l1.setText("Game Draw");

                    } else
                        ;

                } else {
                    b3.setText("0");
                    a = 0;
                    l1.setEnabled(false);
                    l1.setText("Player X Turn");
                    b3.setEnabled(false);
                    check = possiblity();
                    if (t == 1) {
                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {
                            score();
                            disable();

                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;
                    if (l1.getText() == "Player 0 win") {
                        score();
                        disable();

                    }

                    if (j == 9) {
                        l1.setText("Game Draw");

                    } else
                        ;
                }
            }

        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j++;
                if (a == 0) {

                    b4.setText("X");
                    a = 1;
                    l1.setEnabled(false);
                    l1.setText("Player 0 Turn");
                    b4.setEnabled(false);
                    check = possiblity();
                    if (t == 1) {
                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {
                            score();
                            disable();

                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;
                    if (l1.getText() == "Player 0 win") {
                        score();
                        disable();

                    }

                    if (j == 9) {
                        l1.setText("Game Draw");

                    } else
                        ;
                } else {
                    b4.setText("0");
                    a = 0;
                    l1.setEnabled(false);
                    l1.setText("Player X Turn");
                    b4.setEnabled(false);
                    check = possiblity();
                    if (t == 1) {
                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {
                            score();
                            disable();

                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;
                    if (l1.getText() == "Player 0 win") {
                        score();
                        disable();

                    }

                    if (j == 9) {
                        l1.setText("Game Draw");

                    } else
                        ;
                }

            }

        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j++;
                if (a == 0) {

                    b5.setText("X");
                    a = 1;
                    l1.setEnabled(false);
                    l1.setText("Player 0 Turn");
                    b5.setEnabled(false);
                    check = possiblity();
                    if (t == 1) {
                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {
                            score();
                            disable();

                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;
                    if (l1.getText() == "Player 0 win") {
                        score();
                        disable();

                    }

                    if (j == 9) {
                        l1.setText("Game Draw");

                    } else
                        ;
                } else {
                    b5.setText("0");
                    a = 0;
                    l1.setEnabled(false);
                    l1.setText("Player X Turn");
                    b5.setEnabled(false);
                    check = possiblity();
                    if (t == 1) {
                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {
                            score();
                            disable();

                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;
                    if (l1.getText() == "Player 0 win") {
                        score();
                        disable();

                    }

                    if (j == 9) {
                        l1.setText("Game Draw");

                    } else
                        ;
                }

            }

        });
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j++;
                if (a == 0) {

                    b6.setText("X");
                    a = 1;
                    l1.setEnabled(false);
                    l1.setText("Player 0 Turn");
                    b6.setEnabled(false);
                    check = possiblity();
                    if (t == 1) {
                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {
                            score();
                            disable();

                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;
                    if (l1.getText() == "Player 0 win") {
                        score();
                        disable();

                    }

                    if (j == 9) {
                        l1.setText("Game Draw");

                    } else
                        ;
                } else {
                    b6.setText("0");
                    a = 0;
                    l1.setEnabled(false);
                    l1.setText("Player X Turn");
                    b6.setEnabled(false);
                    check = possiblity();
                    if (t == 1) {
                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {
                            score();
                            disable();

                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;
                    if (l1.getText() == "Player 0 win") {
                        score();
                        disable();

                    }

                    if (j == 9) {
                        l1.setText("Game Draw");

                    } else
                        ;
                }

            }

        });
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j++;
                if (a == 0) {

                    b7.setText("X");
                    a = 1;
                    l1.setEnabled(false);
                    l1.setText("Player 0 Turn");
                    b7.setEnabled(false);
                    check = possiblity();
                    if (t == 1) {
                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {
                            score();
                            disable();

                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;
                    if (l1.getText() == "Player 0 win") {
                        score();
                        disable();

                    }

                    if (j == 9) {
                        l1.setText("Game Draw");

                    } else
                        ;
                } else {
                    b7.setText("0");
                    a = 0;
                    l1.setEnabled(false);
                    l1.setText("Player X Turn");
                    b7.setEnabled(false);
                    check = possiblity();
                    if (t == 1) {
                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {
                            score();
                            disable();

                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;
                    if (l1.getText() == "Player 0 win") {
                        score();
                        disable();

                    }

                    if (j == 9) {
                        l1.setText("Game Draw");

                    } else
                        ;
                }

            }

        });
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j++;
                if (a == 0) {

                    b8.setText("X");
                    a = 1;
                    l1.setEnabled(false);
                    l1.setText("Player 0 Turn");
                    b8.setEnabled(false);
                    check = possiblity();
                    if (t == 1) {
                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {
                            score();
                            disable();

                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;
                    if (l1.getText() == "Player 0 win") {
                        score();
                        disable();

                    }

                    if (j == 9) {
                        l1.setText("Game Draw");

                    } else
                        ;

                } else {
                    b8.setText("0");
                    a = 0;
                    l1.setEnabled(false);
                    l1.setText("Player X Turn");
                    b8.setEnabled(false);
                    check = possiblity();
                    if (t == 1) {
                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {
                            score();
                            disable();

                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;
                    if (l1.getText() == "Player 0 win") {
                        score();
                        disable();

                    }

                    if (j == 9) {
                        l1.setText("Game Draw");

                    } else
                        ;
                }

            }

        });
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j++;
                if (a == 0) {

                    b9.setText("X");
                    a = 1;
                    l1.setEnabled(false);
                    l1.setText("Player 0 Turn");
                    b9.setEnabled(false);
                    check = possiblity();

                    if (t == 1) {
                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {
                            score();
                            disable();

                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;
                    if (l1.getText() == "Player 0 win") {
                        score();
                        disable();

                    }

                    if (j == 9) {
                        l1.setText("Game Draw");

                    } else
                        ;

                } else {
                    b9.setText("0");
                    a = 0;
                    l1.setEnabled(false);
                    l1.setText("Player X Turn");
                    b9.setEnabled(false);

                    check = possiblity();
                    if (t == 1) {
                        l1.setText("Player X win");
                        ss = 1;
                        temp++;
                        if (l1.getText() == "Player X win") {

                            disable();

                            score();
                        }

                    } else if (t == 2) {
                        l1.setText("Player 0 win");
                    }
                    ss = 2;
                    temp++;

                    if (l1.getText() == "Player 0 win") {
                        disable();
                        score();

                    }

                    if (j == 9) {
                        l1.setText("Game Draw");

                    } else
                        ;
                }

            }

        });

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a = 0;
                i = 0;
                j = 0;
                t = 0;
                ss = 0;

                l1.setText("Player X Turn");
                b1.setText(null);
                b2.setText(null);
                b3.setText(null);
                b4.setText(null);
                b5.setText(null);
                b6.setText(null);
                b7.setText(null);
                b8.setText(null);
                b9.setText(null);

                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);

            }

        });
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });

    }

    public void score() {
        if (ss == 1) {
            count0++;
            l2.setText("SCORE X: " + count0);
        } else if (ss == 2) {
            count2++;
            l3.setText("SCORE O: " + count2);
        }
    }

    public void disable() {

        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);

    }

    public int possiblity() {
        i = 0;
        i++;
        count1 = 0;
        if (b1.getText() == "X" && b2.getText() == "X" && b3.getText() == "X") {
            t = 1; 
        }else if (b1.getText() == "X" && b4.getText() == "X" && b7.getText() == "X") {
            t = 1; 
        }else if (b1.getText() == "X" && b5.getText() == "X" && b9.getText() == "X") {
            t = 1; 
        }else if (b2.getText() == "X" && b5.getText() == "X" && b8.getText() == "X") {
            t = 1; 
        }else if (b3.getText() == "X" && b6.getText() == "X" && b9.getText() == "X") {
            t = 1; 
        }else if (b3.getText() == "X" && b5.getText() == "X" && b7.getText() == "X") {
            t = 1; 
        }else if (b4.getText() == "X" && b5.getText() == "X" && b6.getText() == "X") {
            t = 1; 
        }else if (b7.getText() == "X" && b8.getText() == "X" && b9.getText() == "X") {
            t = 1; 
        }else if (b1.getText() == "0" && b2.getText() == "0" && b3.getText() == "0") {
            t = 2; 
        }else if (b1.getText() == "0" && b4.getText() == "0" && b7.getText() == "0") {
            t = 2; 
        }else if (b1.getText() == "0" && b5.getText() == "0" && b9.getText() == "0") {
            t = 2; 
        }else if (b2.getText() == "0" && b5.getText() == "0" && b8.getText() == "0") {
            t = 2; 
        }else if (b3.getText() == "0" && b6.getText() == "0" && b9.getText() == "0") {
            t = 2; 
        }else if (b3.getText() == "0" && b5.getText() == "0" && b7.getText() == "0") {
            t = 2; 
        }else if (b4.getText() == "0" && b5.getText() == "0" && b6.getText() == "0") {
            t = 2; 
        }else if (b7.getText() == "0" && b8.getText() == "0" && b9.getText() == "0") {
            t = 2;
        }

        return 0;

    }

    public void actionPerformed(ActionEvent e) {
    }

    public static void main(String[] args) {
        {
            game f = new game();
            f.allbtn();
            f.btnfun();
            f.possiblity();
            f.score();
            // f.disable();

        }
    }

}
